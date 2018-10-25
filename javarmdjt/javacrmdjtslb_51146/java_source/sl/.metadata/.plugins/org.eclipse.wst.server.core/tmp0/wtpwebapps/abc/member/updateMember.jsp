<%@ page contentType="text/html; charset=gb2312" %>
<%@page import="com.domain.MemberForm"%>
<%MemberForm form=(MemberForm)request.getAttribute("form");%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=gb2312">
<title>会员修改属性</title>
</head>
 <link href="css/css1.css" rel="stylesheet" type="text/css">
<script language="javascript">
function checkEmpty(form){
for(i=0;i<form.length;i++){
if(form.elements[i].value==""){
alert("表单信息不能为空");
return false;
}
}
if(document.form.oldPassword.value!=document.form.passwordOld.value){
window.alert("您输入的密码与原来的不一致，请重新输入");
return false;
}
if(document.form.password.value!=document.form.passwordOne.value){
window.alert("您两次输入的密码不一致，请重新输入");
return false;
}
if(isNaN(document.form.age.value)){
window.alert("年龄只能为数字");
return false;
}
}
</script>
<body>
<p>&nbsp;</p>
<div align="center">
  <p><strong>修改会员信息
  </strong></p>
  <form name="form" method="post" action="memberAction.do?action=6&id=<%=form.getId()%>" onSubmit="return checkEmpty(form)">
    <table width="298"  border="1" cellspacing="0" cellpadding="0" bordercolor="#FFFFFF" bordercolordark="#819BBC" bordercolorlight="#FFFFFF">
      <tr>
        <td width="105" height="35" bgcolor="#EFF6FE">
        <div align="center">会员名称</div></td>
        <td width="187"><div align="center">
          <input type="hidden" name="name" value="<%=form.getName()%>"><%=form.getName()%>
        </div></td>
      </tr>
       <tr>
        <td height="35" bgcolor="#EFF6FE">
        <div align="center">原来的密码</div></td>
        <td><div align="center">
           <input type="hidden" name="result" value="<%=form.getResult()%>">
            <input type="hidden" name="question" value="<%=form.getQuestion()%>">
          <input type="hidden" name="passwordOld" value="<%=form.getPassword()%>">
          <input type="password" name="oldPassword">
        </div></td>
      </tr>
      <tr>
        <td height="35" bgcolor="#EFF6FE">
        <div align="center">新密码</div></td>
        <td><div align="center">
          <input type="password" name="password">
        </div></td>
      </tr>
      <tr>
        <td height="35" bgcolor="#EFF6FE">
        <div align="center">密码确认</div></td>
        <td><div align="center">
          <input type="password" name="passwordOne">
        </div></td>
      </tr>
      <tr>
        <td height="35" bgcolor="#EFF6FE">
        <div align="center">真实姓名</div></td>
        <td><div align="center">
          <input type="text" name="reallyName" value="<%=form.getReallyName()%>">
        </div></td>
      </tr>
      <tr>
        <td height="35" bgcolor="#EFF6FE">
        <div align="center">年龄</div></td>
        <td><div align="center">
          <input type="text" name="age" value="<%=form.getAge()%>">
        </div></td>
      </tr>
      <tr>
        <td height="35" bgcolor="#EFF6FE">
        <div align="center">职业</div></td>
        <td><div align="center">
          <input type="text" name="profession" value="<%=form.getProfession()%>">
        </div></td>
      </tr>
      <tr>
        <td height="35" bgcolor="#EFF6FE">
        <div align="center">Email地址</div></td>
        <td><div align="center">
          <input name="email" type="text"  value="<%=form.getEmail()%>">
        </div></td>
      </tr>


    </table>
    <br><br><br>
    <input type="submit" name="Submit2" value="提交">&nbsp;&nbsp;
    <input type="reset" name="Submit3" value="重置">
    &nbsp;&nbsp;
    <input type="button" name="back" value="返回" onClick="javascript:history.go(-1)">
  </form>
  <p>&nbsp;  </p>
</div>
</body>
</html>
