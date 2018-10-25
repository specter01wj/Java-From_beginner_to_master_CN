package org.apache.jsp.background;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class managerCheck_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List _jspx_dependants;

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.AnnotationProcessor _jsp_annotationprocessor;

  public Object getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_annotationprocessor = (org.apache.AnnotationProcessor) getServletConfig().getServletContext().getAttribute(org.apache.AnnotationProcessor.class.getName());
  }

  public void _jspDestroy() {
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html; charset=gb2312");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<meta http-equiv=\"Content-Type\" content=\"text/html; charset=gb2312\">\r\n");
      out.write("<title>管理员登录</title>\r\n");
      out.write("</head>\r\n");
      out.write(" <link href=\"../css/css1.css\" rel=\"stylesheet\" type=\"text/css\">\r\n");
      out.write(" <script language=\"javascript\">\r\n");
      out.write(" function checkEmpty(){\r\n");
      out.write(" if(document.form.account.value==\"\"){\r\n");
      out.write("  window.alert(\"请输入管理员账号\")\r\n");
      out.write("   document.form.account.focus();\r\n");
      out.write("   return false;\r\n");
      out.write(" }\r\n");
      out.write(" if(document.form.password.value==\"\"){\r\n");
      out.write(" window.alert(\"请输入管理员密码\")\r\n");
      out.write(" document.form.password.focus();\r\n");
      out.write(" return false;\r\n");
      out.write(" }\r\n");
      out.write(" return true;\r\n");
      out.write(" } \r\n");
      out.write(" \r\n");
      out.write(" </script>\r\n");
      out.write("<body onunload=\"quit.jsp\"> \r\n");
      out.write("<br>\r\n");
      out.write("\r\n");
      out.write("<table width=\"452\" height=\"358\"  border=\"0\" align=\"center\" cellpadding=\"0\" cellspacing=\"0\">\r\n");
      out.write("  <tr>\r\n");
      out.write("    <td background=\"../image/land.jpg\">\r\n");
      out.write("\t<form name=\"form\" method=\"post\" action=\"../managerAction.do?action=0\" onSubmit=\"return checkEmpty()\">\r\n");
      out.write("  <table width=\"55%\"  border=\"0\" align=\"center\" cellpadding=\"0\" cellspacing=\"0\">\r\n");
      out.write("    <tr>\r\n");
      out.write("      <td width=\"23%\" height=\"30\"><div align=\"right\"><strong>账号:</strong></div></td>\r\n");
      out.write("      <td width=\"77%\">&nbsp;<input name=\"account\" type=\"text\" size=\"23\"></td>\r\n");
      out.write("    </tr>\r\n");
      out.write("    <tr>\r\n");
      out.write("      <td height=\"30\"><div align=\"right\"><strong>密码:</strong></div></td>\r\n");
      out.write("      <td>&nbsp;<input name=\"password\" type=\"password\" size=\"23\"></td>\r\n");
      out.write("    </tr>\r\n");
      out.write("  </table>\r\n");
      out.write("  <br>\r\n");
      out.write("  <div align=\"center\">&nbsp;\r\n");
      out.write("    <input type=\"submit\" name=\"Submit2\" value=\"提交\">&nbsp;&nbsp;\r\n");
      out.write("    <input type=\"reset\" name=\"reset\" value=\"重置\">&nbsp;&nbsp;\r\n");
      out.write("    <!--input type=\"button\" name=\"submit3\" value=\"返回\" onClick=\"javascript:window.location.href='../index.jsp'\"-->\r\n");
      out.write("  </div>\r\n");
      out.write("</form>\r\n");
      out.write("\t<p>&nbsp;</p>\r\n");
      out.write("\t<p>&nbsp;</p></td>\r\n");
      out.write("  </tr>\r\n");
      out.write("</table>\r\n");
      out.write("<p>&nbsp;</p>\r\n");
      out.write("</body>\r\n");
      out.write("</html>\r\n");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try { out.clearBuffer(); } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
