<%@ page contentType="text/html; charset=gb2312" %>
<meta http-equiv="Content-Type" content="text/html; charset=gb2312">
<link href="css/css.css" rel="stylesheet" type="text/css">


<%if(session.getAttribute("id")==null||session.getAttribute("form")==null){%>
<table width="97%" height="41"  border="0" align="center" cellpadding="0" cellspacing="0" >
      <tr align="center" >
        <td width="117" height="39" class="linkWhite"><a href="index.jsp" >首页<br>
        Index</a></td>
        <td width="117" class="linkWhite"><a href="sell_resultTen.jsp">销售排行<br>
  SellSort</a></td>
        <td width="117" class="linkWhite"><a href="goodsAction.do?action=14&mark=0">新品上架<br>
  NewsGoods</a></td>
        <td width="117" class="linkWhite"><a href="goodsAction.do?action=15&mark=1" >特价商品<br>
  At a sale</a></td>
        <td width="117" class="linkWhite"><a href="connection.jsp" >查看订单<br>
  Order</a></td>
        <td width="117" class="linkWhite"><a href="connection.jsp" >查看购物车<br>
  Cart</a></td>
        <td width="117" class="linkWhite"><a href="connection.jsp" >会员修改<br>
  Member</a></td>
        <td width="117" class="linkWhite"><a href="#" onclick="this.style.behavior='url(#default#homepage)';this.sethomepage('http://www.mingrisoft.com')" class="linkBlack">设为首页<br>
  SettingFirst</a></td>
      </tr>
</table>
<%}else{%>
<table width="97%" height="41"  border="0" align="center" cellpadding="0" cellspacing="0">
      <tr align="center">
        <td width="117" height="39" class="linkWhite"><a href="index.jsp">首页<br>
        Index</a></td>
        <td width="117" class="linkWhite"><a href="sell_resultTen.jsp">销售排行<br>
  SellSort</a></td>
        <td width="117" class="linkWhite"><a href="goodsAction.do?action=14&mark=0">新品上架<br>
  NewsGoods</a></td>
        <td width="117" class="linkWhite"><a href="goodsAction.do?action=15&mark=1">特价商品<br>
  At a sale</a></td>
        <td width="117" class="linkWhite"><a href="cart_detail.jsp">查看订单<br>
  Order</a></td>
        <td width="117" class="linkWhite"><a href="cart_see.jsp">查看购物车<br>
  Cart</a></td>
        <td width="117" class="linkWhite"><a href="memberAction.do?action=5&id=<%=session.getAttribute("id")%>">会员修改<br>
  Member</a></td>
        <td width="117" class="linkWhite"><a href="#" onclick="this.style.behavior='url(#default#homepage)';this.sethomepage('http://www.mingrisoft.com')">设为首页<br>
  SettingFirst</a></td>
      </tr>
</table>
<%}%>
