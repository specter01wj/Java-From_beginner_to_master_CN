package org.apache.jsp.member;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import com.domain.MemberForm;
import com.tool.Chinese;

public final class checkMemberResult_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("\r\n");
      out.write("\r\n");
      com.dao.MemberDao dao = null;
      synchronized (_jspx_page_context) {
        dao = (com.dao.MemberDao) _jspx_page_context.getAttribute("dao", PageContext.PAGE_SCOPE);
        if (dao == null){
          dao = new com.dao.MemberDao();
          _jspx_page_context.setAttribute("dao", dao, PageContext.PAGE_SCOPE);
        }
      }
      out.write("\r\n");
      out.write("\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<meta http-equiv=\"Content-Type\" content=\"text/html; charset=gb2312\">\r\n");
      out.write("<title>会员登录结果</title>\r\n");
      out.write("</head>\r\n");
      out.write(" <link href=\"../css/css.css\" rel=\"stylesheet\" type=\"text/css\">\r\n");
      out.write("\r\n");
      out.write("<body>\r\n");
      out.write("<p>&nbsp;</p>\r\n");
      out.write("<div align=\"center\">\r\n");
      out.write("  <p><strong>\r\n");
      out.write("    ");
if(request.getAttribute("result")==null){
      out.write("\r\n");
      out.write("    ");

      String id=(String)request.getAttribute("id");
      MemberForm form=(MemberForm)request.getAttribute("memberForm");
	  session.setAttribute("id",id);
      session.setAttribute("form",form);
    
      out.write("\r\n");
      out.write("<!--  meta http-equiv=\"refresh\" content=\"0;URL=index.jsp\"-->\r\n");
response.sendRedirect("index.jsp"); 
      out.write("\r\n");
      out.write("  ");
}else{
      out.write("\r\n");
      out.write("      ");

	  String result=(String)request.getAttribute("result");
	  
      out.write("\r\n");
      out.write("\t  <script language='javascript'>alert('");
      out.print(result);
      out.write("');window.location.href='index.jsp';</script>\r\n");
      out.write("\r\n");
      out.write("  ");
}
      out.write(" \r\n");
      out.write("  </strong></p>\r\n");
      out.write("\t\r\n");
      out.write("</div>\r\n");
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
