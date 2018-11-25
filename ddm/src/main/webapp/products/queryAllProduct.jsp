<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<link type="text/css" rel="stylesheet" href="${pageContext.request.contextPath}/css/css.css">
	<link type="text/css" rel="stylesheet" href="${pageContext.request.contextPath}/css/easyui.css">
 	<link type="text/css" rel="stylesheet" href="${pageContext.request.contextPath}/css/icon.css">
  	<script type="text/javascript" src="${pageContext.request.contextPath}/js/jquery.min.js"></script>
  	<script type="text/javascript" src="${pageContext.request.contextPath}/js/jquery.easyui.min.js"></script>
  	<script type="text/javascript" src="${pageContext.request.contextPath}/js/easyui-lang-zh_CN.js"></script>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
	<script type="text/javascript">

	//生成datagrid控件；
	$(function(){

	  //  alert("0");

	$("#myDatagrid").datagrid({


	//访问的路径；
	url:"query.do",
	pagination:true,
	width:400,
	height:300,

	columns:[[

	{checkbox:true,field:"ck"},//在页面中展示多选框
	{title:"编号",field:"bookId"},
	{title:"书名",field:"bookName"},
	{title:"图片",field:"productImage"},
	{title:"价格",field:" price"},
	{title:"当当价格",field:"dangPrice"},
    {title:"库存",field:"inventory"},
	{title:"作者",field:"author"},
    {title:"出版社",field:"press"},
    {title:"销量",field:"salaNum"},
	{title:"评分",field:"customeScore"},
    {title:"类别",field:"category.categoryName"},

	]],
	toolbar:'#tools',
        onDblClickRow:function(rowIndex, rowData){

            //alert(rowIndex);

            //alert(rowData.name);

            $("#updateId").val(rowData.id);
            $("#updateName").val(rowData.name);

            $("#updatePrice").val(rowData.price);
            $("#updateDescription").val(rowData.description);

            $("#updateDialog").dialog("open");


        }






    });
	});
	<%--datagrid end   --%>


    function deleteMany(){

        var arrObj = $("#myDatagrid").datagrid("getSelections");

        alert(arrObj.length);

        if(arrObj.length==0){

            alert("请选择要删除的数据");

        }

        else{

            var result=confirm("确认要删除吗？");

            if(result){

                //alert("执行删除操作");
                //获取要删除的数据的id的值；
                var ids=new Array(arrObj.length);

                alert(ids.length);

                for(var i=0;i<arrObj.length;i++){

                    ids[i]=arrObj[i].bookId;


                    for(var i=0;i<ids.length;i++){
                        alert(ids[i])
					}
                    //发送ajax到后台来执行；

                    $.ajax({

                        url:"deleteMany.do",
                        data:"ids="+ids,
                        success:function(data){

                            alert(data);
                            if(data){

                                alert("删除成功");
                                $("#myDatagrid").datagrid("reload");


                            }
                            else{

                                alert("删除失败");
                            }

                        }


                    });

                }


            }

        }


    }

	</script>
</head>
<body>


<table id="myDatagrid">

</table>
<div id="tools">
	<a href="JavaScript:void(0)" class="easyui-linkbutton" data-options="iconCls:'icon-add'" onclick="add()">添加</a>
	<a href="JavaScript:void(0)" class="easyui-linkbutton" data-options="iconCls:'icon-edit'" onclick="update()">修改</a>
	<a href="JavaScript:void(0)" class="easyui-linkbutton" data-options="iconCls:'icon-remove'" onclick="deleteMany()">批量删除</a>

</div>
<!--datagrid的工具栏的div====end -->

</body>
</html>