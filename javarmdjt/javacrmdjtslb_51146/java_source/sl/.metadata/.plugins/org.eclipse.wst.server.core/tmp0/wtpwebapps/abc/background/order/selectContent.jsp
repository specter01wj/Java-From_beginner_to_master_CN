<%@ page contentType="text/html; charset=gb2312"%>
<%@page import="java.sql.*"%>
<%@page import="java.util.*"%>
<%@page import="com.domain.OrderForm"%>
<%@page import="com.domain.OrderDetailForm"%>
<%@page import="com.domain.GoodsForm"%>
<jsp:useBean id="order" scope="page" class="com.dao.OrderDao"/>
<jsp:useBean id="goods" scope="page" class="com.dao.GoodsDao"/>
<jsp:useBean id="orderDetail" scope="page" class="com.dao.OrderDetailDao"/>
<%OrderForm orderForm=(OrderForm)request.getAttribute("orderForm");%>
<%List list=(List)request.getAttribute("orderDetailList");%>
<html>
<head>
<style type="text/css">
<!--
.style1 {
	color: #990000;
	font-weight: bold;
}
-->
</style>
<meta http-equiv="Content-Type" content="text/html; charset=gb2312">
<title>电子商城的后台</title>
<link href="../../css/css.css" rel="stylesheet" type="text/css">
</head>
 <link href="css/css.css" rel="stylesheet" type="text/css">
<body>
<table width="755"  border="0" align="center" cellpadding="0" cellspacing="0">
  <tr valign="bottom">
    <td height="108" colspan="2" background="image/banner1.jpg"> <div align="center"><jsp:include page="../upOne.jsp"/> </div>      <div align="center">
   <jsp:include page="../upTwo.jsp"/>
      </div></td>
  </tr>
  <tr>
    <td width="24%" height="318"><jsp:include page="../../leftManager.jsp"/>  </td>
    <td width="76%" bgcolor="#FFFFFF">
    <div align="center">
	<table width="99%" height="16"  border="0" cellpadding="0" cellspacing="0">
      <tr>
        <td bgcolor="#E6E6E6"><div align="center" class="dhz">订单号为：<%=orderForm.getNumber()%>的详细信息</div></td>
      </tr>
    </table><br>
	
	<table width="76%"  border="1" cellspacing="0" cellpadding="0">
      <tr align="center" class="zi" >
        <td width="26%" height="25">会员账号</td>
        <td width="22%"><%=orderForm.getName()%></td>
        <td width="26%">会员姓名</td>
        <td width="22%"><%=orderForm.getReallyName()%></td>
      </tr>
      <tr  align="center" class="zi">
        <td height="25">送货电话</td>
        <td><%=orderForm.getTel()%></td>
        <td>送货地址</td>
        <td><%=orderForm.getAddress()%></td>
      </tr>
      <tr  align="center" class="zi">
        <td height="25">付款方式</td>
        <td><%=orderForm.getSetMoney()%></td>
        <td>运送方式</td>
        <td><%=orderForm.getPost()%></td>
      </tr>
      <tr align="center" class="zi">
        <td height="25" >备注信息</td>
        <td><%=orderForm.getBz()%></td>
        <td>订货时间</td>
        <td><%=orderForm.getCreaTime()%></td>
      </tr>
    </table>
	<br>
	    <strong>商品详细信息</strong>	  <br><br>
	    <table width="74%"  border="1" cellspacing="0" cellpadding="0">
          <tr class="zi">
            <td><div align="center">商品名称</div></td>
            <td><div align="center">商品数量</div></td>
            <td><div align="center">商品价格</div></td>
          </tr>
          <%
          float sum=0;
          for(int i=0;i<list.size();i++){
            OrderDetailForm form=(OrderDetailForm)list.get(i);
            sum=sum+form.getPrice()*form.getNumber();
          %>
          <tr class="zi">
            <td><div align="center"><%=goods.selectOneGoods(form.getGoodsId()).getName()%></div></td>
            <td><div align="center"><%=form.getNumber()%></div></td>
            <td><div align="center"><%=form.getPrice()%>元</div></td>
          </tr><%}%>
        </table><br><br>
        <span class="zi">总金额:<%=sum%></span><br>
    <table width="76%" height="19"  border="0" cellpadding="0" cellspacing="0">
      <tr class="zi">
        <td width="72%">
              <div align="left">
                <%if(orderForm.getSign().equals("1")){%>
                已经出货
                <%}else{%>
                没有出货
                <%}%>
              </div></td><td width="28%" class="linkBlack"><div align="right"><a href="javascript:history.go(-1)">返回</a></div></td>
      </tr>
    </table>
    </div></td>
  </tr>
  <tr bgcolor="#FFFFFF">
    <td height="60" colspan="2"><p align="center"><jsp:include page="../downNews.jsp"/>

</p>    </td>
  </tr>
</table>
</body>
</html>
