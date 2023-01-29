<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>

<%@ include file="/WEB-INF/views/common/taglibs.jsp" %>
<%@ include file="/WEB-INF/views/common/doctype.jsp" %>
<%@ include file="/WEB-INF/views/common/style.jsp" %>
<%@ include file="/WEB-INF/views/common/script.jsp" %>
</head>

<body>
<div>
	hello main
	
	<p>게시판</p>
	<button id="boardBtn">이동</button>
</div>	
<form name="frm_menu" method="post">
	<input type="hidden" name="test" value="test" />
</form>

<script>

	$('#boardBtn').on('click', function(){
		goMenu('/board/list');
	});
	
</script>
</body>
</html>