package org.apache.jsp.background;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import com.domain.ManagerForm;

public final class upTwo_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<meta http-equiv=\"Content-Type\" content=\"text/html; charset=gb2312\">\r\n");
      out.write("\r\n");
java.util.Date date=new java.util.Date();
      out.write('\r');
      out.write('\n');
ManagerForm manager=(ManagerForm)session.getAttribute("manager");
      out.write('\r');
      out.write('\n');
if(manager==null||manager.equals("")){
      out.write("  \r\n");
      out.write("<meta http-equiv=\"refresh\" content=\"0;URL=background\\connectionFail.jsp\">\r\n");
      out.write("    \r\n");
      out.write("\t  ");
}else{
      out.write("\r\n");
      out.write("\t  <link href=\"../css/css.css\" rel=\"stylesheet\" type=\"text/css\">\r\n");
      out.write("<table width=\"100%\" height=\"15\"  border=\"0\" cellpadding=\"0\" cellspacing=\"0\">\r\n");
      out.write("        <tr>\r\n");
      out.write("          <td width=\"24%\" height=\"18\" class=\"zi\">&nbsp;&nbsp;&nbsp;<font color=\"#FFFFFF\">当前登录的是：");
      out.print(manager.getAccount());
      out.write("</font></td>\r\n");
      out.write("          <td width=\"76%\"><div align=\"right\" class=\"zi\"><font color=\"#FFFFFF\">今天是");
      out.print(date.getYear()+1900);
      out.write('年');
      out.print(date.getMonth()+1);
      out.write('月');
      out.print(date.getDate());
      out.write("日</font>&nbsp;&nbsp;&nbsp;</div></td>\r\n");
      out.write("        </tr>\r\n");
      out.write("      </table>\r\n");
      out.write("\t  ");
}
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
