/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/8.5.72
 * Generated at: 2021-12-11 07:24:44 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.io.PrintWriter;
import question.*;
import user.*;
import java.util.ArrayList;

public final class resultQuiz_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  private static final java.util.Set<java.lang.String> _jspx_imports_packages;

  private static final java.util.Set<java.lang.String> _jspx_imports_classes;

  static {
    _jspx_imports_packages = new java.util.HashSet<>();
    _jspx_imports_packages.add("javax.servlet");
    _jspx_imports_packages.add("javax.servlet.http");
    _jspx_imports_packages.add("question");
    _jspx_imports_packages.add("javax.servlet.jsp");
    _jspx_imports_packages.add("user");
    _jspx_imports_classes = new java.util.HashSet<>();
    _jspx_imports_classes.add("java.io.PrintWriter");
    _jspx_imports_classes.add("java.util.ArrayList");
  }

  private volatile javax.el.ExpressionFactory _el_expressionfactory;
  private volatile org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public java.util.Set<java.lang.String> getPackageImports() {
    return _jspx_imports_packages;
  }

  public java.util.Set<java.lang.String> getClassImports() {
    return _jspx_imports_classes;
  }

  public javax.el.ExpressionFactory _jsp_getExpressionFactory() {
    if (_el_expressionfactory == null) {
      synchronized (this) {
        if (_el_expressionfactory == null) {
          _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
        }
      }
    }
    return _el_expressionfactory;
  }

  public org.apache.tomcat.InstanceManager _jsp_getInstanceManager() {
    if (_jsp_instancemanager == null) {
      synchronized (this) {
        if (_jsp_instancemanager == null) {
          _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
        }
      }
    }
    return _jsp_instancemanager;
  }

  public void _jspInit() {
  }

  public void _jspDestroy() {
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
      throws java.io.IOException, javax.servlet.ServletException {

    final java.lang.String _jspx_method = request.getMethod();
    if (!"GET".equals(_jspx_method) && !"POST".equals(_jspx_method) && !"HEAD".equals(_jspx_method) && !javax.servlet.DispatcherType.ERROR.equals(request.getDispatcherType())) {
      response.sendError(HttpServletResponse.SC_METHOD_NOT_ALLOWED, "JSP들은 오직 GET, POST 또는 HEAD 메소드만을 허용합니다. Jasper는 OPTIONS 메소드 또한 허용합니다.");
      return;
    }

    final javax.servlet.jsp.PageContext pageContext;
    javax.servlet.http.HttpSession session = null;
    final javax.servlet.ServletContext application;
    final javax.servlet.ServletConfig config;
    javax.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    javax.servlet.jsp.JspWriter _jspx_out = null;
    javax.servlet.jsp.PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("    <meta http-equiv=\"Content-Type\" content=\"text/html\"; charset=\"UTF-8\">\r\n");
      out.write("    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1, shrink-to-fit=no\">\r\n");
      out.write("    <title>동퀴콘</title>\r\n");
      out.write("    <link rel=\"stylesheet\" href=\"./css/bootstrap.min.css\">\r\n");
      out.write("    <link rel=\"stylesheet\" href=\"./css/custom.css\">\r\n");
      out.write("    <link rel=\"icon\" href=\"./img/favicon.png\">\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("<nav class=\"navbar navbar-expand-lg navbar-light fixed-top shadow-sm\" style=\"background-color: #558DF0;\">\r\n");
      out.write("    <div class=\"container-xxl d-flex align-items-md-center\" style=\"width:1200px\">\r\n");
      out.write("        <a class=\"navbar-brand\" href=\"index.jsp\"><img src=\"./img/mainIcon.png\" class=\"rounded float-start\" width=\"120\"></a>\r\n");
      out.write("        <button class=\"navbar-toggler\" type=\"button\" data-bs-toggle=\"collapse\" data-bs-target=\"#navbarSupportedContent\" aria-controls=\"navbarSupportedContent\" aria-expanded=\"false\" aria-label=\"Toggle navigation\">\r\n");
      out.write("            <span class=\"navbar-toggler-icon\"></span>\r\n");
      out.write("        </button>\r\n");
      out.write("        <div class=\"collapse navbar-collapse\" id=\"navbarSupportedContent\">\r\n");
      out.write("            <ul class=\"navbar-nav me-auto\">\r\n");
      out.write("                <li class=\"nav-item\">\r\n");
      out.write("                    <a class=\"nav-link\" href=\"#\" style=\"font-size:15pt; color:white;\"><b>퀴즈 시작하기</b></a>\r\n");
      out.write("                </li>\r\n");
      out.write("                <li class=\"nav-item\">\r\n");
      out.write("                    <a class=\"nav-link\" href=\"registerQuiz.jsp\" style=\"font-size:15pt; color:white;\"><b>퀴즈 만들기</b></a>\r\n");
      out.write("                </li>\r\n");
      out.write("            </ul>\r\n");
      out.write("            ");

                String LoginID = null;
                String UserName = null;
                if(session.getAttribute("loginID") != null) {
                    LoginID = (String) session.getAttribute("LoginID");
                    UserName = (String) session.getAttribute("UserName");
                }
                if(LoginID == null) {
            
      out.write("\r\n");
      out.write("            <ul class=\"navbar-nav\">\r\n");
      out.write("                <a class=\"nav-link\" aria-current=\"page\" href=\"signUp.jsp\" style=\"color:white\">회원가입</a>\r\n");
      out.write("                <a class=\"btn btn-outline-primary\" href=\"login.jsp\" style=\"border-color: white; color: white\">로그인</a>\r\n");
      out.write("            </ul>\r\n");
      out.write("            ");

            } else {
            
      out.write("\r\n");
      out.write("            <ul class=\"navbar-nav d-flex\">\r\n");
      out.write("                <li class=\"nav-item dropdown\">\r\n");
      out.write("                    <a class=\"nav-link dropdown-toggle\" href=\"#\" id=\"navbarDropdown\" role=\"button\" data-bs-toggle=\"dropdown\" aria-expanded=\"false\" style=\"color: white\">\r\n");
      out.write("                        ");
      out.print(UserName );
      out.write(" 님\r\n");
      out.write("                    </a>\r\n");
      out.write("                    <ul class=\"dropdown-menu\" aria-labelledby=\"navbarDropdown\" style=\"background-color: #558DF0;\">\r\n");
      out.write("                        <li><a class=\"dropdown-item\" href=\"myPage.jsp\" style=\"color: white\">마이페이지</a></li>\r\n");
      out.write("                        <li><a class=\"dropdown-item\" href=\"#\" style=\"color: white\">1:1 문의</a></li>\r\n");
      out.write("                        <li><hr class=\"dropdown-divider\" style=\"color: white\"></li>\r\n");
      out.write("                        <li><a class=\"dropdown-item\" href=\"logout.jsp\" style=\"color: white\">로그아웃</a></li>\r\n");
      out.write("                    </ul>\r\n");
      out.write("                </li>\r\n");
      out.write("            </ul>\r\n");
      out.write("            ");

                }
            
      out.write("\r\n");
      out.write("        </div>\r\n");
      out.write("    </div>\r\n");
      out.write("</nav>\r\n");
      out.write("<br><br><br><br>\r\n");
      out.write("<div class=\"py-5 text-center\">\r\n");
      out.write("</div>\r\n");
      out.write("<div class=\"container col-md-4\" style=\"text-align:center\">\r\n");

	int score = Integer.parseInt(request.getParameter("score"));
	if(score>=8) {

      out.write("\r\n");
      out.write("	<h2 style=\"color:#B3E59F\"><b>&nbsp;GOOD!</b></h2>\r\n");
      out.write("	<img src=\"img/excellent.png\" style=\"width: 300px;height:300px\">\r\n");
      out.write("	<div class=\"col-12\" style=\"height:100px; padding:30px; background-color: #B3E59F; text-align:center; font-size:25px; font-weight:bold; border-radius:5px\">\r\n");
      out.write("			 <label class=\"form-label\" style=\"color:white; font-size:30px;\">당신의 점수는 10점 만점의 ");
      out.print(score );
      out.write("점</label>\r\n");
      out.write("	</div>\r\n");

	} else if(score>=3 && score<=7) { 

      out.write("\r\n");
      out.write("	<h2 style=\"color:#FFE07D\"><b>&nbsp;NOT BAD!</b></h2>\r\n");
      out.write("	<img src=\"img/good.png\" style=\"width: 300px;height:300px\">\r\n");
      out.write("	<div class=\"col-12\" style=\"height:100px; padding:30px; background-color: #FFE07D; text-align:center; font-size:25px; font-weight:bold; border-radius:5px\">\r\n");
      out.write("			 <label class=\"form-label\" style=\"color:white; font-size:30px;\">당신의 점수는 10점 만점의 ");
      out.print(score );
      out.write("점</label>\r\n");
      out.write("	</div>\r\n");

	} else {

      out.write("\r\n");
      out.write("	<h2 style=\"color:#DA387D\"><b>&nbsp;BAD!</b></h2>\r\n");
      out.write("	<img src=\"img/bad.png\" style=\"width: 300px;height:300px\">\r\n");
      out.write("	<div class=\"col-12\" style=\"height:100px; padding:30px; background-color: #DA387D; text-align:center; font-size:25px; font-weight:bold; border-radius:5px\">\r\n");
      out.write("			 <label class=\"form-label\" style=\"color:white; font-size:30px;\">당신의 점수는 10점 만점의 ");
      out.print(score );
      out.write("점</label>\r\n");
      out.write("	</div>\r\n");

	}
	String Score = request.getParameter("score");
	String ID = String.valueOf(session.getAttribute("LoginID"));
	int result1;
	String result2;
	
	result1 = userDAO.addScore(Score, ID);
	if(result1 == 1) {
		session.setAttribute("score", 0);
	} else {
		PrintWriter script = response.getWriter();
	    script.println("<script>");
	    script.println("alert('update 데이터베이스 오류');");
	    script.println("history.back();");
	    script.println("</script>");
	    script.close();
	}
	
	result2 = userDAO.searchScore(ID);
	if(result2 != null) {

      out.write("\r\n");
      out.write("	<br><br><br><h2>");
      out.print(UserName );
      out.write("님의 총 점수 : ");
      out.print(result2 );
      out.write("점</h2>\r\n");

	} else {
		PrintWriter script = response.getWriter();
	    script.println("<script>");
	    script.println("alert('select 데이터베이스 오류');");
	    script.println("history.back();");
	    script.println("</script>");
	    script.close();
	}

      out.write("\r\n");
      out.write("	<br><br><br><br>\r\n");
      out.write("	<a href=\"ranking.jsp\" style=\"color:black; font-size:30px;\">랭킹 확인하러가기</a>\r\n");
      out.write("</div><br><br><br><br>\r\n");
      out.write("<footer class=\"bg-light mt-4 p-5 text-center\" style=\"color: #000000;\">\r\n");
      out.write("    2017112079 윤대현<br>2017112066 정호종<br>\r\n");
      out.write("    Copyright &copy; 2021 ddolI98 All Rights Reserved.\r\n");
      out.write("</footer>\r\n");
      out.write("<script src=\"./js/jquery.min.js\"></script>\r\n");
      out.write("<script src=\"./js/popper.js\"></script>\r\n");
      out.write("<script src=\"./js/bootstrap.min.js\"></script>\r\n");
      out.write("</body>\r\n");
      out.write("</html>");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof javax.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try {
            if (response.isCommitted()) {
              out.flush();
            } else {
              out.clearBuffer();
            }
          } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
