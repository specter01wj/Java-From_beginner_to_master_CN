<%@ page contentType="text/html; charset=gb2312" %>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=gb2312">
<title>找回密码步骤一</title>
</head>
 <link href="../css/css1.css" rel="stylesheet" type="text/css">
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
<body>
<div align="center">
  <p class="bgcolor">&nbsp;</p>
  <p class="bgcolor"><strong>输入会员账号</strong></p>
  <form name="form" method="post" action="findTwo.jsp" onSubmit="return checkEmpty(this)">
    <table width="298"  border="1" cellspacing="0" cellpadding="0" bordercolor="#FFFFFF" bordercolordark="#819BBC" bordercolorlight="#FFFFFF">
      <tr>
        <td width="105" height="35" bgcolor="#EFF6FE">
        <div align="center">会员账号</div></td>
        <td width="187"><div align="center">
          <input type="text" name="name">
        </div></td>
      </tr>

    </table>
    <br>
    <input type="submit" name="Submit2" value="提交">
    &nbsp;&nbsp;
    <input type="reset" name="Submit3" value="重置">
    &nbsp;&nbsp;
    <input type="button" name="Submit4" value="关闭" onClick="javascript:window.close();">
  </form>
  <p>&nbsp;  </p>
</div>
</body>
</html>
