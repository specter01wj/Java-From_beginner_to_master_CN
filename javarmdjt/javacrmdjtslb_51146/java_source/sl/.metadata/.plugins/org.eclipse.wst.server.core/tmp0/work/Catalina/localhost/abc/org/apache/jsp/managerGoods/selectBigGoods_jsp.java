package org.apache.jsp.managerGoods;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.*;
import java.util.*;
import com.domain.GoodsForm;
import com.domain.SmallTypeForm;

public final class selectBigGoods_jsp extends org.apache.jasper.runtime.HttpJspBase
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
List bigList=(List)request.getAttribute("list");
      out.write('\r');
      out.write('\n');
List smallList=(List)request.getAttribute("smallList");
      out.write('\r');
      out.write('\n');

int number=Integer.parseInt((String)request.getAttribute("number"));
int maxPage=Integer.parseInt((String)request.getAttribute("maxPage"));
int pageNumber=Integer.parseInt((String)request.getAttribute("pageNumber"));
int start=number*4;//开始条数
int over=(number+1)*4;//结束条数
int count=pageNumber-over;//还剩多少条记录

if(count<=0){
  over=pageNumber;
  }

      out.write("\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<meta http-equiv=\"Content-Type\" content=\"text/html; charset=gb2312\">\r\n");
      out.write("<title>电子商城</title>\r\n");
      out.write("\r\n");
      out.write("<link href=\"../css/css.css\" rel=\"stylesheet\" type=\"text/css\">\r\n");
      out.write("</head>\r\n");
      out.write("\r\n");
      out.write("<body>\r\n");
      out.write("\r\n");
      out.write("<table width=\"755\" height=\"150%\"  border=\"0\" align=\"center\" cellpadding=\"0\" cellspacing=\"0\">\r\n");
      out.write("  <tr>\r\n");
      out.write("    <td height=\"98\" ><div align=\"center\">\r\n");
      out.write("    ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "../topOne.jsp", out, false);
      out.write("</div>    </td>\r\n");
      out.write("  </tr>\r\n");
      out.write("  <tr>\r\n");
      out.write("    <td height=\"847\" class=\"linkBlack\" bgcolor=\"#FFFFFF\"><table width=\"100%\" height=\"100%\"  border=\"0\" cellpadding=\"0\" cellspacing=\"0\">\r\n");
      out.write("      <tr>\r\n");
      out.write("        <td width=\"26%\" height=\"638\" rowspan=\"3\" valign=\"top\" background=\"image/zuocedaohangbeijing.jpg\">\r\n");
      out.write("\r\n");
      out.write("\t\t");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "../left.jsp", out, false);
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\t\t</td>\r\n");
      out.write("        <td width=\"74%\" height=\"46\" align=\"center\" valign=\"middle\" background=\"../image/fl.jpg\">");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "../topThree.jsp", out, false);
      out.write("</td>\r\n");
      out.write("\r\n");
      out.write("      </tr>\r\n");
      out.write("      <tr>\r\n");
      out.write("        <td height=\"25\" align=\"center\" valign=\"middle\" class=\"zi\">\r\n");
if(smallList.size()==0){
      out.write("目前该大商品类别没有设置商品的子类别");
}else{
      out.write("\r\n");
      out.write("    <table width=\"99%\" height=\"21\"  border=\"1\"  bgcolor=\"#DAD9D9\" cellpadding=\"0\" cellspacing=\"0\" bordercolor=\"#FFFFFF\" bordercolorlight=\"#FFFFFF\" bordercolordark=\"#819BBC\">\r\n");
      out.write("          <tr align=\"center\">\r\n");
      out.write("        ");
for(int small=0;small<smallList.size();small++){
            SmallTypeForm smallForm=(SmallTypeForm)smallList.get(small);
            
      out.write("\r\n");
      out.write("            <td width=\"537\"><a href=\"goodsAction.do?action=13&big=");
      out.print(request.getParameter("big"));
      out.write("&small=");
      out.print(smallForm.getId());
      out.write("&id=");
      out.print(smallForm.getBigId());
      out.write('"');
      out.write('>');
      out.print(smallForm.getSmallName());
      out.write("</a></td>\r\n");
      out.write("         ");
}
      out.write("\r\n");
      out.write("          </tr>\r\n");
      out.write("        </table>\r\n");
}
      out.write("\r\n");
      out.write("\r\n");
      out.write("\t\t</td>\r\n");
      out.write("      </tr>\r\n");
      out.write("      <tr>\r\n");
      out.write("        <td height=\"588\" align=\"center\" valign=\"top\" class=\"zi\">\r\n");
if(bigList.size()==0){
      out.write("<br><!--判断按小类别查询商品是否有数据-->\r\n");
      out.write("<br>\r\n");
      out.write("<br>\r\n");
      out.write("暂时没有商品的信息<br>\r\n");
      out.write("<br><br><br>");
}else{
      out.write("\r\n");
      out.write("           ");

          

              for(int i=start;i<over;i++)
              {
                GoodsForm bigForm=(GoodsForm)bigList.get(i);
                
      out.write("\r\n");
      out.write("<br>\r\n");
      out.write("\t\t<table width=\"67%\"  border=\"1\" align=\"center\" cellpadding=\"0\" cellspacing=\"0\" bordercolor=\"#FFFFFF\" bordercolorlight=\"#FFFFFF\" bordercolordark=\"#819BBC\">\r\n");
      out.write("          <tr>\r\n");
      out.write("            <td width=\"36%\" rowspan=\"4\" height=\"120\"><input name=\"pricture");
      out.print(i);
      out.write("\" type=\"image\" src=\"");
      out.print(bigForm.getPicture());
      out.write("\" width=\"140\" height=\"94\"></td>\r\n");
      out.write("            <td width=\"64%\" height=\"30\" class=\"zi\"><div align=\"center\">");
      out.print(bigForm.getName());
      out.write("</div></td>\r\n");
      out.write("          </tr>\r\n");
      out.write("          <tr>\r\n");
      out.write("            <td height=\"30\" class=\"zi\"><div align=\"center\">\r\n");
      out.write("            ");
if(bigForm.getMark().toString().equals("0")){
      out.write("\r\n");
      out.write("              单价：");
      out.print(bigForm.getNowPrice());
      out.write("元\r\n");
      out.write("            ");
}else{
      out.write("\r\n");
      out.write("             <font color=\"#FF0000\"> 特价：");
      out.print(bigForm.getFreePrice());
      out.write("元</font>\r\n");
      out.write("            ");
}
      out.write("\r\n");
      out.write("            </div></td>\r\n");
      out.write("          </tr>\r\n");
      out.write("          <tr>\r\n");
      out.write("            <td height=\"30\" class=\"zi\"><div align=\"center\">");
      out.print(bigForm.getIntroduce());
      out.write("</div></td>\r\n");
      out.write("          </tr>\r\n");
      out.write("          <tr>\r\n");
      out.write("            <td height=\"30\" class=\"zi\"> <div align=\"center\">  ");
if(session.getAttribute("form")!=null||session.getAttribute("id")!=null){
      out.write("\r\n");
      out.write("              <a href=\"#\" onClick=\"window.open('goodsAction.do?action=16&id=");
      out.print(bigForm.getId());
      out.write("','','width=500,height=200');\">查看详细内容</a>\r\n");
      out.write("\t\t\t\t\r\n");
      out.write("\t\t\t\t    ");
}else{
      out.write("\r\n");
      out.write("\t\t\t\t   登录后才能购买\r\n");
      out.write("\t\t\t    \r\n");
      out.write("\t\t\t\t   ");
}
      out.write("\r\n");
      out.write("\t\t\t    </div></td>\r\n");
      out.write("          </tr>\r\n");
      out.write("        </table>\r\n");
      out.write("\t\t");
}}
      out.write("<br>\r\n");
      out.write("        <table width=\"90%\"  border=\"0\" align=\"center\" cellpadding=\"0\" cellspacing=\"0\">\r\n");
      out.write("          <tr align=\"center\" class=\"zi\">\r\n");
      out.write("            <td width=\"13%\">共为");
      out.print(maxPage);
      out.write("页</td>\r\n");
      out.write("            <td width=\"16%\">共有");
      out.print(pageNumber);
      out.write("条记录</td>\r\n");
      out.write("            <td width=\"14%\">当前为第");
      out.print(number+1);
      out.write("页</td>\r\n");
      out.write("            <td width=\"19%\">");
if((number+1)==1){
      out.write("\r\n");
      out.write("      上一页\r\n");
      out.write("        ");
}else{
      out.write("\r\n");
      out.write("        <a href=\"goodsAction.do?action=12&big=");
      out.print(request.getParameter("big"));
      out.write('&');
      out.write('i');
      out.write('=');
      out.print(number-1);
      out.write("\">上一页</a></td>\r\n");
      out.write("            ");
}
      out.write("\r\n");
      out.write("            <td width=\"18%\">");
if(maxPage<=(number+1)){
      out.write("\r\n");
      out.write("      下一页\r\n");
      out.write("        ");
}else{
      out.write("\r\n");
      out.write("        <a href=\"goodsAction.do?action=12&big=");
      out.print(request.getParameter("big"));
      out.write('&');
      out.write('i');
      out.write('=');
      out.print(number+1);
      out.write("\">下一页</a></td>\r\n");
      out.write("            ");
}
      out.write("\r\n");
      out.write("          </tr>\r\n");
      out.write("        </table>\r\n");
      out.write("</td>\r\n");
      out.write("      </tr>\r\n");
      out.write("    </table></td>\r\n");
      out.write("  </tr>\r\n");
      out.write(" <tr bgcolor=\"#FFFFFF\">\r\n");
      out.write("    <td height=\"100\" ><p align=\"center\">");
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
