/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/9.0.83
 * Generated at: 2023-12-18 09:28:23 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.today_005fnollaeng_005fpage;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class pwho_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.HashMap<java.lang.String,java.lang.Long>(3);
    _jspx_dependants.put("/WEB-INF/lib/taglibs-standard-impl-1.2.5.jar", Long.valueOf(1702876508000L));
    _jspx_dependants.put("jar:file:/C:/final/.metadata/.plugins/org.eclipse.wst.server.core/tmp0/wtpwebapps/final/WEB-INF/lib/taglibs-standard-impl-1.2.5.jar!/META-INF/fmt.tld", Long.valueOf(1425946270000L));
    _jspx_dependants.put("jar:file:/C:/final/.metadata/.plugins/org.eclipse.wst.server.core/tmp0/wtpwebapps/final/WEB-INF/lib/taglibs-standard-impl-1.2.5.jar!/META-INF/c.tld", Long.valueOf(1425946270000L));
  }

  private static final java.util.Set<java.lang.String> _jspx_imports_packages;

  private static final java.util.Set<java.lang.String> _jspx_imports_classes;

  static {
    _jspx_imports_packages = new java.util.HashSet<>();
    _jspx_imports_packages.add("javax.servlet");
    _jspx_imports_packages.add("javax.servlet.http");
    _jspx_imports_packages.add("javax.servlet.jsp");
    _jspx_imports_classes = null;
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

    if (!javax.servlet.DispatcherType.ERROR.equals(request.getDispatcherType())) {
      final java.lang.String _jspx_method = request.getMethod();
      if ("OPTIONS".equals(_jspx_method)) {
        response.setHeader("Allow","GET, HEAD, POST, OPTIONS");
        return;
      }
      if (!"GET".equals(_jspx_method) && !"POST".equals(_jspx_method) && !"HEAD".equals(_jspx_method)) {
        response.setHeader("Allow","GET, HEAD, POST, OPTIONS");
        response.sendError(HttpServletResponse.SC_METHOD_NOT_ALLOWED, "JSP들은 오직 GET, POST 또는 HEAD 메소드만을 허용합니다. Jasper는 OPTIONS 메소드 또한 허용합니다.");
        return;
      }
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
      response.setContentType("text/html; charset=UTF-8");
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
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html lang=\"en\">\r\n");
      out.write("<head>\r\n");
      out.write("<meta charset=\"UTF-8\">\r\n");
      out.write("<meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\r\n");
      out.write("<title>Nollaeng : 누구랑 놀랭?</title>\r\n");
      out.write("<link rel=\"stylesheet\" href=\"../resources/css/bootstrap.css\">\r\n");
      out.write("<link rel=\"stylesheet\" href=\"../resources/css/ptoday.css\">\r\n");
      out.write("\r\n");
      out.write("<script src=\"https://kit.fontawesome.com/7c6041109a.js\"\r\n");
      out.write("	crossorigin=\"anonymous\"></script>\r\n");
      out.write("<link\r\n");
      out.write("	href=\"https://fonts.googleapis.com/css2?family=Black+Han+Sans&family=Nanum+Gothic+Coding:wght@700&family=Nanum+Pen+Script&family=Noto+Sans+KR&display=swap\"\r\n");
      out.write("	rel=\"stylesheet\">\r\n");
      out.write("<script src=\"../resources/js/header_bar.js\" defer></script>	\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("	");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "../header.jsp", out, false);
      out.write("\r\n");
      out.write("	<div class=\"container\">\r\n");
      out.write("		<hr class=\"hr-top\">\r\n");
      out.write("		<div class=\"menu\">\r\n");
      out.write("			<ul>\r\n");
      out.write("				<li><a href=\"pwhere.jsp\">어디서 놀랭?</a></li>\r\n");
      out.write("				<li><a href=\"pwhat.jsp\">뭐하고 놀랭?</a></li>\r\n");
      out.write("				<li><a href=\"pwho.jsp\" id=\"who_nol\">누구랑 놀랭?</a></li>\r\n");
      out.write("			</ul>\r\n");
      out.write("		</div>\r\n");
      out.write("		<hr class=\"hr-bottom\">\r\n");
      out.write("		<div id=\"content\">\r\n");
      out.write("			<h1>WHO</h1>\r\n");
      out.write("			<ul class=\"prod-list\">\r\n");
      out.write("				<li><img src=\"../resources/images/who_card1.jpg\" alt=\"상품1\">\r\n");
      out.write("					<div class=\"caption\">\r\n");
      out.write("						<a href=\"../instar/instar.jsp\"><h2>연인</h2></a>\r\n");
      out.write("						<p></p>\r\n");
      out.write("					</div></li>\r\n");
      out.write("				<li><img src=\"../resources/images/who_card2.png\" alt=\"상품2\">\r\n");
      out.write("					<div class=\"caption\">\r\n");
      out.write("						<a href=\"../instar/instar.jsp\"><h2>친구</h2></a>\r\n");
      out.write("						<p></p>\r\n");
      out.write("					</div></li>\r\n");
      out.write("				<li><img src=\"../resources/images/who_card3.jpg\" alt=\"상품3\">\r\n");
      out.write("					<div class=\"caption\">\r\n");
      out.write("						<a href=\"../instar/instar.jsp\"><h2>가족</h2></a>\r\n");
      out.write("						<p></p>\r\n");
      out.write("					</div></li>\r\n");
      out.write("				<li><img src=\"../resources/images/who_card4.jpg\" alt=\"상품4\">\r\n");
      out.write("					<div class=\"caption\">\r\n");
      out.write("						<a href=\"../instar/instar.jsp\"><h2>학교 친구</h2></a>\r\n");
      out.write("						<p></p>\r\n");
      out.write("					</div></li>\r\n");
      out.write("				<li><img src=\"../resources/images/who_card5.jpg\" alt=\"상품5\">\r\n");
      out.write("					<div class=\"caption\">\r\n");
      out.write("						<a href=\"../instar/instar.jsp\"><h2>반려동물 동반</h2></a>\r\n");
      out.write("						<p></p>\r\n");
      out.write("					</div></li>\r\n");
      out.write("				<li><img src=\"../resources/images/who_card1.png\" alt=\"상품6\">\r\n");
      out.write("					<div class=\"caption\">\r\n");
      out.write("						<a href=\"../instar/instar.jsp\"><h2>홀로</h2></a>\r\n");
      out.write("						<p></p>\r\n");
      out.write("					</div></li>\r\n");
      out.write("\r\n");
      out.write("			</ul>\r\n");
      out.write("		</div>\r\n");
      out.write("\r\n");
      out.write("	</div>\r\n");
      out.write("	");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "../footer.jsp", out, false);
      out.write("\r\n");
      out.write("</body>\r\n");
      out.write("</html>	");
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
