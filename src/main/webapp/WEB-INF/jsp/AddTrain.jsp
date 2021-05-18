<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Add Train</title>
<style>
* {
	box-sizing: border-box;
}

body {
	background-image: url(sandy.jpg);
	background-repeat: no-repeat;
	margin-left: 10%;
	margin-right: 10%;
}

.hd {
	text-align: center;
	padding: 10px;
	margin-left: 5%;
	margin-right: 5%;
	color: #cc0066;
	font-weight: bold;
	font-size: 40px;
}

.main {
	border: 1px blue solid;
	background-color: yellow;
	border-radius: 5px;
	text-align: center;
	margin-left: 22%;
	margin-right: 33.3%;
	padding: 10px;
	margin-bottom: 10px;
	width: 700px;
	color: red;
}

.menu {
	border: 1px black solid;
	border-radius: 13px;
	background-color: white;
	color: green;
	font-weight: bold;
	font-size: 18px;
	text-align: center;
	margin-right: 15px;
	padding: 5px;
	padding-left: 10px;
	padding-right: 10px;
	width: 130px;
}

a:hover {
	color: red;
}

a:link {
	color: green;
	text-decoration: none;
}

.tab {
	border: 1px black solid;
	border-radius: 2px;
	background-color: #FFE5CC;
	margin-left: 30%;
	width: 450px;
	color: red;
	font-weight: bold;
	font-style: normal;
	text-align: center;
	font-size: 22px;
	margin-bottom: 10px;
	padding: 10px;
}

.yel {
	color: yellow;
}

.red {
	color: red;
}

.green {
	color: green;
}

.brown {
	color: brown;
}

.blue {
	color: blue;
}
</style>
</head>
<body>
	<header>
		<h1 class="hd">
			National Railway Information And Tourism Control<br />[ NRITC ]
		</h1>
		<div class="main">
			<p1 class="menu">
			<a href="userHome">Home</a></p1>
			<p1 class="menu">
			<a href="addTrainView">Add Trains</a></p1>
			<p1 class="menu">
			<a href="viewTrain">View Trains</a></p1>
			<p1 class="menu">
			<a href="userLogout">Logout</a></p1>
		</div>
	</header>
	<table class="tab brown hd">
		<tr>
			<td>Add Trains</td>
		</tr>
	</table>

	<table class="tab green" border="0px">

		<tr>
			<td>
				<form action="addTrain" method="post">
					<br /> Train Number : <input type="text" name="trainno"><br />
					<br /> Train Name : <input type="text" name="trainname"><br />
					<br /> From Station : <input type="text" name="fromstation"><br />
					<br /> To Station : <input type="text" name="tostation"><br />
					<br /> Available : <input type="text" name="available"><br />
					<br /> Fare (INR) : <input type="text" name="fare"><br />
					<br /> <input type="submit" value=" ADD TRAIN ">
				</form>
				<br />
			</td>

		</tr>
	</table>

</body>
</html>