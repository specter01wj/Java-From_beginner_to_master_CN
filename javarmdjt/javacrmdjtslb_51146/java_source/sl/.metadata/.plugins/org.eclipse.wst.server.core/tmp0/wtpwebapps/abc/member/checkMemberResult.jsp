<%@ page contentType="text/html; charset=gb2312" %>
<%@page import="com.domain.MemberForm"%>
<%@page import="com.tool.Chinese"%>
<jsp:useBean id="dao" scope="page" class="com.dao.MemberDao"/>

<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=gb2312">
<title>会员登录结果</title>
</head>
 <link href="../css/css.css" rel="stylesheet" type="text/css">

<body>
<p>&nbsp;</p>
<div align="center">
  <p><strong>
    <%if(request.getAttribute("result")==null){%>
    <%
      String id=(String)request.getAttribute("id");
      MemberForm form=(MemberForm)request.getAttribute("memberForm");
	  session.setAttribute("id",id);
      session.setAttribute("form",form);
    %>
<!--  meta http-equiv="refresh" content="0;URL=index.jsp"-->
<%response.sendRedirect("index.jsp"); %>
  <%}else{%>
      <%
	  String result=(String)request.getAttribute("result");
	  %>
	  <script language='javascript'>alert('<%=result%>');window.location.href='index.jsp';</script>

  <%}%> 
  </strong></p>
	
</div>
</body>
</html>
