<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib uri = "http://java.sun.com/jsp/jstl/core" prefix = "c" %>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
	<head>
		<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
		<title>Login</title>
		<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.1.3/css/bootstrap.min.css" integrity="sha384-MCw98/SFnGE8fJT3GXwEOngsV7Zt27NXFoaoApmYm81iuXoPkFOJwJ8ERdknLPMO" crossorigin="anonymous">
	</head>
	<body class = "bg-light">
		
		<h1 class = "text-light bg-secondary py-4 text-center">Employee Tracker</h1>
		<div class = "container m-auto w-50 pt-2 pb-4 text-center">
			<h2 class = "text-success py-4 text-center">Login</h2>
			<c:if test="${isLoginUnsuccessful}">
				<span class="text-danger mb-4">Invalid Username/Password</span>			
			</c:if>
			<form:form action="loginManager" method="post" modelAttribute="manager">
				<form:input path="username" name="username" class="form-control form-control-lg my-4" 
							placeholder="Username"/>
				<form:errors path="username" class="text-danger d-block"></form:errors>
				<form:password path="password" name="password" class="form-control form-control-lg my-4" 
								placeholder="Password"/>
				<form:errors path="password" class="text-danger d-block"></form:errors>
				<button type="submit" class="ml-auto mr-auto btn btn-success btn-lg my-4">Login</button>
			</form:form>
			
			<a href="${pageContext.request.contextPath}/signUp">Not registered? Sign up</a>					
		</div>
		
		<script src="https://code.jquery.com/jquery-3.3.1.slim.min.js" integrity="sha384-q8i/X+965DzO0rT7abK41JStQIAqVgRVzpbzo5smXKp4YfRvH+8abtTE1Pi6jizo" crossorigin="anonymous"></script>
		<script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.3/umd/popper.min.js" integrity="sha384-ZMP7rVo3mIykV+2+9J3UJ46jBk0WLaUAdn689aCwoqbBJiSnjAK/l8WvCWPIPm49" crossorigin="anonymous"></script>
		<script src="https://stackpath.bootstrapcdn.com/bootstrap/4.1.3/js/bootstrap.min.js" integrity="sha384-ChfqqxuZUCnJSK3+MXmPNIyE6ZbWh2IMqE241rYiqJxyMiZ6OW/JmZQ5stwEULTy" crossorigin="anonymous"></script>
	</body>
</html>