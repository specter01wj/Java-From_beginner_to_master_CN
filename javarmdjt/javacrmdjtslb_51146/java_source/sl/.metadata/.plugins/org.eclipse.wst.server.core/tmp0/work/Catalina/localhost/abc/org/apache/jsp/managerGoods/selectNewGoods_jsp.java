package org.apache.jsp.managerGoods;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.*;
import java.util.*;
import com.domain.GoodsForm;

public final class selectNewGoods_jsp extends org.apache.jasper.runtime.HttpJspBase
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
List newList =(List)request.getAttribute("list");
      out.write("\r\n");
      out.write("<meta http-equiv=\"Content-Type\" content=\"text/html; charset=gb2312\">\r\n");
      out.write("<title>显示新品上架</title>\r\n");
      out.write("<link href=\"../css/css.css\" rel=\"stylesheet\" type=\"text/css\">\r\n");
      out.write("</head>\r\n");
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
      out.write("    <td height=\"847\"><table width=\"100%\" height=\"100%\"  border=\"0\" cellpadding=\"0\" cellspacing=\"0\">\r\n");
      out.write("      <tr>\r\n");
      out.write("        <td width=\"25%\" height=\"638\" rowspan=\"2\" valign=\"top\" background=\"image/zuocedaohangbeijing.jpg\">\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "../left.jsp", out, false);
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\t\t</td>\r\n");
      out.write("        <td width=\"75%\" height=\"44\" align=\"center\" valign=\"middle\" background=\"image/xinpinshangjia.jpg\" bgcolor=\"#FFFFFF\"><div align=\"left\">&nbsp;</div></td>\r\n");
      out.write("      \r\n");
      out.write("      </tr>\r\n");
      out.write("      <tr bgcolor=\"#FFFFFF\">\r\n");
      out.write("\t \r\n");
      out.write("        <td valign=\"top\"  height=\"700\">\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t&nbsp;\r\n");
      out.write("\r\n");
      out.write("  <div align=\"left\">\r\n");
      out.write("\t\t        ");

              int now=6;
              if(newList.size()<6){
              now=newList.size();
              }
             
              for(int i=0;i<now;i++)
              {
                GoodsForm newGoods=(GoodsForm)newList.get(i);
                
      out.write("\r\n");
      out.write("\t\t    </div>\r\n");
      out.write("\t\t\t \r\n");
      out.write("\t\t\t <table width=\"99%\" border=\"2\" align=\"center\" cellpadding=\"0\" cellspacing=\"0\" bordercolor=\"#CCCCCC\"   >\r\n");
      out.write("               <tr>\r\n");
      out.write("                 <td height=\"159\" bordercolor=\"#666666\" >\r\n");
      out.write("                   <table width=\"96%\" height=\"120\"  border=\"1\" align=\"center\" cellpadding=\"0\" cellspacing=\"0\" bordercolor=\"#EFEFEF\" >\r\n");
      out.write("                     <tr>\r\n");
      out.write("                       <td width=\"36%\" rowspan=\"4\" height=\"120\"><div align=\"center\">\r\n");
      out.write("                           <input name=\"pricture");
      out.print(i);
      out.write("\" type=\"image\" src=\"");
      out.print(newGoods.getPicture());
      out.write("\" width=\"140\" height=\"94\">\r\n");
      out.write("                       </div></td>\r\n");
      out.write("                       <td width=\"18%\" height=\"30\"><div align=\"center\" class=\"zi\">商品名称</div></td>\r\n");
      out.write("                       <td width=\"46%\"><span class=\"zi\">");
      out.print(newGoods.getName());
      out.write("</span></td>\r\n");
      out.write("                     </tr>\r\n");
      out.write("                     <tr>\r\n");
      out.write("                       <td height=\"30\"><div align=\"center\" class=\"hz\"><font color=\"#F14D83\">单价</font></div></td>\r\n");
      out.write("                       <td height=\"30\"><span class=\"zi\"><font color=\"#F14D83\">");
      out.print(newGoods.getNowPrice());
      out.write("元</font></span></td>\r\n");
      out.write("                     </tr>\r\n");
      out.write("                     <tr>\r\n");
      out.write("                       <td height=\"30\"><div align=\"center\" class=\"zi\">描述</div></td>\r\n");
      out.write("                       <td height=\"30\"><span class=\"zi\">");
      out.print(newGoods.getIntroduce());
      out.write("</span></td>\r\n");
      out.write("                     </tr>\r\n");
      out.write("                     <tr>\r\n");
      out.write("                       <td height=\"30\" colspan=\"2\" class=\"linkBlack\"><div align=\"right\">\r\n");
      out.write("                           ");
if(session.getAttribute("form")!=null||session.getAttribute("id")!=null){
      out.write("\r\n");
      out.write("                           <a href=\"#\" class=\"zi\" onClick=\"window.open('goodsAction.do?action=16&id=");
      out.print(newGoods.getId());
      out.write("','','width=500,height=200');\">查看详细内容</a></div>\r\n");
      out.write("                           ");
}else{
      out.write("\r\n");
      out.write("                           <div align=\"right\" class=\"zi\">登录后才能购买</div></td>\r\n");
      out.write("                       ");
}
      out.write("\r\n");
      out.write("                     </tr>\r\n");
      out.write("                 </table></td>\r\n");
      out.write("               </tr>\r\n");
      out.write("             </table>\r\n");
      out.write("\t\t\t  ");
}
      out.write("\r\n");
      out.write("            <table width=\"99%\"  border=\"0\" cellspacing=\"0\" cellpadding=\"0\">\r\n");
      out.write("              <tr>\r\n");
      out.write("                <td class=\"linkBlack\"><div align=\"right\"><a href=\"#\" class=\"zi\" onClick=\"javasrcipt:history.go(-1);\">返回</a></div></td>\r\n");
      out.write("              </tr>\r\n");
      out.write("            </table>\r\n");
      out.write("\t      <div align=\"center\"></div></td>\r\n");
      out.write("      </tr>\r\n");
      out.write("    </table></td>\r\n");
      out.write("  </tr>\r\n");
      out.write("  <tr bgcolor=\"#FFFFFF\">\r\n");
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
