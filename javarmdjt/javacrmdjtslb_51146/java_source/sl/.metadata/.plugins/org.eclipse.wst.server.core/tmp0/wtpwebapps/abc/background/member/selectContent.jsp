<%@ page contentType="text/html; charset=gb2312"%>
<%@page import="java.sql.*"%>
<%@page import="java.util.*"%>
<%@page import="com.domain.MemberForm"%>


<%
MemberForm form=(MemberForm)request.getAttribute("form");

%>



<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=gb2312">
<title>电子商城的后台</title>
<link href="../../css/css.css" rel="stylesheet" type="text/css">
</head>
 <link href="css/css.css" rel="stylesheet" type="text/css">
<body>
<table width="755"  border="0" align="center" cellpadding="0" cellspacing="0">
  <tr valign="bottom">
    <td height="108" colspan="2"  background="image/banner1.jpg">      <div align="center">
   <jsp:include page="../upTwo.jsp"/>
      </div></td>
  </tr>
  <tr>
    <td width="24%" height="318"><jsp:include page="../../leftManager.jsp"/>  </td>
    <td width="76%" height="318" bgcolor="#FFFFFF"  class="linkBlack">
	
	<table width="99%" height="16"  border="0" cellpadding="0" cellspacing="0">
      <tr>
        <td bgcolor="#E6E6E6"><div align="center"><font color="#990000"><b>查看会员的详细情况</b></font></div></td>
      </tr>
    </table>
<br><br>

      <br>
      <br>
        <table width="71%" height="130"  border="1" align="center" cellpadding="0" cellspacing="0">
          <tr class="zi">
            <td width="20%" height="26"><div align="center">数据编号</div></td>
            <td width="31%"><div align="center"><%=form.getId()%></div></td>
            <td width="20%"><div align="center">会员账号</div></td>
            <td width="31%"><div align="center"><%=form.getName()%></div></td>
          </tr>
          <tr class="zi">
            <td height="25"><div align="center">会员姓名</div></td>
            <td><div align="center"><%=form.getReallyName()%></div></td>
            <td><div align="center">会员年龄</div></td>
            <td><div align="center"><%=form.getAge()%>岁</div></td>
          </tr>
          <tr class="zi">
            <td height="27"><div align="center">会员职业</div></td>
            <td><div align="center"><%=form.getProfession()%></div></td>
            <td><div align="center">电子邮件</div></td>
            <td><div align="center"><%=form.getEmail()%></div></td>
          </tr>

          <tr class="zi">
           <td height="27"><div align="center">问&nbsp;&nbsp;&nbsp;&nbsp;题</div></td>
            <td><div align="center"><%=form.getQuestion()%></div></td>
            <td><div align="center">答&nbsp;&nbsp;&nbsp;&nbsp;案</div></td>
            <td><div align="center"><%=form.getResult()%></div></td>
          </tr>
      </table>
        <table width="71%"  border="0" align="center" cellpadding="0" cellspacing="0">
          <tr class="zi">
            <td width="87%" height="29">&nbsp;</td>
            <td width="13%"> <a href="javascript:history.back();">返回</a></td>
          </tr>
      </table>


	  </div></td>
  </tr>
  <tr bgcolor="#FFFFFF">
    <td height="60" colspan="2"><p align="center"><jsp:include page="../downNews.jsp"/>

</p>    </td>
  </tr>
</table>
</body>
</html>
