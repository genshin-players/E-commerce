package com.pb.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.pb.entity.Product;
import com.pb.entity.ProductCategory;
import com.pb.mapper.ProductCategoryMapper;
import com.pb.mapper.ProductMapper;
import com.pb.service.ProductCategoryService;
import com.pb.vo.ProductCategoryVO;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Collectors;


@Service
public class ProductCategoryServiceImpl extends ServiceImpl<ProductCategoryMapper, ProductCategory> implements ProductCategoryService {


    @Autowired
    private ProductCategoryMapper productCategoryMapper;
    @Autowired
    private ProductMapper productMapper;

   /* *//*
     * 修改分类
     * *//*
    @Override
    public Boolean updateCategory(String newName,Integer id) {
        *//*ProductCategory category = productCategoryMapper.selectById(id);
        System.out.println("根据id查出要修改的全部数据"+category.toString());
        category.setName(newName);*//*
        int i = productCategoryMapper.updateCategory(newName, id);
        return i>0;
    }*/

    @Override
    public List<ProductCategoryVO> buildProductCategoryMenu() {
        //1、查询所有的商品分类数据
        List<ProductCategory> productCategoryList = this.productCategoryMapper.selectList(null);
        //2、数据类型转换成 ProductCategoryVO
       /* List<ProductCategoryVO> productCategoryVOList=new ArrayList<>();
        for (ProductCategory  productCategory : productCategoryList) {
            ProductCategoryVO productCategoryVO=new ProductCategoryVO();
            BeanUtils.copyProperties(productCategory,productCategoryVO);
            productCategoryVOList.add(productCategoryVO);
        }*/

        List<ProductCategoryVO> productCategoryVOList = productCategoryList.stream().map(ProductCategoryVO::new).collect(Collectors.toList());
        //3、进行父子级菜单的封装
        List<ProductCategoryVO> levelOneList = buildMenu(productCategoryVOList);
        return levelOneList;
    }


    /*
     * 删除分类
     * */
    @Override
    public Boolean delete(Integer id) {
        ArrayList<Integer > ids = new ArrayList<>();
        //先把要删除的一级分类id放入到集合中
        ids.add(id);

        //递归的将一级分类下的id也加入到集合中
        this.getIds(ids,id);

        //批量删除集合中的id
        int i = productCategoryMapper.deleteBatchIds(ids);

        return i>0;
    }



    //递归方法
    private void getIds(ArrayList<Integer> ids, Integer id) {
        //查询二级分类的对象
        QueryWrapper<ProductCategory> Wrapper = new QueryWrapper<>();
        Wrapper.eq("parent_id",id);
        List<ProductCategory> twoSubjects = productCategoryMapper.selectList(Wrapper);

        //遍历二级分类的对象，把二级分类的id加入到要删除的集合中
        for (ProductCategory twoSubject : twoSubjects) {
            Integer idss = twoSubject.getId();
            ids.add(idss);
            //把二级分类的每一个ID，查询它下面的子节点
            // 递归删除二级分类下的子分类
            getIds(ids, idss);
        }
    }


    /*
    * 查出所有的数据，然后  拿出第一个数据  遍历整个集合 看他的 子菜单  当前数据的id和集合中的parentid是否一致；
    * */


    /**
     * 构建菜单
     * @param list
     */
    public List<ProductCategoryVO> buildMenu(List<ProductCategoryVO> list){
        //找到一级菜单
        List<ProductCategoryVO> levelOneList = list.stream().filter(c -> c.getParentId() == 0).collect(Collectors.toList());
        for (ProductCategoryVO vo : levelOneList) {
            recursion(list,vo);
        }
        return levelOneList;
    }

    /**
     * 递归分类
     * @param list
     * @param vo
     */


    //1级
    public void recursion(List<ProductCategoryVO> list,ProductCategoryVO vo){
        //找到子菜单
        List<ProductCategoryVO> children = getChildren(list, vo);
        vo.setChildren(children);
        //继续查找子菜单
        if(children.size() > 0){   //说明还有子菜单
            //2级
            for (ProductCategoryVO child : children) {   //child这个相当于吧二级菜单又拿出来了

                //3级
                recursion(list,child);   //在递归 自己用自己
            }
        }
    }

    /**
     * 获取子菜单
     * @param list
     * @param vo
     */
    public List<ProductCategoryVO> getChildren(List<ProductCategoryVO> list,ProductCategoryVO vo){
        List<ProductCategoryVO> children = new ArrayList<>();
        Iterator<ProductCategoryVO> iterator = list.iterator();
        while (iterator.hasNext()) {
            ProductCategoryVO next = iterator.next();
            if(next.getParentId().equals(vo.getId())){
                children.add(next);
            }
        }
        return children;
    }









}
