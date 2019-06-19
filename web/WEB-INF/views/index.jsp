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
		<div>
			<span>서버 주소 입력</span>
			<input id="serverAddress" type="text">
		</div>

		<div>
			<span>API Key 입력</span>
			<input id="apiKey" type="text">
		</div>

		<div>
			<span>파일 명(확장자 포함)입력</span>
			<input id="fileName" type="text">
		</div>

		<form id="sendFiles" enctype="multipart/form-data">
			<input type="file" name="file">
			<input type="button" cmd='upload' value="열기">
		</form>

		<button cmd="newWord">새문서-워드</button>
		<button cmd="newCell">새문서-셀</button>
		<button cmd="newSlide">새문서-슬라이드</button>

		<%--<form id="downloadFile">--%>
		<%--<input type="button" cmd='download' value="다운로드">--%>
		<%--</form>--%>
	</body>
</html>
