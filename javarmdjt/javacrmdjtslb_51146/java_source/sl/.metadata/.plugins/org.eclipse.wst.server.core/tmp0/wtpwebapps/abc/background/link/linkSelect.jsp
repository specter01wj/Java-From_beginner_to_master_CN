<%@ page contentType="text/html; charset=gb2312"%>
<%@page import="java.sql.*"%>
<%@page import="java.util.*"%>
<%@page import="com.domain.LinkForm"%>
<%
List list=(List)request.getAttribute("list");
int number=Integer.parseInt((String)request.getAttribute("number"));
int maxPage=Integer.parseInt((String)request.getAttribute("maxPage"));
int pageNumber=Integer.parseInt((String)request.getAttribute("pageNumber"));
int start=number*7;//开始条数
int over=(number+1)*7;//结束条数
int count=pageNumber-over;//还剩多少条记录

if(count<=0){
  over=pageNumber;
  }
%>
 <script Language="JavaScript">
 function deleteAffiche(date) {
  if(confirm("确定要删除吗？")){
    window.location="linkAction.do?action=4&id="+date;
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
    <td height="108" colspan="2"  background="image/banner1.jpg"><div align="center">
 <jsp:include page="../upTwo.jsp"/>
    </div></td>
  </tr>
  <tr>
    <td width="24%" height="390"><jsp:include page="../../leftManager.jsp"/>  </td>
    <td width="76%" bgcolor="#FFFFFF" class="linkBlack">
    <div align="center">
	
	
	<table width="90%" height="16"  border="0" cellpadding="0" cellspacing="0">
      <tr>
        <td bgcolor="#E6E6E6"><div align="center" class="dhz"><font color="#990000"><b>连接网站信息的查询</b></font></div></td>
      </tr>
    </table>
	  <table width="90%"  border="1" cellspacing="0" cellpadding="0">
        <tr class="zi">
          <td width="14%" height="25"><div align="center">数据编号</div></td>
          <td width="28%"><div align="center">网站名称</div></td>
          <td width="28%"><div align="center">网站连接地址</div></td>
          <td width="30%"><div align="center">操作</div></td>
        </tr>
		     <%for(int i=start;i<over;i++){
      LinkForm form=(LinkForm)list.get(i);
          %>
        <tr class="zi">
          <td height="30"><div align="center"><%=form.getId()%></div></td>
          <td><div align="center"><%=form.getLinkName()%></div></td>
          <td><div align="center"><%=form.getLinkAddress()%></div></td>
          <td><div align="center"><a href="javascript:deleteAffiche('<%=form.getId()%>')">删除</a></div></td>
      <%}%>  </tr>
      </table>
	  <br>
	  <table width="90%"  border="0" align="center" cellpadding="0" cellspacing="0">
        <tr align="center" class="zi">
          <td width="13%">共为<%=maxPage%>页</td>
          <td width="16%">共有<%=pageNumber%>条记录</td>
          <td width="14%">当前为第<%=number+1%>页</td>
          <td width="19%"><%if((number+1)==1){%>
      上一页
        <%}else{%>
        <a href="linkAction.do?action=0&i=<%=number-1%>">上一页</a></td>
          <%}%>
          <td width="18%"><%if(maxPage<=(number+1)){%>
            下一页
              <%}else{%>
              <a href="linkAction.do?action=0&i=<%=number+1%>">下一页</a></td>
          <%}%>

          <td width="20%">
            <div align="right"><a href="linkAction.do?action=1">添加网站信息</a>&nbsp;&nbsp;&nbsp;&nbsp;</div></td>
        </tr>
      </table>
	  <p><br>

    </p>
    </div></td>
  </tr>
  <tr bgcolor="#FFFFFF">
    <td height="60" colspan="2"><p align="center"><jsp:include page="../downNews.jsp"/>

</p>    </td>
  </tr>
</table>
</body>
</html>
