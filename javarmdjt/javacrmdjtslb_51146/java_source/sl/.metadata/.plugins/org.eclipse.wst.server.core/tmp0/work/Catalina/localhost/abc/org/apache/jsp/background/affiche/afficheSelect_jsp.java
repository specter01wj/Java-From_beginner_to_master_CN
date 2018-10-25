package org.apache.jsp.background.affiche;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.*;
import java.util.*;
import com.domain.AfficheForm;

public final class afficheSelect_jsp extends org.apache.jasper.runtime.HttpJspBase
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

List list=(List)request.getAttribute("list");
int number=Integer.parseInt((String)request.getAttribute("number"));
int maxPage=Integer.parseInt((String)request.getAttribute("maxPage"));
int pageNumber=Integer.parseInt((String)request.getAttribute("pageNumber"));
int start=number*7;//开始条数
int over=(number+1)*7;//结束条数
int count=pageNumber-over;//还剩多少条记录
if(count<=0){
  over=pageNumber;
  }

      out.write("\r\n");
      out.write(" <script Language=\"JavaScript\">\r\n");
      out.write(" function deleteAffiche(date) {\r\n");
      out.write("  if(confirm(\"确定要删除吗？\")){\r\n");
      out.write("    window.location=\"afficheAction.do?action=3&id=\"+date;\r\n");
      out.write("\t}\r\n");
      out.write("  }\r\n");
      out.write(" </script>\r\n");
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
      out.write("  <tr  valign=\"bottom\">\r\n");
      out.write("    <td height=\"111\" colspan=\"2\"  background=\"image/banner1.jpg\"><div align=\"center\">\r\n");
      out.write(" ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "../upTwo.jsp", out, false);
      out.write("\r\n");
      out.write("    </div></td>\r\n");
      out.write("  </tr>\r\n");
      out.write("  <tr>\r\n");
      out.write("    <td width=\"24%\" height=\"390\">");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "../../leftManager.jsp", out, false);
      out.write("  </td>\r\n");
      out.write("    <td width=\"76%\" bgcolor=\"#FFFFFF\" class=\"linkBlack\">\r\n");
      out.write("    <div align=\"center\">\r\n");
      out.write("\t<table width=\"90%\" height=\"16\"  border=\"0\" cellpadding=\"0\" cellspacing=\"0\">\r\n");
      out.write("      <tr>\r\n");
      out.write("        <td bgcolor=\"#E6E6E6\"><div align=\"center\" class=\"dhz\"><font color=\"#990000\"><b>公告信息的查询</b></font></div></td>\r\n");
      out.write("      </tr>\r\n");
      out.write("    </table>\r\n");
      out.write("<br><br>\r\n");
      out.write("\r\n");
      out.write("\t  <table width=\"90%\"  border=\"1\" cellspacing=\"0\" cellpadding=\"0\">\r\n");
      out.write("        <tr class=\"zi\">\r\n");
      out.write("          <td width=\"17%\" height=\"25\"><div align=\"center\">数据编号</div></td>\r\n");
      out.write("          <td width=\"19%\"><div align=\"center\">公告标题</div></td>\r\n");
      out.write("          <td width=\"27%\"><div align=\"center\">公告发布时间</div></td>\r\n");
      out.write("          <td width=\"37%\"><div align=\"center\">操作</div></td>\r\n");
      out.write("        </tr>\r\n");
      out.write("\t\t     ");
for(int i=start;i<over;i++){
      AfficheForm form=(AfficheForm)list.get(i);
          
      out.write("\r\n");
      out.write("        <tr class=\"zi\">\r\n");
      out.write("          <td height=\"30\"><div align=\"center\">");
      out.print(form.getId());
      out.write("</div></td>\r\n");
      out.write("          <td><div align=\"center\">");
      out.print(form.getName());
      out.write("</div></td>\r\n");
      out.write("          <td><div align=\"center\">");
      out.print(form.getIssueTime());
      out.write("</div></td>\r\n");
      out.write("          <td><div align=\"center\"><a href=\"afficheAction.do?action=4&id=");
      out.print(form.getId());
      out.write("\">修改</a>&nbsp;&nbsp;<a href=\"afficheAction.do?action=6&id=");
      out.print(form.getId());
      out.write("\">查询内容</a>&nbsp;&nbsp;<a href=\"javascript:deleteAffiche('");
      out.print(form.getId());
      out.write("')\">删除</a></div></td>\r\n");
      out.write("      ");
}
      out.write("  </tr>\r\n");
      out.write("      </table>\r\n");
      out.write("\t  <br>\r\n");
      out.write("\t  <table width=\"90%\"  border=\"0\" align=\"center\" cellpadding=\"0\" cellspacing=\"0\">\r\n");
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
      out.write("          <td width=\"19%\">");
if((number+1)==1){
      out.write("\r\n");
      out.write("      上一页\r\n");
      out.write("        ");
}else{
      out.write("\r\n");
      out.write("        <a href=\"afficheAction.do?action=0&i=");
      out.print(number-1);
      out.write("\">上一页</a></td>\r\n");
      out.write("          ");
}
      out.write("\r\n");
      out.write("          <td width=\"18%\">");
if(maxPage<=(number+1)){
      out.write("\r\n");
      out.write("            下一页\r\n");
      out.write("              ");
}else{
      out.write("\r\n");
      out.write("              <a href=\"afficheAction.do?action=0&i=");
      out.print(number+1);
      out.write("\">下一页</a></td>\r\n");
      out.write("          ");
}
      out.write("\r\n");
      out.write("\r\n");
      out.write("          <td width=\"20%\">\r\n");
      out.write("            <div align=\"right\"><a href=\"afficheAction.do?action=1\">添加公告信息</a>&nbsp;&nbsp;&nbsp;&nbsp;</div></td>\r\n");
      out.write("        </tr>\r\n");
      out.write("      </table>\r\n");
      out.write("\t  <p><br>\r\n");
      out.write("\r\n");
      out.write("    </p>\r\n");
      out.write("    </div></td>\r\n");
      out.write("  </tr>\r\n");
      out.write("  <tr bgcolor=\"#FFFFFF\">\r\n");
      out.write("    <td height=\"50\" colspan=\"2\"><p align=\"center\">");
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
