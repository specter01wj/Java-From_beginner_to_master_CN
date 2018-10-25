<%@ page contentType="text/html; charset=gb2312" %>
<%@ page import="java.util.*"%>
<%@ page import="com.domain.SellGoodsForm"%>
<jsp:useBean id="dao" scope="page" class="com.dao.GoodsDao"/>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=gb2312">
<title>电子商城</title>

<link href="css/css.css" rel="stylesheet" type="text/css">
</head>
<body>
<div align="center">
<table width="562" height="290" border="0" cellpadding="0" cellspacing="0">
      <tr>
        <td width="562" height="46" align="center" valign="center" background="image/gouwuche.jpg">&nbsp;</td>
      </tr>
      <tr>
        <td  valign="top" bgcolor="#FFFFFF">
		  <div align="center" class="zi"><br>
              <%if(session.getAttribute("cart")==null){%>
           您还没有购物！！！
           <%}else{%>

        </div>
        <form method="post" action="cart_modify.jsp" name="form">
		  <table width="96%"  border="1" align="center" cellpadding="0" cellspacing="0" bordercolor="#FFFFFF" bordercolordark="#819BBC" bordercolorlight="#FFFFFF">
          <tr class="zi">
            <td width="16%" height="28"><div align="center">序号</div></td>
            <td width="23%"><div align="center">商品的名称</div></td>
            <td width="22%"><div align="center">商品价格</div></td>
            <td width="22%"><div align="center">商品数量</div></td>
            <td width="17%"><div align="center">总金额</div></td>
          </tr>
            <%
            float sum=0;
        Vector cart=(Vector)session.getAttribute("cart");
        for(int i=0;i<cart.size();i++){
          SellGoodsForm form=(SellGoodsForm)cart.elementAt(i);
          sum=sum+form.number*form.price;
        
        %>
          <tr class="zi">
            <td height="28"><div align="center"><%=i+1%></div></td>
            <td><div align="center"><%=dao.selectOneGoods(new Integer(form.ID)).getName()%></div></td>
            <td><div align="center"><%=form.price%>元</div></td>
            <td><div align="center"><input name="num<%=i%>" size="7" type="text"  value="<%=form.number%>" onBlur="check(this.form)"></div></td>
            <td><div align="center"><%=form.number*form.price%>元</div></td>
          </tr>
		     <script language="javascript">
<!--
			function check(myform){
				if(isNaN(myform.num<%=i%>.value) || myform.num<%=i%>.value.indexOf('.',0)!=-1){
					alert("请不要输入非法字符");myform.num<%=i%>.focus();return;}
				if(myform.num<%=i%>.value==""){
					alert("请输入修改的数量");myform.num<%=i%>.focus();return;}
				myform.submit();
			}
-->
		</script>
          <%}%>
        </table>

        </form>

<table width="100%" border="0" align="center" cellpadding="0" cellspacing="0">
      <tr align="center" valign="middle">
		<td height="10">&nbsp;		</td>
        <td width="24%" height="10" colspan="-3" align="left">&nbsp;</td>
		</tr>
      <tr align="center" valign="middle">
        <td height="21" class="tableBorder_B1">&nbsp;</td>
        <td height="21" colspan="-3" align="left" class="zi">合计总金额：￥<%=sum%></td>
      </tr>
      <tr align="center" valign="middle">
        <td height="21" colspan="2" class="linkBlack"><a href="#" onClick="javascript:window.open('cart_checkOut.jsp','','width=1024,height=768,top=5,left=5')">去收银台结账</a> | <a href="cart_clear.jsp">清空购物车</a> </td>
        </tr>
</table>

<%}%></td>
      </tr>
</table>
</div>
</body>
</html>
