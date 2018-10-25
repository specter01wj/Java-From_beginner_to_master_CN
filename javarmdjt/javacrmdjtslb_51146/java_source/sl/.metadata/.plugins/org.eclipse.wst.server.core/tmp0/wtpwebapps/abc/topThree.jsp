<%@ page contentType="text/html; charset=gb2312" %>
<%@page import="java.sql.*"%>
<%@page import="java.util.*"%>
<%@page import="com.domain.BigTypeForm"%>
<jsp:useBean id="big" scope="page" class="com.dao.BigTypeDao"/>
<%List bigList=(List)big.selectBig();%>
<meta http-equiv="Content-Type" content="text/html; charset=gb2312">
<table width="55%" height="22"  border="1" cellpadding="0" cellspacing="0"  bordercolor="#FFFFFF" bordercolorlight="#FFFFFF" bordercolordark="#819BBC">
                <tr>
                  <%
                  String id=request.getParameter("id");
				  if(id==null){
				  id="none";
				  }
                  for(int i=0;i<bigList.size();i++){
                  BigTypeForm bigForm=(BigTypeForm)bigList.get(i);
				  
                    %>
 <td  align="center" class="linkBlack" <%if(id.equals(bigForm.getId().toString())){out.println("bgcolor='#DAD9D9'");}%>><a href="goodsAction.do?action=12&big=<%=bigForm.getId()%>&id=<%=bigForm.getId()%>"><%=bigForm.getBigName()%></a></td>
                  <%}%>
                </tr>
</table>
