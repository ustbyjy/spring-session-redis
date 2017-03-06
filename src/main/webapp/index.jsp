<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
<title>Index</title>
</head>
<body>
<%
    String path = request.getContextPath();
    String basePath = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort() + path + "/";
%>
<form action="<%=basePath %>set">
    name：<input type="text" name="name" value=""><br>
    value：<input type="text" name="value" value=""><br>
    <input type="submit" value="提交">
</form>
</body>
</html>
