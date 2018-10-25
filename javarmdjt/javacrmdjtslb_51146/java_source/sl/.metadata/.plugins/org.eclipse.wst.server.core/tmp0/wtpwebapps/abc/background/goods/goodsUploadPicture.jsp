<%@ page contentType="text/html; charset=gb2312"%>
<%@page import="java.sql.*"%>
<%@page import="java.util.*"%>
<%@page import="com.domain.BigTypeForm"%>
<%@page import="com.domain.SmallTypeForm"%>
<%@page import="com.domain.GoodsForm"%>
<jsp:useBean id="big" scope="page" class="com.dao.BigTypeDao"/>
<jsp:useBean id="small" scope="page" class="com.dao.SmallTypeDao"/>
<%
GoodsForm goodsForm=(GoodsForm)request.getAttribute("goods");

%>
<script language="javascript">
function checkEmpty(form){
for(i=0;i<form.length;i++){
if(form.elements[i].value==""){
alert("表单信息不能为空");
return false;
}
}
}

</script>
<style type="text/css">
<!--
.style1 {
	color: #990000;
	font-weight: bold;
}
-->
</style>
<html>
<link href="../../css/css.css" rel="stylesheet" type="text/css">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=gb2312">
<title>电子商城的后台</title>
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
    <td width="76%" height="318" bgcolor="#FFFFFF">
    <div align="center">	  <table width="99%" height="16"  border="0" cellpadding="0" cellspacing="0">
      <tr>
        <td bgcolor="#E6E6E6"><div align="center" class="dhz">添加商品图片</div></td>
      </tr>
    </table><br>
	  <form action="goodsDealPicture.jsp" method="post" enctype="multipart/form-data"  name="form" onSubmit="return checkEmpty(form)" >
        <table width="90%"  border="1" cellspacing="0" cellpadding="0">
          <tr class="zi">
            <td width="20%" height="26">&nbsp;&nbsp;所属大类别</td>
            <td width="31%">&nbsp;&nbsp;<%=big.selectName(goodsForm.getBig())%></td>
            <td width="20%">&nbsp;&nbsp;所属于小类别</td>
            <td width="31%">&nbsp;&nbsp;<%=small.selectName(goodsForm.getSmall())%></td>
          </tr>
          <tr class="zi">
            <td height="25">&nbsp;&nbsp;商品名称</td>
            <td>&nbsp;&nbsp;<%=goodsForm.getName()%></td>
            <td>&nbsp;&nbsp;生产厂商</td>
            <td>&nbsp;&nbsp;<%=goodsForm.getFrom()%></td>
          </tr>
          <tr class="zi">
            <td height="27">&nbsp;&nbsp;商品定价</td>
            <td>&nbsp;&nbsp;<%=goodsForm.getNowPrice()%>元</td>
            <td>&nbsp;&nbsp;初始化特价</td>
            <td>&nbsp;&nbsp;<%=goodsForm.getFreePrice()%>元</td>
          </tr>
          <tr class="zi">
            <td height="28">&nbsp;&nbsp;商品描述</td>
            <td colspan="3">&nbsp;&nbsp;<%=goodsForm.getIntroduce()%></td>
          </tr>
          <tr class="zi">
            <td height="28">&nbsp;&nbsp;上传商品图片</td>
            <td colspan="3">&nbsp;
              <input name="picture" type="file" size="40"></td>
          </tr>
        </table>
        <p>
          <input type="submit" name="Submit2" value="提交">&nbsp;
          <input type="reset" name="reset" value="清除">&nbsp;
          <input type="button" name="back" value="返回" onClick="javasrcipt:history.go(-1)">
        </p>
	  </form>
	  <p>&nbsp;</p>
	  <p>&nbsp;</p>
	  </div></td>
  </tr>
  <tr bgcolor="#FFFFFF">
    <td height="60" colspan="2"><p align="center"><jsp:include page="../downNews.jsp"/>

</p>    </td>
  </tr>
</table>
</body>
</html>
