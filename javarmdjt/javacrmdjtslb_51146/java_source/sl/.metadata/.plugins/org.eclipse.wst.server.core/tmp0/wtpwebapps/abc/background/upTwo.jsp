<%@ page contentType="text/html; charset=gb2312" %>
<meta http-equiv="Content-Type" content="text/html; charset=gb2312">
<%@ page import="com.domain.ManagerForm"%>
<%java.util.Date date=new java.util.Date();%>
<%ManagerForm manager=(ManagerForm)session.getAttribute("manager");%>
<%if(manager==null||manager.equals("")){%>  
<meta http-equiv="refresh" content="0;URL=background\connectionFail.jsp">
    
	  <%}else{%>
	  <link href="../css/css.css" rel="stylesheet" type="text/css">
<table width="100%" height="15"  border="0" cellpadding="0" cellspacing="0">
        <tr>
          <td width="24%" height="18" class="zi">&nbsp;&nbsp;&nbsp;<font color="#FFFFFF">当前登录的是：<%=manager.getAccount()%></font></td>
          <td width="76%"><div align="right" class="zi"><font color="#FFFFFF">今天是<%=date.getYear()+1900%>年<%=date.getMonth()+1%>月<%=date.getDate()%>日</font>&nbsp;&nbsp;&nbsp;</div></td>
        </tr>
      </table>
	  <%}%>