<%@ page contentType="text/html; charset=gb2312" %>
<%@page import="com.domain.MemberForm"%>
<%@page import="com.tool.Chinese"%>
<jsp:useBean id="dao" scope="page" class="com.dao.MemberDao"/>

<%MemberForm form=dao.selectMemberForm(Chinese.chinese(request.getParameter("name")));%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=gb2312">
<title>找回密码步骤二</title>
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
  <%if(form==null||form.equals("")){%>
 <p><strong>不存在此会员名称,请重新输入！！！</strong></p>
 <meta http-equiv="refresh" content="3;URL=findOne.jsp">
  <%}else{%>
  <p class="blue"><strong>输入答案</strong></p>
  <form name="form" method="post" action="findThree.jsp" onSubmit="return checkEmpty(form)">
    <table width="298"  border="1" cellspacing="0" cellpadding="0" bordercolor="#FFFFFF" bordercolordark="#819BBC" bordercolorlight="#FFFFFF">
      <tr>
        <td width="105" height="35" bgcolor="#EFF6FE">
        <div align="center">问题</div></td>
        <td width="187"><div align="center"><input type="hidden" name="name" value="<%=form.getName()%>">
          <input type="hidden" name="question" value="<%=form.getQuestion()%>"><%=form.getQuestion()%>
        </div></td>
      </tr>
       <tr>
        <td width="105" height="35" bgcolor="#EFF6FE">
        <div align="center">答案</div></td>
        <td width="187"><div align="center">
          <input type="text" name="result">
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
