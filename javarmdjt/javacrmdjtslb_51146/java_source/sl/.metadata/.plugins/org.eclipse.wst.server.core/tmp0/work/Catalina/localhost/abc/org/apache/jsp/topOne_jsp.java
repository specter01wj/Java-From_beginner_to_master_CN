package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.*;
import java.util.*;
import com.domain.LinkForm;

public final class topOne_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      com.dao.LinkDao dao = null;
      synchronized (_jspx_page_context) {
        dao = (com.dao.LinkDao) _jspx_page_context.getAttribute("dao", PageContext.PAGE_SCOPE);
        if (dao == null){
          dao = new com.dao.LinkDao();
          _jspx_page_context.setAttribute("dao", dao, PageContext.PAGE_SCOPE);
        }
      }
      out.write("\r\n");
      out.write("<meta http-equiv=\"Content-Type\" content=\"text/html; charset=gb2312\">\r\n");
List list=dao.selectLink();
      out.write("\r\n");
      out.write("<link href=\"css/css.css\" rel=\"stylesheet\" type=\"text/css\">\r\n");
      out.write("<!--table width=\"755\" height=\"106\"  border=\"0\" cellpadding=\"0\" cellspacing=\"0\"  background=\"image/banner.jpg\"-->\r\n");
      out.write("<table width=\"755\" height=\"112\"  border=\"0\" cellpadding=\"0\" cellspacing=\"0\">\r\n");
      out.write("        <tr>\r\n");
      out.write("          <td height=\"106\"><img src=\"image/gougo1.jpg\" width=\"755\" height=\"112\" border=\"0\" usemap=\"#Map\"/></td>\r\n");
      out.write("        </tr>\r\n");
      out.write("</table>\r\n");
      out.write("\r\n");
      out.write("<map name=\"Map\">\r\n");
if(session.getAttribute("id")==null||session.getAttribute("form")==null){
      out.write("\r\n");
      out.write("  <area shape=\"rect\" coords=\"279,68,304,82\" href=\"index.jsp\">\r\n");
      out.write("  <area shape=\"rect\" coords=\"337,68,386,82\" href=\"goodsAction.do?action=14&mark=0\">\r\n");
      out.write("  <area shape=\"rect\" coords=\"414,67,464,82\" href=\"goodsAction.do?action=15&mark=1\">\r\n");
      out.write("  <area shape=\"rect\" coords=\"482,67,555,82\" href=\"connection.jsp\">\r\n");
      out.write("  <area shape=\"rect\" coords=\"567,69,603,81\" href=\"connection.jsp\">\r\n");
      out.write("  <area shape=\"rect\" coords=\"695,67,744,83\" href=\"sell_resultTen.jsp\">\r\n");
      out.write("  <area shape=\"rect\" coords=\"628,68,677,81\" href=\"connection.jsp\">\r\n");
      out.write("  ");
 }else{
      out.write("\r\n");
      out.write("    <area shape=\"rect\" coords=\"279,68,304,82\" href=\"index.jsp\">\r\n");
      out.write("  <area shape=\"rect\" coords=\"337,68,386,82\" href=\"goodsAction.do?action=14&mark=0\">\r\n");
      out.write("  <area shape=\"rect\" coords=\"414,67,464,82\" href=\"goodsAction.do?action=15&mark=1\">\r\n");
      out.write("  <!--area shape=\"rect\" coords=\"482,67,555,82\" href=\"memberAction.do?action=5&id=<!--%=session.getAttribute(\"id\")%>\"-->\r\n");
      out.write("  <area shape=\"rect\" coords=\"482,67,555,82\" href=\"#\" onClick=\"javascript:window.open('memberAction.do?action=5&id=");
      out.print(session.getAttribute("id"));
      out.write("','advertise','width=350,height=450,top=10,left=20')\">\r\n");
      out.write("  <!--area shape=\"rect\" coords=\"569,69,605,81\" href=\"cart_see.jsp\"-->\r\n");
      out.write("  <area shape=\"rect\" coords=\"569,69,605,81\" href=\"#\" onClick=\"javascript:window.open('cart_see.jsp','','width=570,height=300,top=10,left=20')\">\r\n");
      out.write("  <area shape=\"rect\" coords=\"695,67,744,83\" href=\"sell_resultTen.jsp\">\r\n");
      out.write("  <area shape=\"rect\" coords=\"628,68,677,81\" href=\"cart_detail.jsp\">\r\n");
      out.write("  ");
}
      out.write("\r\n");
      out.write("  <area shape=\"rect\" coords=\"504,11,554,23\" href=\"mailto:tmoonbook@sina.com\">\r\n");
      out.write("  <area shape=\"rect\" coords=\"601,9,652,24\" href=\"javascript:window.external.AddFavorite('http://localhost/net','蜀玉电子购物商城')\">\r\n");
      out.write("  <area shape=\"rect\" coords=\"701,9,749,23\"  href=\"#\" onclick=\"this.style.behavior='url(#default#homepage)';this.sethomepage('http://localhost/net')\">\r\n");
      out.write("</map>\r\n");
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
