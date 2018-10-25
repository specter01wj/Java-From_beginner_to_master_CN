<%@ page contentType="text/html; charset=gb2312"%>
<%@page import="java.sql.*"%>
<%@page import="java.util.*"%>
<%@page import="com.domain.BigTypeForm"%>
<%@page import="com.domain.SmallTypeForm"%>
<jsp:useBean id="big" scope="page" class="com.dao.BigTypeDao"/>
<jsp:useBean id="small" scope="page" class="com.dao.SmallTypeDao"/>
<%
List bigList=big.selectBig();
String id=(String)request.getAttribute("bigId");
if(id==null){id="1";}

Integer bigId=Integer.valueOf(id);
List smallList=small.selectOneBigId(bigId);
%>
<script language="javascript">
function checkEmpty(form){
for(i=0;i<form.length;i++){
if(form.elements[i].value==""){
alert("表单信息不能为空");
return false;
}
}
if(isNaN(document.form.nowPirce.value)){
window.alert("价格只能为数字");
return false;
}
}
function ChangeItem(){
var big=form.big.value;
window.location.href="goodsAction.do?action=2&bigId="+big;
}
</script>

<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=gb2312">
<title>电子商城的后台</title>

<style type="text/css">
<!--
.style1 {	color: #990000;
	font-weight: bold;
}
-->
</style>
<link href="../../css/css.css" rel="stylesheet" type="text/css">
</head>

<body background="image/beijingtu.jpg">
<table width="755"  border="0" align="center" cellpadding="0" cellspacing="0">
  <tr valign="bottom">
    <td height="108" colspan="2" background="image/banner1.jpg"> <div align="center"><jsp:include page="../upOne.jsp"/> </div>      <div align="center">
   <jsp:include page="../upTwo.jsp"/>
      </div></td>
  </tr>
  <tr>
    <td width="24%" height="318"><jsp:include page="../../leftManager.jsp"/>  </td>
    <td width="76%" height="318" bgcolor="#FFFFFF"><div align="center">

       <table width="99%" height="16"  border="0" cellpadding="0" cellspacing="0">
      <tr>
        <td bgcolor="#E6E6E6"><div align="center" class="dhz">添加商品信息</div></td>
      </tr>
    </table>
      <br>
	  <form action="goodsAction.do?action=3" method="post" enctype="multipart/form-data"  name="form" onSubmit="return checkEmpty(form)" >
        <table width="90%"  border="1" cellspacing="0" cellpadding="0">
          <tr class="zi">
            <td width="20%" height="26">&nbsp;&nbsp;所属大类别</td>
            <td width="31%">&nbsp;&nbsp;<select name="big" onChange="ChangeItem()"><option value="">请选择</option>
          <%for(int i=0;i<bigList.size();i++){
            BigTypeForm bigForm=(BigTypeForm)bigList.get(i);
            %>

          <option value="<%=bigForm.getId()%>" <%if(bigId.equals(bigForm.getId())){out.println("selected");}%>>

		  <%=big.selectName(bigForm.getId())%>
		  </option>
            <%}%>
            </select></td>
            <td width="20%">&nbsp;&nbsp;所属于小类别</td>
            <td width="31%">&nbsp;<select name="small"><option value="">请选择</option>
             <%for(int i=0;i<smallList.size();i++){
               SmallTypeForm smallForm=(SmallTypeForm)smallList.get(i);
               %>
                  <option value="<%=smallForm.getId()%>"><%=smallForm.getSmallName()%></option>

               <%}%>
            </select></td>
          </tr>
          <tr class="zi">
            <td height="25">&nbsp;&nbsp;商品名称</td>
            <td>&nbsp;&nbsp;<input name="name" type="text" size="20"></td>
            <td>&nbsp;&nbsp;生产厂商</td>
            <td>&nbsp;<input name="from" type="text" size="20"></td>
          </tr>
          <tr class="zi">
            <td height="27">&nbsp;&nbsp;商品定价</td>
            <td>&nbsp;&nbsp;<input name="nowPirce" type="text" size="20"></td>
            <td>&nbsp;&nbsp;初始化特价</td>
            <td>&nbsp;<input name="freePirce" type="hidden" size="20" value="0">0元</td>
          </tr>
          <tr class="zi">
            <td height="28">&nbsp;&nbsp;商品描述</td>
            <td colspan="3">&nbsp;&nbsp;<input name="introduce" type="text" size="50"></td>
          </tr>
        </table>
        <p align="center">
          <input type="submit" name="Submit2" value="提交">&nbsp;
          <input type="reset" name="reset" value="清除">&nbsp;
          <input type="button" name="back" value="返回" onClick="javasrcipt:history.go(-1)">
        </p>
	  </form>
	  <p>&nbsp;</p>
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
