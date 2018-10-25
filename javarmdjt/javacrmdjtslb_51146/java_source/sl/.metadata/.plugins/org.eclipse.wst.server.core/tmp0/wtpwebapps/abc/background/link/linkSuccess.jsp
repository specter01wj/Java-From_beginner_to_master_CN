<%@page contentType="text/html; charset=gb2312"%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=gb2312">
<jsp:useBean id="su" scope="page" class="com.jspsmart.upload.SmartUpload"/>
<title>电子商城的后台</title>
</head>
<link href="css/css.css" rel="stylesheet" type="text/css">
<body>
<table width="755" height="100%" border="0" align="center" cellpadding="0" cellspacing="0">
  
  <tr valign="bottom">
    <td height="108" colspan="2"  background="image/banner1.jpg">
      <div align="center">
      <jsp:include page="../upTwo.jsp"/>
      </div>
    </td>
  </tr>
  <tr>
    <td width="24%" height="318">
    <jsp:include page="../../leftManager.jsp"/>
    </td>
    <td width="76%" bgcolor="#FFFFFF">
      <div align="center">
	  <table width="99%" height="16"  border="0" cellpadding="0" cellspacing="0">
      <tr>
        <td bgcolor="#E6E6E6"><div align="center"><font color="#990000"><b><%=request.getAttribute("success")%></b></font></div></td>
      </tr>
    </table>
<br><br>
	  

        <p>&nbsp;</p>
        <p>&nbsp;</p>
        <p>&nbsp;</p>
        <p>&nbsp;</p>
        <p>&nbsp;</p>
        <p>&nbsp;</p>
        <p>&nbsp;</p>
        <p>&nbsp;</p>
        <p>&nbsp;</p>
      </div>
    </td>
    <meta http-equiv="refresh" content="3;URL=linkAction.do?action=0">
  </tr>
  <tr bgcolor="#FFFFFF">
    <td height="60" colspan="2">
      <p align="center">
      <jsp:include page="../downNews.jsp"/>
      </p>
    </td>
  </tr>
</table>
</body>
</html>
