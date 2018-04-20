<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
	
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
    
<!DOCTYPE html>
<html>
<head>
	<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
	<link rel="stylesheet" href="assets/css/bootstrap.min.css">

	<title>Movie Search</title>
</head>
<body>
	<h1>Movie List</h1>
	<div><a href="/" class="btn btn-default">Home</a></div>
	<div>
		<table class="table table-striped" style="max-width:1000px">
			<thead>
				<tr>
					<th>Title</th>
					<th>Year</th>
					<th>imdbID</th>
				</tr>
			</thead>
			<tbody>
				<c:forEach items="${movieList.movies}" var="movie">
					<tr>
						<td><c:out value="${movie.title}" /></td>
						<td><c:out value="${movie.year}" /></td>
						<td><a href="http://www.imdb.com/title/${movie.imdbID}/">${movie.imdbID}</a></td>
					</tr>
				</c:forEach>
			</tbody>
		</table>
	</div>
</body>
</html>