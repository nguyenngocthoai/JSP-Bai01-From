<%@page import="com.haru.entities.Student"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Result Form</title>
</head>
<body>
	<%
		Student st = new Student();
		st = (Student) request.getAttribute("student");
		out.println("<br>" + st.getFirstname());
		out.println("<br>" + st.getLastname());
		out.println("<br>" + st.getBirthday());
		out.println("<br>" + st.getEmail());
		out.println("<br>" + st.getMobileNumber());
		out.println("<br>" + st.getGender());
		out.println("<br>" + st.getAddress());
		out.println("<br>" + st.getCity());
		out.println("<br>" + st.getPincode());
		out.println("<br>" + st.getState());
		out.println("<br>" + st.getCountry());
		out.println("<br>" + st.getHobbiles());
		out.println("<br>" + st.getQualification());
		out.println("<br>" + st.getCourseApplies());
	%>
</body>
</html>