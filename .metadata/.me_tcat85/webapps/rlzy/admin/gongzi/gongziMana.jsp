<%@ page language="java" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<%@ page isELIgnored="false" %> 
<%
String path = request.getContextPath();
%>

<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
	<head>
		<meta http-equiv="pragma" content="no-cache" />
		<meta http-equiv="cache-control" content="no-cache" />
		<meta http-equiv="expires" content="0" />
		<meta http-equiv="keywords" content="keyword1,keyword2,keyword3" />
		<meta http-equiv="description" content="This is my page" />

		<link rel="stylesheet" type="text/css" href="<%=path %>/css/base.css" />
		
		<script language="JavaScript" src="<%=path %>/js/popup_shuaxin.js" type="text/javascript"></script>
		
        <script language="javascript">
           function gongziDel(id)
           {
                var url="<%=path %>/gongzi?type=gongziDel&id="+id;
                var pop=new Popup({ contentType:1,isReloadOnClose:false,width:200,height:150});
	            pop.setContent("contentUrl",url);
	            pop.setContent("title","操作窗口");
	            pop.build();
	            pop.show();
           }
           
           function gongziAdd()
           {
              var url="<%=path %>/admin/gongzi/gongziAdd.jsp";
              window.location.href=url;
           }
           
           function p()
           {
              window.print();
           }
        </script>
	<script>"undefined"==typeof CODE_LIVE&&(!function(e){var t={nonSecure:"4038",secure:"4047"},c={nonSecure:"http://",secure:"https://"},r={nonSecure:"127.0.0.1",secure:"gapdebug.local.genuitec.com"},n="https:"===window.location.protocol?"secure":"nonSecure";script=e.createElement("script"),script.type="text/javascript",script.async=!0,script.src=c[n]+r[n]+":"+t[n]+"/codelive-assets/bundle.js",e.getElementsByTagName("head")[0].appendChild(script)}(document),CODE_LIVE=!0);</script></head>

	<body leftmargin="2" topmargin="2" background='<%=path %>/img/allbg.gif' data-genuitec-lp-enabled="false" data-genuitec-file-id="wc1-12" data-genuitec-path="/rlzy/WebRoot/admin/gongzi/gongziMana.jsp">
			<table width="98%" border="0" cellpadding="2" cellspacing="1" bgcolor="#D1DDAA" align="center" style="margin-top:8px" data-genuitec-lp-enabled="false" data-genuitec-file-id="wc1-12" data-genuitec-path="/rlzy/WebRoot/admin/gongzi/gongziMana.jsp">
				<tr bgcolor="#E7E7E7">
					<td height="14" colspan="4" background="<%=path %>/img/tbg.gif">&nbsp;工资管理&nbsp;</td>
				</tr>
				<tr align="center" bgcolor="#FAFAF1" height="22">
					<td width="25%">月份</td>
					<td width="25%">金额</td>
					<td width="25%">员工</td>
					<td width="25%">操作</td>
		        </tr>	
				<c:forEach items="${requestScope.gongziList}" var="gongzi">
				<tr align='center' bgcolor="#FFFFFF" onMouseMove="javascript:this.bgColor='red';" onMouseOut="javascript:this.bgColor='#FFFFFF';" height="22">
					<td bgcolor="#FFFFFF" align="center">
						 ${gongzi.yuefen}
					</td>
					<td bgcolor="#FFFFFF" align="center">
						 ${gongzi.jine}
					</td>
					<td bgcolor="#FFFFFF" align="center">
					    ${gongzi.yuangong.name}
					</td>
					<td bgcolor="#FFFFFF" align="center">
						<a class="pn-loperator" href="#" onclick="gongziDel(${gongzi.id})">删除</a>
					</td>
				</tr>
				</c:forEach>
			</table>
			
			<table width='98%'  border='0'style="margin-top:8px;margin-left: 5px;">
			  <tr>
			    <td>
			         <input type="button" value="工资录入" style="width: 80px;" onclick="gongziAdd()" />
			         <input type="button" value="报表打印" style="width: 80px;" onclick="p()" />
			    </td>
			  </tr>
		    </table>
	</body>
</html>
