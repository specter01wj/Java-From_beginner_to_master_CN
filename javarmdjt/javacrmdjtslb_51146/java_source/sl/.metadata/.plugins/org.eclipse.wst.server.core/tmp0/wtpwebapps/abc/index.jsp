<%@ page contentType="text/html; charset=gb2312" %>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=gb2312">
<title>电子购物商城</title>
<link href="Css/style.css" rel="stylesheet">
<script language="javascript">
function clockon(bgclock){
	var now=new Date();
	var year=now.getYear();
	var month=now.getMonth();
	var date=now.getDate();
	var day=now.getDay();
	var hour=now.getHours();
	var minu=now.getMinutes();
	var sec=now.getSeconds();
	var week;
	month=month+1;
	if(month<10) month="0"+month;
	if(date<10) date="0"+date;
	if(hour<10) hour="0"+hour;
	if(minu<10) minu="0"+minu;
	if(sec<10) sec="0"+sec;
	var arr_week=new Array("星期日","星期一","星期二","星期三","星期四","星期五","星期六");
	week=arr_week[day];
	var time="";
	time=year+"年"+month+"月"+date+"日 "+week+" "+hour+":"+minu+":"+sec;
	if(document.all){
		bgclock.innerHTML="当前时间：["+time+"]"
	}
	var timer=setTimeout("clockon(bgclock)",200);
} 

</script>
  <!--  script   language="javascript">   
  window.onbeforeunload   =   function   ()   
  {   
            if   (event.clientY   <   0   &&   event.clientX>document.body.scrollWidth)   {   
           window.location.href="loginOut.jsp";
        }   
  }   
  </script--> 
  <script type="text/javascript">
  function window.onunload(){
  	if(event.clientX<0&&event.clientY<0){
  		window.location.href("lotest.jsp");
  	}
  }
  </script>
</head>

<body onLoad="clockon(bgclock)">
<div id="div1" style="position: absolute;  text-align:center; visibility:hidden; filter: revealTrans(Transition=8, Duration=1)  revealTrans(Transition=9, Duration=3)  revealTrans(Transition=10, Duration=1)  revealTrans(Transition=11, Duration=2)  revealTrans(Transition=12, Duration=3)  revealTrans(Transition=17, Duration=2)  revealTrans(Transition=18, Duration=3) revealTrans(Transition=19, Duration=1) revealTrans(Transition=20, Duration=2) revealTrans(Transition=21, Duration=3)"><img id="img1"></div>
<script language="javascript">
var n=0;
var n1=0;
var is=true;
document.all.div1.style.top=document.body.clientHeight-135;
document.all.div1.style.left=document.body.clientWidth-175;
function showdiv(){
	n=Math.floor(Math.random()*10);
	document.all.div1.filters[n].apply();
	if (n1==5){n1=1}
	else{n1=n1+1}
	document.all.img1.src="image/guanggao/"+n1+".jpg";
	if (is==true){	
		document.all.div1.style.visibility="visible";
		is=false;
	}else{
		document.all.div1.style.visibility="hidden";
		is=true;
	}
	document.all.div1.filters[n].play();
	setTimeout("showdiv()",6000);
}
showdiv();
function place(){
	window.status=String(n);
	document.all.div1.style.top=parseInt(document.body.scrollTop)+parseInt(document.body.clientHeight)-135;
	document.all.div1.style.left=parseInt(document.body.scrollLeft)+parseInt(document.body.clientWidth)-175;
	setTimeout("place()",50)
}
place();
</script>
<table width="755"  border="0" align="center" cellpadding="0" cellspacing="0">
  <tr>
    <td><div align="center">
    <jsp:include page="topOne.jsp"/></div>    </td>
  </tr>
  <tr>
    <td height="847">
	<table width="100%" height="100%"  border="0" cellpadding="0" cellspacing="0">
      <tr >
        <td width="193" height="638" rowspan="4" valign="top" background="image/zuocedaohangbeijing.jpg"><jsp:include page="left.jsp"/></td>
        <td width="562" height="10" align="center" valign="bottom" bgcolor="#E2E2E2"> <div id="bgclock"class="zi"></div>  </td>
      
      </tr>
      <tr >
        <td height="39" align="center" valign="middle" bgcolor="#FFFFFF"><jsp:include page="topThree.jsp"/></td>
      </tr>
      <tr>
        <!--td  height="89" valign="top" background="image/guanggaotiao.jpg">		</td-->
		<td  height="89" valign="top"><object classid="clsid:D27CDB6E-AE6D-11cf-96B8-444553540000" codebase="http://download.macromedia.com/pub/shockwave/cabs/flash/swflash.cab#version=6,0,29,0" width="562" height="198">
          <param name="movie" value="image/3.swf">
          <param name="quality" value="high">
          <embed src="image/3.swf" quality="high" pluginspage="http://www.macromedia.com/go/getflashplayer" type="application/x-shockwave-flash" width="607" height="198"></embed>
		  </object></td>
      </tr>
      <tr>
        <td  height="524" valign="top" bgcolor="#FFFFFF"><jsp:include page="right.jsp"/></td>
      </tr>
    </table></td>
  </tr>
 <tr bgcolor="#FFFFFF">
    <td height="100" ><p align="center"><jsp:include page="downNews.jsp"/>

   </td>
  </tr>

</table>
</body>
</html>
