<%@include file="indexheader.jsp" %>

<html>
<head>
	<title>Company Login</title>
	<link rel="stylesheet" type="text/css" href="fontawesome/css/all.min.css">
	<link rel="stylesheet" type="text/css" href="style2.css">
</head>
<body>
    <h2 style="text-align: center">Company Login</h2>
 <div class="container">
 	<div class="header">
 		<h1>login</h1>
 	</div>
 	<div class="main"> 
            <form action="companylogindb.jsp" method="post">
 			<span>
 				<i class="fa fa-user"></i>
 				<input type="text" placeholder="email" name="email">
 			</span><br>
 			<span>
 				<i class="fa fa-lock"></i>
 				<input type="password" placeholder="password" name="password">
 			</span><br>
                                <button type="submit" form="form1" value="Submit">Submit</button>

 		</form>
 	</div>
 </div>
</body>
</html>