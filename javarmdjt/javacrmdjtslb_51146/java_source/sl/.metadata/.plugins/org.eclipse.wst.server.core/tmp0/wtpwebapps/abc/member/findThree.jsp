<%@ page contentType="text/html; charset=gb2312" %>
<%@page import="com.domain.MemberForm"%>
<%@page import="com.tool.Chinese"%>
<jsp:useBean id="dao" scope="page" class="com.dao.MemberDao"/>
<%
String name=Chinese.chinese(request.getParameter("name")).trim();
String result=Chinese.chinese(request.getParameter("result")).trim();
MemberForm form=dao.selectFind(name,result);
%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=gb2312">
<title>找回密码步骤三</title>
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
if(document.form.password.value!=document.form.passwordOne.value){
window.alert("您两次输入的密码不一致，请重新输入");
return false;
}
}
</script>
<body>
<div align="center">
  <%if(form==null||form.equals("")){%>
 <p><strong>答案不正确,请重新输入！！！</strong></p>
 <meta http-equiv="refresh" content="3;URL=findTwo.jsp?name=<%=name%>">
  <%}else{%>
  <p class="blue"><strong>输入新密码</strong></p>
  <form name="form" method="post" action="findFour.jsp?id=<%=form.getId()%>" onSubmit="return checkEmpty(form)">
    <table width="298"  border="1" cellspacing="0" cellpadding="0" bordercolor="#FFFFFF" bordercolordark="#819BBC" bordercolorlight="#FFFFFF">
      <tr>
        <td width="105" height="35" bgcolor="#EFF6FE">
        <div align="center">请输入新的密码</div></td>
        <td width="187"><div align="center">
          <input type="password" name="password">
        </div></td>
      </tr>
       <tr>
        <td width="105" height="35" bgcolor="#EFF6FE">
        <div align="center">确认密码</div></td>
        <td width="187"><div align="center">
                 <input type="password" name="passwordOne">
        </div></td>
      </tr>
    </table>
    <br>
    <input type="submit" name="Submit2" value="提交">&nbsp;&nbsp;
    <input type="reset" name="Submit3" value="重置">
    &nbsp;&nbsp;
	<input type="button" name="Submit4" value="返回" onClick="javascript:history.go(-1)">
  </form>
<%}%>

</div>
</body>
</html>
