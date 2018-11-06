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
		<a href="login" class="pb-2 mr-4" style="float:right">logout</a>
		<div class = "container py-5 text-center text-light">
			<h2 class = "text-success py-4 text-center">Employee List</h2>
			<a type="button" class="btn btn-info d-inline-block mr-4" href="showAddEmployeeForm">Add employee</a>
			<a type="button" class="btn btn-info d-inline-block" href="getEmployees">Get employees</a>
			<c:if test="${isGetEmployeesButtonClicked}">
				<table class="table table-responsive my-5 ml-5 pl-4">
					<thead class="thead-dark text-light">
						<tr>
							<th>Employee Code</th>
							<th>Employee Name</th>
							<th>Employee Location</th>
							<th>Employee Email</th>
							<th>Employee Date of Birth</th>
							<th>Action</th>
						</tr>
					</thead>
					<tbody class="bg-light text-dark text-center">
					
						<c:forEach var="currentEmployee" items="${employeeList}" varStatus="status">
							<c:url var="updateEmployeeLink" value="showUpdateEmployeePage">
								<c:param name="employeeCode" value="${currentEmployee.employeeCode}"/>
							</c:url>
					
							<tr>
								<td>${currentEmployee.employeeCode}</td>
								<td>${currentEmployee.employeeName}</td>
								<td>${currentEmployee.employeeLocation}</td>
								<td>${currentEmployee.employeeEmail}</td>
								<td>${currentEmployee.employeeDateOfBirth}</td>
								<td>
									<a href="${updateEmployeeLink}">Update</a>
								</td>
							</tr>
						</c:forEach>
					</tbody>
				</table>
			</c:if>
		</div>
		
	</body>
</html>