<%@ page contentType="text/html; charset=gb2312" %>
<%@page import="java.util.*"%>
<%@page import="com.domain.GoodsForm"%>
<jsp:useBean id="goods" scope="page" class="com.dao.GoodsDao"/>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=gb2312">
<title>电子购物商城</title>
<link href="css/css.css" rel="stylesheet" type="text/css">
<script language="JavaScript" type="text/JavaScript">
<!--
function MM_reloadPage(init) {  //reloads the window if Nav4 resized
  if (init==true) with (navigator) {if ((appName=="Netscape")&&(parseInt(appVersion)==4)) {
    document.MM_pgW=innerWidth; document.MM_pgH=innerHeight; onresize=MM_reloadPage; }}
  else if (innerWidth!=document.MM_pgW || innerHeight!=document.MM_pgH) location.reload();
}
MM_reloadPage(true);
//-->
</script>
</head>

<body>


<table width="755" height="150%"  border="0" align="center" cellpadding="0" cellspacing="0">
  <tr>
    <td height="98"><div align="center">
    <jsp:include page="topOne.jsp"/></div>    </td>
  </tr>
  <tr>
    <td height="847"><table width="100%" height="100%"  border="0" cellpadding="0" cellspacing="0">
      <tr>
        <td width="193" height="638" rowspan="2" valign="top" background="image/zuocedaohangbeijing.jpg">

		<jsp:include page="left.jsp"/>		</td>
		<%
        List list=goods.selectGoodsNumber();
		int number=list.size();
		if(number>10){
		number=10;
		}%>
        <td width="75%" height="46" align="center" valign="middle" bgcolor="#FFFFFF" class="zi"  background="image/link.jpg">销售商品排行 TOP<%=number%></td>

      </tr>
      <tr bgcolor="#FFFFFF">
        <td valign="top"  height="613">
		    <%  for(int i=0;i<number;i++){
          GoodsForm form=(GoodsForm)list.get(i);
        %>
		<div id="Layer1" style="position:absolute; left:459px; top:<%=245+i*148%>px; width:30px; height:30px; z-index:1; background-image: url(image/number/<%=i+1%>.gif); layer-background-image: url(image/number/<%=i+1%>.gif); border: 1px none #000000;"></div>
        <table width="99%" height="149"  border="2" align="center" cellpadding="0" cellspacing="0" bordercolor="#CCCCCC"   >
          <tr>
            <td height="145" bordercolor="#666666" >
              <table width="96%" height="120"  border="1" align="center" cellpadding="0" cellspacing="0" bordercolor="#EFEFEF" >
                <tr class="zi">
                  <td width="36%" rowspan="4" height="120"><div align="center">
                      <input name="pricture<%=i%>" type="image" src="<%=form.getPicture()%>" width="140" height="94">
                          </div></td>
                  <td width="16%" height="30"><div align="center">商品名称</div></td>
                  <td width="48%"><%=form.getName()%></td>
                </tr>
                <tr>
                  <td height="30" class="zi"><div align="center"><font color="#F14D83">单价</font></div></td>
                  <td height="30" class="zi"><font color="#F14D83"><%=form.getNowPrice()%>元</font></td>
                </tr>
                <tr>
                  <td height="30" class="zi"><div align="center">商品描述</div></td>
                  <td height="30" class="zi"><%=form.getIntroduce()%></td>
                </tr>
                <tr>
                  <td height="30" colspan="2" class="linkBlack"><div align="right">
                      <%if(session.getAttribute("form")!=null||session.getAttribute("id")!=null){%>
                      <a href="#" class="zi" onClick="window.open('goodsAction.do?action=16&id=<%=form.getId()%>','','width=500,height=200');">查看详细内容</a></div>
                      <%}else{%>
                      <div align="right" class="zi">登录后才能购买</div></td>
                  <%}%>
                </tr>
            </table></td>
          </tr>
        </table>
		<%}%>
		</td>
      </tr>
    </table></td>
  </tr>
  <tr  bgcolor="#FFFFFF">
    <td height="100"><p align="center"><jsp:include page="downNews.jsp"/></p></td>
  </tr>
</table>
</body>
</html>
