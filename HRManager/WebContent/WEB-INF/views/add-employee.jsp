<%@taglib uri = "http://www.springframework.org/tags/form" prefix = "form"%>
<%@ taglib uri = "http://java.sun.com/jsp/jstl/core" prefix = "c" %>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
	<head>
		<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
		<title>Employee List</title>
		<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.1.3/css/bootstrap.min.css" integrity="sha384-MCw98/SFnGE8fJT3GXwEOngsV7Zt27NXFoaoApmYm81iuXoPkFOJwJ8ERdknLPMO" crossorigin="anonymous">
	</head>
	<body class = "bg-light">
		
		<h1 class = "text-light bg-secondary py-4 text-center">Employee Tracker</h1>
		<a href="employeeListPage" class="pb-2 ml-4" style="float:left">back</a>
		<a href="login" class="pb-2 mr-4" style="float:right">logout</a>
		<div class = "container m-auto w-50 pt-2 pb-4 text-center text-light">
			
			<h2 class = "text-success py-4 text-center">
				<c:if test="${!isToBeUpdated}">Add New Employee</c:if>
				<c:if test="${isToBeUpdated}">Update Employee</c:if>	
			</h2>
			
			<c:if test="${!isToBeUpdated}">
				<c:set var="process" value="addEmployee" scope="page"/>
			</c:if>
			<c:if test="${isToBeUpdated}">
				<c:set var="process" value="updateExistingEmployee" scope="page"/>
			</c:if>
			
			<form:form action="${process}" modelAttribute="employee">
				
				<form:errors path="employeeCode" class="text-danger d-block"/>
				<form:input path="employeeCode" name="employeeCode" class="my-2 form-control form-control-lg"
							placeholder="Employee Code" readonly="${isToBeUpdated}"/>
				
				<form:errors path="employeeName" class="text-danger d-block"/>			
				<form:input path="employeeName" name="employeeName" class="my-2 form-control form-control-lg"
							placeholder="Employee Name"/>
							
				<form:errors path="employeeLocation" class="text-danger d-block"/>			
				<form:textarea path="employeeLocation" name="employeeLocation" 
							class="my-2 form-control form-control-lg" placeholder="Employee Location"
							rows="6"/>
							
				<form:errors path="employeeEmail" class="text-danger d-block"/>
				<form:input type="email" path="employeeEmail" name="employeeEmail" class="my-2 form-control form-control-lg"
							placeholder="Employee email"/>
				
				<form:errors path="dateOfBirth" class="text-danger d-block"/>			
				<form:input type="date" path="dateOfBirth" class="form-control my-2" name="dateOfBirth"/>
							
				<button type="submit" class="btn btn-success btn-lg ml-auto mr-auto my-4 d-inline-block">Submit</button>
				<button type="reset" class="btn btn-success btn-lg ml-auto mr-auto my-4 d-inline-block">Reset</button>
			</form:form>
		</div>
	</body>
</html>