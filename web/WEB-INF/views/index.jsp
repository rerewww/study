<%--
  Created by IntelliJ IDEA.
  User: son
  Date: 2019-05-15
  Time: 오후 11:31
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <script type="text/javascript" charset="utf-8" src="/dist/build.js"></script>
  </head>
  <body>
  <button cmd="checkArrayObject">TEST</button>
  <form id="sendFiles" enctype="multipart/form-data">
    <input type="file" name="file">
    <input type="button" cmd='upload' value="전송">
  </form>
  <form id="downloadFile">
    <input type="file" name="file">
    <input type="button" cmd='download' value="다운로드">
  </form>
  <p id="result"></p>
  </body>
</html>
