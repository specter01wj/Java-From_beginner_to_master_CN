<%@ page contentType="text/html; charset=gb2312" %>
<%@ page import="java.util.*"%>
<%@ page import="com.domain.MemberForm"%>
<%java.util.Date date=new java.util.Date();%>
<jsp:useBean id="dao" scope="page" class="com.dao.MemberDao"/>
<%
String id=(String)session.getAttribute("id");
MemberForm form=dao.selectOneMember(Integer.valueOf(id));
%>
<html>
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
<head>
<meta http-equiv="Content-Type" content="text/html; charset=gb2312">
<title>电子商城</title>

<style type="text/css">
<!--
.style1 {
	color: #FF0000;
	font-weight: bold;
}
-->
</style>
</head>
 <link href="css/css.css" rel="stylesheet" type="text/css">
<body>
<table width="755" height="150%"  border="0" align="center" cellpadding="0" cellspacing="0">
  <tr>
    <td height="98"><div align="center">
    <jsp:include page="topOne.jsp"/></div>    </td>
  </tr>
  <tr>
    <td height="847"><table width="100%" height="100%"  border="0" cellpadding="0" cellspacing="0" bgcolor="#FFFFFF">
      <tr>
        <td width="25%" height="638" rowspan="2" valign="top" background="image/zuocedaohangbeijing.jpg">

		<jsp:include page="left.jsp"/>


		</td>
        <td width="75%" height="33" align="center" valign="middle" background="image/jiezhao.jpg">&nbsp;</td>

      </tr>
      <tr>
        <td valign="top"  height="613">		  <div align="center"><br>
                    <form name="form" method="post" action="cart_checkOutOrder.jsp"  onSubmit="return checkEmpty(this)">
		  <table width="68%"  border="1" cellspacing="0" cellpadding="0"  bordercolor="#FFFFFF" bordercolordark="#819BBC" bordercolorlight="#FFFFFF">
            <tr>
              <td height="30" colspan="2"> <div align="center" class="dhz">注意：请您不要恶意或非法提交订单以免造成不必要的麻烦！ </div></td>
              </tr>
			   <tr class="zi">
              <td height="30"><div align="center">订单编号</div></td>
              <td>&nbsp;<input type="hidden" name="number" value="<%=date.getTime()%>"><%=date.getTime()%></td>
            </tr>
            <tr class="zi">
              <td width="24%" height="30"><div align="center">会员名称</div></td>
              <td width="76%">&nbsp;<%=form.getName()%><input type="hidden" name="name" value="<%=form.getName()%>"></td>
            </tr>
            <tr class="zi">
              <td height="30"><div align="center">真实姓名</div></td>
              <td>&nbsp;<%=form.getReallyName()%><input type="hidden" name="reallyName" value="<%=form.getReallyName()%>"></td>
            </tr>
            <tr class="zi">
              <td height="30"><div align="center">联系地址</div></td>
              <td>&nbsp;<input type="text" name="address"></td>
            </tr>
            <tr class="zi">
              <td height="30"><div align="center">联系电话</div></td>
              <td>&nbsp;<input type="text" name="tel"></td>
            </tr>
            <tr class="zi">
              <td height="30"><div align="center">付款方式</div></td>
              <td>
			    &nbsp;<select name="setMoney" class="textarea">
			        <option value="">请选择</option>
      <option value="银行付款">银行付款</option>
      <option value="邮政付款">邮政付款</option>
      <option value="现金支付">现金支付</option>
    </select>
			  </td>
            </tr>

            <tr class="zi">
              <td height="30"><div align="center">运送方式</div></td>
              <td>&nbsp;<select name="post" class="textarea">
			        <option value="">请选择</option>
      <option value="普通邮寄">普通邮寄</option>
      <option value="特快专递">特快专递</option>
      <option value="EMS专递方式">EMS专递方式</option>
    </select>
			  
			  </td>
            </tr>
            <tr class="zi">
              <td height="60"><div align="center">备注信息</div></td>
              <td>&nbsp;<textarea name="bz"></textarea></td>
            </tr>
          </table>
		  <br>

                <input type="submit" name="Submit2" value="提交">&nbsp;
               <input type="reset" name="reset" value="清除">&nbsp;
     
              </form>
        </div>
        </td>
      </tr>
    </table></td>
  </tr>
  <tr bgcolor="#FFFFFF">
   <td height="100"><p align="center"><jsp:include page="downNews.jsp"/></p></td>
  </tr>
</table>
</body>
</html>
