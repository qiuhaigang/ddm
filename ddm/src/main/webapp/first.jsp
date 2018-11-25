<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>

<html>
<body>
<h2>Hello World!</h2>
<h3>everyDay full of hope</h3>
<c:forEach items="${requestScope.list}" var="a">

    ${a}


</c:forEach>

${requestScope.result}
</body>
</html>
