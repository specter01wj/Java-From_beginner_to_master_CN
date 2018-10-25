<%@ page contentType="text/html; charset=gb2312" %>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=gb2312">
<title>订单处理结果</title>
</head>
<body>
<br>
<%
String success=(String)request.getAttribute("success");
String sign=(String)request.getParameter("sign");
%>
<%if(sign!=null){%>
  <script language='javascript'>alert('<%=success%>');window.location.href='orderAction.do?action=0&sign=<%=sign%>';</script>
<%}else{%>
 <script language='javascript'>alert('<%=success%>');window.location.href='orderAction.do?action=0';</script>
<%}%>
</body>
</html>
