package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.*;
import java.util.*;
import com.domain.BigTypeForm;

public final class topThree_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("\r\n");
      com.dao.BigTypeDao big = null;
      synchronized (_jspx_page_context) {
        big = (com.dao.BigTypeDao) _jspx_page_context.getAttribute("big", PageContext.PAGE_SCOPE);
        if (big == null){
          big = new com.dao.BigTypeDao();
          _jspx_page_context.setAttribute("big", big, PageContext.PAGE_SCOPE);
        }
      }
      out.write('\r');
      out.write('\n');
List bigList=(List)big.selectBig();
      out.write("\r\n");
      out.write("<meta http-equiv=\"Content-Type\" content=\"text/html; charset=gb2312\">\r\n");
      out.write("<table width=\"55%\" height=\"22\"  border=\"1\" cellpadding=\"0\" cellspacing=\"0\"  bordercolor=\"#FFFFFF\" bordercolorlight=\"#FFFFFF\" bordercolordark=\"#819BBC\">\r\n");
      out.write("                <tr>\r\n");
      out.write("                  ");

                  String id=request.getParameter("id");
				  if(id==null){
				  id="none";
				  }
                  for(int i=0;i<bigList.size();i++){
                  BigTypeForm bigForm=(BigTypeForm)bigList.get(i);
				  
                    
      out.write("\r\n");
      out.write(" <td  align=\"center\" class=\"linkBlack\" ");
if(id.equals(bigForm.getId().toString())){out.println("bgcolor='#DAD9D9'");}
      out.write("><a href=\"goodsAction.do?action=12&big=");
      out.print(bigForm.getId());
      out.write("&id=");
      out.print(bigForm.getId());
      out.write('"');
      out.write('>');
      out.print(bigForm.getBigName());
      out.write("</a></td>\r\n");
      out.write("                  ");
}
      out.write("\r\n");
      out.write("                </tr>\r\n");
      out.write("</table>\r\n");
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
