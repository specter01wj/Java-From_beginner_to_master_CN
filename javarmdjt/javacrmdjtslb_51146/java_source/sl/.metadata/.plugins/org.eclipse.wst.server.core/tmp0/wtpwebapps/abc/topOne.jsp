<%@ page contentType="text/html; charset=gb2312" %>
<%@page import="java.sql.*"%>
<%@page import="java.util.*"%>
<%@page import="com.domain.LinkForm" %>
<jsp:useBean id="dao" scope="page" class="com.dao.LinkDao"/>
<meta http-equiv="Content-Type" content="text/html; charset=gb2312">
<%List list=dao.selectLink();%>
<link href="css/css.css" rel="stylesheet" type="text/css">
<!--table width="755" height="106"  border="0" cellpadding="0" cellspacing="0"  background="image/banner.jpg"-->
<table width="755" height="112"  border="0" cellpadding="0" cellspacing="0">
        <tr>
          <td height="106"><img src="image/gougo1.jpg" width="755" height="112" border="0" usemap="#Map"/></td>
        </tr>
</table>

<map name="Map">
<%if(session.getAttribute("id")==null||session.getAttribute("form")==null){%>
  <area shape="rect" coords="279,68,304,82" href="index.jsp">
  <area shape="rect" coords="337,68,386,82" href="goodsAction.do?action=14&mark=0">
  <area shape="rect" coords="414,67,464,82" href="goodsAction.do?action=15&mark=1">
  <area shape="rect" coords="482,67,555,82" href="connection.jsp">
  <area shape="rect" coords="567,69,603,81" href="connection.jsp">
  <area shape="rect" coords="695,67,744,83" href="sell_resultTen.jsp">
  <area shape="rect" coords="628,68,677,81" href="connection.jsp">
  <% }else{%>
    <area shape="rect" coords="279,68,304,82" href="index.jsp">
  <area shape="rect" coords="337,68,386,82" href="goodsAction.do?action=14&mark=0">
  <area shape="rect" coords="414,67,464,82" href="goodsAction.do?action=15&mark=1">
  <!--area shape="rect" coords="482,67,555,82" href="memberAction.do?action=5&id=<!--%=session.getAttribute("id")%>"-->
  <area shape="rect" coords="482,67,555,82" href="#" onClick="javascript:window.open('memberAction.do?action=5&id=<%=session.getAttribute("id")%>','advertise','width=350,height=450,top=10,left=20')">
  <!--area shape="rect" coords="569,69,605,81" href="cart_see.jsp"-->
  <area shape="rect" coords="569,69,605,81" href="#" onClick="javascript:window.open('cart_see.jsp','','width=570,height=300,top=10,left=20')">
  <area shape="rect" coords="695,67,744,83" href="sell_resultTen.jsp">
  <area shape="rect" coords="628,68,677,81" href="cart_detail.jsp">
  <%}%>
  <area shape="rect" coords="504,11,554,23" href="mailto:tmoonbook@sina.com">
  <area shape="rect" coords="601,9,652,24" href="javascript:window.external.AddFavorite('http://localhost/net','蜀玉电子购物商城')">
  <area shape="rect" coords="701,9,749,23"  href="#" onclick="this.style.behavior='url(#default#homepage)';this.sethomepage('http://localhost/net')">
</map>
