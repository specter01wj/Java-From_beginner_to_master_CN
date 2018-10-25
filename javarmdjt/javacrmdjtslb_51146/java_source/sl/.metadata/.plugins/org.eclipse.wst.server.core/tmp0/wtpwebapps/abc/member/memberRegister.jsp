<%@ page contentType="text/html; charset=gb2312" %>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=gb2312">
<title>会员注册</title>
<style type="text/css">
<!--
.style1 {color: #FF0000}
.style2 {color: #000000}
-->
</style>
 <link href="../css/css1.css" rel="stylesheet" type="text/css">
<script type="text/javascript">
<!--
function SelectSubmit(){
	document.all.registerForm.submit();
	return true;
}
function submit1(){
	if(document.all.username.value.length==0){
	alert("请填写用户名!");
		return false;
	}
	if(document.all.realname.value.length==0){
		alert("请填写真实姓名!");
		return false;
	}
	if(document.all.password1.value.length==0){
		alert("请填写密码!");
		return false;
	}
	if(document.all.password2.value.length==0){
		alert("请填写密码!");
		return false;
	}

	if(document.all.email.value.length==0){
		alert("请填写电子邮件!");
		return false;
	}
	if(document.all.question.value.length==0){
		alert("请选择问题!");
		return false;
	}
	if(document.all.result.value.length==0){
		alert("请填写问题答案!");
		return false;
	}
	if(document.all.password1.value!=document.all.password2.value){
		alert("两次密码输入不相符！");
		return false;
	}
	if(!checkemail(registerForm.email.value)){
		alert("您输入Email地址不正确!");registerForm.email.focus();return false;
	}

	 //在JavaScript中，正则表达式只能使用"/"开头和结束，不能使用双引号
	var Expression=/[^\u4E00-\u9FA5]/; 
	var objExp=new RegExp(Expression);
	if(objExp.test(registerForm.username.value)!=true){
		alert("用户名只可以是英文名称!");
		return false;
	}
	
	document.all.registerForm.submit();
	return true;
	
}

function checkemail(email){
	var str=email;
	var Expression=/\w+([-+.']\w+)*@\w+([-.]\w+)*\.\w+([-.]\w+)*/; 
	var objExp=new RegExp(Expression);
	if(objExp.test(str)==true){
		return true;
	}else{
		return false;
	}
}	
function reset(){
	document.all.registerForm.reset();
}
function checkusername(){//用于添加“检查按钮”的Javascript
	 //在JavaScript中，正则表达式只能使用"/"开头和结束，不能使用双引号
	var Expression=/[^\u4E00-\u9FA5]/; 
	var objExp=new RegExp(Expression);
	if(objExp.test(registerForm.username.value)!=true){
		alert("用户名只可以是英文名称!");
		return false;
	}
	else{
		window.location.href='checkuser.do?username='+registerForm.username.value
		return true;
	}
}


//-->
</script>
<script language="javascript">
function trigger(opt){
//opt表示现有可选项的数目
	registerForm.question.options[opt]=new Option(registerForm.question.options[opt]?
	registerForm.question.options[opt].innerText+String.fromCharCode(event.keyCode):
	String.fromCharCode(event.keyCode))
	registerForm.question.selectedIndex=opt;  //设置下拉列表的选中项
}
</script>
<script language="javascript">
function edit(opt){
//opt表示现有可选项的数目
	if(registerForm.question.options[opt]){
		if(event.keyCode==8){
			var str=registerForm.question.options[opt].innerText;
			var len=str.length;		registerForm.question.options[opt].innerText=str.substring(0,len-1);
			if(registerForm.question.options[opt].innerText==""){
				registerForm.question.remove(opt);
				registerForm.question.selectedIndex=1;
			};
		}
		if(event.keyCode==32){
			registerForm.question.options[opt].innerText+=" ";
		}
	}
}
</script>

</head>


<body>
<div align="center">
  <p class="blue"><strong>会员注册
  </strong></p>
  <form name="registerForm" method="post" action="../memberAction.do?action=0">
    <table width="298"  border="1" cellspacing="0" cellpadding="0" bordercolor="#FFFFFF" bordercolordark="#819BBC" bordercolorlight="#FFFFFF">
      <tr>
        <td width="105" height="35" bgcolor="#EFF6FE">
        <div align="center">会员名称</div></td>
        <td width="187"><div align="center">
          <input type="text" name="username">
          <span class="style1">*</span></div></td>
      </tr>
      <tr>
        <td height="35" bgcolor="#EFF6FE">
        <div align="center">会员密码</div></td>
        <td><div align="center">
          <input type="password" name="password1">
          <span class="style1">*</span></div></td>
      </tr>
      <tr>
        <td height="35" bgcolor="#EFF6FE">
        <div align="center">密码确认</div></td>
        <td><div align="center">
          <input type="password" name="password2">
          <span class="style1">*</span></div></td>
      </tr>
      <tr>
        <td height="35" bgcolor="#EFF6FE">
        <div align="center">真实姓名</div></td>
        <td><div align="center">
          <input type="text" name="realname">
          <span class="style1">*</span></div></td>
      </tr>
      <tr>
        <td height="35" bgcolor="#EFF6FE">
        <div align="center">年龄</div></td>
        <td><div align="center">
          <input type="text" name="age" value="18">
          <span class="style2">*</span></div></td>
      </tr>
      <tr>
        <td height="35" bgcolor="#EFF6FE">
        <div align="center">职业</div></td>
        <td><div align="center">
          <input type="text" name="profession" value="学生">
          <span class="style2">*</span></div></td>
      </tr>
      <tr>
        <td height="35" bgcolor="#EFF6FE">
        <div align="center">Email地址</div></td>
        <td><div align="center">
          <input name="email" type="text" >
          <span class="style1">*</span></div></td>
      </tr>
      <tr>
        <td height="35" bgcolor="#EFF6FE">
        <div align="center">找回密码问题</div></td>
        <td><div align="center">
          <select id="question" onkeypress="trigger(3)" onkeyup="edit(3)" name="question">
		  <option value="1+1=？">1+1=</option>
		  <option value="我的爱好是什么？">我的爱好是什么？</option>
		  <option value="我姓什么？">我的爱好是什么？</option>
          </select>
          <span class="style1">*</span></div></td>
      </tr>
      <tr>
        <td height="35" bgcolor="#EFF6FE">
        <div align="center">答案</div></td>
        <td><div align="center">
          <input type="text" name="result">
          <span class="style1">*</span></div></td>
      </tr>
    </table>
    <p><span class="style1">*</span>：<span class="blue">代表必添项目</span>
    *：<span class="blue">代表非必添项目</span></p>
    <p>
        <input type="button" name="Submit2" value="提交"  onClick="return submit1();">
&nbsp;&nbsp;
        <input type="reset" name="Submit3" value="重置">
    </p>
        </p>
  </form>
  <p>&nbsp;  </p>
</div>
</body>
</html>
