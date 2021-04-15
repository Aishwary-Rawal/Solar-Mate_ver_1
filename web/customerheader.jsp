<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Strict//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-strict.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta name="keywords" content="" />
<meta name="description" content="" />
<meta http-equiv="content-type" content="text/html; charset=utf-8" />
<title>Solar-Mate</title>
<link href="http://fonts.googleapis.com/css?family=Abel" rel="stylesheet" type="text/css" />
<link href="style.css" rel="stylesheet" type="text/css" media="screen" />
<script type="text/javascript" src="http://ajax.googleapis.com/ajax/libs/jquery/1.7.1/jquery.min.js"></script>
<script type="text/javascript" src="jquery.dropotron-1.0.js"></script>
</head>
<body>
<div id="wrapper">
	<div id="header-wrapper">
		<div id="header">
			<div id="logo">
				<h1><a href="#">Solar-Mate</a></h1>
				<p>Let SUN do the work</p>
			</div>
		</div>
	</div>
	<!-- end #header -->
	<div id="menu-wrapper">
		<ul id="menu">
			<li class="current_page_item"><a href="customerhome.jsp"><span>Home</span></a></li>
			<li><a href="calculate_load.jsp"><span>Calculate Load</span></a></li>
                        <li><a href="rate.jsp"><span>Rate Companies</span></a></li>
                        <li><a href="feedback.jsp"><span>Feedback</span></a></li>
                        <li><span>My Account</span>
				<ul>
					<li class="first"> <a href="delete_customer.jsp">Delete Account</a> </li>
					<li class="last"> <a href="customerlogout.jsp">Logout</a> </li>
				</ul>
			</li>
		</ul>
		<script type="text/javascript">
			$('#menu').dropotron();
		</script>
	</div>
	<!-- end #menu -->