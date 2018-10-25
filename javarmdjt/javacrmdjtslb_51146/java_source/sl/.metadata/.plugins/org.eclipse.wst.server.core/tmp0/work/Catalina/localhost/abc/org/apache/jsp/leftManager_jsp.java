package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class leftManager_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write(" <script Language=\"JavaScript\">\r\n");
      out.write(" function quit() {\r\n");
      out.write("  if(confirm(\"确定要退出后台吗？\")){\r\n");
      out.write("    window.location.href=\"loginOut.jsp\";\r\n");
      out.write("\t}\r\n");
      out.write("  }\r\n");
      out.write(" </script>\r\n");
      out.write("    <script   language=\"javascript\">   \r\n");
      out.write("  window.onbeforeunload   =   function   ()   \r\n");
      out.write("  {   \r\n");
      out.write("            if   (event.clientY   <   0   &&   event.clientX>document.body.scrollWidth)   {   \r\n");
      out.write("           window.location.href=\"loginOut.jsp\";\r\n");
      out.write("        }   \r\n");
      out.write("  }   \r\n");
      out.write("  </script> \r\n");
      out.write(" <link href=\"css/css.css\" rel=\"stylesheet\" type=\"text/css\">\r\n");
      out.write("<table width=\"182\" border=\"0\" align=\"center\" cellpadding=\"0\" cellspacing=\"0\">\r\n");
      out.write("      <tr>\r\n");
      out.write("        <td height=\"59\" colspan=\"106\" background=\"image/zuocedaohang1.jpg\">       </td>\r\n");
      out.write("      </tr>\r\n");
      out.write("      <tr>\r\n");
      out.write("        <td height=\"55\" colspan=\"106\"   background=\"image/zuocedaohang2.jpg\"><p align=\"center\" class=\"linkBlack\"><a href=\"goodsAction.do?action=0\">商品设置<br>\r\n");
      out.write("        Goods Manager </a></p></td>\r\n");
      out.write("      </tr>\r\n");
      out.write("      <tr>\r\n");
      out.write("        <td height=\"45\" colspan=\"106\" background=\"image/zuocedaohang3.jpg\"><p align=\"center\" class=\"linkBlack\"><a href=\"memberAction.do?action=2\">会员设置<br>\r\n");
      out.write("        Member Manager</a></p></td>\r\n");
      out.write("      </tr>\r\n");
      out.write("      <tr>\r\n");
      out.write("        <td height=\"45\" colspan=\"106\" background=\"image/zuocedaohang4.jpg\"><p align=\"center\" class=\"linkBlack\"><a href=\"managerAction.do?action=1\">后台管理员设置<br>\r\n");
      out.write("        Administrator Manager </a></p></td>\r\n");
      out.write("      </tr>\r\n");
      out.write("      <tr>\r\n");
      out.write("        <td height=\"45\" colspan=\"106\" background=\"image/zuocedaohang5.jpg\"><p align=\"center\" class=\"linkBlack\"><a href=\"orderAction.do?action=0\">订单设置<br>\r\n");
      out.write("        Order Manager</a></p></td>\r\n");
      out.write("      </tr>\r\n");
      out.write("      <tr>\r\n");
      out.write("        <td height=\"45\" colspan=\"106\" background=\"image/zuocedaohang6.jpg\"><p align=\"center\" class=\"linkBlack\"><a href=\"afficheAction.do?action=0\">公告设置<br>\r\n");
      out.write("        Manager Placard</a> </p></td>\r\n");
      out.write("      </tr>\r\n");
      out.write("\t    <tr>\r\n");
      out.write("        <td height=\"45\" colspan=\"106\" background=\"image/zuocedaohang7.jpg\"><p align=\"center\" class=\"linkBlack\"><a href=\"linkAction.do?action=0\">友情连接设置<br>\r\n");
      out.write("        Link Manager </a></p></td>\r\n");
      out.write("      </tr>\r\n");
      out.write("      <tr>\r\n");
      out.write("        <td colspan=\"106\" height=\"62\"   background=\"image/zuocedaohang8.jpg\" class=\"linkBlack\"><p align=\"center\"><a href=\"javascript:quit()\">退出后台<br>\r\n");
      out.write("        Exit Background </a></p></td>\r\n");
      out.write("      </tr>\r\n");
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
