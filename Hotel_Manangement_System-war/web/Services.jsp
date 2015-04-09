<%-- 
    Document   : Services
    Created on : 8-Apr-2015, 10:33:54 PM
    Author     : Vishal
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
   <head>
		<title></title>
		<meta charset="utf-8">
		<link rel="stylesheet" href="css/reset.css" type="text/css" media="all">
		<link rel="stylesheet" href="css/layout.css" type="text/css" media="all">
		<link rel="stylesheet" href="css/style.css" type="text/css" media="all">
		<script type="text/javascript" src="js/jquery-1.6.js" ></script>
		<script type="text/javascript" src="js/cufon-yui.js"></script>
		<script type="text/javascript" src="js/cufon-replace.js"></script>  
		<script type="text/javascript" src="js/Adamina_400.font.js"></script>
		<script type="text/javascript" src="js/jquery.jqtransform.js" ></script>
		<script type="text/javascript" src="js/script.js" ></script>
		<script type="text/javascript" src="js/atooltip.jquery.js"></script>
		<!--[if lt IE 9]>
			<script type="text/javascript" src="js/html5.js"></script>
			<link rel="stylesheet" href="css/ie.css" type="text/css" media="all">
		<![endif]-->
		<!--[if lt IE 7]>
			<div style=' clear: both; text-align:center; position: relative;'>
				<a href="http://windows.microsoft.com/en-US/internet-explorer/products/ie/home?ocid=ie6_countdown_bannercode"><img src="http://storage.ie6countdown.com/assets/100/images/banners/warning_bar_0000_us.jpg" border="0" height="42" width="820" alt="You are using an outdated browser. For a faster, safer browsing experience, upgrade for free today." /></a>
			</div>
		<![endif]-->
	</head>
	<body id="page4">
		<div class="bg1">
			<div class="bg2">
				<div class="main">
<!-- header -->
					<header>
						<h1><a href="index.html" id="logo">LoungeHotel</a></h1>
						<div class="department">
							Humber Blvd<br>
							<span>Toll free: &nbsp;  +1 800 989 9876</span>
						</div>
					</header>
					<div class="box">
						<nav>
							<ul id="menu">
								<li class="active"><a href="index.html">About Us</a></li>
								<li><a href="Services.jsp">Services</a></li>
								<li><a href="Booking.jsp">Booking</a></li>
								<li><a href="Rooms.jsp">Rooms</a></li>
								<li><a href="Locations.jsp">Locations</a></li>
							</ul>
						</nav>

<
						<article id="content">
							<div class="box1">
								<div class="wrapper">
									<form action="#" id="form1">
										<h2>Book a Room</h2>
										<fieldset>
											<div class="row">
												<input type="text" class="input">
												Your Name:
											</div>	
											<div class="row">
												<input type="text" class="input">
												E-Mail Address:
											</div>	
											<div class="row">
												<input type="text" class="input">
												Home Phone:
											</div>	
											<div class="row">
												<div class="select1"><select><option>&nbsp;</option><option>...</option></select></div>
												Length of Stay:
											</div>	
											<div class="row">
												<div class="select1"><select><option>&nbsp;</option><option>...</option></select></div>
												Number in Party:
											</div>	
											<div class="row">
												<div class="select2"><select><option>&nbsp;</option><option>...</option></select></div>
												<div class="select2"><select><option>&nbsp;</option><option>...</option></select></div>
												<div class="select2"><select><option>&nbsp;</option><option>...</option></select></div>
												Arrival Date:
											</div>	
											<div class="row_textarea">
												Additional Comments:
												<textarea cols="1" rows="1"></textarea>	
											</div>	
											<div class="wrapper">
												<a href="#" class="button1" onClick="document.getElementById('form1').submit()">Send</a>
												<a href="#" class="button1" onClick="document.getElementById('form1').reset()">Clear</a>
											</div>
										</fieldset>
									</form>
					</div>
		<div class="main">
<!-- footer -->
			<footer>
				<div class="col2">
					Lounge Hotel &copy; 2011 <a rel="nofollow" href="index.jsp" >EJB Project by</a> by Vishal & Ashish
					<nav>
						<ul id="footer_menu">
							<li class="active"><a href="index.jsp">About Us</a></li>
							<li><a href="Services.jsp">Services</a></li>
							<li><a href="Booking.jsp">Booking</a></li>
							<li><a href="Rooms.jsp">Rooms</a></li>
							<li class="last"><a href="Locations.jsp">Locations</a></li>
						</ul>
					</nav>
				</div>
				<div class="col1 pad_left1">
					<ul id="icons">
						<li><a href="#" class="normaltip" title="Linkedin"><img src="images/icon1.jpg" alt=""></a></li>
						<li><a href="#" class="normaltip" title="Facebook"><img src="images/icon2.jpg" alt=""></a></li>
						<li><a href="#" class="normaltip" title="Picasa"><img src="images/icon3.jpg" alt=""></a></li>
						<li><a href="#" class="normaltip" title="Twitter"><img src="images/icon4.jpg" alt=""></a></li>
					</ul>
				</div>				
				
			</footer>

		</div>
		<script type="text/javascript"> Cufon.now(); </script>
		<script>
			$(document).ready(function(){
				$('.kwicks').kwicks({
					max : 500,
					spacing : 0,
					event : 'mouseover'
				});
							   
			})
		</script>
	</body>
</html>
