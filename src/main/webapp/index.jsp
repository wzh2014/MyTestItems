<%@ page contentType="text/html;charset=UTF-8" language="java" pageEncoding="utf-8" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>test</title>
</head>
<script>
    function selectUser() {
        var xmlhttp = new XMLHttpRequest();
        xmlhttp.onreadystatechange = function () {
            if (xmlhttp.readyState == 4 && xmlhttp.status == 200) {
                document.getElementById("test").innerHTML = xmlhttp.responseText;
            }
        }
        xmlhttp.open("POST", "user/showUser.do", true);
        xmlhttp.setRequestHeader("Content-type", "application/x-www-form-urlencoded");
        xmlhttp.send("id=2");
    }
</script>
<body>
<p id="test">Hello World!</p>
<button type="button" onclick="selectUser()">onclick test</button>
<form action="/user/selectUser.do" method="get">
    <table>
        <tr>
            <th>id</th>
            <th>name</th>
        </tr>
        <tr>
            <td><input type="text" style="width: 50px"></td>
            <td>${user.name}</td>
        </tr>
    </table>
    <input type="submit" value="查询"/>
</form>
</body>
</html>