<%@ page contentType="text/html; charset=gb2312" language="java" import="java.sql.*" errorPage="" %>
<%@page import="java.sql.*"%>
<%@page import="java.util.*"%>
<%@page import="com.domain.GoodsForm"%>
<%
GoodsForm form=(GoodsForm)request.getAttribute("form");

%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=gb2312">
<link rel="stylesheet" href="css/css1.css">
<title></title>
</head>

<body  >
<table width="500" height="200"  border="0" align="center" cellpadding="0" cellspacing="0">
  <tr>
    <td height="75"  background="image/tanchuye.jpg" ><table width="85%" height="113"  border="0" align="center" cellpadding="0" cellspacing="0" >
      <tr>
        <td height="113" valign="middle" bgcolor="#FFFFFF"><form name="form" method="post" action="cart_add.jsp">
          <div align="center"><strong>查看商品详细信息</strong></div>
              <br>
          
          <table width="95%" height="100"  border="1" align="center" cellpadding="0" cellspacing="0" bordercolor="#FFFFFF" bordercolorlight="#FFFFFF" bordercolordark="#819BBC" >
  <tr>
    <td width="36%" rowspan="4" height="100"><div align="center">
        <input name="pricture" type="image" src="<%=form.getPicture()%>" width="110" height="100">
    </div></td>
    <td width="64%" height="22"><div align="center">
      <table width="71%" height="20"  border="0" align="right" cellpadding="0" cellspacing="0">
        <tr>
          <td>货品名称：<%=form.getName()%> <input type="hidden" name="goodsId" value="<%=form.getId()%>" /></td>
        </tr>
      </table>
    </div></td>
  </tr>
  <tr>
    <td height="20"><div align="center">
        <table width="71%"  border="0" align="right" cellpadding="0" cellspacing="0">
      <tr>
        <td><%if(form.getMark().toString().equals("1")){%>
特&nbsp;&nbsp;&nbsp;&nbsp;价：<%=form.getFreePrice()%>元<input  type="hidden" name="price" value="<%=form.getFreePrice()%>"/>
<%}else{%>
现&nbsp;&nbsp;&nbsp;&nbsp;价：<%=form.getNowPrice()%>元<input type="hidden" name="price" value="<%=form.getNowPrice()%>"/>
<%}%></td>
      </tr>
    </table>
</div></td>
  </tr>
  <tr>
    <td height="20"><div align="center">
      <table width="71%"  border="0" align="right" cellpadding="0" cellspacing="0">
        <tr>
          <td>简&nbsp;&nbsp;&nbsp;&nbsp;介：<%=form.getIntroduce()%> </td>
        </tr>
      </table>
    </div></td>
  </tr>
  <tr align="center">
    <td height="23"><input type="button" name="close" value="关闭窗口" onClick="window.close()">&nbsp;&nbsp;<input type="submit" name="Submit" value="放入购物车"></td>

  </tr>
</table>
</form>		</td>
      </tr>
    </table></td>
  </tr>
</table>

</body>
</html>
