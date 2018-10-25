<%@ page contentType="text/html; charset=gb2312"%>
<%@page import="java.sql.*"%>
<%@page import="java.util.*"%>
<%@page import="com.domain.MemberForm"%>
<%
List list=(List)request.getAttribute("list");
int number=Integer.parseInt((String)request.getAttribute("number"));
int maxPage=Integer.parseInt((String)request.getAttribute("maxPage"));
int pageNumber=Integer.parseInt((String)request.getAttribute("pageNumber"));
int start=number*6;//开始条数
int over=(number+1)*6;//结束条数
int count=pageNumber-over;//还剩多少条记录
if(count<=0){
  over=pageNumber;
  }
%>
 <script Language="JavaScript">
 function deleteMember(date) {
  if(confirm("确定要删除吗？")){
    window.location="memberAction.do?action=4&id="+date;
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
<table width="755"align="center" cellpadding="0" cellspacing="0">
  <tr valign="bottom">
    <td height="108" colspan="2"  background="image/banner1.jpg">      <div align="center">
   <jsp:include page="../upTwo.jsp"/>
      </div></td>
  </tr>
  <tr>
    <td width="24%" height="390"><jsp:include page="../../leftManager.jsp"/>  </td>
    <td width="76%" bgcolor="#FFFFFF">    <div align="center">
<table width="90%" height="16"  border="0" cellpadding="0" cellspacing="0">
      <tr>
        <td bgcolor="#E6E6E6"><div align="center" class="dhz"><font color="#990000"><b>会员信息查询</b></font></div></td>
      </tr>
    </table>
	    <table width="90%"  border="1" cellspacing="0" cellpadding="0">

	    <tr class="zi">
          <td width="14%" height="25"><div align="center">编号</div></td>
          <td width="14%"><div align="center">会员账号</div></td>
          <td width="14%"><div align="center">会员姓名</div></td>
           <td width="14%"><div align="center">会员年龄</div></td>

    <td width="38%"><div align="center">操作</div></td>
        </tr>
        <%for(int i=start;i<over;i++){
      MemberForm form=(MemberForm)list.get(i);
          %>
        <tr class="zi">
          <td height="30"><div align="center"><%=form.getId()%></div></td>
          <td><div align="center"><%=form.getName()%></div></td>
          <td><div align="center"><%=form.getReallyName()%></div></td>
                  <td><div align="center"><%=form.getAge()%>岁</div></td>
        <td class="linkBlack"><div align="center">

		 <a href="memberAction.do?action=3&id=<%=form.getId()%>">详细信息</a>&nbsp;&nbsp;&nbsp;&nbsp;

		 <a href="javascript:deleteMember('<%=form.getId()%>')">删除</a>

		  </div></td>
        </tr>
        <%}%>
      </table><br>
	   <table width="90%"  border="0" align="center" cellpadding="0" cellspacing="0">
   <tr align="center" class="zi">
    <td width="17%">共为<%=maxPage%>页</td>
			<td width="22%">共有<%=pageNumber%>条记录</td>
            <td width="26%">当前为第<%=number+1%>页</td>
    <td width="19%" class="linkBlack"><%if((number+1)==1){%> 上一页<%}else{%><a href="memberAction.do?action=2&i=<%=number-1%>">上一页</a></td><%}%>
            <td width="16%" class="linkBlack"><%if(maxPage<=(number+1)){%>下一页<%}else{%><a href="memberAction.do?action=2&i=<%=number+1%>">下一页</a></td><%}%>
   </tr>
 </table>

    </div></td>
  </tr>
  <tr bgcolor="#FFFFFF">
    <td height="60" colspan="2"><p align="center"><jsp:include page="../downNews.jsp"/>

</p>    </td>
  </tr>
</table>
</body>
</html>
