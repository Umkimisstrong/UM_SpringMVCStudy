/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/8.5.54
 * Generated at: 2022-05-27 03:49:13 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class EmployeeInsertForm_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.HashMap<java.lang.String,java.lang.Long>(2);
    _jspx_dependants.put("/WEB-INF/lib/standard.jar", Long.valueOf(1653527314000L));
    _jspx_dependants.put("jar:file:/C:/SpringMVCStudy/.metadata/.plugins/org.eclipse.wst.server.core/tmp0/wtpwebapps/mvc04/WEB-INF/lib/standard.jar!/META-INF/c.tld", Long.valueOf(1098678690000L));
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

  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fc_005fimport_0026_005furl_005fnobody;

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
    _005fjspx_005ftagPool_005fc_005fimport_0026_005furl_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
  }

  public void _jspDestroy() {
    _005fjspx_005ftagPool_005fc_005fimport_0026_005furl_005fnobody.release();
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
      throws java.io.IOException, javax.servlet.ServletException {

    final java.lang.String _jspx_method = request.getMethod();
    if (!"GET".equals(_jspx_method) && !"POST".equals(_jspx_method) && !"HEAD".equals(_jspx_method) && !javax.servlet.DispatcherType.ERROR.equals(request.getDispatcherType())) {
      response.sendError(HttpServletResponse.SC_METHOD_NOT_ALLOWED, "JSPs only permit GET, POST or HEAD. Jasper also permits OPTIONS");
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

	request.setCharacterEncoding("UTF-8");
	String cp = request.getContextPath();

      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<meta charset=\"UTF-8\">\r\n");
      out.write("<title>EmployeeInsertForm.jsp</title>\r\n");
      out.write("<link rel=\"stylesheet\" type=\"text/css\" href=\"");
      out.print(cp );
      out.write("/css/main.css\">\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("\r\n");
      out.write("<!-- --------------------------\r\n");
      out.write("\t#20 EmployeeInsertForm.jsp\r\n");
      out.write("\t- 직원 데이터 입력 페이지 \r\n");
      out.write("-------------------------- -->\r\n");
      out.write("\r\n");
      out.write("<div>\r\n");
      out.write("\t<!-- 메뉴 영역 -->\r\n");
      out.write("\t<div>\r\n");
      out.write("\t\t");
      if (_jspx_meth_c_005fimport_005f0(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("\t</div>\r\n");
      out.write("\t\r\n");
      out.write("\t<!-- 콘텐츠 영역 -->\r\n");
      out.write("\t<div id=\"content\">\r\n");
      out.write("\t\t<h1>[ 직원 추가 ]</h1>\r\n");
      out.write("\t\t<hr />\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t<form action=\"\" method=\"post\" id=\"employeeForm\">\r\n");
      out.write("\t\t\t<table>\r\n");
      out.write("\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t<th>이름</th>\r\n");
      out.write("\t\t\t\t\t<td>\r\n");
      out.write("\t\t\t\t\t\t<input type=\"text\" id=\"name\" name=\"name\" placeholder=\"이름\"/>\r\n");
      out.write("\t\t\t\t\t</td>\r\n");
      out.write("\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t<th>주민번호</th>\r\n");
      out.write("\t\t\t\t\t<td>\r\n");
      out.write("\t\t\t\t\t\t<input type=\"text\" id=\"ssn1\" name=\"ssn1\" style=\"width: 100px;\"\r\n");
      out.write("\t\t\t\t\t\tplaceholder=\"앞 6자리\"/>\r\n");
      out.write("\t\t\t\t\t\t-\r\n");
      out.write("\t\t\t\t\t\t<input type=\"password\" id=\"ssn2\" name=\"ssn2\" style=\"width: 110px\"\r\n");
      out.write("\t\t\t\t\t\tplaceholder=\"뒤 7자리\" />\r\n");
      out.write("\t\t\t\t\t</td>\r\n");
      out.write("\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t<th>생년월일</th>\r\n");
      out.write("\t\t\t\t\t<td>\r\n");
      out.write("\t\t\t\t\t\t<input type=\"text\" id=\"birthday\" name=\"birthday\" placeholder=\"생년월일\" />\r\n");
      out.write("\t\t\t\t\t</td>\r\n");
      out.write("\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t<th>양/음력</th>\r\n");
      out.write("\t\t\t\t\t<td>\r\n");
      out.write("\t\t\t\t\t\t<input type=\"radio\" value=\"0\" name=\"lunar\" id=\"lunar0\" checked=\"checked\"/>\r\n");
      out.write("\t\t\t\t\t\t<label for=\"lunar0\">양력</label>\r\n");
      out.write("\t\t\t\t\t\t<input type=\"radio\" value=\"1\" name=\"lunar\" id=\"lunar1\" />\r\n");
      out.write("\t\t\t\t\t\t<label for=\"lunar1\">음력</label>\r\n");
      out.write("\t\t\t\t\t</td>\r\n");
      out.write("\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t\r\n");
      out.write("\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t<th>전화번호</th>\r\n");
      out.write("\t\t\t\t\t<td>\r\n");
      out.write("\t\t\t\t\t\t<input type=\"text\" id=\"telephone\" name=\"telephone\" placeholder=\"전화번호\" />\r\n");
      out.write("\t\t\t\t\t</td>\r\n");
      out.write("\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t\r\n");
      out.write("\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t<th>지역</th>\r\n");
      out.write("\t\t\t\t\t<td>\r\n");
      out.write("\t\t\t\t\t\t<select name=\"regionId\" id=\"regionId\">\r\n");
      out.write("\t\t\t\t\t\t\t<option value=\"1\">강북</option>\r\n");
      out.write("\t\t\t\t\t\t\t<option value=\"2\">강남</option>\r\n");
      out.write("\t\t\t\t\t\t\t<option value=\"3\">마포</option>\r\n");
      out.write("\t\t\t\t\t\t\t<option value=\"4\">서대문</option>\r\n");
      out.write("\t\t\t\t\t\t\t<option value=\"5\">은평</option>\r\n");
      out.write("\t\t\t\t\t\t</select>\r\n");
      out.write("\t\t\t\t\t</td>\r\n");
      out.write("\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t\r\n");
      out.write("\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t<th>부서</th>\r\n");
      out.write("\t\t\t\t\t<td>\r\n");
      out.write("\t\t\t\t\t\t<select name=\"departmentId\" id=\"departmentId\">\r\n");
      out.write("\t\t\t\t\t\t\t<option value=\"1\">독서부</option>\r\n");
      out.write("\t\t\t\t\t\t\t<option value=\"2\">원예부</option>\r\n");
      out.write("\t\t\t\t\t\t\t<option value=\"3\">축구부</option>\r\n");
      out.write("\t\t\t\t\t\t\t<option value=\"4\">야구부</option>\r\n");
      out.write("\t\t\t\t\t\t</select>\r\n");
      out.write("\t\t\t\t\t</td>\t\t\t\r\n");
      out.write("\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t\r\n");
      out.write("\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t<th>직위</th>\r\n");
      out.write("\t\t\t\t\t<td>\r\n");
      out.write("\t\t\t\t\t\t<select name=\"positionId\" id=\"positionId\">\r\n");
      out.write("\t\t\t\t\t\t\t<option value=\"1\">팀장</option>\r\n");
      out.write("\t\t\t\t\t\t\t<option value=\"2\">기술고문</option>\r\n");
      out.write("\t\t\t\t\t\t\t<option value=\"3\">팀원</option>\r\n");
      out.write("\t\t\t\t\t\t\t<option value=\"4\">엑스맨</option>\r\n");
      out.write("\t\t\t\t\t\t</select>\r\n");
      out.write("\t\t\t\t\t</td>\t\t\t\r\n");
      out.write("\t\t\t\t\r\n");
      out.write("\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t\r\n");
      out.write("\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t<th>기본급</th>\r\n");
      out.write("\t\t\t\t\t<td>\r\n");
      out.write("\t\t\t\t\t\t<input type=\"text\" id=\"basicPay\" name=\"basicPay\">\r\n");
      out.write("\t\t\t\t\t\t(최소기본급 <span id=\"minBasicPay\"\r\n");
      out.write("\t\t\t\t\t\tstyle=\"color: red; font-weight: bold\">2000000</span>원)\r\n");
      out.write("\t\t\t\t\t</td>\r\n");
      out.write("\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t\r\n");
      out.write("\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t<th>수당</th>\r\n");
      out.write("\t\t\t\t\t<td>\r\n");
      out.write("\t\t\t\t\t\t<input type=\"text\" id=\"extraPay\" name=\"extraPay\"/>\r\n");
      out.write("\t\t\t\t\t</td>\r\n");
      out.write("\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t\r\n");
      out.write("\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t<td colspan=\"2\" align=\"center\">\r\n");
      out.write("\t\t\t\t\t\t<br /><br />\r\n");
      out.write("\t\t\t\t\t\t<button type=\"button\" class=\"btn\" id=\"submitBtn\"\r\n");
      out.write("\t\t\t\t\t\tstyle=\"width: 40%; height: 50px;\">직원 추가</button>\r\n");
      out.write("\t\t\t\t\t\t<button type=\"button\" class=\"btn\" id=\"listBtn\"\r\n");
      out.write("\t\t\t\t\t\tstyle=\"width: 40%; height: 50px;\">직원 리스트</button>\r\n");
      out.write("\t\t\t\t\t\t<br /><br />\r\n");
      out.write("\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t<span id=\"err\" style=\"color: red; font-weight: bold; display: none;\"></span>\r\n");
      out.write("\t\t\t\t\t</td>\r\n");
      out.write("\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t\r\n");
      out.write("\t\t\t</table>\r\n");
      out.write("\t\t</form>\r\n");
      out.write("\t</div>\r\n");
      out.write("\t\r\n");
      out.write("\t\r\n");
      out.write("\t<!-- 회사 소개 및 어플리케이션 소개 영역 -->\r\n");
      out.write("\t<div id=\"footer\">\r\n");
      out.write("\t</div>\r\n");
      out.write("\t\r\n");
      out.write("\t\r\n");
      out.write("</div>\r\n");
      out.write("\r\n");
      out.write("\r\n");
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

  private boolean _jspx_meth_c_005fimport_005f0(javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  c:import
    org.apache.taglibs.standard.tag.rt.core.ImportTag _jspx_th_c_005fimport_005f0 = (org.apache.taglibs.standard.tag.rt.core.ImportTag) _005fjspx_005ftagPool_005fc_005fimport_0026_005furl_005fnobody.get(org.apache.taglibs.standard.tag.rt.core.ImportTag.class);
    boolean _jspx_th_c_005fimport_005f0_reused = false;
    try {
      _jspx_th_c_005fimport_005f0.setPageContext(_jspx_page_context);
      _jspx_th_c_005fimport_005f0.setParent(null);
      // /EmployeeInsertForm.jsp(24,2) name = url type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_c_005fimport_005f0.setUrl("EmployeeMenu.jsp");
      int[] _jspx_push_body_count_c_005fimport_005f0 = new int[] { 0 };
      try {
        int _jspx_eval_c_005fimport_005f0 = _jspx_th_c_005fimport_005f0.doStartTag();
        if (_jspx_th_c_005fimport_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
          return true;
        }
      } catch (java.lang.Throwable _jspx_exception) {
        while (_jspx_push_body_count_c_005fimport_005f0[0]-- > 0)
          out = _jspx_page_context.popBody();
        _jspx_th_c_005fimport_005f0.doCatch(_jspx_exception);
      } finally {
        _jspx_th_c_005fimport_005f0.doFinally();
      }
      _005fjspx_005ftagPool_005fc_005fimport_0026_005furl_005fnobody.reuse(_jspx_th_c_005fimport_005f0);
      _jspx_th_c_005fimport_005f0_reused = true;
    } finally {
      org.apache.jasper.runtime.JspRuntimeLibrary.releaseTag(_jspx_th_c_005fimport_005f0, _jsp_getInstanceManager(), _jspx_th_c_005fimport_005f0_reused);
    }
    return false;
  }
}