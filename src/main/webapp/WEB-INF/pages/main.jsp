<%@ taglib prefix="sec" uri="http://www.springframework.org/security/tags" %>
<%--
  Created by IntelliJ IDEA.
  User: bangae1
  Date: 2016-01-08
  Time: 오후 3:15
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<sec:authentication property="principal.username" var="id"/>
<sec:authentication property="principal.age" var="age"/>
<!DOCTYPE html>
<head>
    <title>Title</title>
</head>
<body>
welcome ${id}
user age : ${age}
</body>
</html>
