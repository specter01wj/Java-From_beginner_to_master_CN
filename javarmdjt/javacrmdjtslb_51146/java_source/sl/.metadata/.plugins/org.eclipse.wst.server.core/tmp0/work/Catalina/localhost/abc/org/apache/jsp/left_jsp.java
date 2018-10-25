package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.*;
import java.util.*;
import com.domain.AfficheForm;
import com.domain.MemberForm;
import com.domain.GoodsForm;

public final class left_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      com.dao.AfficheDao affiche = null;
      synchronized (_jspx_page_context) {
        affiche = (com.dao.AfficheDao) _jspx_page_context.getAttribute("affiche", PageContext.PAGE_SCOPE);
        if (affiche == null){
          affiche = new com.dao.AfficheDao();
          _jspx_page_context.setAttribute("affiche", affiche, PageContext.PAGE_SCOPE);
        }
      }
      out.write('\r');
      out.write('\n');
      com.dao.GoodsDao goods = null;
      synchronized (_jspx_page_context) {
        goods = (com.dao.GoodsDao) _jspx_page_context.getAttribute("goods", PageContext.PAGE_SCOPE);
        if (goods == null){
          goods = new com.dao.GoodsDao();
          _jspx_page_context.setAttribute("goods", goods, PageContext.PAGE_SCOPE);
        }
      }
      out.write('\r');
      out.write('\n');
java.util.Date date=new java.util.Date();
      out.write('\r');
      out.write('\n');
List afficheList=(List)affiche.selectAffiche();
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<script language=\"javascript\">\r\n");
      out.write("\r\n");
      out.write("function land(){                  //登录的脚本\r\n");
      out.write("if(document.form.name.value==\"\"){\r\n");
      out.write("window.alert(\"请输入账号\");\r\n");
      out.write("return false;\r\n");
      out.write("}\r\n");
      out.write("if(document.form.password.value==\"\"){\r\n");
      out.write("window.alert(\"请输入密码\");\r\n");
      out.write("return false;\r\n");
      out.write("}\r\n");
      out.write("return true;\r\n");
      out.write("}\r\n");
      out.write("function quit() {\r\n");
      out.write("  if(confirm(\"欢迎下次光临！！！\")){\r\n");
      out.write("    window.location.href=\"loginOut.jsp\";\r\n");
      out.write("\t}\r\n");
      out.write("  }\r\n");
      out.write("</script> \r\n");
      out.write("<meta http-equiv=\"Content-Type\" content=\"text/html; charset=gb2312\">\r\n");
      out.write("\r\n");
      out.write("<link href=\"css/css.css\" rel=\"stylesheet\" type=\"text/css\">\r\n");
      out.write("<table width=\"193\" height=\"635\"  border=\"0\" align=\"center\" cellpadding=\"0\" cellspacing=\"0\">\r\n");
      out.write("          <tr>\r\n");
      out.write("            <td width=\"193\" height=\"252\" valign=\"middle\" background=\"image/denglu.jpg\">\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t\t<form name=\"form\" method=\"post\" action=\"memberAction.do?action=1\" onSubmit=\"return land()\">\r\n");
      out.write("\t\t\t<table width=\"80%\" height=\"90\"  border=\"0\" align=\"center\" cellpadding=\"0\" cellspacing=\"0\">\r\n");
      out.write("              <tr>\r\n");
      out.write("                <td width=\"39%\" height=\"20\"><div align=\"right\" class=\"zi\">用户名：</div></td>\r\n");
      out.write("                <td width=\"61%\"><input name=\"name\" type=\"text\" size=\"13\"></td>\r\n");
      out.write("              </tr>\r\n");
      out.write("              <tr>\r\n");
      out.write("                <td height=\"20\"><div align=\"right\" class=\"zi\">密&nbsp;&nbsp;码：</div></td>\r\n");
      out.write("                <td><input name=\"password\" type=\"password\" size=\"13\"></td>\r\n");
      out.write("              </tr>\r\n");
      out.write("              <tr align=\"center\">\r\n");
      out.write("                <td height=\"27\" colspan=\"2\"><input type=\"submit\" name=\"Submit3\"  value=\"登录\">                <input name=\"reset\" type=\"reset\" value=\"重置\"/></td>\r\n");
      out.write("              </tr>\r\n");
      out.write("  <tr align=\"center\">\r\n");
      out.write("              <td height=\"23\"><div align=\"right\">\r\n");
      out.write("                <table width=\"82%\" height=\"77%\"  border=\"0\" cellpadding=\"0\" cellspacing=\"0\">\r\n");
      out.write("                  <tr>\r\n");
      out.write("                    <td class=\"linkBlack\"><div align=\"center\"><a href=\"#\" onClick=\"javascript:window.open('member/memberRegister.jsp','','width=350,height=450,top=10,left=10')\">注 &nbsp; 册</a></div></td>                                  \r\n");
      out.write("\t\t\t\t  </tr>\r\n");
      out.write("                </table>\r\n");
      out.write("                </div></td> \r\n");
      out.write("                <td><table width=\"82%\" height=\"77%\"  border=\"0\" cellpadding=\"0\" cellspacing=\"0\">\r\n");
      out.write("                  <tr>\r\n");
      out.write("                    <td class=\"linkBlack\"><div align=\"center\"><a href=\"#\" onClick=\"javascript:window.open('member/findOne.jsp','','width=300,height=150,top=10,left=10')\">找回密码 </a></div></td>\r\n");
      out.write("                  </tr>\r\n");
      out.write("                </table></td>\r\n");
      out.write("  </tr>\r\n");
      out.write("</table>\r\n");
      out.write("\t\t\t</form>\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t\t\t");
System.out.println(session.getAttribute("id")!=null||session.getAttribute("form")!=null);
				
				if(session.getAttribute("id")!=null||session.getAttribute("form")!=null){
      out.write("\r\n");
      out.write("\t\t\t\t          ");
MemberForm form=(MemberForm)session.getAttribute("form");
      out.write("\r\n");
      out.write("\t\t\t    <table width=\"93%\"   border=\"0\" align=\"center\" cellpadding=\"0\" cellspacing=\"0\" bordercolor=\"#FFFFFF\" bordercolorlight=\"#FFFFFF\" bordercolordark=\"#819BBC\">\r\n");
      out.write("\t\t\t\t  <tr>\r\n");
      out.write("                    <td align=\"center\" class=\"zi\">欢迎");
      out.print(form.getName());
      out.write("</td>\r\n");
      out.write("                  </tr>\r\n");
      out.write("                  <tr>\r\n");
      out.write("                    <td align=\"center\" class=\"zi\">会员姓名：");
      out.print(form.getReallyName());
      out.write("</td>\r\n");
      out.write("                  </tr>\r\n");
      out.write("\t\t\t\t \r\n");
      out.write("\t\t\t\t  \r\n");
      out.write("                  <tr>\r\n");
      out.write("                    <td align=\"center\" class=\"linkBlack\" ><a href=\"javascript:quit()\">安全退出</a></td>\r\n");
      out.write("                  </tr>\r\n");
      out.write("              </table>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t\t");
}
      out.write("\r\n");
      out.write("            <p>&nbsp;</p></td>\r\n");
      out.write("          </tr>\r\n");
      out.write("          <tr>\r\n");
      out.write("            <td height=\"142\" align=\"center\" valign=\"top\"><table width=\"100%\" height=\"100%\"  border=\"0\" cellpadding=\"0\" cellspacing=\"0\">\r\n");
      out.write("              <tr>\r\n");
      out.write("                <td height=\"43\" background=\"image/shangchenggenggao.jpg\">&nbsp;</td>\r\n");
      out.write("              </tr>\r\n");
      out.write("              <tr>\r\n");
      out.write("                <td height=\"111\">\r\n");
      out.write("\t\t\t\t  <table width=\"84%\" height=\"209\"  border=\"0\" align=\"center\" cellpadding=\"0\" cellspacing=\"0\"  >\r\n");
      out.write("                <tr>\r\n");
      out.write("                  <td height=\"166\" valign=\"middle\" >\r\n");
      out.write("                    \r\n");
      out.write("\t\t\t\t\t<MARQUEE direction=\"up\"  onmouseout=\"this.start()\" \r\n");
      out.write("             onmouseover=\"this.stop()\" scrollAmount=\"1\" scrollDelay=\"1\" class=\"linkBlack\" behavior=\"scroll\">\t  \r\n");
      out.write("\t\t            ");

                      for(int i=0;i<afficheList.size();i++){
                        AfficheForm afficheForm=(AfficheForm)afficheList.get(i);
                        
      out.write("\r\n");
      out.write("\t\t\t\t\t\t<div align=\"center\"><a href=\"#\" onClick=\"window.open('afficheSelect.jsp?id=");
      out.print(afficheForm.getId());
      out.write("','','width=400,height=300');\">");
      out.print(afficheForm.getName());
      out.write("</a></div><br><br>\r\n");
      out.write("\t\t\t\t\t\t");
}
      out.write("\r\n");
      out.write("                                            </marquee>                  </td>\r\n");
      out.write("                </tr>\r\n");
      out.write("            </table>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\r\n");
      out.write("\t\t\t\t\r\n");
      out.write("\t\t\t\t</td>\r\n");
      out.write("              </tr>\r\n");
      out.write("            </table>\t\t\t\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t\t</td>\r\n");
      out.write("          </tr>\r\n");
      out.write("          <tr>\r\n");
      out.write("            <td height=\"236\" valign=\"top\"><table width=\"100%\" height=\"235\"  border=\"0\" cellpadding=\"0\" cellspacing=\"0\">\r\n");
      out.write("              <tr>\r\n");
      out.write("                <td height=\"43\" background=\"image/shangpinxiaoshoupaihang.jpg\">&nbsp;</td>\r\n");
      out.write("              </tr>\r\n");
      out.write("              <tr>\r\n");
      out.write("                <td height=\"192\">\r\n");
      out.write("\t\t\t\t  <table width=\"84%\" height=\"153\"  border=\"0\" align=\"center\" cellpadding=\"0\" cellspacing=\"0\">\r\n");
      out.write("          <ul>   ");

             List goodsList =goods.selectGoodsNumber();
             int number=goodsList.size();
           if(number>6){
             number=5;
           }
             for(int account=0;account<number;account++){
             GoodsForm form=(GoodsForm)goodsList.get(account);
             
      out.write("\r\n");
      out.write("                <tr align=\"center\" >\r\n");
      out.write("                  ");
if(form.getNumber().equals(new Integer(0))){
      out.write("\r\n");
      out.write("                  <td width=\"39%\" >没有商品排名</td>\r\n");
      out.write("                  ");
}else{
      out.write("\r\n");
      out.write("                 \r\n");
      out.write("                  <td width=\"12%\" class=\"linkBlack\">&nbsp;\r\n");
      out.write("</td>\r\n");
      out.write("                  <td width=\"44%\" class=\"linkBlack\">                <li type=\"square\">\r\n");
      out.write("                   <div  align=\"left\"><a href=\"sell_result.jsp?id=");
      out.print(form.getId());
      out.write("&account=");
      out.print(account+1);
      out.write('"');
      out.write('>');
      out.print(form.getName());
      out.write("</a> </div></td>\r\n");
      out.write("                  ");
}
      out.write("\r\n");
      out.write("               <td width=\"5%\"></li>  </tr>\r\n");
      out.write("             ");
}
      out.write("</ul>\r\n");
      out.write("            </table>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\r\n");
      out.write("\t\t\t\t\r\n");
      out.write("\t\t\t\t\r\n");
      out.write("\t\t\t\t\r\n");
      out.write("\t\t\t\t</td>\r\n");
      out.write("              </tr>\r\n");
      out.write("            </table></td>\r\n");
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
