<%@ page contentType="text/html; charset=gb2312" %>
<%@page import="com.domain.MemberForm"%>
<%@page import="com.tool.Chinese"%>
<jsp:useBean id="dao" scope="page" class="com.dao.MemberDao"/>
<%
String password=Chinese.chinese(request.getParameter("password").trim());
Integer id=Integer.valueOf(request.getParameter("id"));
boolean change=dao.updatePassword(password,id);
%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=gb2312">
<title>找回密码步骤四</title>
<script language="javascript">
function closeit(){
setTimeout("self.close()",3000);
}
</script>
</head>
 <link href="../css/css1.css" rel="stylesheet" type="text/css">

<body onLoad="closeit();">
<p>&nbsp;</p>
<div align="center" class="blue">
  <p><strong>
    <%if(change){%>
    密码修改成功！！！
  <%}else{%>
    密码修改失败！！！
  <%}%>
  </strong></p>
<!--meta http-equiv="refresh" content="3;URL=../index.jsp"-->

</div>
</body>
</html>
