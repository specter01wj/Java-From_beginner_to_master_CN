<%@ page contentType="text/html; charset=gb2312" %>
<%@page import="java.sql.*"%>
<%@page import="java.util.*"%>
<%@page import="com.domain.GoodsForm" %>
<jsp:useBean id="newGood" scope="page" class="com.dao.GoodsDao"/>
<%List newGoodList =newGood.selectMark(Integer.valueOf("0"));%>
<meta http-equiv="Content-Type" content="text/html; charset=gb2312">
<table width="96%" height="566"  border="1" align="center" cellpadding="0" cellspacing="0" bordercolor="#FFFFFF" bordercolorlight="#FFFFFF" bordercolordark="#819BBC">
          <tr>
            <td height="35" align="center" valign="middle"><div align="left">&nbsp;&nbsp;新品上架</div></td>
          </tr>
          <tr>
            <td height="529">
			 <%
              int number=6;
              if(newGoodList.size()<6){
              number=newGoodList.size();
              }
             
              for(int i=0;i<number;i++)
              {
                GoodsForm newGoods=(GoodsForm)newGoodList.get(i);
                %>
				<table width="67%"  border="1" align="center" cellpadding="0" cellspacing="0" bordercolor="#FFFFFF" bordercolorlight="#FFFFFF" bordercolordark="#819BBC">

              <tr>
                <td width="36%" rowspan="4" height="120"><input name="pricture<%=i%>" type="image" src="<%=newGoods.getPicture()%>" width="140" height="126"></td>
                <td width="64%" height="30"><div align="center"><%=newGoods.getName()%></div></td>
              </tr>
              <tr>
                <td height="30"><div align="center">单价：<%=newGoods.getNowPrice()%>元</div></td>
              </tr>
              <tr>
                <td height="30"><div align="center"><%=newGoods.getIntroduce()%></div></td>
              </tr>
              <tr>
                <td height="30"><div align="center">查看详细内容</div></td>
              </tr>

            </table><%}%></td>
          </tr>
        </table>

