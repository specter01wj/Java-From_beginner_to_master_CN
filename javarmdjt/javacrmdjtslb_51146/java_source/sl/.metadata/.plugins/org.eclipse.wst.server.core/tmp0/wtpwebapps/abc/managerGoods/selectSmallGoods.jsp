<%@ page contentType="text/html; charset=gb2312" %>
<%@page import="java.sql.*"%>
<%@page import="java.util.*"%>
<%@page import="com.domain.GoodsForm" %>
<%@page import="com.domain.SmallTypeForm" %>
<%List bigList=(List)request.getAttribute("list");%>
<%List smallList=(List)request.getAttribute("smallList");%>
<%
int number=Integer.parseInt((String)request.getAttribute("number"));
int maxPage=Integer.parseInt((String)request.getAttribute("maxPage"));
int pageNumber=Integer.parseInt((String)request.getAttribute("pageNumber"));
int start=number*4;//开始条数
int over=(number+1)*4;//结束条数
int count=pageNumber-over;//还剩多少条记录

if(count<=0){
  over=pageNumber;
  }
%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=gb2312">
<title>电子商城</title>

<link href="../css/css.css" rel="stylesheet" type="text/css">
</head>
 <link href="css/css.css" rel="stylesheet" type="text/css">
<body>

<table width="755" height="150%"  border="0" align="center" cellpadding="0" cellspacing="0">
  <tr>
    <td height="98"><div align="center">
    <jsp:include page="../topOne.jsp"/></div>    </td>
  </tr>
  <tr>
    <td height="847" bgcolor="#FFFFFF" class="linkBlack"><table width="100%" height="100%"  border="0" cellpadding="0" cellspacing="0">
      <tr>
        <td width="25%" height="638" rowspan="3" valign="top" background="image/zuocedaohangbeijing.jpg">

		<jsp:include page="../left.jsp"/>


		</td>
        <td width="75%" height="35" align="center" valign="middle" background="../image/fl.jpg"><jsp:include page="../topThree.jsp"/></td>

      </tr>
      <tr>
        <td height="25" align="center" valign="middle" class="zi">
<%if(smallList.size()==0){%>没有商品的子类别<%}else{%>
    <table width="99%" height="21"  border="1" cellpadding="0" bgcolor="#DAD9D9" cellspacing="0" bordercolor="#FFFFFF" bordercolorlight="#FFFFFF" bordercolordark="#819BBC">
          <tr align="center" >
        <%for(int small=0;small<smallList.size();small++){
            SmallTypeForm smallForm=(SmallTypeForm)smallList.get(small);
            %>
            <td width="537"><a href="goodsAction.do?action=13&big=<%=request.getParameter("big")%>&small=<%=smallForm.getId()%>&id=<%=smallForm.getBigId()%>"><%=smallForm.getSmallName()%></a></td>
         <%}%>
          </tr>
        </table>
<%}%>

		</td>
      </tr>
      <tr>
        <td height="588" align="center" valign="top" class="zi">
<%if(bigList.size()==0){%><br><br><br><br>
暂时没有商品的信息<br>
<br>
<br><%}else{%>
           <%
          

              for(int i=start;i<over;i++)
              {
                GoodsForm bigForm=(GoodsForm)bigList.get(i);
                %>
<br>
		<table width="67%"  border="1" align="center" cellpadding="0" cellspacing="0" bordercolor="#FFFFFF" bordercolorlight="#FFFFFF" bordercolordark="#819BBC">
          <tr>
            <td width="36%" rowspan="4" height="120"><input name="pricture<%=i%>" type="image" src="<%=bigForm.getPicture()%>" width="140" height="94"></td>
            <td width="64%" height="30" class="zi"><div align="center"><%=bigForm.getName()%></div></td>
          </tr>
          <tr>
            <td height="30" class="zi"><div align="center">
            <%if(bigForm.getMark().toString().equals("0")){%>
              单价：<%=bigForm.getNowPrice()%>元
            <%}else{%>
             <font color="#FF0000"> 特价：<%=bigForm.getFreePrice()%>元</font>
            <%}%>
            </div></td>
          </tr>
          <tr>
            <td height="30" class="zi"><div align="center"><%=bigForm.getIntroduce()%></div></td>
          </tr>
          <tr>
            <td height="30" class="zi">  <div align="center"> <%if(session.getAttribute("form")!=null||session.getAttribute("id")!=null){%>
              <a href="#" onClick="window.open('goodsAction.do?action=16&id=<%=bigForm.getId()%>','','width=500,height=200');">查看详细内容</a>
				
				    <%}else{%>
				   登录后才能购买
			     
				   <%}%>
			    </div></td>
          </tr>
        </table>
		<%}}%><br>
        <table width="90%"  border="0" align="center" cellpadding="0" cellspacing="0">
          <tr align="center" class="zi">
            <td width="13%">共为<%=maxPage%>页</td>
            <td width="16%">共有<%=pageNumber%>条记录</td>
            <td width="14%">当前为第<%=number+1%>页</td>
            <td width="19%"><%if((number+1)==1){%>
      上一页
        <%}else{%>
        <a href="goodsAction.do?action=13&big=<%=request.getParameter("big")%>&small=<%=request.getParameter("small")%>&i=<%=number-1%>">上一页</a></td>
            <%}%>
            <td width="18%"><%if(maxPage<=(number+1)){%>
      下一页
        <%}else{%>
        <a href="goodsAction.do?action=13&big=<%=request.getParameter("big")%>&small=<%=request.getParameter("small")%>&i=<%=number+1%>">下一页</a></td>
            <%}%>
          </tr>
        </table>
</td>
      </tr>
    </table></td>
  </tr>
<tr bgcolor="#FFFFFF">
    <td height="100" ><p align="center"><jsp:include page="../downNews.jsp"/>

   </td>
  </tr>
</table>
</body>
</html>
