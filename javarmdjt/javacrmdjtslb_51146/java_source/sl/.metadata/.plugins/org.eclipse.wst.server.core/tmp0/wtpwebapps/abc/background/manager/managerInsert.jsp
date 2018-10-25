<%@ page contentType="text/html; charset=gb2312"%>
<%@page import="java.sql.*"%>
<%@page import="java.util.*"%>
<%@page import="com.domain.ManagerForm"%>
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
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=gb2312">
<title>电子商城的后台</title>
<link href="../../css/css.css" rel="stylesheet" type="text/css">
</head>
 <link href="css/css.css" rel="stylesheet" type="text/css">
<body>
<table width="755"  border="0" align="center" cellpadding="0" cellspacing="0">
 
  <tr valign="bottom">
    <td height="108" colspan="2" background="image/banner1.jpg"><div align="center">
 <jsp:include page="../upTwo.jsp"/>
    </div></td>
  </tr>
  <tr>
    <td width="24%" height="318"><jsp:include page="../../leftManager.jsp"/>  </td>
    <td width="76%" height="36" bgcolor="#FFFFFF" class="linkBlack">
    <div align="center">	
	<table width="99%" height="16"  border="0" cellpadding="0" cellspacing="0">
      <tr>
        <td bgcolor="#E6E6E6"><div align="center"><font color="#990000"><b>添加管理员信息</b></font></div></td>
      </tr>
    </table>
<br><br>

	  <form name="form" method="post" action="managerAction.do?action=3" onSubmit="return checkEmpty(form)">
        <table width="58%"  border="1" cellspacing="0" cellpadding="0">
          <tr class="zi">
            <td width="23%" height="30"><div align="center">管理员账号</div></td>
            <td width="77%">&nbsp;<input name="account" type="text" size="35"></td>
          </tr>
          <tr class="zi">
            <td height="30"><div align="center">密&nbsp;码</div></td>
            <td>&nbsp;<input name="password" type="password" size="35"></td>
          </tr>
          <tr class="zi">
            <td height="30"><div align="center">姓&nbsp;名</div></td>
            <td>&nbsp;<input name="name" type="text" size="35"></td>
          </tr>
        </table>
        <p>
          <input type="submit" name="Submit2" value="提交">&nbsp;
          <input type="reset" name="reset" value="清除">&nbsp;
          <input type="button" name="back" value="返回" onClick="javasrcipt:history.go(-1)">
	      </p>
	  </form>
	  <p><br>
	  </p>
	  <p>&nbsp;</p>
	  <p>&nbsp;</p>
	  <p>&nbsp;</p>
	  <p>&nbsp;        </p>
    </div></td>
  </tr>
  <tr bgcolor="#FFFFFF">
    <td height="60" colspan="2"><p align="center"><jsp:include page="../downNews.jsp"/>

</p>    </td>
  </tr>
</table>
</body>
</html>
