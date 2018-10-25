package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.*;
import java.util.*;
import com.domain.GoodsForm;

public final class right_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      com.dao.GoodsDao newGood = null;
      synchronized (_jspx_page_context) {
        newGood = (com.dao.GoodsDao) _jspx_page_context.getAttribute("newGood", PageContext.PAGE_SCOPE);
        if (newGood == null){
          newGood = new com.dao.GoodsDao();
          _jspx_page_context.setAttribute("newGood", newGood, PageContext.PAGE_SCOPE);
        }
      }
      out.write('\r');
      out.write('\n');
List nowList =newGood.selectMark(Integer.valueOf("0"));
      out.write('\r');
      out.write('\n');
List freeList =newGood.selectMark(Integer.valueOf("1"));
      out.write("\r\n");
      out.write("<meta http-equiv=\"Content-Type\" content=\"text/html; charset=gb2312\">\r\n");
if(session.getAttribute("form")!=null||session.getAttribute("id")!=null){
      out.write("\r\n");
      out.write("<link href=\"css/css.css\" rel=\"stylesheet\" type=\"text/css\">\r\n");
      out.write("<br>\r\n");
      out.write("<table width=\"100%\" height=\"186\"  border=\"0\" align=\"center\" cellpadding=\"0\" cellspacing=\"0\" bordercolor=\"#FFFFFF\" bordercolorlight=\"#FFFFFF\" bordercolordark=\"#819BBC\">\r\n");
      out.write("          <tr>\r\n");
      out.write("            <td height=\"44\" colspan=\"2\" align=\"center\" valign=\"middle\" background=\"image/tejiaoshangpin.jpg\">\r\n");
      out.write("              <table width=\"95%\"  border=\"0\" cellspacing=\"0\" cellpadding=\"0\">\r\n");
      out.write("                <tr>\r\n");
      out.write("                  <td height=\"22\">&nbsp;</td>\r\n");
      out.write("                  <td><div align=\"right\" class=\"linkBlack\"><a href=\"goodsAction.do?action=15&mark=1\"><b>更多</b></a></div></td>\r\n");
      out.write("                </tr>\r\n");
      out.write("            </table>            </td>\r\n");
      out.write("          </tr>\r\n");
      out.write("          <tr> \r\n");
      out.write("\t\t  \r\n");
      out.write("\t\t  \r\n");
      out.write("\t\t  \r\n");
      out.write("\t\t  \r\n");
      out.write("\t\t  \r\n");
      out.write("\t\t  ");

              int free=2;
              if(freeList.size()<2){
              free=freeList.size();
              }

              for(int i=0;i<free;i++)
              {
                GoodsForm newGoods=(GoodsForm)freeList.get(i);
                
      out.write("\r\n");
      out.write("            <td height=\"80\" valign=\"middle\">\t\t\t<table width=\"99%\" height=\"136\" align=\"center\" cellpadding=\"0\" cellspacing=\"0\" bordercolor=\"#FFFFFF\" bordercolorlight=\"#FFFFFF\" bordercolordark=\"#819BBC\">\r\n");
      out.write("              <tr>\r\n");
      out.write("                <td width=\"23%\" rowspan=\"5\" height=\"80\"><input name=\"pricture");
      out.print(i);
      out.write("\" type=\"image\" src=\"");
      out.print(newGoods.getPicture());
      out.write("\" width=\"140\" height=\"94\"></td>\r\n");
      out.write("                <td width=\"77%\" height=\"20\"><div align=\"center\"><span class=\"zi\">");
      out.print(newGoods.getName());
      out.write("</span></div></td>\r\n");
      out.write("              </tr>\r\n");
      out.write("              <tr>\r\n");
      out.write("                <td height=\"20\"><div align=\"center\" style=\"text-decoration:line-through;color:#910402\"><span class=\"zi\">原价：");
      out.print(newGoods.getNowPrice());
      out.write("元</span></div></td>\r\n");
      out.write("              </tr>\r\n");
      out.write("              <tr>\r\n");
      out.write("                <td height=\"20\"><div align=\"center\"><font color=\"#F14D83\"><span class=\"zi\">现价");
      out.print(newGoods.getFreePrice());
      out.write("元</span></font></div></td>\r\n");
      out.write("              </tr>\r\n");
      out.write("              <tr>\r\n");
      out.write("                <td height=\"20\"><div align=\"center\"><span class=\"zi\">");
      out.print(newGoods.getIntroduce());
      out.write("</span></div></td>\r\n");
      out.write("              </tr>\r\n");
      out.write("              <tr>\r\n");
      out.write("                <td height=\"13\"><div align=\"center\" class=\"linkBlack\"><a href=\"#\" onClick=\"window.open('goodsAction.do?action=16&id=");
      out.print(newGoods.getId());
      out.write("','','width=500,height=200');\">查看详细内容</a></div></td>\r\n");
      out.write("              </tr>\r\n");
      out.write("            </table></td>\r\n");
      out.write("            ");
}
      out.write("\r\n");
      out.write("          </tr>\r\n");
      out.write("</table>\r\n");
      out.write("\r\n");
      out.write("\r\n");
}
      out.write("\r\n");
      out.write("\r\n");
      out.write("<table width=\"100%\" height=\"590\"  border=\"0\" align=\"center\" cellpadding=\"0\" cellspacing=\"0\">\r\n");
      out.write("          <tr>\r\n");
      out.write("            <td height=\"44\" align=\"center\" valign=\"middle\" background=\"image/xinpinshangjia.jpg\"><div align=\"left\">\r\n");
      out.write("              <table width=\"95%\"  border=\"0\" align=\"center\" cellpadding=\"0\" cellspacing=\"0\">\r\n");
      out.write("                <tr>\r\n");
      out.write("                  <td height=\"22\">&nbsp;</td>\r\n");
      out.write("                  <td><div align=\"right\" class=\"linkBlack\"><a href=\"goodsAction.do?action=14&mark=0\"><b>更多</b></a></div></td>\r\n");
      out.write("                </tr>\r\n");
      out.write("              </table>\r\n");
      out.write("            </div></td>\r\n");
      out.write("          </tr>\r\n");
      out.write("          <tr>\r\n");
      out.write("            <td height=\"529\">\r\n");
      out.write("\t\t\t");

              int now=5;
              if(nowList.size()<5){
              now=nowList.size();
              }

              for(int i=0;i<now;i++)
              {
                GoodsForm newGoods=(GoodsForm)nowList.get(i);
                
      out.write("<table width=\"100%\" height=\"100\"  border=\"0\" align=\"center\" cellpadding=\"0\" cellspacing=\"0\">\r\n");
      out.write("              <tr>\r\n");
      out.write("                <td>\t\t\t\t<table width=\"99%\"   border=\"2\" align=\"center\" cellpadding=\"0\" cellspacing=\"0\" bordercolor=\"#CCCCCC\"   >\r\n");
      out.write("                  <tr>\r\n");
      out.write("                    <td height=\"159\" bordercolor=\"#666666\" >\r\n");
      out.write("                      <table width=\"96%\" border=\"1\" align=\"center\" cellpadding=\"0\" cellspacing=\"0\" bordercolor=\"#EFEFEF\" >\r\n");
      out.write("                        <tr>\r\n");
      out.write("                          <td width=\"36%\" rowspan=\"4\" height=\"120\"><div align=\"center\">\r\n");
      out.write("                              <input name=\"pricture");
      out.print(i);
      out.write("\" type=\"image\" src=\"");
      out.print(newGoods.getPicture());
      out.write("\" width=\"140\" height=\"94\">\r\n");
      out.write("                          </div></td>\r\n");
      out.write("                          <td width=\"18%\" height=\"30\"><div align=\"center\" class=\"zi\">商品名称</div></td>\r\n");
      out.write("                          <td width=\"46%\"><span class=\"zi\">");
      out.print(newGoods.getName());
      out.write("</span></td>\r\n");
      out.write("                        </tr>\r\n");
      out.write("                        <tr>\r\n");
      out.write("                          <td height=\"30\"><div align=\"center\"><font color=\"#F14D83\"><span class=\"zi\">单价：元</span></font></div></td>\r\n");
      out.write("                          <td height=\"30\"><font color=\"#F14D83\"><span class=\"hz\">");
      out.print(newGoods.getNowPrice());
      out.write("</span></font></td>\r\n");
      out.write("                        </tr>\r\n");
      out.write("                        <tr>\r\n");
      out.write("                          <td height=\"30\"><div align=\"center\" class=\"zi\">产品描述</div></td>\r\n");
      out.write("                          <td height=\"30\"><span class=\"zi\">");
      out.print(newGoods.getIntroduce());
      out.write("</span></td>\r\n");
      out.write("                        </tr>\r\n");
      out.write("                        <tr>\r\n");
      out.write("                          <td height=\"30\" colspan=\"2\" class=\"zi\"><div align=\"right\">\r\n");
      out.write("                              ");
if(session.getAttribute("form")!=null||session.getAttribute("id")!=null){
      out.write("\r\n");
      out.write("                             <a href=\"#\" onClick=\"window.open('goodsAction.do?action=16&id=");
      out.print(newGoods.getId());
      out.write("','','width=500,height=200');\">查看详细内容</a></div>\r\n");
      out.write("                              ");
}else{
      out.write("\r\n");
      out.write("                               <div align=\"right\"  class=\"zi\">登录后才能购买</div></td>\r\n");
      out.write("                          ");
}
      out.write("\r\n");
      out.write("                        </tr>\r\n");
      out.write("                    </table></td>\r\n");
      out.write("                  </tr>\r\n");
      out.write("                </table></td>\r\n");
      out.write("              </tr>\r\n");
      out.write("            </table>\r\n");
      out.write("\t\t\t");
}
      out.write("\t\t\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t\t</td>\r\n");
      out.write("\t\t\t \r\n");
      out.write("\t\t       \r\n");
      out.write("          </tr>\r\n");
      out.write("</table>\r\n");
      out.write("\r\n");
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
