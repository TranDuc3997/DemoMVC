<%@page import="model.ListStudent"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
	<title>Result</title>
	<meta charset="utf-8" lang="vi">
	<link rel="stylesheet" type="text/css" href="css/style.css">
	<%ListStudent list =(ListStudent) request.getAttribute("list"); %>
</head>
<body>
	<table>
		<tr>
			<th>Mã Sinh Viên</th>
			<th>Tên</th>
			<th>Năm Sinh</th>
			<th>Trường</th>
		</tr>
		<% for (int i = 0; i < list.getList().size(); i++) { %>
		<tr>
			<td> <%= list.getList().get(i).getID() %> </td>
			<td> <%= list.getList().get(i).getName() %> </td>
			<td> <%= list.getList().get(i).getBirthday() %> </td>
			<td> <%= list.getList().get(i).getSchool() %> </td>
		</tr>
		<% }%>
	</table>
</body>
</html>