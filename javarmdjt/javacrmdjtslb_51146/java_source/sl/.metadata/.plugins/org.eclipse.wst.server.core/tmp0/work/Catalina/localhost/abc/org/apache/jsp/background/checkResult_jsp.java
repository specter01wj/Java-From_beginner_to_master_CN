package org.apache.jsp.background;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.*;

public final class checkResult_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      			"", true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\r\n");
      out.write("\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write(" <link href=\"../css/css.css\" rel=\"stylesheet\" type=\"text/css\">\r\n");
      out.write("<meta http-equiv=\"Content-Type\" content=\"text/html; charset=gb2312\">\r\n");
      out.write("<title>登录结果</title>\r\n");
      out.write("  <!--script   language=\"javascript\">   \r\n");
      out.write("  window.onbeforeunload   =   function   ()   \r\n");
      out.write("  {   \r\n");
      out.write("            if   (event.clientY   <   0   &&   event.clientX>document.body.scrollWidth)   {   \r\n");
      out.write("           window.location.href=\"loginOut.jsp\";\r\n");
      out.write("        }   \r\n");
      out.write("  }   \r\n");
      out.write("  </script-->  \r\n");
      out.write("</head>\r\n");
      out.write("\r\n");
      out.write("<body onunload=\"quit.jsp\">\r\n");
      out.write("<p>&nbsp;</p>\r\n");
      out.write("<p align=\"center\">\t");

	System.out.println(request.getAttribute("result")==null);
	if(request.getAttribute("result")==null){
      out.write('\r');
      out.write('\n');
      out.write('	');
session.setAttribute("manager",request.getAttribute("manager"));
       session.setMaxInactiveInterval(3600);
	   response.sendRedirect("orderAction.do?action=0");
	   
      out.write("\r\n");
      out.write("\t<!--meta http-equiv=\"refresh\" content=\"0;URL=orderAction.do?action=0\"-->\r\n");
      out.write("\t");
}else{
      out.write("\r\n");
      out.write("\t      ");

		   String result=(String)request.getAttribute("result");
		  
      out.write("\r\n");
      out.write("\t\t    <script language='javascript'>alert('");
      out.print(result);
      out.write("');window.location.href='background/managerCheck.jsp';</script>\r\n");
      out.write("\r\n");
      out.write("\t");
}
      out.write("\r\n");
      out.write("\t</p>\r\n");
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
