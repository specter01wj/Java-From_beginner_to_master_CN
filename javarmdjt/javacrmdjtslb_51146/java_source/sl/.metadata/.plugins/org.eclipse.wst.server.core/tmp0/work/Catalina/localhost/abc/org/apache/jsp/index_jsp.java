package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class index_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<meta http-equiv=\"Content-Type\" content=\"text/html; charset=gb2312\">\r\n");
      out.write("<title>电子购物商城</title>\r\n");
      out.write("<link href=\"Css/style.css\" rel=\"stylesheet\">\r\n");
      out.write("<script language=\"javascript\">\r\n");
      out.write("function clockon(bgclock){\r\n");
      out.write("\tvar now=new Date();\r\n");
      out.write("\tvar year=now.getYear();\r\n");
      out.write("\tvar month=now.getMonth();\r\n");
      out.write("\tvar date=now.getDate();\r\n");
      out.write("\tvar day=now.getDay();\r\n");
      out.write("\tvar hour=now.getHours();\r\n");
      out.write("\tvar minu=now.getMinutes();\r\n");
      out.write("\tvar sec=now.getSeconds();\r\n");
      out.write("\tvar week;\r\n");
      out.write("\tmonth=month+1;\r\n");
      out.write("\tif(month<10) month=\"0\"+month;\r\n");
      out.write("\tif(date<10) date=\"0\"+date;\r\n");
      out.write("\tif(hour<10) hour=\"0\"+hour;\r\n");
      out.write("\tif(minu<10) minu=\"0\"+minu;\r\n");
      out.write("\tif(sec<10) sec=\"0\"+sec;\r\n");
      out.write("\tvar arr_week=new Array(\"星期日\",\"星期一\",\"星期二\",\"星期三\",\"星期四\",\"星期五\",\"星期六\");\r\n");
      out.write("\tweek=arr_week[day];\r\n");
      out.write("\tvar time=\"\";\r\n");
      out.write("\ttime=year+\"年\"+month+\"月\"+date+\"日 \"+week+\" \"+hour+\":\"+minu+\":\"+sec;\r\n");
      out.write("\tif(document.all){\r\n");
      out.write("\t\tbgclock.innerHTML=\"当前时间：[\"+time+\"]\"\r\n");
      out.write("\t}\r\n");
      out.write("\tvar timer=setTimeout(\"clockon(bgclock)\",200);\r\n");
      out.write("} \r\n");
      out.write("\r\n");
      out.write("</script>\r\n");
      out.write("  <!--  script   language=\"javascript\">   \r\n");
      out.write("  window.onbeforeunload   =   function   ()   \r\n");
      out.write("  {   \r\n");
      out.write("            if   (event.clientY   <   0   &&   event.clientX>document.body.scrollWidth)   {   \r\n");
      out.write("           window.location.href=\"loginOut.jsp\";\r\n");
      out.write("        }   \r\n");
      out.write("  }   \r\n");
      out.write("  </script--> \r\n");
      out.write("  <script type=\"text/javascript\">\r\n");
      out.write("  function window.onunload(){\r\n");
      out.write("  \tif(event.clientX<0&&event.clientY<0){\r\n");
      out.write("  \t\twindow.location.href(\"lotest.jsp\");\r\n");
      out.write("  \t}\r\n");
      out.write("  }\r\n");
      out.write("  </script>\r\n");
      out.write("</head>\r\n");
      out.write("\r\n");
      out.write("<body onLoad=\"clockon(bgclock)\">\r\n");
      out.write("<div id=\"div1\" style=\"position: absolute;  text-align:center; visibility:hidden; filter: revealTrans(Transition=8, Duration=1)  revealTrans(Transition=9, Duration=3)  revealTrans(Transition=10, Duration=1)  revealTrans(Transition=11, Duration=2)  revealTrans(Transition=12, Duration=3)  revealTrans(Transition=17, Duration=2)  revealTrans(Transition=18, Duration=3) revealTrans(Transition=19, Duration=1) revealTrans(Transition=20, Duration=2) revealTrans(Transition=21, Duration=3)\"><img id=\"img1\"></div>\r\n");
      out.write("<script language=\"javascript\">\r\n");
      out.write("var n=0;\r\n");
      out.write("var n1=0;\r\n");
      out.write("var is=true;\r\n");
      out.write("document.all.div1.style.top=document.body.clientHeight-135;\r\n");
      out.write("document.all.div1.style.left=document.body.clientWidth-175;\r\n");
      out.write("function showdiv(){\r\n");
      out.write("\tn=Math.floor(Math.random()*10);\r\n");
      out.write("\tdocument.all.div1.filters[n].apply();\r\n");
      out.write("\tif (n1==5){n1=1}\r\n");
      out.write("\telse{n1=n1+1}\r\n");
      out.write("\tdocument.all.img1.src=\"image/guanggao/\"+n1+\".jpg\";\r\n");
      out.write("\tif (is==true){\t\r\n");
      out.write("\t\tdocument.all.div1.style.visibility=\"visible\";\r\n");
      out.write("\t\tis=false;\r\n");
      out.write("\t}else{\r\n");
      out.write("\t\tdocument.all.div1.style.visibility=\"hidden\";\r\n");
      out.write("\t\tis=true;\r\n");
      out.write("\t}\r\n");
      out.write("\tdocument.all.div1.filters[n].play();\r\n");
      out.write("\tsetTimeout(\"showdiv()\",6000);\r\n");
      out.write("}\r\n");
      out.write("showdiv();\r\n");
      out.write("function place(){\r\n");
      out.write("\twindow.status=String(n);\r\n");
      out.write("\tdocument.all.div1.style.top=parseInt(document.body.scrollTop)+parseInt(document.body.clientHeight)-135;\r\n");
      out.write("\tdocument.all.div1.style.left=parseInt(document.body.scrollLeft)+parseInt(document.body.clientWidth)-175;\r\n");
      out.write("\tsetTimeout(\"place()\",50)\r\n");
      out.write("}\r\n");
      out.write("place();\r\n");
      out.write("</script>\r\n");
      out.write("<table width=\"755\"  border=\"0\" align=\"center\" cellpadding=\"0\" cellspacing=\"0\">\r\n");
      out.write("  <tr>\r\n");
      out.write("    <td><div align=\"center\">\r\n");
      out.write("    ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "topOne.jsp", out, false);
      out.write("</div>    </td>\r\n");
      out.write("  </tr>\r\n");
      out.write("  <tr>\r\n");
      out.write("    <td height=\"847\">\r\n");
      out.write("\t<table width=\"100%\" height=\"100%\"  border=\"0\" cellpadding=\"0\" cellspacing=\"0\">\r\n");
      out.write("      <tr >\r\n");
      out.write("        <td width=\"193\" height=\"638\" rowspan=\"4\" valign=\"top\" background=\"image/zuocedaohangbeijing.jpg\">");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "left.jsp", out, false);
      out.write("</td>\r\n");
      out.write("        <td width=\"562\" height=\"10\" align=\"center\" valign=\"bottom\" bgcolor=\"#E2E2E2\"> <div id=\"bgclock\"class=\"zi\"></div>  </td>\r\n");
      out.write("      \r\n");
      out.write("      </tr>\r\n");
      out.write("      <tr >\r\n");
      out.write("        <td height=\"39\" align=\"center\" valign=\"middle\" bgcolor=\"#FFFFFF\">");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "topThree.jsp", out, false);
      out.write("</td>\r\n");
      out.write("      </tr>\r\n");
      out.write("      <tr>\r\n");
      out.write("        <!--td  height=\"89\" valign=\"top\" background=\"image/guanggaotiao.jpg\">\t\t</td-->\r\n");
      out.write("\t\t<td  height=\"89\" valign=\"top\"><object classid=\"clsid:D27CDB6E-AE6D-11cf-96B8-444553540000\" codebase=\"http://download.macromedia.com/pub/shockwave/cabs/flash/swflash.cab#version=6,0,29,0\" width=\"562\" height=\"198\">\r\n");
      out.write("          <param name=\"movie\" value=\"image/3.swf\">\r\n");
      out.write("          <param name=\"quality\" value=\"high\">\r\n");
      out.write("          <embed src=\"image/3.swf\" quality=\"high\" pluginspage=\"http://www.macromedia.com/go/getflashplayer\" type=\"application/x-shockwave-flash\" width=\"607\" height=\"198\"></embed>\r\n");
      out.write("\t\t  </object></td>\r\n");
      out.write("      </tr>\r\n");
      out.write("      <tr>\r\n");
      out.write("        <td  height=\"524\" valign=\"top\" bgcolor=\"#FFFFFF\">");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "right.jsp", out, false);
      out.write("</td>\r\n");
      out.write("      </tr>\r\n");
      out.write("    </table></td>\r\n");
      out.write("  </tr>\r\n");
      out.write(" <tr bgcolor=\"#FFFFFF\">\r\n");
      out.write("    <td height=\"100\" ><p align=\"center\">");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "downNews.jsp", out, false);
      out.write("\r\n");
      out.write("\r\n");
      out.write("   </td>\r\n");
      out.write("  </tr>\r\n");
      out.write("\r\n");
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
