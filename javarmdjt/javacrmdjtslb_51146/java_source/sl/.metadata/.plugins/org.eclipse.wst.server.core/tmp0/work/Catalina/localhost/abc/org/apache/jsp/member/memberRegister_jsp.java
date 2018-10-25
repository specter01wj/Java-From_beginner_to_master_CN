package org.apache.jsp.member;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class memberRegister_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<title>会员注册</title>\r\n");
      out.write("<style type=\"text/css\">\r\n");
      out.write("<!--\r\n");
      out.write(".style1 {color: #FF0000}\r\n");
      out.write(".style2 {color: #000000}\r\n");
      out.write("-->\r\n");
      out.write("</style>\r\n");
      out.write(" <link href=\"../css/css1.css\" rel=\"stylesheet\" type=\"text/css\">\r\n");
      out.write("<script type=\"text/javascript\">\r\n");
      out.write("<!--\r\n");
      out.write("function SelectSubmit(){\r\n");
      out.write("\tdocument.all.registerForm.submit();\r\n");
      out.write("\treturn true;\r\n");
      out.write("}\r\n");
      out.write("function submit1(){\r\n");
      out.write("\tif(document.all.username.value.length==0){\r\n");
      out.write("\talert(\"请填写用户名!\");\r\n");
      out.write("\t\treturn false;\r\n");
      out.write("\t}\r\n");
      out.write("\tif(document.all.realname.value.length==0){\r\n");
      out.write("\t\talert(\"请填写真实姓名!\");\r\n");
      out.write("\t\treturn false;\r\n");
      out.write("\t}\r\n");
      out.write("\tif(document.all.password1.value.length==0){\r\n");
      out.write("\t\talert(\"请填写密码!\");\r\n");
      out.write("\t\treturn false;\r\n");
      out.write("\t}\r\n");
      out.write("\tif(document.all.password2.value.length==0){\r\n");
      out.write("\t\talert(\"请填写密码!\");\r\n");
      out.write("\t\treturn false;\r\n");
      out.write("\t}\r\n");
      out.write("\r\n");
      out.write("\tif(document.all.email.value.length==0){\r\n");
      out.write("\t\talert(\"请填写电子邮件!\");\r\n");
      out.write("\t\treturn false;\r\n");
      out.write("\t}\r\n");
      out.write("\tif(document.all.question.value.length==0){\r\n");
      out.write("\t\talert(\"请选择问题!\");\r\n");
      out.write("\t\treturn false;\r\n");
      out.write("\t}\r\n");
      out.write("\tif(document.all.result.value.length==0){\r\n");
      out.write("\t\talert(\"请填写问题答案!\");\r\n");
      out.write("\t\treturn false;\r\n");
      out.write("\t}\r\n");
      out.write("\tif(document.all.password1.value!=document.all.password2.value){\r\n");
      out.write("\t\talert(\"两次密码输入不相符！\");\r\n");
      out.write("\t\treturn false;\r\n");
      out.write("\t}\r\n");
      out.write("\tif(!checkemail(registerForm.email.value)){\r\n");
      out.write("\t\talert(\"您输入Email地址不正确!\");registerForm.email.focus();return false;\r\n");
      out.write("\t}\r\n");
      out.write("\r\n");
      out.write("\t //在JavaScript中，正则表达式只能使用\"/\"开头和结束，不能使用双引号\r\n");
      out.write("\tvar Expression=/[^\\u4E00-\\u9FA5]/; \r\n");
      out.write("\tvar objExp=new RegExp(Expression);\r\n");
      out.write("\tif(objExp.test(registerForm.username.value)!=true){\r\n");
      out.write("\t\talert(\"用户名只可以是英文名称!\");\r\n");
      out.write("\t\treturn false;\r\n");
      out.write("\t}\r\n");
      out.write("\t\r\n");
      out.write("\tdocument.all.registerForm.submit();\r\n");
      out.write("\treturn true;\r\n");
      out.write("\t\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("function checkemail(email){\r\n");
      out.write("\tvar str=email;\r\n");
      out.write("\tvar Expression=/\\w+([-+.']\\w+)*@\\w+([-.]\\w+)*\\.\\w+([-.]\\w+)*/; \r\n");
      out.write("\tvar objExp=new RegExp(Expression);\r\n");
      out.write("\tif(objExp.test(str)==true){\r\n");
      out.write("\t\treturn true;\r\n");
      out.write("\t}else{\r\n");
      out.write("\t\treturn false;\r\n");
      out.write("\t}\r\n");
      out.write("}\t\r\n");
      out.write("function reset(){\r\n");
      out.write("\tdocument.all.registerForm.reset();\r\n");
      out.write("}\r\n");
      out.write("function checkusername(){//用于添加“检查按钮”的Javascript\r\n");
      out.write("\t //在JavaScript中，正则表达式只能使用\"/\"开头和结束，不能使用双引号\r\n");
      out.write("\tvar Expression=/[^\\u4E00-\\u9FA5]/; \r\n");
      out.write("\tvar objExp=new RegExp(Expression);\r\n");
      out.write("\tif(objExp.test(registerForm.username.value)!=true){\r\n");
      out.write("\t\talert(\"用户名只可以是英文名称!\");\r\n");
      out.write("\t\treturn false;\r\n");
      out.write("\t}\r\n");
      out.write("\telse{\r\n");
      out.write("\t\twindow.location.href='checkuser.do?username='+registerForm.username.value\r\n");
      out.write("\t\treturn true;\r\n");
      out.write("\t}\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("//-->\r\n");
      out.write("</script>\r\n");
      out.write("<script language=\"javascript\">\r\n");
      out.write("function trigger(opt){\r\n");
      out.write("//opt表示现有可选项的数目\r\n");
      out.write("\tregisterForm.question.options[opt]=new Option(registerForm.question.options[opt]?\r\n");
      out.write("\tregisterForm.question.options[opt].innerText+String.fromCharCode(event.keyCode):\r\n");
      out.write("\tString.fromCharCode(event.keyCode))\r\n");
      out.write("\tregisterForm.question.selectedIndex=opt;  //设置下拉列表的选中项\r\n");
      out.write("}\r\n");
      out.write("</script>\r\n");
      out.write("<script language=\"javascript\">\r\n");
      out.write("function edit(opt){\r\n");
      out.write("//opt表示现有可选项的数目\r\n");
      out.write("\tif(registerForm.question.options[opt]){\r\n");
      out.write("\t\tif(event.keyCode==8){\r\n");
      out.write("\t\t\tvar str=registerForm.question.options[opt].innerText;\r\n");
      out.write("\t\t\tvar len=str.length;\t\tregisterForm.question.options[opt].innerText=str.substring(0,len-1);\r\n");
      out.write("\t\t\tif(registerForm.question.options[opt].innerText==\"\"){\r\n");
      out.write("\t\t\t\tregisterForm.question.remove(opt);\r\n");
      out.write("\t\t\t\tregisterForm.question.selectedIndex=1;\r\n");
      out.write("\t\t\t};\r\n");
      out.write("\t\t}\r\n");
      out.write("\t\tif(event.keyCode==32){\r\n");
      out.write("\t\t\tregisterForm.question.options[opt].innerText+=\" \";\r\n");
      out.write("\t\t}\r\n");
      out.write("\t}\r\n");
      out.write("}\r\n");
      out.write("</script>\r\n");
      out.write("\r\n");
      out.write("</head>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<body>\r\n");
      out.write("<div align=\"center\">\r\n");
      out.write("  <p class=\"blue\"><strong>会员注册\r\n");
      out.write("  </strong></p>\r\n");
      out.write("  <form name=\"registerForm\" method=\"post\" action=\"../memberAction.do?action=0\">\r\n");
      out.write("    <table width=\"298\"  border=\"1\" cellspacing=\"0\" cellpadding=\"0\" bordercolor=\"#FFFFFF\" bordercolordark=\"#819BBC\" bordercolorlight=\"#FFFFFF\">\r\n");
      out.write("      <tr>\r\n");
      out.write("        <td width=\"105\" height=\"35\" bgcolor=\"#EFF6FE\">\r\n");
      out.write("        <div align=\"center\">会员名称</div></td>\r\n");
      out.write("        <td width=\"187\"><div align=\"center\">\r\n");
      out.write("          <input type=\"text\" name=\"username\">\r\n");
      out.write("          <span class=\"style1\">*</span></div></td>\r\n");
      out.write("      </tr>\r\n");
      out.write("      <tr>\r\n");
      out.write("        <td height=\"35\" bgcolor=\"#EFF6FE\">\r\n");
      out.write("        <div align=\"center\">会员密码</div></td>\r\n");
      out.write("        <td><div align=\"center\">\r\n");
      out.write("          <input type=\"password\" name=\"password1\">\r\n");
      out.write("          <span class=\"style1\">*</span></div></td>\r\n");
      out.write("      </tr>\r\n");
      out.write("      <tr>\r\n");
      out.write("        <td height=\"35\" bgcolor=\"#EFF6FE\">\r\n");
      out.write("        <div align=\"center\">密码确认</div></td>\r\n");
      out.write("        <td><div align=\"center\">\r\n");
      out.write("          <input type=\"password\" name=\"password2\">\r\n");
      out.write("          <span class=\"style1\">*</span></div></td>\r\n");
      out.write("      </tr>\r\n");
      out.write("      <tr>\r\n");
      out.write("        <td height=\"35\" bgcolor=\"#EFF6FE\">\r\n");
      out.write("        <div align=\"center\">真实姓名</div></td>\r\n");
      out.write("        <td><div align=\"center\">\r\n");
      out.write("          <input type=\"text\" name=\"realname\">\r\n");
      out.write("          <span class=\"style1\">*</span></div></td>\r\n");
      out.write("      </tr>\r\n");
      out.write("      <tr>\r\n");
      out.write("        <td height=\"35\" bgcolor=\"#EFF6FE\">\r\n");
      out.write("        <div align=\"center\">年龄</div></td>\r\n");
      out.write("        <td><div align=\"center\">\r\n");
      out.write("          <input type=\"text\" name=\"age\" value=\"18\">\r\n");
      out.write("          <span class=\"style2\">*</span></div></td>\r\n");
      out.write("      </tr>\r\n");
      out.write("      <tr>\r\n");
      out.write("        <td height=\"35\" bgcolor=\"#EFF6FE\">\r\n");
      out.write("        <div align=\"center\">职业</div></td>\r\n");
      out.write("        <td><div align=\"center\">\r\n");
      out.write("          <input type=\"text\" name=\"profession\" value=\"学生\">\r\n");
      out.write("          <span class=\"style2\">*</span></div></td>\r\n");
      out.write("      </tr>\r\n");
      out.write("      <tr>\r\n");
      out.write("        <td height=\"35\" bgcolor=\"#EFF6FE\">\r\n");
      out.write("        <div align=\"center\">Email地址</div></td>\r\n");
      out.write("        <td><div align=\"center\">\r\n");
      out.write("          <input name=\"email\" type=\"text\" >\r\n");
      out.write("          <span class=\"style1\">*</span></div></td>\r\n");
      out.write("      </tr>\r\n");
      out.write("      <tr>\r\n");
      out.write("        <td height=\"35\" bgcolor=\"#EFF6FE\">\r\n");
      out.write("        <div align=\"center\">找回密码问题</div></td>\r\n");
      out.write("        <td><div align=\"center\">\r\n");
      out.write("          <select id=\"question\" onkeypress=\"trigger(3)\" onkeyup=\"edit(3)\" name=\"question\">\r\n");
      out.write("\t\t  <option value=\"1+1=？\">1+1=</option>\r\n");
      out.write("\t\t  <option value=\"我的爱好是什么？\">我的爱好是什么？</option>\r\n");
      out.write("\t\t  <option value=\"我姓什么？\">我的爱好是什么？</option>\r\n");
      out.write("          </select>\r\n");
      out.write("          <span class=\"style1\">*</span></div></td>\r\n");
      out.write("      </tr>\r\n");
      out.write("      <tr>\r\n");
      out.write("        <td height=\"35\" bgcolor=\"#EFF6FE\">\r\n");
      out.write("        <div align=\"center\">答案</div></td>\r\n");
      out.write("        <td><div align=\"center\">\r\n");
      out.write("          <input type=\"text\" name=\"result\">\r\n");
      out.write("          <span class=\"style1\">*</span></div></td>\r\n");
      out.write("      </tr>\r\n");
      out.write("    </table>\r\n");
      out.write("    <p><span class=\"style1\">*</span>：<span class=\"blue\">代表必添项目</span>\r\n");
      out.write("    *：<span class=\"blue\">代表非必添项目</span></p>\r\n");
      out.write("    <p>\r\n");
      out.write("        <input type=\"button\" name=\"Submit2\" value=\"提交\"  onClick=\"return submit1();\">\r\n");
      out.write("&nbsp;&nbsp;\r\n");
      out.write("        <input type=\"reset\" name=\"Submit3\" value=\"重置\">\r\n");
      out.write("    </p>\r\n");
      out.write("        </p>\r\n");
      out.write("  </form>\r\n");
      out.write("  <p>&nbsp;  </p>\r\n");
      out.write("</div>\r\n");
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
