<%@ page contentType="text/html; charset=gb2312"%>
<%@page import="java.sql.*"%>
<%@page import="java.util.*"%>
<%@page import="com.domain.GoodsForm"%>
<jsp:useBean id="big" scope="page" class="com.dao.BigTypeDao"/>
<jsp:useBean id="small" scope="page" class="com.dao.SmallTypeDao"/>
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
 function deleteType(date) {
  if(confirm("确定要删除吗？")){
    window.location="goodsAction.do?action=6&id="+date;
	}
  }
 </script>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=gb2312">
<title>电子商城的后台</title>
<script language="JavaScript" type="text/JavaScript">
<!--
function MM_reloadPage(init) {  //reloads the window if Nav4 resized
  if (init==true) with (navigator) {if ((appName=="Netscape")&&(parseInt(appVersion)==4)) {
    document.MM_pgW=innerWidth; document.MM_pgH=innerHeight; onresize=MM_reloadPage; }}
  else if (innerWidth!=document.MM_pgW || innerHeight!=document.MM_pgH) location.reload();
}
MM_reloadPage(true);
//-->
</script>
<style type="text/css">
<!--
.style1 {
	color: #990000;
	font-weight: bold;
}
-->
</style>

<link href="../../css/css.css" rel="stylesheet" type="text/css">
</head>

<body >
<div id="Layer1" style="position:absolute; left:330px; top:129px; width:517px; height:23px; z-index:1" class="linkBlack">
  <div align="right"><a href="goodsAction.do?action=0" >商品查询</a>&nbsp;&nbsp;&nbsp;&nbsp;<a href="bigTypeAction.do?action=0">大类别查询</a>&nbsp;&nbsp;&nbsp;&nbsp;<a href="smallTypeAction.do?action=0">小类别查询</a>&nbsp;&nbsp;&nbsp;&nbsp;<a href="javascript:history.go(-1)">返回</a>&nbsp;&nbsp;</div>
</div>
<table width="755"  border="0" align="center" cellpadding="0" cellspacing="0">
  <tr valign="bottom">
    <td colspan="2" background="image/banner1.jpg"  height="108">     <div align="center">
   <jsp:include page="../upTwo.jsp"/>
      </div></td>
  </tr>
  <tr>
    <td width="24%" height="390"valign="top"><jsp:include page="../../leftManager.jsp"/>  </td>
    <td width="76%" bgcolor="#FFFFFF"><div align="center">
      <table width="90%" height="16"  border="0" cellpadding="0" cellspacing="0">
      <tr >
        <td bgcolor="#E6E6E6" ><div align="center" class="dhz"><font color="#990000"><b>商品信息查询</b></font></div></td>
      </tr>
    </table>
	  <table width="90%"  border="1" cellspacing="0" cellpadding="0">
        <tr class="zi">
          <td width="14%"><div align="center">数据编号</div></td>
          <td width="19%"><div align="center">商品名称</div></td>
          <td width="14%"><div align="center">大类别</div></td>
          <td width="14%"><div align="center">小类别</div></td>
          <td width="14%"><div align="center">是否特价</div></td>
          <td width="25%"><div align="center">操作</div></td>
        </tr>
		     <%for(int i=start;i<over;i++){
            GoodsForm form=(GoodsForm)list.get(i);

      %>
        <tr class="zi">
          <td><div align="center"><%=form.getId()%></div></td>
          <td class="linkBlack" height="25"><div align="center"><a href="<%=form.getPicture()%>" target="_blank"><%=form.getName()%></a></div></td>

          <td class="linkBlack"><div align="center"><a href="goodsAction.do?action=9&big=<%=form.getBig()%>"><%=big.selectName(form.getBig())%></a></div></td>

          <td class="linkBlack"><div align="center"><a href="goodsAction.do?action=8&small=<%=form.getSmall()%>"><%=small.selectName(form.getSmall())%></a></div></td>
          <td class="linkBlack"><div align="center"><a href="goodsAction.do?action=7&mark=<%=form.getMark()%>"><%if(form.getMark().toString().equals("0")){%>否<%}else{%>是<%}%></a></div></td>
          <td class="linkBlack"><div align="center"><a href="goodsAction.do?action=5&id=<%=form.getId()%>">详细信息</a>&nbsp;&nbsp;

		  <a href="javascript:deleteType(<%=form.getId()%>)">删除</a>
<a href="goodsAction.do?action=18&id=<%=form.getId() %>">修改</a></div></td>
          <%}%>  </tr>
      </table>

	 <br>
	  <table width="90%"  border="0" cellpadding="0" cellspacing="0">
        <tr align="center" class="zi">
          <td width="13%">共为<%=maxPage%>页</td>
          <td width="16%">共有<%=pageNumber%>条记录</td>
          <td width="14%">当前为第<%=number+1%>页</td>
          <td width="19%" class="linkBlack"><%if((number+1)==1){%>  
	  上一页  
        <%}else{%>
		
		<a href="goodsAction.do?action=0&i=<%=number-1%>">
		  上一页</a></td>
          <%}%>
          <td width="18%" class="linkBlack"><%if(maxPage<=(number+1)){%>
            下一页
              <%}else{%>
	 
		<a href="goodsAction.do?action=0&i=<%=number+1%>">下一页</a>
<%}%>


          <td width="20%" class="linkBlack">
            <div align="right"><a href="goodsAction.do?action=1">添加商品</a>&nbsp;</div></td>
        </tr>
      </table>
    </div></td>
  </tr>
  <tr bgcolor="#FFFFFF">
    <td height="50" colspan="2"><p align="center"><jsp:include page="../downNews.jsp"/>

   </td>
  </tr>
</table>
</body>
</html>
