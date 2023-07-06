
<#include "../header.ftlh">
<div class="content-body">
    <div class="container-fluid">
        <div class="row">
            <div class="col-xl-12">
                <div class="d-flex mb-4 justify-content-between align-items-center flex-wrap">
                    <div class="table-search">
                        <div class="input-group search-area mb-xxl-0 mb-4">
                            <input type="text" class="form-control" placeholder="按照老师姓名查询">
                            <span class="input-group-text"><a href="javascript:void(0)"><i class="flaticon-381-search-2"></i></a></span>
                        </div>
                    </div>
                    <a href="/update_addstudent" class="btn btn-primary mb-xxl-0 mb-4 "><i class="far fa-file-word me-2"></i>添加学生</a>
                </div>
                <div class="tab-content">
                    <div class="tab-pane active show" id="All">
                        <div class="table-responsive">
                            <table class="table card-table default-table display mb-4 dataTablesCard table-responsive-xl " id="guestTable-all">

                                <tbody>

                                    <ul>
                                        <#list  main as levelOne>
                                        <li>${levelOne.name}
                                            <ul>
                                                <#list levelOne.children as levelTwo>
                                                <li>${levelTwo.name}
                                                    <ul>
                                                        <#list levelTwo.children as levelThree>
                                                        <li>${levelThree.name}</li>
                                                        </#list>
                                                    </ul>
                                                </li>
                                                </#list>
                                            </ul>
                                        </li>
                                        </#list>
                                    </ul>
                                   <#-- <#list list as levelOne>
                                        <div class="fj">
                                            <span class="n_img"></span>
                                            <span class="fl">${levelOne.name}</span>
                                        </div>
                                        <div class="zj">
                                            <div class="zj_l">
                                                <div class="zj_l_c">
                                                    <h2>
                                                        <a href="/product/list/2/${levelTwo.id}" th:text="${levelTwo.name}"></a>
                                                    </h2>
                                                    <#list levelTwo.children as levelThree>
                                                        <a href="/product/list/3/${levelThree.id}" th:text="${levelThree.name}"></a>
                                                    </#list>
                                                </div>
                                            </div>
                                        </div>
                                    </#list>
-->



                                </body>
                                </tbody>
                            </table>
                        </div>
                    </div>
                </div>
            </div>
        </div>
    </div>
</div>
</div>
<!--**********************************
    Content body end
***********************************-->



<!--**********************************
    Footer start
***********************************-->
<div class="footer">

    <div class="copyright">
        <p>Copyright &copy; 2021.Company name All rights reserved.<a target="_blank" href="https://sc.chinaz.com/moban/">&#x7F51;&#x9875;&#x6A21;&#x677F;</a></p>
    </div>
</div>
<!--**********************************
    Footer end
***********************************-->

<!--**********************************
   Support ticket button start
***********************************-->

<!--**********************************
   Support ticket button end
***********************************-->


</div>
<!--**********************************
    Main wrapper end
***********************************-->

<!--**********************************
    Scripts
***********************************-->
<!-- Required vendors -->
<script src="/js/global.min.js"></script>
<script src="/js/jquery.nice-select.min.js"></script>

<!-- Datatable -->
<script src="/js/jquery.dataTables.min.js"></script>
<script src="/js/datatables.init.js"></script>

<script src="/js/custom.min.js"></script>
<script src="/js/deznav-init.js"></script>
<script src="/js/demo.js"></script>
<script src="/js/styleSwitcher.js"></script>
<style>
    .tree li {
        list-style-type: none;
        margin: 0;
        padding: 10px 5px 0 25px;
        position: relative;
    }
    .tree li::before {
        content: '';
        position: absolute;
        top: 0;
        left: -20px;
        width: 1px;
        height: 100%;
        border-left: 1px solid #ccc;
    }
    .tree li::after {
        content: '';
        position: absolute;
        top: 30px;
        left: -20px;
        width: 25px;
        height: 1px;
        border-bottom: 1px solid #ccc;
    }
    .tree li:last-child::before {
        height: 30px;
    }
    .tree li .caret {
        cursor: pointer;
        display: inline-block;
        width: 10px;
        height: 10px;
        margin-right: 10px;
        border-top: 4px solid #ccc;
        border-right: 4px solid #ccc;
        transform: rotate(45deg);
    }
    .tree li .caret-down {
        transform: rotate(-45deg);
    }
    .tree li .category {
        color: #333;
        display: inline-block;
        padding: 5px;
        border-radius: 5px;
        background-color: #f5f5f5;
    }
    .tree ul {
        margin-left: 20px;
        margin-top: 0;
        display: none;




    }
    .tree li.opened ul {
        display: block;
    }
</style>

<script src="https://code.jquery.com/jquery-3.5.1.slim.min.js"></script>
<script>
    $(document).ready(function() {
        $('.caret').click(function() {
            $(this).parent().toggleClass('opened');
            $(this).toggleClass('caret-down');
        });
    });
</script>
</body>
</html>
