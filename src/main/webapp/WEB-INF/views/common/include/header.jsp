<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ include file="/WEB-INF/views/common/include/taglibs.jsp" %>

<!-- Navbar -->
<nav class="main-header navbar navbar-expand navbar-dark navbar-light">
	<!-- Left navbar links -->
	<ul class="navbar-nav">
		<li class="nav-item">
			<a class="nav-link" data-widget="pushmenu" href="#" role="button"><i class="fas fa-bars"></i></a>
		</li>
		<li class="nav-item d-none d-sm-inline-block">
			<a href="/" class="nav-link">Home</a>
		</li>
	</ul>

	<!-- Right navbar links -->
	<ul class="navbar-nav ml-auto">
		<!-- Navbar Search -->
		<li class="nav-item">
			<a class="nav-link" data-widget="navbar-search" href="#" role="button">
				<i class="fas fa-search"></i>
			</a>
			<div class="navbar-search-block">
				<form class="form-inline">
				<div class="input-group input-group-sm">
					<input class="form-control form-control-navbar" type="search" placeholder="Search" aria-label="Search">
					<div class="input-group-append">
						<button class="btn btn-navbar" type="submit">
							<i class="fas fa-search"></i>
						</button>
						<button class="btn btn-navbar" type="button" data-widget="navbar-search">
							<i class="fas fa-times"></i>
						</button>
					</div>
				</div>
				</form>
		  	</div>
		</li>
	</ul>
</nav>
<!-- /navbar -->

<!-- Main Sidebar Container -->
<aside class="main-sidebar sidebar-dark-primary elevation-4">
	<!-- Brand Logo -->
	<a href="index3.html" class="brand-link">
		<img src="/resources/dist/img/AdminLTELogo.png" alt="AdminLTE Logo" class="brand-image img-circle elevation-3" style="opacity: .8">
		<span class="brand-text font-weight-light">AdminLTE 3</span>
	</a>

	<!-- Sidebar -->
	<div class="sidebar">
		<!-- Sidebar user panel (optional) -->
	    <div class="user-panel mt-3 pb-3 mb-3 d-flex">
			<div class="image">
				<img src="/resources/dist/img/user2-160x160.jpg" class="img-circle elevation-2" alt="User Image">
			</div>
			<div class="info">
				<a href="#" class="d-block">Profile</a>
			</div>
		</div>

		<!-- Sidebar Menu -->
		<nav class="mt-2">
			<ul class="nav nav-pills nav-sidebar flex-column" data-widget="treeview" role="menu" data-accordion="false">
				<li class="nav-item">
					<a href="#" class="nav-link" data-depth1="01">
						<i class="nav-icon fas fa-tachometer-alt"></i>
						<p>Board<i class="right fas fa-angle-left"></i></p>
					</a>
					<ul class="nav nav-treeview">
						<li class="nav-item">
							<a href="javascript:goMenu('/board/list');" class="nav-link" data-depth2="01">
								<i class="far fa-circle nav-icon"></i>
								<p>Notice</p>
							</a>
						</li>
						<li class="nav-item">
							<a href="#" class="nav-link">
								<i class="far fa-circle nav-icon"></i>
								<p>FAQ</p>
							</a>
						</li>
					</ul>
				</li>
				<li class="nav-item">
					<a href="#" class="nav-link">
						<i class="nav-icon fas fa-th"></i>
						<p>Simple Link</p>
					</a>
				</li>
			</ul>
		</nav>
	</div>
</aside>

<form name="frm_menu" method="post"></form>

<script>
	
	$(function(){
		// menu active
		$("a[data-depth1='${menu_depth1}']").addClass("active");

		// menu1 아래 menu2 존재하면 menu2 활성화 
		if($("a[data-depth1='${menu_depth1}'] i").hasClass("fa-tachometer-alt")){
			$("a[data-depth1='${menu_depth1}']").closest("li").addClass("menu-open");
			$("a[data-depth2='${menu_depth2}']").addClass("active");
		}
	});
	
</script>