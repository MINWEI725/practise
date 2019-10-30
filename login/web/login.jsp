<%--
  Created by IntelliJ IDEA.
  User: Lenovo
  Date: 2019/10/21
  Time: 10:33
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <script src="https://cdn.staticfile.org/jquery/1.10.2/jquery.min.js">
    </script>
    <script>

        $(function(){
            $("#imgId").click(function(){
                var path = "${pageContext.request.contextPath}/getCode?time="+new Date().getTime();
                $(this).attr("src",path);
            });
        });
    </script>
    <style>
        div{
            color: red;
        }
    </style>
    <title>注册</title>
</head>

<body>
    <form action="${pageContext.request.contextPath}/loginServlet" method="post">
        <table>
            <tr>
                <td>用户名</td>
                <td><input type="text" name="username"></td>
            </tr>
            <tr>
                <td>密码</td>
                <td><input type="password" name="password"></td>
            </tr>
            <tr>
                <td>验证码</td>
                <td><input type="text" name="checkCode"></td>
            </tr>
            <tr>
                <td colspan="2"><img  id="imgId" src="${pageContext.request.contextPath}/getCode"></td>
            </tr>
            <tr>
                <td colspan="2"><input type="submit" value="登录"></td>
            </tr>
        </table>
    </form>
<div> <%=request.getAttribute("fcode") == null ? "" : request.getAttribute("fcode") %> </div>
</body>
</html>
