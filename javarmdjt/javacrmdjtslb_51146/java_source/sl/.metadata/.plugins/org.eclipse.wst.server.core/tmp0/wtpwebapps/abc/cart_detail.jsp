<%@ page contentType="text/html; charset=gb2312" %>
<%@ page import="java.util.*"%>
<%@ page import="com.domain.OrderDetailForm"%>
<%@ page import="com.domain.OrderForm"%>
<%@ page import="com.domain.MemberForm"%>
<jsp:useBean id="order" scope="page" class="com.dao.OrderDao"/>
<jsp:useBean id="orderDetail" scope="page" class="com.dao.OrderDetailDao"/>
<jsp:useBean id="goodsDao" scope="page" class="com.dao.GoodsDao"/>
<jsp:useBean id="member" scope="page" class="com.dao.MemberDao"/>
<%String id=(String)session.getAttribute("id");%>
<%MemberForm memberForm=member.selectOneMember(Integer.valueOf(id));%>
<%List orderList=order.selectOrderHead(memberForm.getName());%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=gb2312">
<title>电子购物商城</title>
<script language="javascript">
function previewPrint(){
	WB.ExecWB(7,1);
}
function setPrint(){
	WB.ExecWB(8,1);
	}

</script>
<style>
@media print{
div{display:none}
}
</style>
</head>
 <link href="css/css.css" rel="stylesheet" type="text/css">
<body>
<OBJECT   classid=CLSID:8856F961-340A-11D0-A96B-00C04FD705A2   height=0   id=WB   width=0>   
  </OBJECT> 
<table width="755" height="150%"  border="0" align="center" cellpadding="0" cellspacing="0">
  <tr>
    <td height="98"><div align="center">
    <jsp:include page="topOne.jsp"/></div>    </td>
  </tr>
  <tr>
    <td height="847" bgcolor="#FFFFFF" class="linkBlack"><table width="100%" height="100%"  border="0" cellpadding="0" cellspacing="0" >
      
	  <tr>
	  
        <td width="25%" height="638" rowspan="2" valign="top"  background="image/zuocedaohangbeijing.jpg">
		<div align="center">
		<jsp:include page="left.jsp"/>
		</div>
		</td>
        <td width="75%" height="33" align="center" valign="middle" background="image/chakandingdan.jpg">&nbsp;</td>

      </tr>
	
      <tr>
        <td valign="top"  height="613" align="center" class="zi">
		  <br>
		      <br>
              <%if(orderList.size()==0){%>
     没有订货信息
     <%}else{%>
          
		  <table width="99%"  border="1" align="center" cellpadding="0" cellspacing="0" bordercolor="#FFFFFF" bordercolorlight="#FFFFFF" bordercolordark="#819BBC">

       <tr align="center" class="zi">
            <td width="15%" height="21">编号</td>

            <td width="15%">电话</td>
            <td width="21%">地址</td>

            <td width="24%">订货时间</td>
            <td width="13%">是否出货</td> <td width="12%">操作</td>
          </tr>
      <%
      for(int orderNumber=0;orderNumber<orderList.size();orderNumber++){
        OrderForm orderForm=(OrderForm)orderList.get(orderNumber);
        %>
          <tr align="center" class="zi">
            <td height="24"><%=orderForm.getNumber()%></td>

            <td><%=orderForm.getTel()%></td>
            <td><%=orderForm.getAddress()%></td>

            <td><%=orderForm.getCreaTime()%></td>
            <td><%if(orderForm.getSign().equals("0")){%>
            否<%}else{%>是<%}%>
            </td>
             <td><a href="cart_detail.jsp?number=<%=orderForm.getNumber()%>">查看明细</a></td>
          </tr>

          <%}%>
        </table>
     

		   <br>
	      <%if(request.getParameter("number")!=null){%>

	      <br>
	      <span class="zi">订货明细查询</span>	      <br>
<br>

      <table width="89%"  border="1" align="center" cellpadding="0" cellspacing="0" bordercolor="#FFFFFF" bordercolorlight="#FFFFFF" bordercolordark="#819BBC">
		<thead style="display:table-header-group;font-weight:bold">
        <tr align="center" class="zi">
          <td width="25%" height="21">编号</td>
          <td width="24%">商品名称</td>
          <td width="28%">商品价格</td>
          <td width="23%">商品数量</td>
        </tr> 
		</thead>
		 <%
        float sum=0;
            List orderDetailList=orderDetail.selectOrderDetailNumber(request.getParameter("number"));
        for(int orderDetailNumber=0;orderDetailNumber<orderDetailList.size();orderDetailNumber++){
         OrderDetailForm orderDetailForm=(OrderDetailForm)orderDetailList.get(orderDetailNumber);

         sum=sum+orderDetailForm.getPrice()*orderDetailForm.getNumber();
         %>
        <tr  align="center" class="zi" >
          <td height="21"><%=orderDetailForm.getOrderNumber()%></td>
          <td><%=goodsDao.selectOneGoods(orderDetailForm.getGoodsId()).getName()%></td>
          <td><%=orderDetailForm.getPrice()%>元</td>
          <td><%=orderDetailForm.getNumber()%></td>
        </tr>
        <%}%>
      </table>

	   <table width="89%"  border="0" cellspacing="0" cellpadding="0">
         <tr>
           <td height="24"  align="right" class="zi">总金额：<%=sum%>元</td>
         </tr>
		
		 <tr><td> <div align="center"><input type="button" value="打印设置" id="button1" name="button1" onClick="setPrint();"/>
		 <input type="button" value="打印预览" id="button2" name="button2" onClick="previewPrint();"/>
		 <input type="button" value="打印订单明细表" id="button3" name="button3" onClick="window.print();"/>
		 </div>
		 </td></tr>
       </table> <%}%>
      <%}%>		</td>
      </tr>
    </table></td>
  </tr>
<tr bgcolor="#FFFFFF">
    <td height="100" ><div align="center"><jsp:include page="downNews.jsp"/></div>

   </td>
  </tr>
</table>
</body>
</html>
