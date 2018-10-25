<%@ page contentType="text/html; charset=gb2312" %>
<%@page import="java.sql.*"%>
<%@page import="java.util.*"%>
<%@page import="com.domain.AfficheForm"%>
<%@page import="com.domain.MemberForm"%>
<%@page import="com.domain.GoodsForm"%>
<jsp:useBean id="affiche" scope="page" class="com.dao.AfficheDao"/>
<jsp:useBean id="goods" scope="page" class="com.dao.GoodsDao"/>
<%java.util.Date date=new java.util.Date();%>
<%List afficheList=(List)affiche.selectAffiche();%>


<script language="javascript">

function land(){                  //登录的脚本
if(document.form.name.value==""){
window.alert("请输入账号");
return false;
}
if(document.form.password.value==""){
window.alert("请输入密码");
return false;
}
return true;
}
function quit() {
  if(confirm("欢迎下次光临！！！")){
    window.location.href="loginOut.jsp";
	}
  }
</script> 
<meta http-equiv="Content-Type" content="text/html; charset=gb2312">

<link href="css/css.css" rel="stylesheet" type="text/css">
<table width="193" height="635"  border="0" align="center" cellpadding="0" cellspacing="0">
          <tr>
            <td width="193" height="252" valign="middle" background="image/denglu.jpg">
			
			
			<form name="form" method="post" action="memberAction.do?action=1" onSubmit="return land()">
			<table width="80%" height="90"  border="0" align="center" cellpadding="0" cellspacing="0">
              <tr>
                <td width="39%" height="20"><div align="right" class="zi">用户名：</div></td>
                <td width="61%"><input name="name" type="text" size="13"></td>
              </tr>
              <tr>
                <td height="20"><div align="right" class="zi">密&nbsp;&nbsp;码：</div></td>
                <td><input name="password" type="password" size="13"></td>
              </tr>
              <tr align="center">
                <td height="27" colspan="2"><input type="submit" name="Submit3"  value="登录">                <input name="reset" type="reset" value="重置"/></td>
              </tr>
  <tr align="center">
              <td height="23"><div align="right">
                <table width="82%" height="77%"  border="0" cellpadding="0" cellspacing="0">
                  <tr>
                    <td class="linkBlack"><div align="center"><a href="#" onClick="javascript:window.open('member/memberRegister.jsp','','width=350,height=450,top=10,left=10')">注 &nbsp; 册</a></div></td>                                  
				  </tr>
                </table>
                </div></td> 
                <td><table width="82%" height="77%"  border="0" cellpadding="0" cellspacing="0">
                  <tr>
                    <td class="linkBlack"><div align="center"><a href="#" onClick="javascript:window.open('member/findOne.jsp','','width=300,height=150,top=10,left=10')">找回密码 </a></div></td>
                  </tr>
                </table></td>
  </tr>
</table>
			</form>
			
				<%System.out.println(session.getAttribute("id")!=null||session.getAttribute("form")!=null);
				
				if(session.getAttribute("id")!=null||session.getAttribute("form")!=null){%>
				          <%MemberForm form=(MemberForm)session.getAttribute("form");%>
			    <table width="93%"   border="0" align="center" cellpadding="0" cellspacing="0" bordercolor="#FFFFFF" bordercolorlight="#FFFFFF" bordercolordark="#819BBC">
				  <tr>
                    <td align="center" class="zi">欢迎<%=form.getName()%></td>
                  </tr>
                  <tr>
                    <td align="center" class="zi">会员姓名：<%=form.getReallyName()%></td>
                  </tr>
				 
				  
                  <tr>
                    <td align="center" class="linkBlack" ><a href="javascript:quit()">安全退出</a></td>
                  </tr>
              </table>

				
			
			<%}%>
            <p>&nbsp;</p></td>
          </tr>
          <tr>
            <td height="142" align="center" valign="top"><table width="100%" height="100%"  border="0" cellpadding="0" cellspacing="0">
              <tr>
                <td height="43" background="image/shangchenggenggao.jpg">&nbsp;</td>
              </tr>
              <tr>
                <td height="111">
				  <table width="84%" height="209"  border="0" align="center" cellpadding="0" cellspacing="0"  >
                <tr>
                  <td height="166" valign="middle" >
                    
					<MARQUEE direction="up"  onmouseout="this.start()" 
             onmouseover="this.stop()" scrollAmount="1" scrollDelay="1" class="linkBlack" behavior="scroll">	  
		            <%
                      for(int i=0;i<afficheList.size();i++){
                        AfficheForm afficheForm=(AfficheForm)afficheList.get(i);
                        %>
						<div align="center"><a href="#" onClick="window.open('afficheSelect.jsp?id=<%=afficheForm.getId()%>','','width=400,height=300');"><%=afficheForm.getName()%></a></div><br><br>
						<%}%>
                                            </marquee>                  </td>
                </tr>
            </table>

				
				
				</td>
              </tr>
            </table>			
			
			
			
			</td>
          </tr>
          <tr>
            <td height="236" valign="top"><table width="100%" height="235"  border="0" cellpadding="0" cellspacing="0">
              <tr>
                <td height="43" background="image/shangpinxiaoshoupaihang.jpg">&nbsp;</td>
              </tr>
              <tr>
                <td height="192">
				  <table width="84%" height="153"  border="0" align="center" cellpadding="0" cellspacing="0">
          <ul>   <%
             List goodsList =goods.selectGoodsNumber();
             int number=goodsList.size();
           if(number>6){
             number=5;
           }
             for(int account=0;account<number;account++){
             GoodsForm form=(GoodsForm)goodsList.get(account);
             %>
                <tr align="center" >
                  <%if(form.getNumber().equals(new Integer(0))){%>
                  <td width="39%" >没有商品排名</td>
                  <%}else{%>
                 
                  <td width="12%" class="linkBlack">&nbsp;
</td>
                  <td width="44%" class="linkBlack">                <li type="square">
                   <div  align="left"><a href="sell_result.jsp?id=<%=form.getId()%>&account=<%=account+1%>"><%=form.getName()%></a> </div></td>
                  <%}%>
               <td width="5%"></li>  </tr>
             <%}%></ul>
            </table>

				
				
				
				
				</td>
              </tr>
            </table></td>
          </tr>
</table>

