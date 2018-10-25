package org.apache.jsp.background.goods;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.*;
import java.util.*;
import com.domain.BigTypeForm;
import com.domain.SmallTypeForm;
import com.domain.GoodsForm;

public final class selectContent_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      com.dao.SmallTypeDao small = null;
      synchronized (_jspx_page_context) {
        small = (com.dao.SmallTypeDao) _jspx_page_context.getAttribute("small", PageContext.PAGE_SCOPE);
        if (small == null){
          small = new com.dao.SmallTypeDao();
          _jspx_page_context.setAttribute("small", small, PageContext.PAGE_SCOPE);
        }
      }
      out.write('\r');
      out.write('\n');

GoodsForm goodsForm=(GoodsForm)request.getAttribute("form");


      out.write("\r\n");
      out.write("\r\n");
      out.write("<script language=\"javascript\">\r\n");
      out.write("function checkEmpty(form){\r\n");
      out.write("for(i=0;i<form.length;i++){\r\n");
      out.write("if(form.elements[i].value==\"\"){\r\n");
      out.write("alert(\"表单信息不能为空\");\r\n");
      out.write("return false;\r\n");
      out.write("}\r\n");
      out.write("}\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("</script>\r\n");
      out.write("\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<meta http-equiv=\"Content-Type\" content=\"text/html; charset=gb2312\">\r\n");
      out.write("<title>电子商城的后台</title>\r\n");
      out.write("<link href=\"../../css/css.css\" rel=\"stylesheet\" type=\"text/css\">\r\n");
      out.write("</head>\r\n");
      out.write(" <link href=\"css/css.css\" rel=\"stylesheet\" type=\"text/css\">\r\n");
      out.write("<body>\r\n");
      out.write("<table width=\"755\"  border=\"0\" align=\"center\" cellpadding=\"0\" cellspacing=\"0\">\r\n");
      out.write("\r\n");
      out.write("  <tr valign=\"bottom\">\r\n");
      out.write("    <td height=\"108\" colspan=\"2\" background=\"image/banner1.jpg\" ><div align=\"center\">\r\n");
      out.write(" ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "../upTwo.jsp", out, false);
      out.write("\r\n");
      out.write("    </div></td>\r\n");
      out.write("  </tr>\r\n");
      out.write("  <tr>\r\n");
      out.write("    <td width=\"24%\" height=\"318\">");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "../../leftManager.jsp", out, false);
      out.write("  </td>\r\n");
      out.write("    <td width=\"76%\" height=\"36\" bgcolor=\"#FFFFFF\" class=\"linkBlack\">\r\n");
      out.write("    <div align=\"center\">\t\r\n");
      out.write("\t       <table width=\"99%\" height=\"16\"  border=\"0\" cellpadding=\"0\" cellspacing=\"0\">\r\n");
      out.write("      <tr >\r\n");
      out.write("        <td bgcolor=\"#E6E6E6\" ><div align=\"center\"><font color=\"#990000\"><b>查看商品的详细情况</b></font></div></td>\r\n");
      out.write("      </tr>\r\n");
      out.write("    </table><br><br>\r\n");
      out.write("\t\r\n");
      out.write("\r\n");
      out.write("        <table width=\"90%\" height=\"209\"  border=\"1\" cellpadding=\"0\" cellspacing=\"0\">\r\n");
      out.write("          <tr class=\"zi\">\r\n");
      out.write("            <td width=\"20%\" height=\"26\">&nbsp;&nbsp;所属大类别</td>\r\n");
      out.write("            <td width=\"31%\">&nbsp;&nbsp;");
      out.print(big.selectName(goodsForm.getBig()));
      out.write("</td>\r\n");
      out.write("            <td width=\"20%\">&nbsp;&nbsp;所属于小类别</td>\r\n");
      out.write("            <td width=\"31%\">&nbsp;&nbsp;");
      out.print(small.selectName(goodsForm.getSmall()));
      out.write("</td>\r\n");
      out.write("          </tr>\r\n");
      out.write("          <tr class=\"zi\">\r\n");
      out.write("            <td height=\"26\">&nbsp;&nbsp;商品名称</td>\r\n");
      out.write("            <td>&nbsp;&nbsp;");
      out.print(goodsForm.getName());
      out.write("</td>\r\n");
      out.write("            <td>&nbsp;&nbsp;生产厂商</td>\r\n");
      out.write("            <td>&nbsp;&nbsp;");
      out.print(goodsForm.getFrom());
      out.write("</td>\r\n");
      out.write("          </tr>\r\n");
      out.write("          <tr class=\"zi\">\r\n");
      out.write("            <td height=\"26\">&nbsp;&nbsp;商品定价</td>\r\n");
      out.write("            <td>&nbsp;&nbsp;");
      out.print(goodsForm.getNowPrice());
      out.write("元</td>\r\n");
      out.write("            <td>&nbsp;&nbsp;特价</td>\r\n");
      out.write("            <td>&nbsp;&nbsp;");
      out.print(goodsForm.getFreePrice());
      out.write("元</td>\r\n");
      out.write("          </tr>\r\n");
      out.write("          <tr class=\"zi\">\r\n");
      out.write("            <td height=\"26\">&nbsp;&nbsp;商品描述</td>\r\n");
      out.write("            <td colspan=\"3\">&nbsp;&nbsp;");
      out.print(goodsForm.getIntroduce());
      out.write("</td>\r\n");
      out.write("          </tr>\r\n");
      out.write("          <tr class=\"zi\">\r\n");
      out.write("            <td height=\"79\">&nbsp;&nbsp;商品图片</td>\r\n");
      out.write("            <td colspan=\"3\">&nbsp;&nbsp;<input name=\"imageField\" type=\"image\" src=\"");
      out.print(goodsForm.getPicture());
      out.write("\" width=\"140\" height=\"94\"></td>\r\n");
      out.write("          </tr>\r\n");
      out.write("        </table>\r\n");
      out.write("        <table width=\"90%\"  border=\"0\" cellspacing=\"0\" cellpadding=\"0\">\r\n");
      out.write("          <tr class=\"zi\">\r\n");
      out.write("            ");
String mark=goodsForm.getMark().toString();
      out.write("\r\n");
      out.write("            <td width=\"65%\" height=\"29\" align=\"right\">\t\t\t\r\n");
      out.write("\t\t\t  ");
if(mark.equals("0")){
      out.write("\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t\t");
}else{
      out.write("\r\n");
      out.write("\t\t\t<a href=\"goodsAction.do?action=11&id=");
      out.print(goodsForm.getId());
      out.write("&mark=0\">删除特价信息</a>\r\n");
      out.write("\t\t\t");
}
      out.write("\r\n");
      out.write("\t\t\t&nbsp;&nbsp;</td>\r\n");
      out.write("           \r\n");
      out.write("\t\t    <td width=\"22%\" align=\"right\">\r\n");
      out.write("                        ");
if(mark.equals("0")){
      out.write("\r\n");
      out.write("              <a href=\"goodsAction.do?action=10&id=");
      out.print(goodsForm.getId());
      out.write("\">设置特价商品</a>\r\n");
      out.write("              ");
}else{
      out.write("\r\n");
      out.write("              <a href=\"goodsAction.do?action=10&id=");
      out.print(goodsForm.getId());
      out.write("\">调整特价商品</a>\r\n");
      out.write("              ");
}
      out.write("\r\n");
      out.write("&nbsp;&nbsp;</td>\r\n");
      out.write("            <td width=\"13%\"> <a href=\"javascript:history.back();\">返回</a></td>\r\n");
      out.write("          </tr>\r\n");
      out.write("        </table>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\t  </div></td>\r\n");
      out.write("  </tr>\r\n");
      out.write("  <tr bgcolor=\"#FFFFFF\">\r\n");
      out.write("    <td height=\"60\" colspan=\"2\"><p align=\"center\">");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "../downNews.jsp", out, false);
      out.write("\r\n");
      out.write("\r\n");
      out.write("</p>    </td>\r\n");
      out.write("  </tr>\r\n");
      out.write("</table>\r\n");
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
