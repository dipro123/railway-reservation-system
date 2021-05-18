<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
	<meta charset="ISO-8859-1">
	<title>Register</title>
	<style>
		*{
			box-sizing: border-box;
		}
		body{
			background-image: url(sandy.jpg);
			background-repeat: no-repeat;
			margin-left:10%;
			margin-right:10%;
		}
		.hd{
			text-align: center;
			padding:10px;
			margin-left: 5%;
			margin-right: 5%;
			color:#cc0066;
			font-weight: bold;
			font-size:40px;
		}
		.main{
			border:1px blue solid;
			background-color: yellow;
			border-radius: 5px;
			text-align: center;
			margin-left:22%;
			margin-right: 33.3%;
			padding:10px;
			margin-bottom: 10px;
			width:700px;
			color:red;
		}
		.menu{
			border:1px black solid;
			border-radius: 13px;
			background-color: white;
			color:green;
			font-weight: bold;
			font-size:18px;
			text-align: center;
			margin-right:15px;
			padding:5px;
			padding-left: 10px;
			padding-right: 10px;
			width:130px;
		}
		a:hover{
		color:red;
	}
	a:link{
		color: green;
		text-decoration: none;
	}
	.tab{
		border:1px black solid;
		border-radius: 2px;
		background-color: #FFE5CC;
		margin-left: 30%;
		width:450px;
		color:red;
		font-weight: bold;
		font-style:normal;
		text-align:center;
		font-size: 22px;
		margin-bottom:10px;
		padding:10px;
	}
	.yel{
	color:yellow;
	}
	.red{
		color:red;
	}
	.green{
		color:green;
	}
	.brown{
		color:brown;
	}
	.blue{
		color:blue;
	}
	</style>
</head>
<body>
<header>
	<h1 class="hd">National Railway Information And Tourism Control<br/>[ NRITC ]</h1>
	<div class="main">
		<p1 class="menu"><a href="UserLogin">Login as User</a></p1>
		<p1 class="menu"><a href="UserRegister">Register</a></p1>
	</div>
</header>
<table class="tab brown hd">
		<tr>
			<td>New User Registration</td>
		</tr>
	</table>

	<table class="tab green" border="0px">
		
		<tr>
			<td>
				<form action="register" method="post">
					Username : <input type="text" name="uname" placeholder="Enter Username" required><br/><br/>
					Password : <input type="password" name="pword" required><br/><br/>
					FirstName: <input type="text" name="firstname" required><br/><br/>
					Last Name: <input type="text" name="lastname" required><br/><br/>
					Address : <input type="text" name="address" required><br/><br/>
					Phone No : <input type="number" name="phoneno" required><br/><br/>
					Email Id : <input type="email" name="mailid" required><br/><br/>
					<input type="submit" value=" I AGREE FOR ALL TERMS & CONDITIONS ! REGISTER ME " text-align="center">
				</form>
			</td>
			
		</tr>  
	</table>
	
	</div>

</body>
</html>