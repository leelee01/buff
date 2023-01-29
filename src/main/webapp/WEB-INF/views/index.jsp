<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>

<%@ include file="/WEB-INF/views/common/taglibs.jsp" %>
<%@ include file="/WEB-INF/views/common/doctype.jsp" %>
<%@ include file="/WEB-INF/views/common/style.jsp" %>
<%@ include file="/WEB-INF/views/common/script.jsp" %>
</head>

<body>
	hello index
	
	<button id="testBtn">test</button>
	
<form name="frm_menu" method="post">
	<input type="hidden" name="test" value="test" />
</form>

<script>

	$('#testBtn').on('click', function(){
		goMenu('/board/list');
	});
	
</script>
</body>
</html>