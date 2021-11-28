<%@ page language="java" contentType="text/html;charset=UTF-8" pageEncoding="UTF-8" %>
<%@ page import="java.io.PrintWriter"%>
<%@ page import = "question.*" %>
<%@ page import = "java.util.ArrayList" %>
<!DOCTYPE html>
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html"; charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
    <title>동퀴콘</title>
    <link rel="stylesheet" href="./css/bootstrap.min.css">
    <link rel="stylesheet" href="./css/custom.css">
    <link rel="icon" href="./img/favicon.png">
    <script type = "text/javascript">
    	
    </script>
</head>
<body>
<nav class="navbar navbar-expand-lg navbar-light fixed-top shadow-sm" style="background-color: #558DF0;">
    <div class="container-xxl d-flex align-items-md-center" style="width:1200px">
        <a class="navbar-brand" href="index.jsp"><img src="./img/mainIcon.png" class="rounded float-start" width="120"></a>
        <button class="navbar-toggler" type="button" data-bs-toggle="collapse" data-bs-target="#navbarSupportedContent" aria-controls="navbarSupportedContent" aria-expanded="false" aria-label="Toggle navigation">
            <span class="navbar-toggler-icon"></span>
        </button>
        <div class="collapse navbar-collapse" id="navbarSupportedContent">
            <ul class="navbar-nav me-auto">
                <li class="nav-item">
                    <a class="nav-link" href="#" style="font-size:15pt; color:white;"><b>퀴즈 시작하기</b></a>
                </li>
                <li class="nav-item">
                    <a class="nav-link" href="registerQuiz.jsp" style="font-size:15pt; color:white;"><b>퀴즈 만들기</b></a>
                </li>
            </ul>
            <%
                String LoginID = null;
                String UserName = null;
                if(session.getAttribute("loginID") != null) {
                    LoginID = (String) session.getAttribute("LoginID");
                    UserName = (String) session.getAttribute("UserName");
                }
                if(LoginID == null) {
            %>
            <ul class="navbar-nav">
                <a class="nav-link" aria-current="page" href="signUp.jsp" style="color:white">회원가입</a>
                <a class="btn btn-outline-primary" href="login.jsp" style="border-color: white; color: white">로그인</a>
            </ul>
            <%
            } else {
            %>
            <ul class="navbar-nav d-flex">
                <li class="nav-item dropdown">
                    <a class="nav-link dropdown-toggle" href="#" id="navbarDropdown" role="button" data-bs-toggle="dropdown" aria-expanded="false" style="color: white">
                        <%=UserName %> 님
                    </a>
                    <ul class="dropdown-menu" aria-labelledby="navbarDropdown" style="background-color: #558DF0;">
                        <li><a class="dropdown-item" href="myPage.jsp" style="color: white">마이페이지</a></li>
                        <li><a class="dropdown-item" href="#" style="color: white">1:1 문의</a></li>
                        <li><hr class="dropdown-divider" style="color: white"></li>
                        <li><a class="dropdown-item" href="logout.jsp" style="color: white">로그아웃</a></li>
                    </ul>
                </li>
            </ul>
            <%
                }
            %>
        </div>
    </div>
</nav>
<%
	@SuppressWarnings("unchecked")
	ArrayList<QuestionDTO> qList = (ArrayList<QuestionDTO>)session.getAttribute("questionList");
	String type = String.valueOf(session.getAttribute("type"));
	int qnum = Integer.parseInt(String.valueOf(session.getAttribute("qnum")));
	
	System.out.println("전송 후 문제 내용");
	System.out.println(qList.get(qnum));
	
	QuestionDTO instance = qList.get(qnum);
	
	System.out.println(instance.questionNumber);
	
	//qList.get(i).answer 이거 하면 답 번호 나옴
%>
<br><br><br><br>
<div class="py-5 text-center">
    <h2><b><%= type %></b></h2>
</div>
<div class="container col-md-4">
	<%
		if (qList.get(qnum).type) {
			
	%>
		<div class="col-12" style="height:150px; text-align:center; font-size:25px; font-weight:bold; border-radius:5px">
			<img src = "<%=qList.get(qnum).questionContent%>" style = "width : 200px;">
		</div>
	<%
		} else {
	%>
		<div class="col-12" style="height:150px; padding:50px; background-color: #EAEAEA; text-align:center; font-size:25px; font-weight:bold; border-radius:5px">
			 <label class="form-label">Q : <%=qList.get(qnum).questionContent %></label>
		</div>		
    <%
		}
    %>
		<br><br><br><br>
    <form method="post" action="#">
        <div class="row g-3">
            <button class="w-100 btn-lg" style="background-color: white; color:#558DF0; border:3px solid #558DF0" name = "answer" value = "1"><b>1. <%=qList.get(qnum).example1 %></b></button>
            <button class="w-100 btn-lg" style="background-color: white; color:#558DF0; border:3px solid #558DF0" name = "answer" value = "2"><b>2. <%=qList.get(qnum).example2 %></b></button>
            <button class="w-100 btn-lg" style="background-color: white; color:#558DF0; border:3px solid #558DF0" name = "answer" value = "3"><b>3. <%=qList.get(qnum).example3 %></b></button>
            <button class="w-100 btn-lg" style="background-color: white; color:#558DF0; border:3px solid #558DF0" name = "answer" value = "4"><b>4. <%=qList.get(qnum).example4 %></b></button>
        </div><br><br>
    </form>
</div>
<footer class="bg-light mt-4 p-5 text-center" style="color: #000000;">
    2017112079 윤대현<br>2017112066 정호종<br>
    Copyright &copy; 2021 ddolI98 All Rights Reserved.
</footer>
<script src="./js/jquery.min.js"></script>
<script src="./js/popper.js"></script>
<script src="./js/bootstrap.min.js"></script>
</body>
</html>