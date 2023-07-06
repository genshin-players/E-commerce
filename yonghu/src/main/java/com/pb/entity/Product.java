package com.pb.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.io.Serializable;



  @EqualsAndHashCode(callSuper = false)
    public class Product implements Serializable {

    private static final long serialVersionUID=1L;

      /**
     * 主键
     */
        @TableId(value = "id", type = IdType.AUTO)
      private Integer id;

      /**
     * 名称
     */
      private String name;

      /**
     * 描述
     */
      private String description;

      /**
     * 价格
     */
      private Float price;

      /**
     * 库存
     */
      private Integer stock;

      /**
     * 分类1
     */
      private Integer categoryleveloneId;

      /**
     * 分类2
     */
      private Integer categoryleveltwoId;

      /**
     * 分类3
     */
      private Integer categorylevelthreeId;

      /**
     * 文件名称
     */
      private String fileName;


    public Integer getId() {
      return id;
    }

    public void setId(Integer id) {
      this.id = id;
    }

    public String getName() {
      return name;
    }

    public void setName(String name) {
      this.name = name;
    }

    public String getDescription() {
      return description;
    }

    public void setDescription(String description) {
      this.description = description;
    }

    public Float getPrice() {
      return price;
    }

    public void setPrice(Float price) {
      this.price = price;
    }

    public Integer getStock() {
      return stock;
    }

    public void setStock(Integer stock) {
      this.stock = stock;
    }

    public Integer getCategoryleveloneId() {
      return categoryleveloneId;
    }

    public void setCategoryleveloneId(Integer categoryleveloneId) {
      this.categoryleveloneId = categoryleveloneId;
    }

    public Integer getCategoryleveltwoId() {
      return categoryleveltwoId;
    }

    public void setCategoryleveltwoId(Integer categoryleveltwoId) {
      this.categoryleveltwoId = categoryleveltwoId;
    }

    public Integer getCategorylevelthreeId() {
      return categorylevelthreeId;
    }

    public void setCategorylevelthreeId(Integer categorylevelthreeId) {
      this.categorylevelthreeId = categorylevelthreeId;
    }

    public String getFileName() {
      return fileName;
    }

    public void setFileName(String fileName) {
      this.fileName = fileName;
    }
  }
