<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>user</title>
    <script src="js/jquery-1.7.2.min(1).js"></script>
</head>
<body>
<form id="myform">
    用户名称：<input type="text" name="username"/>
    用户密码：<input type="text" name="password"/>
    性别：<input type="text" name="sex"/>
    <button id="btn">提交</button>
</form>
</body>
</html>
<script>
    $(function () {
     $("#btn").click(function () {
         $.ajax({
             url: "/userServlet",
             type: "POST",
             data: $("#myform").serialize(),
             success: function (data) {
                 alert(data);
             },
             error: function (data) {
                 alert(data);
             }
         });
     });
    });


</script>
