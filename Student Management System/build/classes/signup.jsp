<html>
<head>
<title>Register Here</title>
<link rel="stylesheet" href="newcss.css">
</head>
<body>
	<form action="insertintosignup.jsp">
		<div class="container">

			<label><b>Username</b></label> <input type="text"
				placeholder="Enter Username" name="username" required> <label><b>Password</b></label>
			<input type="password" placeholder="Enter Password" name="pwd"
				required> <label><b>Full Name</b></label> <input type="text"
				placeholder="Full Name" name="fullname" required> <label><b>Phone
					number</b></label> <input type="text" placeholder="Enter your number"
				name="phone" required> <label><b>City</b></label> <input
				type="text" placeholder="City" name="city" required> <label><b>Address</b></label>
			<input type="text" placeholder="Address" name="address" required>

			<input type="checkbox" checked="checked"> Remember me

			<div class="clearfix">
				<button type="button" class="cancelbtn">Cancel</button>
				<button type="submit" class="signupbtn">Sign Up</button>
			</div>
		</div>
	</form>
</body>
</html>