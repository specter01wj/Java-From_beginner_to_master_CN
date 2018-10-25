package org.apache.jsp.background.goods;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.*;
import java.util.*;
import com.domain.GoodsForm;

public final class goodSelect_jsp extends org.apache.jasper.runtime.HttpJspBase
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

List list=(List)request.getAttribute("list");
int number=Integer.parseInt((String)request.getAttribute("number"));
int maxPage=Integer.parseInt((String)request.getAttribute("maxPage"));
int pageNumber=Integer.parseInt((String)request.getAttribute("pageNumber"));
int start=number*6;//开始条数
int over=(number+1)*6;//结束条数
int count=pageNumber-over;//还剩多少条记录
if(count<=0){
  over=pageNumber;
  }

      out.write("\r\n");
      out.write(" <script Language=\"JavaScript\">\r\n");
      out.write(" function deleteType(date) {\r\n");
      out.write("  if(confirm(\"确定要删除吗？\")){\r\n");
      out.write("    window.location=\"goodsAction.do?action=6&id=\"+date;\r\n");
      out.write("\t}\r\n");
      out.write("  }\r\n");
      out.write(" </script>\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<meta http-equiv=\"Content-Type\" content=\"text/html; charset=gb2312\">\r\n");
      out.write("<title>电子商城的后台</title>\r\n");
      out.write("<script language=\"JavaScript\" type=\"text/JavaScript\">\r\n");
      out.write("<!--\r\n");
      out.write("function MM_reloadPage(init) {  //reloads the window if Nav4 resized\r\n");
      out.write("  if (init==true) with (navigator) {if ((appName==\"Netscape\")&&(parseInt(appVersion)==4)) {\r\n");
      out.write("    document.MM_pgW=innerWidth; document.MM_pgH=innerHeight; onresize=MM_reloadPage; }}\r\n");
      out.write("  else if (innerWidth!=document.MM_pgW || innerHeight!=document.MM_pgH) location.reload();\r\n");
      out.write("}\r\n");
      out.write("MM_reloadPage(true);\r\n");
      out.write("//-->\r\n");
      out.write("</script>\r\n");
      out.write("<style type=\"text/css\">\r\n");
      out.write("<!--\r\n");
      out.write(".style1 {\r\n");
      out.write("\tcolor: #990000;\r\n");
      out.write("\tfont-weight: bold;\r\n");
      out.write("}\r\n");
      out.write("-->\r\n");
      out.write("</style>\r\n");
      out.write("\r\n");
      out.write("<link href=\"../../css/css.css\" rel=\"stylesheet\" type=\"text/css\">\r\n");
      out.write("</head>\r\n");
      out.write("\r\n");
      out.write("<body >\r\n");
      out.write("<div id=\"Layer1\" style=\"position:absolute; left:330px; top:129px; width:517px; height:23px; z-index:1\" class=\"linkBlack\">\r\n");
      out.write("  <div align=\"right\"><a href=\"goodsAction.do?action=0\" >商品查询</a>&nbsp;&nbsp;&nbsp;&nbsp;<a href=\"bigTypeAction.do?action=0\">大类别查询</a>&nbsp;&nbsp;&nbsp;&nbsp;<a href=\"smallTypeAction.do?action=0\">小类别查询</a>&nbsp;&nbsp;&nbsp;&nbsp;<a href=\"javascript:history.go(-1)\">返回</a>&nbsp;&nbsp;</div>\r\n");
      out.write("</div>\r\n");
      out.write("<table width=\"755\"  border=\"0\" align=\"center\" cellpadding=\"0\" cellspacing=\"0\">\r\n");
      out.write("  <tr valign=\"bottom\">\r\n");
      out.write("    <td colspan=\"2\" background=\"image/banner1.jpg\"  height=\"108\">     <div align=\"center\">\r\n");
      out.write("   ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "../upTwo.jsp", out, false);
      out.write("\r\n");
      out.write("      </div></td>\r\n");
      out.write("  </tr>\r\n");
      out.write("  <tr>\r\n");
      out.write("    <td width=\"24%\" height=\"390\"valign=\"top\">");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "../../leftManager.jsp", out, false);
      out.write("  </td>\r\n");
      out.write("    <td width=\"76%\" bgcolor=\"#FFFFFF\"><div align=\"center\">\r\n");
      out.write("      <table width=\"90%\" height=\"16\"  border=\"0\" cellpadding=\"0\" cellspacing=\"0\">\r\n");
      out.write("      <tr >\r\n");
      out.write("        <td bgcolor=\"#E6E6E6\" ><div align=\"center\" class=\"dhz\"><font color=\"#990000\"><b>商品信息查询</b></font></div></td>\r\n");
      out.write("      </tr>\r\n");
      out.write("    </table>\r\n");
      out.write("\t  <table width=\"90%\"  border=\"1\" cellspacing=\"0\" cellpadding=\"0\">\r\n");
      out.write("        <tr class=\"zi\">\r\n");
      out.write("          <td width=\"14%\"><div align=\"center\">数据编号</div></td>\r\n");
      out.write("          <td width=\"19%\"><div align=\"center\">商品名称</div></td>\r\n");
      out.write("          <td width=\"14%\"><div align=\"center\">大类别</div></td>\r\n");
      out.write("          <td width=\"14%\"><div align=\"center\">小类别</div></td>\r\n");
      out.write("          <td width=\"14%\"><div align=\"center\">是否特价</div></td>\r\n");
      out.write("          <td width=\"25%\"><div align=\"center\">操作</div></td>\r\n");
      out.write("        </tr>\r\n");
      out.write("\t\t     ");
for(int i=start;i<over;i++){
            GoodsForm form=(GoodsForm)list.get(i);

      
      out.write("\r\n");
      out.write("        <tr class=\"zi\">\r\n");
      out.write("          <td><div align=\"center\">");
      out.print(form.getId());
      out.write("</div></td>\r\n");
      out.write("          <td class=\"linkBlack\" height=\"25\"><div align=\"center\"><a href=\"");
      out.print(form.getPicture());
      out.write("\" target=\"_blank\">");
      out.print(form.getName());
      out.write("</a></div></td>\r\n");
      out.write("\r\n");
      out.write("          <td class=\"linkBlack\"><div align=\"center\"><a href=\"goodsAction.do?action=9&big=");
      out.print(form.getBig());
      out.write('"');
      out.write('>');
      out.print(big.selectName(form.getBig()));
      out.write("</a></div></td>\r\n");
      out.write("\r\n");
      out.write("          <td class=\"linkBlack\"><div align=\"center\"><a href=\"goodsAction.do?action=8&small=");
      out.print(form.getSmall());
      out.write('"');
      out.write('>');
      out.print(small.selectName(form.getSmall()));
      out.write("</a></div></td>\r\n");
      out.write("          <td class=\"linkBlack\"><div align=\"center\"><a href=\"goodsAction.do?action=7&mark=");
      out.print(form.getMark());
      out.write('"');
      out.write('>');
if(form.getMark().toString().equals("0")){
      out.write('否');
}else{
      out.write('是');
}
      out.write("</a></div></td>\r\n");
      out.write("          <td class=\"linkBlack\"><div align=\"center\"><a href=\"goodsAction.do?action=5&id=");
      out.print(form.getId());
      out.write("\">详细信息</a>&nbsp;&nbsp;\r\n");
      out.write("\r\n");
      out.write("\t\t  <a href=\"javascript:deleteType(");
      out.print(form.getId());
      out.write(")\">删除</a>\r\n");
      out.write("<a href=\"goodsAction.do?action=18&id=");
      out.print(form.getId() );
      out.write("\">修改</a></div></td>\r\n");
      out.write("          ");
}
      out.write("  </tr>\r\n");
      out.write("      </table>\r\n");
      out.write("\r\n");
      out.write("\t <br>\r\n");
      out.write("\t  <table width=\"90%\"  border=\"0\" cellpadding=\"0\" cellspacing=\"0\">\r\n");
      out.write("        <tr align=\"center\" class=\"zi\">\r\n");
      out.write("          <td width=\"13%\">共为");
      out.print(maxPage);
      out.write("页</td>\r\n");
      out.write("          <td width=\"16%\">共有");
      out.print(pageNumber);
      out.write("条记录</td>\r\n");
      out.write("          <td width=\"14%\">当前为第");
      out.print(number+1);
      out.write("页</td>\r\n");
      out.write("          <td width=\"19%\" class=\"linkBlack\">");
if((number+1)==1){
      out.write("  \r\n");
      out.write("\t  上一页  \r\n");
      out.write("        ");
}else{
      out.write("\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t<a href=\"goodsAction.do?action=0&i=");
      out.print(number-1);
      out.write("\">\r\n");
      out.write("\t\t  上一页</a></td>\r\n");
      out.write("          ");
}
      out.write("\r\n");
      out.write("          <td width=\"18%\" class=\"linkBlack\">");
if(maxPage<=(number+1)){
      out.write("\r\n");
      out.write("            下一页\r\n");
      out.write("              ");
}else{
      out.write("\r\n");
      out.write("\t \r\n");
      out.write("\t\t<a href=\"goodsAction.do?action=0&i=");
      out.print(number+1);
      out.write("\">下一页</a>\r\n");
}
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("          <td width=\"20%\" class=\"linkBlack\">\r\n");
      out.write("            <div align=\"right\"><a href=\"goodsAction.do?action=1\">添加商品</a>&nbsp;</div></td>\r\n");
      out.write("        </tr>\r\n");
      out.write("      </table>\r\n");
      out.write("    </div></td>\r\n");
      out.write("  </tr>\r\n");
      out.write("  <tr bgcolor=\"#FFFFFF\">\r\n");
      out.write("    <td height=\"50\" colspan=\"2\"><p align=\"center\">");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "../downNews.jsp", out, false);
      out.write("\r\n");
      out.write("\r\n");
      out.write("   </td>\r\n");
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
