<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>

<%@ include file="/WEB-INF/views/common/include/taglibs.jsp" %>
<%@ include file="/WEB-INF/views/common/include/doctype.jsp" %>
<%@ include file="/WEB-INF/views/common/include/style.jsp" %>
<%@ include file="/WEB-INF/views/common/include/script.jsp" %>

<!-- jsGrid -->
<script src="/resources/plugins/jsgrid/demos/db.js"></script>
<script src="/resources/plugins/jsgrid/jsgrid.min.js"></script>

</head>
<body class="hold-transition dark-mode sidebar-mini">
<div class="wrapper">
	<c:set var="menu_depth1" value="01" />
	<c:set var="menu_depth2" value="01" />
	<!-- header -->
	<%@ include file="/WEB-INF/views/common/include/header.jsp" %>
	<!-- header -->

	<div class="content-wrapper">
		<div class="content-header">
			<div class="container-fluid">
				<div class="row mb-2">
					<div class="col">
						<h1 class="m-0">Notice</h1>
					</div>
				</div>
			</div>
		</div>
	
		<!-- Main content -->
		<section class="content">
		  <div class="card">
		    <div class="card-header">
		      <h3 class="card-title">jsGrid</h3>
		    </div>
		    <!-- /.card-header -->
		    <div class="card-body">
		      <div id="jsGrid1"></div>
		    </div>
		    <!-- /.card-body -->
		  </div>
		  <!-- /.card -->
		</section>
		<!-- /.content -->
	</div>
	<!-- /.content-wrapper -->
	
	<!-- footer -->
	<%@ include file="/WEB-INF/views/common/include/footer.jsp" %>
	<!-- footer -->
</div>

<script>
$(function(){
    $("#jsGrid1").jsGrid({
        height: "100%",
        width: "100%",
        sorting: true,
        paging: true,
        data: db.clients,

        fields: [
            { name: "Name", type: "text", width: 150 },
            { name: "Age", type: "number", width: 50 },
            { name: "Address", type: "text", width: 200 },
            { name: "Country", type: "select", items: db.countries, valueField: "Id", textField: "Name" },
            { name: "Married", type: "checkbox", title: "Is Married" }
        ]
    });
  });
</script>
</body>
</html>
