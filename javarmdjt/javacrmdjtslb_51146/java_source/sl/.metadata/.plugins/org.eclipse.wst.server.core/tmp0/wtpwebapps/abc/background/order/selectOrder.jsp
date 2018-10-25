<%@ page contentType="text/html; charset=gb2312"%>
<%@page import="java.sql.*"%>
<%@page import="java.util.*"%>
<%@page import="com.domain.OrderForm"%>
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
 function deleteOrder(date) {
  if(confirm("确定要删除吗？")){
    window.location="orderAction.do?action=2&number="+date;
	}
  }
 </script>
    <script   language="javascript">   
  window.onbeforeunload   =   function   ()   
  {   
            if   (event.clientY   <   0   &&   event.clientX>document.body.scrollWidth)   {   
           window.location.href="../../loginOut.jsp";
        }   
  }   
  </script> 
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=gb2312">
<title>电子商城的后台</title>
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
<body onunload="quit.jsp">
<table width="755"  border="0" align="center" cellpadding="0" cellspacing="0"  bordercolor="#FFFFFF" bordercolordark="#000000" bordercolorlight="#FFFFFF">
  <tr valign="bottom">
    <td colspan="2" background="image/banner1.jpg" height="108">    <div align="center">
   <jsp:include page="../upTwo.jsp"/>
      </div></td>
  </tr>
  <tr>
    <td width="24%" height="390" valign="top"><jsp:include page="../../leftManager.jsp"/>  </td>
    <td width="76%"  height="390" bgcolor="#FFFFFF">
    <div align="center">
	<table width="96%" height="16"  border="0" cellpadding="0" cellspacing="0">
      <tr>
        <td bgcolor="#E6E6E6"><div align="center" class="dhz"><font color="#990000"><b>商品订单信息查询</b></font></div></td>
      </tr>
    </table>
	    <table width="96%"  border="1" cellspacing="0" cellpadding="0">

	    <tr class="zi">
          <td width="15%" height="25"><div align="center">编号</div></td>
          <td width="14%"><div align="center">真实姓名</div></td>

         <td width="16%"><div align="center">是否出货</div></td>
        <td width="26%"><div align="center">订货时间</div></td>
   <td width="29%"><div align="center">操作</div></td>
        </tr>
        <%for(int i=start;i<over;i++){
      OrderForm form=(OrderForm)list.get(i);
          %>
        <tr align="center" class="zi">
          <td height="25"><%=form.getNumber()%></td>
          <td><%=form.getReallyName()%></td>

		  <td class="linkBlack"><%if(form.getSign().equals("0")){%>
                    <a href="orderAction.do?action=0&sign=<%=form.getSign()%>">否</a>
                    <%}else{%>
                    <a href="orderAction.do?action=0&sign=<%=form.getSign()%>">是</a>
                    <%}%></td>
		  <td><%=form.getCreaTime()%></td>
        <td class="linkBlack"><a href="orderAction.do?action=3&number=<%=form.getNumber()%>">详细信息</a>
                             &nbsp;&nbsp;
	     <%if(form.getSign().equals("1")){%>
		 已出
		 <%}else if(request.getParameter("sign")==null){%>
		  <a href="orderAction.do?action=1&number=<%=form.getNumber()%>">出货</a>
		 <%}else{%>
		  <a href="orderAction.do?action=1&sign=<%=request.getParameter("sign")%>&number=<%=form.getNumber()%>">出货</a>
		 <%}%>
		 &nbsp;&nbsp;

		 <a href="javascript:deleteOrder('<%=form.getNumber()%>')">删除</a>

		  </td>
        </tr>
        <%}%>
      </table>
        <p>&nbsp;        </p>
        <p>
          <%if(request.getParameter("sign")==null){%>
                </p>
        <table width="96%"  border="0" align="center" cellpadding="0" cellspacing="0">
    <tr align="center" class="zi">
    <td width="17%">共为<%=maxPage%>页</td>
    <td width="22%">共有<%=pageNumber%>条记录</td>
    <td width="26%">当前为第<%=number+1%>页</td>
    <td width="19%" class="linkBlack"><%if((number+1)==1){%> 上一页<%}else{%><a href="orderAction.do?action=0&i=<%=number-1%>">上一页</a></td><%}%>
    <td width="16%" class="linkBlack"><%if(maxPage<=(number+1)){%>下一页<%}else{%><a href="orderAction.do?action=0&i=<%=number+1%>">下一页</a></td><%}%>
   </tr>
 </table>
<%}else{%>
 <table width="96%"  border="0" align="center" cellpadding="0" cellspacing="0">
    <tr align="center" class="zi">
    <td width="14%">共为<%=maxPage%>页</td>
    <td width="18%">共有<%=pageNumber%>条记录</td>
    <td width="22%">当前为第<%=number+1%>页</td>
    <td width="16%"><%if((number+1)==1){%> 上一页<%}else{%><a href="orderAction.do?action=0&i=<%=number-1%>&sign=<%=request.getParameter("sign")%>">上一页</a></td><%}%>
    <td width="12%"><%if(maxPage<=(number+1)){%>下一页<%}else{%><a href="orderAction.do?action=0&i=<%=number+1%>&sign=<%=request.getParameter("sign")%>">下一页</a></td><%}%>
    <td width="18%" class="linkBlack"><a href="orderAction.do?action=0">返回</a></td>
   </tr>
 </table>
<%}%>
    </div></td>
  </tr>
  <tr bgcolor="#FFFFFF">
    <td height="50" colspan="2"><p align="center"><jsp:include page="../downNews.jsp"/>

   </td>
  </tr>
</table>
</body>
</html>
