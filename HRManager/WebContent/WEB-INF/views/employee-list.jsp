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
			<button class="btn btn-info d-inline-block btn-lg mr-4" href="addEmployee" 
						modelAttribute="employee">Add employee</button>
			<button class="btn btn-info d-inline-block btn-lg" href="getEmployees"
						modelAttribute="employee">Get employees</button>
			<table class="table table-responsive">
				<thead class="thead-dark text-light">
					<tr>
						<th>Employee Code</th>
						<th>Employee Name</th>
						<th>Employee Location</th>
						<th>Employee Email</th>
						<th>Employee Date of Birth</th>
					</tr>
				</thead>
<!-- 				<tbody class="bg-light text-dark text-center">
					<c:forEach var="flight" items="${filteredFlights}">
						<tr>
							<td>${flight.flightNumber}</td>
							<td>${flight.departureLocation}</td>
							<td>${flight.arrivalLocation}</td>
							<td>${flight.validTill}</td>
							<td>${flight.flightTime}</td>
							<td>${flight.flightDuration}</td>
							<td>${flight.fare}</td>
							<td>${flight.seatAvailability}</td>
							<td>${flight.flightClass}</td>
						</tr>
					</c:forEach>
				</tbody> -->
			</table>
		</div>
		
	</body>
</html>