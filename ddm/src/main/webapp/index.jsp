<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
<title></title>
<meta http-equiv="pragma" content="no-cache">
<meta http-equiv="cache-control" content="no-cache">
<meta http-equiv="expires" content="0">
<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
<meta http-equiv="description" content="This is my page">
<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/admin/css/global/style.css" />
	<link type="text/css" rel="stylesheet" href="${pageContext.request.contextPath}/css/easyui.css">
 	<link type="text/css" rel="stylesheet" href="${pageContext.request.contextPath}/css/icon.css">
  	<script type="text/javascript" src="${pageContext.request.contextPath}/js/jquery.min.js"></script>
  	<script type="text/javascript" src="${pageContext.request.contextPath}/js/jquery.easyui.min.js"></script>
  	<script type="text/javascript" src="${pageContext.request.contextPath}/js/easyui-lang-zh_CN.js"></script>
<script type="text/javascript" src="${pageContext.request.contextPath}/admin/js/global/js.js"></script>
<script type="text/javascript">
/* 顶层窗口 如果 与当前窗口不一致，将顶层窗口重新加载  配合过滤器完成页面跳转*/
 if (top != self) {
	parent.location.reload();
} 		
</script>
</head>
<body>

<form id="login" name="login" action="${pageContext.request.contextPath}/user/login.do" method="post">



      <div class="user">
        <label>用户名：
        <input type="text" name="nickName" id="user"  />
        </label>
      </div>
      <div class="user">
        <label>密　码：
        <input type="password" name="password" id="pwd"   />
        </label>
      </div>
      <div class="chknumber">
        <label>验证码：
        <input   name="code" type="text" id="chknumber" maxlength="4" class="chknumber_input" "/>
        </label><img width="50" height="30" src="${pageContext.request.contextPath}/validateCode/code.do" id="imgVcode" onclick="document.getElementById('imgVcode').src='${pageContext.request.contextPath}/validateCode/code.do?time='+(new Date()).getTime();"  />
      </div>


    <div id="center_submit">
      <div class="button"> <img src="admin/imgs/global/dl.gif" width="57" height="20" onclick="form_submit()" > </div>
      <div class="button"> <img src="admin/imgs/global/cz.gif" width="57" height="20" onclick="form_reset()"> </div>
    </div>


</form>

</body>
<script type="text/javascript">
	
</script>
</body>
</html>