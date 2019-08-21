<%--
  Created by IntelliJ IDEA.
  User: hw
  Date: 2019/6/24
  Time: 14:50
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
    <title>Title</title>
</head>
<body>

<c:forEach items="${accounts}" var="account">
    <tr>

        <td align = "center">${account.id}</td>
        <td align = "center">${account.name}</td>
        <td align = "center">${account.bankBelong}</td>
    </tr>
</c:forEach>

</body>
</html>
