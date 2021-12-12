<%@ page language="java" contentType="text/html; charset=UTF-8"
    	pageEncoding="UTF-8"%>
<%@ page import = "user.*" %>
<%
	request.setCharacterEncoding("UTF-8");
	userDTO instance = new userDTO();
	instance.LoginID = request.getParameter("LoginID");
	instance.Password = request.getParameter("Password");
	instance.Address = request.getParameter("Address");
	instance.Age = request.getParameter("Age");
	instance.Email = request.getParameter("Email");
	instance.Phone = request.getParameter("Phone");
	
	userDAO.setUserInfo(instance);
	
	response.sendRedirect("../index.jsp");
%>