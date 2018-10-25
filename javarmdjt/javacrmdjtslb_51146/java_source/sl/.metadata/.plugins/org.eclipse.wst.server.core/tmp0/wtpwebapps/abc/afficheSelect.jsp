<%@ page contentType="text/html; charset=gb2312" language="java" import="java.sql.*" errorPage="" %>
<%@page import="java.sql.*"%>
<%@page import="java.util.*"%>
<%@page import="com.domain.AfficheForm"%>
<jsp:useBean id="dao" scope="page" class="com.dao.AfficheDao"/>
<%AfficheForm form=dao.selectOneAffiche(Integer.valueOf(request.getParameter("id")));%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=gb2312">
<link rel="stylesheet" href="css/css1.css">
<title></title>
</head>

<body bgcolor="#FFC7C6">
<table width="68%" height="218" border="0" align="center" cellpadding="0" cellspacing="0">
  <tr>
    <td height="39" colspan="2">
      <p align="center"><font size="7" face="隶书">公告信息</font></td>
  </tr>

  <tr>
    <td width="18%" height="37"><div align="center"><font size="5">    </font></div></td>
    <td width="82%"><font size="5">标题：<%=form.getName()%> </font></td>
  </tr>
  <tr>
    <td width="18%" height="32"><div align="center"></div></td>
    <td width="82%" height="32">公告内容<%=form.getContent()%> </td>
  </tr>

<tr>
<td width="18%" height="27"><div align="center"> </div></td>
<td width="82%" height="27">发布时间:<%=form.getIssueTime()%></td>
</tr>


<tr><td height="27" colspan="2" align="center">
<input type="button" name="wclose" value="关闭窗口" onClick="window.close()">
</td>
</tr>
</table>

</body>
</html>
