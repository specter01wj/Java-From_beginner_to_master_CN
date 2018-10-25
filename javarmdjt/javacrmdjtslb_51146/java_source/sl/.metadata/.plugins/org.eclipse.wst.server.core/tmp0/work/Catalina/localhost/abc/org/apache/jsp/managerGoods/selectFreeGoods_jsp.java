package org.apache.jsp.managerGoods;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.*;
import java.util.*;
import com.domain.GoodsForm;

public final class selectFreeGoods_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<html>\r\n");
      out.write("<head>\r\n");
List freeList =(List)request.getAttribute("list");
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
      out.write("<meta http-equiv=\"Content-Type\" content=\"text/html; charset=gb2312\">\r\n");
      out.write("<title>特价商品</title>\r\n");
      out.write("<link href=\"../css/css.css\" rel=\"stylesheet\" type=\"text/css\">\r\n");
      out.write("<script type=\"text/javascript\">\r\n");
      out.write("function Jumpping(){\r\n");
      out.write("\twindow.location.href=\"goodsAction.do?action=15&mark=1&i=\"+(window.document.jumpform.jumppage.value-1);\r\n");
      out.write("\treturn;\r\n");
      out.write("\t}\r\n");
      out.write("\r\n");
      out.write("</script>\r\n");
      out.write("</head>\r\n");
      out.write(" <link href=\"css/css.css\" rel=\"stylesheet\" type=\"text/css\">\r\n");
      out.write("<body>\r\n");
      out.write("<table width=\"755\" height=\"150%\"  border=\"0\" align=\"center\" cellpadding=\"0\" cellspacing=\"0\">\r\n");
      out.write("  <tr>\r\n");
      out.write("    <td height=\"98\"><div align=\"center\">\r\n");
      out.write("    ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "../topOne.jsp", out, false);
      out.write("</div>    </td>\r\n");
      out.write("  </tr>\r\n");
      out.write("\r\n");
      out.write("  <tr>\r\n");
      out.write("    <td height=\"847\"><table width=\"100%\" height=\"100%\"  border=\"0\" cellpadding=\"0\" cellspacing=\"0\" bgcolor=\"#FFFFFF\">\r\n");
      out.write("      <tr>\r\n");
      out.write("        <td width=\"25%\" height=\"638\" rowspan=\"2\" valign=\"top\" background=\"image/zuocedaohangbeijing.jpg\">\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "../left.jsp", out, false);
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\t\t</td>\r\n");
      out.write("        <td width=\"75%\" height=\"44\" align=\"center\" valign=\"middle\" background=\"image/tejiaoshangpin.jpg\"><div align=\"left\">&nbsp;</div></td>\r\n");
      out.write("      \r\n");
      out.write("      </tr>\r\n");
      out.write("      <tr bgcolor=\"#FFFFFF\">\r\n");
      out.write("\t \r\n");
      out.write("        <td valign=\"top\"  height=\"700\">\r\n");
      out.write("\t\t&nbsp;\r\n");
      out.write("\t\t\r\n");
      out.write("\r\n");
      out.write("  <div align=\"left\">\r\n");
      out.write("\t\t        ");

          
             
              for(int i=start;i<over;i++)
              {
                GoodsForm freeGoods=(GoodsForm)freeList.get(i);
                
      out.write("\r\n");
      out.write("\t\t    </div>\r\n");
      out.write("\t\t\t \r\n");
      out.write("\t\t\t <table width=\"99%\" height=\"163\"  border=\"2\" align=\"center\" cellpadding=\"0\" cellspacing=\"0\" bordercolor=\"#CCCCCC\"   >\r\n");
      out.write("               <tr>\r\n");
      out.write("                 <td height=\"159\" bordercolor=\"#666666\" >\r\n");
      out.write("                   <table width=\"96%\" height=\"120\"  border=\"1\" align=\"center\" cellpadding=\"0\" cellspacing=\"0\" bordercolor=\"#EFEFEF\" >\r\n");
      out.write("                     <tr>\r\n");
      out.write("                       <td width=\"36%\" rowspan=\"5\" height=\"120\"><div align=\"center\">\r\n");
      out.write("                           <input name=\"pricture");
      out.print(i);
      out.write("\" type=\"image\" src=\"");
      out.print(freeGoods.getPicture());
      out.write("\" width=\"140\" height=\"94\">\r\n");
      out.write("                       </div></td>\r\n");
      out.write("                       <td width=\"12%\" height=\"30\"><div align=\"center\" class=\"zi\">商品名称</div></td>\r\n");
      out.write("                       <td width=\"52%\"><span class=\"zi\">");
      out.print(freeGoods.getName());
      out.write("</span></td>\r\n");
      out.write("                     </tr>\r\n");
      out.write("\t\t\t\t\t  <tr>\r\n");
      out.write("                       <td height=\"30\"><div align=\"center\" style=\"text-decoration:line-through;color:#910402\" class=\"zi\">原价</div></td>\r\n");
      out.write("                       <td height=\"30\"><span class=\"zi\" style=\"text-decoration:line-through;color:#910402\">");
      out.print(freeGoods.getNowPrice());
      out.write("元</span></td>\r\n");
      out.write("\t\t\t\t     </tr>\r\n");
      out.write("                     <tr>\r\n");
      out.write("                       <td height=\"30\"><div align=\"center\" class=\"zi\"><font color=\"#F14D83\">现价</font></div></td>\r\n");
      out.write("                       <td height=\"30\"><span class=\"zi\"><font color=\"#F14D83\">");
      out.print(freeGoods.getFreePrice());
      out.write("元</font></span></td>\r\n");
      out.write("                     </tr>\r\n");
      out.write("                     <tr>\r\n");
      out.write("                       <td height=\"30\"><div align=\"center\" class=\"zi\">描述</div></td>\r\n");
      out.write("                       <td height=\"30\"><span class=\"zi\">");
      out.print(freeGoods.getIntroduce());
      out.write("</span></td>\r\n");
      out.write("                     </tr>\r\n");
      out.write("                     <tr>\r\n");
      out.write("                       <td height=\"30\" colspan=\"2\" class=\"linkBlack\"><div align=\"right\" class=\"zi\">\r\n");
      out.write("                           ");
if(session.getAttribute("form")!=null||session.getAttribute("id")!=null){
      out.write("\r\n");
      out.write("                           <a href=\"#\" onClick=\"window.open('goodsAction.do?action=16&id=");
      out.print(freeGoods.getId());
      out.write("','','width=500,height=200');\">查看详细内容</a></div>\r\n");
      out.write("                           ");
}else{
      out.write("\r\n");
      out.write("                           <div align=\"right\" class=\"zi\">登录后才能购买</div>");
}
      out.write("</td>\r\n");
      out.write("                       \r\n");
      out.write("                     </tr>\r\n");
      out.write("                 </table></td>\r\n");
      out.write("               </tr>\r\n");
      out.write("             </table>\r\n");
      out.write("\t\t\t");
}
      out.write("\r\n");
      out.write("        \r\n");
      out.write("\t\t    <div align=\"center\">\r\n");
      out.write("\t\t      <table width=\"90%\"  border=\"0\" align=\"center\" cellpadding=\"0\" cellspacing=\"0\">\r\n");
      out.write("                <form action=\"\" name=\"jumpform\">\r\n");
      out.write("                <tr align=\"center\" class=\"zi\">\r\n");
      out.write("                  <td width=\"12%\" valign=\"bottom\">共为");
      out.print(maxPage);
      out.write("页</td>\r\n");
      out.write("                  <td width=\"17%\" valign=\"bottom\">共有");
      out.print(pageNumber);
      out.write("条记录</td>\r\n");
      out.write("                  <td width=\"17%\" valign=\"bottom\">当前为第");
      out.print(number+1);
      out.write("页</td>\r\n");
      out.write("                  <td width=\"13%\" valign=\"bottom\">");
if((number+1)==1){
      out.write("\r\n");
      out.write("      <span class=\"zi\">上一页</span>\r\n");
      out.write("        ");
}else{
      out.write("\r\n");
      out.write("        <a href=\"goodsAction.do?action=15&mark=1&i=");
      out.print(number-1);
      out.write("\">上一页</a></td>\r\n");
      out.write("                  ");
}
      out.write("\r\n");
      out.write("                  <td width=\"12%\" valign=\"bottom\">");
if(maxPage<=(number+1)){
      out.write("\r\n");
      out.write("      <span class=\"zi\">下一页</span>\r\n");
      out.write("        ");
}else{
      out.write("\r\n");
      out.write("        <a href=\"goodsAction.do?action=15&mark=1&i=");
      out.print(number+1);
      out.write("\">下一页</a></td>\r\n");
      out.write("                  ");
}
      out.write("<td width=\"7%\" valign=\"bottom\" class=\"linkBlack\"><div align=\"center\"><a href=\"#\" onClick=\"javasrcipt:history.go(-1);\">返回</a></div></td>\r\n");
      out.write("                  <td width=\"22%\" align=\"center\" valign=\"bottom\" class=\"linkBlack\">\r\n");
      out.write("                    转到第                    \r\n");
      out.write("                        <select name=\"jumppage\" onchange=\"Jumpping()\">\r\n");
      out.write("                    ");
 for(int i=1;i<=maxPage;i++){
                    	if(i==number+1){
                    
                     
      out.write("\r\n");
      out.write("                     <option selected value=");
      out.print(i );
      out.write('>');
      out.print(i );
      out.write("</option>\r\n");
      out.write("                     ");
}else{ 
      out.write("\r\n");
      out.write("                     <option value=");
      out.print(i );
      out.write('>');
      out.print(i );
      out.write("</option>\r\n");
      out.write("                     ");
}} 
      out.write("\r\n");
      out.write("                  </select>\r\n");
      out.write("                    页                    </td>\r\n");
      out.write("                </tr>\r\n");
      out.write("\t\t\t\t</form>\r\n");
      out.write("              </table>\r\n");
      out.write("\t\t    </div></td>\r\n");
      out.write("      </tr>\r\n");
      out.write("    </table>\r\n");
      out.write("    \r\n");
      out.write("    </td>\r\n");
      out.write("  </tr>\r\n");
      out.write(" <tr bgcolor=\"#FFFFFF\">\r\n");
      out.write("    <td height=\"100\"><p align=\"center\">");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "../downNews.jsp", out, false);
      out.write("</p></td>\r\n");
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
