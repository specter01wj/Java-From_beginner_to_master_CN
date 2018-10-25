<%@ page contentType="text/html; charset=gb2312" %>
<%@page import="java.sql.*"%>
<%@page import="java.util.*"%>
<%@page import="com.domain.GoodsForm" %>
<html>
<head>
<%List freeList =(List)request.getAttribute("list");%>
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
<meta http-equiv="Content-Type" content="text/html; charset=gb2312">
<title>特价商品</title>
<link href="../css/css.css" rel="stylesheet" type="text/css">
<script type="text/javascript">
function Jumpping(){
	window.location.href="goodsAction.do?action=15&mark=1&i="+(window.document.jumpform.jumppage.value-1);
	return;
	}

</script>
</head>
 <link href="css/css.css" rel="stylesheet" type="text/css">
<body>
<table width="755" height="150%"  border="0" align="center" cellpadding="0" cellspacing="0">
  <tr>
    <td height="98"><div align="center">
    <jsp:include page="../topOne.jsp"/></div>    </td>
  </tr>

  <tr>
    <td height="847"><table width="100%" height="100%"  border="0" cellpadding="0" cellspacing="0" bgcolor="#FFFFFF">
      <tr>
        <td width="25%" height="638" rowspan="2" valign="top" background="image/zuocedaohangbeijing.jpg">
		
		<jsp:include page="../left.jsp"/>


		</td>
        <td width="75%" height="44" align="center" valign="middle" background="image/tejiaoshangpin.jpg"><div align="left">&nbsp;</div></td>
      
      </tr>
      <tr bgcolor="#FFFFFF">
	 
        <td valign="top"  height="700">
		&nbsp;
		

  <div align="left">
		        <%
          
             
              for(int i=start;i<over;i++)
              {
                GoodsForm freeGoods=(GoodsForm)freeList.get(i);
                %>
		    </div>
			 
			 <table width="99%" height="163"  border="2" align="center" cellpadding="0" cellspacing="0" bordercolor="#CCCCCC"   >
               <tr>
                 <td height="159" bordercolor="#666666" >
                   <table width="96%" height="120"  border="1" align="center" cellpadding="0" cellspacing="0" bordercolor="#EFEFEF" >
                     <tr>
                       <td width="36%" rowspan="5" height="120"><div align="center">
                           <input name="pricture<%=i%>" type="image" src="<%=freeGoods.getPicture()%>" width="140" height="94">
                       </div></td>
                       <td width="12%" height="30"><div align="center" class="zi">商品名称</div></td>
                       <td width="52%"><span class="zi"><%=freeGoods.getName()%></span></td>
                     </tr>
					  <tr>
                       <td height="30"><div align="center" style="text-decoration:line-through;color:#910402" class="zi">原价</div></td>
                       <td height="30"><span class="zi" style="text-decoration:line-through;color:#910402"><%=freeGoods.getNowPrice()%>元</span></td>
				     </tr>
                     <tr>
                       <td height="30"><div align="center" class="zi"><font color="#F14D83">现价</font></div></td>
                       <td height="30"><span class="zi"><font color="#F14D83"><%=freeGoods.getFreePrice()%>元</font></span></td>
                     </tr>
                     <tr>
                       <td height="30"><div align="center" class="zi">描述</div></td>
                       <td height="30"><span class="zi"><%=freeGoods.getIntroduce()%></span></td>
                     </tr>
                     <tr>
                       <td height="30" colspan="2" class="linkBlack"><div align="right" class="zi">
                           <%if(session.getAttribute("form")!=null||session.getAttribute("id")!=null){%>
                           <a href="#" onClick="window.open('goodsAction.do?action=16&id=<%=freeGoods.getId()%>','','width=500,height=200');">查看详细内容</a></div>
                           <%}else{%>
                           <div align="right" class="zi">登录后才能购买</div><%}%></td>
                       
                     </tr>
                 </table></td>
               </tr>
             </table>
			<%}%>
        
		    <div align="center">
		      <table width="90%"  border="0" align="center" cellpadding="0" cellspacing="0">
                <form action="" name="jumpform">
                <tr align="center" class="zi">
                  <td width="12%" valign="bottom">共为<%=maxPage%>页</td>
                  <td width="17%" valign="bottom">共有<%=pageNumber%>条记录</td>
                  <td width="17%" valign="bottom">当前为第<%=number+1%>页</td>
                  <td width="13%" valign="bottom"><%if((number+1)==1){%>
      <span class="zi">上一页</span>
        <%}else{%>
        <a href="goodsAction.do?action=15&mark=1&i=<%=number-1%>">上一页</a></td>
                  <%}%>
                  <td width="12%" valign="bottom"><%if(maxPage<=(number+1)){%>
      <span class="zi">下一页</span>
        <%}else{%>
        <a href="goodsAction.do?action=15&mark=1&i=<%=number+1%>">下一页</a></td>
                  <%}%><td width="7%" valign="bottom" class="linkBlack"><div align="center"><a href="#" onClick="javasrcipt:history.go(-1);">返回</a></div></td>
                  <td width="22%" align="center" valign="bottom" class="linkBlack">
                    转到第                    
                        <select name="jumppage" onchange="Jumpping()">
                    <% for(int i=1;i<=maxPage;i++){
                    	if(i==number+1){
                    
                     %>
                     <option selected value=<%=i %>><%=i %></option>
                     <%}else{ %>
                     <option value=<%=i %>><%=i %></option>
                     <%}} %>
                  </select>
                    页                    </td>
                </tr>
				</form>
              </table>
		    </div></td>
      </tr>
    </table>
    
    </td>
  </tr>
 <tr bgcolor="#FFFFFF">
    <td height="100"><p align="center"><jsp:include page="../downNews.jsp"/></p></td>
  </tr>
</table>
</body>
</html>
