<%@ page contentType="text/html; charset=gb2312"%>
<%@ page import="javax.servlet.http.HttpServletRequest" %>
<%@ page import="com.jspsmart.upload.*" %>
<jsp:useBean id="up" scope="page" class="com.jspsmart.upload.SmartUpload" />
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=gb2312">
<title>图片上传处理页</title>
</head>

<body>
<%
//String name=(String)request.getAttribute("name");
//String address=(String)request.getAttribute("address");
int count=0;
	     up.initialize(pageContext);
         up.setTotalMaxFileSize(100000);
         up.setAllowedFilesList("gif,jpg");
         try{up.upload();
          out.print("====================");
            out.print("<br>");
         }catch(Exception e){}
         java.util.Random r=new java.util.Random(System.currentTimeMillis()+1);
         long longr=r.nextLong();
         long longd=System.currentTimeMillis()+longr;
         String name=new Long(longd).toString();
        //name=name.replace('-','_');
         out.print("name=" + name);
         out.print("<br>");
         File f=up.getFiles().getFile(0);
         String path="linkPicture/"+name+"."+f.getFileExt();
         out.print("path=" + path);
         out.print("<br>");
        //BasetableFactory bf=BasetableFactory.getInstance();
        if(!f.isMissing()){
              try { f.saveAs(path);
                  out.print("====================");
                  out.print("<br>");
              } catch (Exception e) {
                  out.print(f.isMissing());
                  out.print("<br>");}
        } else {
            out.print("错误2");

        }
%>
<table width="100%"  border="1" cellspacing="0" cellpadding="0">
  <tr>
    <td height="97"><%=path%> <img src='<%=path%>'></td>
  </tr>
</table>
</body>
</html>
