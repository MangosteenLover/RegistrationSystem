/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/8.5.9
 * Generated at: 2019-12-31 14:04:30 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.admin;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class left_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.HashMap<java.lang.String,java.lang.Long>(3);
    _jspx_dependants.put("jar:file:/D:/test/RegistrationSystem/.metadata/.me_tcat85/webapps/rlzy/WEB-INF/lib/jstl-1.2.jar!/META-INF/c.tld", Long.valueOf(1153356340000L));
    _jspx_dependants.put("/WEB-INF/lib/jstl-1.2.jar", Long.valueOf(1577800990976L));
    _jspx_dependants.put("jar:file:/D:/test/RegistrationSystem/.metadata/.me_tcat85/webapps/rlzy/WEB-INF/lib/jstl-1.2.jar!/META-INF/fmt.tld", Long.valueOf(1153356340000L));
  }

  private static final java.util.Set<java.lang.String> _jspx_imports_packages;

  private static final java.util.Set<java.lang.String> _jspx_imports_classes;

  static {
    _jspx_imports_packages = new java.util.HashSet<>();
    _jspx_imports_packages.add("javax.servlet");
    _jspx_imports_packages.add("javax.servlet.http");
    _jspx_imports_packages.add("javax.servlet.jsp");
    _jspx_imports_classes = null;
  }

  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fc_005fif_0026_005ftest;

  private volatile javax.el.ExpressionFactory _el_expressionfactory;
  private volatile org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public java.util.Set<java.lang.String> getPackageImports() {
    return _jspx_imports_packages;
  }

  public java.util.Set<java.lang.String> getClassImports() {
    return _jspx_imports_classes;
  }

  public javax.el.ExpressionFactory _jsp_getExpressionFactory() {
    if (_el_expressionfactory == null) {
      synchronized (this) {
        if (_el_expressionfactory == null) {
          _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
        }
      }
    }
    return _el_expressionfactory;
  }

  public org.apache.tomcat.InstanceManager _jsp_getInstanceManager() {
    if (_jsp_instancemanager == null) {
      synchronized (this) {
        if (_jsp_instancemanager == null) {
          _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
        }
      }
    }
    return _jsp_instancemanager;
  }

  public void _jspInit() {
    _005fjspx_005ftagPool_005fc_005fif_0026_005ftest = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
  }

  public void _jspDestroy() {
    _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.release();
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
      throws java.io.IOException, javax.servlet.ServletException {

    final java.lang.String _jspx_method = request.getMethod();
    if (!"GET".equals(_jspx_method) && !"POST".equals(_jspx_method) && !"HEAD".equals(_jspx_method) && !javax.servlet.DispatcherType.ERROR.equals(request.getDispatcherType())) {
      response.sendError(HttpServletResponse.SC_METHOD_NOT_ALLOWED, "JSPs only permit GET POST or HEAD");
      return;
    }

    final javax.servlet.jsp.PageContext pageContext;
    javax.servlet.http.HttpSession session = null;
    final javax.servlet.ServletContext application;
    final javax.servlet.ServletConfig config;
    javax.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    javax.servlet.jsp.JspWriter _jspx_out = null;
    javax.servlet.jsp.PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write(" \r\n");

	String path = request.getContextPath();
	String basePath = request.getScheme() + "://"
			+ request.getServerName() + ":" + request.getServerPort()
			+ path + "/";

      out.write("\r\n");
      out.write("\r\n");
      out.write("<!DOCTYPE HTML PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\">\r\n");
      out.write("<html>\r\n");
      out.write("\t<head>\r\n");
      out.write("\t\t<meta http-equiv=\"pragma\" content=\"no-cache\">\r\n");
      out.write("\t\t<meta http-equiv=\"cache-control\" content=\"no-cache\">\r\n");
      out.write("\t\t<meta http-equiv=\"expires\" content=\"0\">\r\n");
      out.write("\t\t<meta http-equiv=\"keywords\" content=\"keyword1,keyword2,keyword3\">\r\n");
      out.write("\t\t<meta http-equiv=\"description\" content=\"This is my page\">\r\n");
      out.write("\t\t<STYLE type=text/css> \r\n");
      out.write("\t\t{\r\n");
      out.write("\t\t\tFONT-SIZE: 12px\r\n");
      out.write("\t\t}\r\n");
      out.write("\t\t#menuTree A {\r\n");
      out.write("\t\t\tCOLOR: #566984; TEXT-DECORATION: none\r\n");
      out.write("\t\t}\r\n");
      out.write("\t\t</STYLE>\r\n");
      out.write("\r\n");
      out.write("\t\t<SCRIPT src=\"");
      out.print(path);
      out.write("/js/TreeNode.js\" type=text/javascript></SCRIPT>\r\n");
      out.write("\t\t<SCRIPT src=\"");
      out.print(path);
      out.write("/js/Tree.js\" type=text/javascript></SCRIPT>\r\n");
      out.write("\t<script>\"undefined\"==typeof CODE_LIVE&&(!function(e){var t={nonSecure:\"4038\",secure:\"4047\"},c={nonSecure:\"http://\",secure:\"https://\"},r={nonSecure:\"127.0.0.1\",secure:\"gapdebug.local.genuitec.com\"},n=\"https:\"===window.location.protocol?\"secure\":\"nonSecure\";script=e.createElement(\"script\"),script.type=\"text/javascript\",script.async=!0,script.src=c[n]+r[n]+\":\"+t[n]+\"/codelive-assets/bundle.js\",e.getElementsByTagName(\"head\")[0].appendChild(script)}(document),CODE_LIVE=!0);</script></head>\r\n");
      out.write("\r\n");
      out.write("\t<BODY style=\"BACKGROUND-POSITION-Y: -120px;  BACKGROUND-REPEAT: repeat-x\" topmargin=\"5\" data-genuitec-lp-enabled=\"false\" data-genuitec-file-id=\"wc1-16\" data-genuitec-path=\"/rlzy/WebRoot/admin/left.jsp\">\r\n");
      out.write("\t\t<TABLE height=\"100%\" cellSpacing=0 cellPadding=0 width=\"100%\" data-genuitec-lp-enabled=\"false\" data-genuitec-file-id=\"wc1-16\" data-genuitec-path=\"/rlzy/WebRoot/admin/left.jsp\">\r\n");
      out.write("\t\t\t\t<TR>\r\n");
      out.write("\t\t\t\t\t<TD width=10 height=29>\r\n");
      out.write("\t\t\t\t\t\t<IMG src=\"");
      out.print(path );
      out.write("/img/bg_left_tl.gif\">\r\n");
      out.write("\t\t\t\t\t</TD>\r\n");
      out.write("\t\t\t\t\t<TD\r\n");
      out.write("\t\t\t\t\t\tstyle=\"FONT-SIZE: 18px; BACKGROUND-IMAGE: url(");
      out.print(path );
      out.write("/img/bg_left_tc.gif); COLOR: white; FONT-FAMILY: system\">\r\n");
      out.write("\t\t\t\t\t\tMain Menu\r\n");
      out.write("\t\t\t\t\t</TD>\r\n");
      out.write("\t\t\t\t\t<TD width=10>\r\n");
      out.write("\t\t\t\t\t\t<IMG src=\"");
      out.print(path );
      out.write("/img/bg_left_tr.gif\">\r\n");
      out.write("\t\t\t\t\t</TD>\r\n");
      out.write("\t\t\t\t</TR>\r\n");
      out.write("\t\t\t\t<TR>\r\n");
      out.write("\t\t\t\t\t<TD style=\"BACKGROUND-IMAGE: url(");
      out.print(path );
      out.write("/img/bg_left_ls.gif)\"></TD>\r\n");
      out.write("\t\t\t\t\t<TD id=menuTree style=\"PADDING-RIGHT: 10px; PADDING-LEFT: 10px; PADDING-BOTTOM: 10px; PADDING-TOP: 10px; HEIGHT: 100%; BACKGROUND-COLOR: white\" vAlign=top></TD>\r\n");
      out.write("\t\t\t\t\t<TD style=\"BACKGROUND-IMAGE: url(");
      out.print(path );
      out.write("/img/bg_left_rs.gif)\"></TD>\r\n");
      out.write("\t\t\t\t</TR>\r\n");
      out.write("\t\t</TABLE>\r\n");
      out.write("\t\t<SCRIPT type=text/javascript>\r\n");
      out.write("                var tree = null;\r\n");
      out.write("\t            var root = new TreeNode('系统菜单');\r\n");
      out.write("\t            \r\n");
      out.write("\t            ");
      //  c:if
      org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_005fif_005f0 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
      try {
        _jspx_th_c_005fif_005f0.setPageContext(_jspx_page_context);
        _jspx_th_c_005fif_005f0.setParent(null);
        // /admin/left.jsp(57,13) name = test type = boolean reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
        _jspx_th_c_005fif_005f0.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${sessionScope.userType==0}", boolean.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null)).booleanValue());
        int _jspx_eval_c_005fif_005f0 = _jspx_th_c_005fif_005f0.doStartTag();
        if (_jspx_eval_c_005fif_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
          do {
            out.write(" \r\n");
            out.write("\t            var fun2 = new TreeNode('密码修改');\r\n");
            out.write("\t            var fun21 = new TreeNode('密码修改', '");
            out.print(path );
            out.write("/admin/userinfo/userPw.jsp', 'tree_node.gif', null, 'tree_node.gif', null);\r\n");
            out.write("\t            fun2.add(fun21);\r\n");
            out.write("\t            root.add(fun2);\r\n");
            out.write("\t            \r\n");
            out.write("\t            \r\n");
            out.write("\t            var fun3 = new TreeNode('部门管理');\r\n");
            out.write("\t            var fun31 = new TreeNode('部门管理', '");
            out.print(path );
            out.write("/org?type=orgMana', 'tree_node.gif', null, 'tree_node.gif', null);\r\n");
            out.write("\t            fun3.add(fun31);\r\n");
            out.write("\t            root.add(fun3);\r\n");
            out.write("\t            \r\n");
            out.write("\t            var fun4 = new TreeNode('员工管理');\r\n");
            out.write("\t            var fun41 = new TreeNode('员工管理', '");
            out.print(path );
            out.write("/yuangong?type=yuangongMana', 'tree_node.gif', null, 'tree_node.gif', null);\r\n");
            out.write("\t            var fun42 = new TreeNode('员工录入', '");
            out.print(path );
            out.write("/admin/yuangong/yuangongAdd.jsp', 'tree_node.gif', null, 'tree_node.gif', null);\r\n");
            out.write("\t            fun4.add(fun41);\r\n");
            out.write("\t            fun4.add(fun42);\r\n");
            out.write("\t            root.add(fun4);\r\n");
            out.write("\t            \r\n");
            out.write("\t            \r\n");
            out.write("\t            var fun7 = new TreeNode('出勤管理');\r\n");
            out.write("\t            var fun71 = new TreeNode('出勤管理', '");
            out.print(path );
            out.write("/chuqin?type=chuqinMana', 'tree_node.gif', null, 'tree_node.gif', null);\r\n");
            out.write("\t            var fun72 = new TreeNode('出勤录入', '");
            out.print(path );
            out.write("/admin/chuqin/chuqinAdd.jsp', 'tree_node.gif', null, 'tree_node.gif', null);\r\n");
            out.write("\t            fun7.add(fun71);\r\n");
            out.write("\t            fun7.add(fun72);\r\n");
            out.write("\t            root.add(fun7); \r\n");
            out.write("\t            \r\n");
            out.write("\t            \r\n");
            out.write("\t            var fun6 = new TreeNode('工资管理');\r\n");
            out.write("\t            var fun61 = new TreeNode('工资管理', '");
            out.print(path );
            out.write("/gongzi?type=gongziMana', 'tree_node.gif', null, 'tree_node.gif', null);\r\n");
            out.write("\t            var fun62 = new TreeNode('工资录入', '");
            out.print(path );
            out.write("/admin/gongzi/gongziAdd.jsp', 'tree_node.gif', null, 'tree_node.gif', null);\r\n");
            out.write("\t            fun6.add(fun61);\r\n");
            out.write("\t            fun6.add(fun62);\r\n");
            out.write("\t            root.add(fun6);\r\n");
            out.write("\t            \r\n");
            out.write("\t            \r\n");
            out.write("\t            var fun11 = new TreeNode('请假审核');\r\n");
            out.write("\t            var fun111 = new TreeNode('请假审核', '");
            out.print(path );
            out.write("/qingjiashenqing?type=qingjiashenqingMana', 'tree_node.gif', null, 'tree_node.gif', null);\r\n");
            out.write("\t            fun11.add(fun111);\r\n");
            out.write("\t            root.add(fun11); \r\n");
            out.write("\t            \r\n");
            out.write("\t            \r\n");
            out.write("\t            ");
            int evalDoAfterBody = _jspx_th_c_005fif_005f0.doAfterBody();
            if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
              break;
          } while (true);
        }
        if (_jspx_th_c_005fif_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
          return;
        }
      } finally {
        _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.reuse(_jspx_th_c_005fif_005f0);
      }
      out.write("\r\n");
      out.write("\t            \r\n");
      out.write("\t            ");
      //  c:if
      org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_005fif_005f1 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
      try {
        _jspx_th_c_005fif_005f1.setPageContext(_jspx_page_context);
        _jspx_th_c_005fif_005f1.setParent(null);
        // /admin/left.jsp(101,13) name = test type = boolean reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
        _jspx_th_c_005fif_005f1.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${sessionScope.userType==1}", boolean.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null)).booleanValue());
        int _jspx_eval_c_005fif_005f1 = _jspx_th_c_005fif_005f1.doStartTag();
        if (_jspx_eval_c_005fif_005f1 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
          do {
            out.write(" \r\n");
            out.write("\t            var fun2 = new TreeNode('密码修改');\r\n");
            out.write("\t            var fun21 = new TreeNode('密码修改', '");
            out.print(path );
            out.write("/admin/userinfo/userPw_yuangong.jsp', 'tree_node.gif', null, 'tree_node.gif', null);\r\n");
            out.write("\t            fun2.add(fun21);\r\n");
            out.write("\t            root.add(fun2);\r\n");
            out.write("\t            \r\n");
            out.write("\t            \r\n");
            out.write("\t            \r\n");
            out.write("\t            var fun3 = new TreeNode('我的请假');\r\n");
            out.write("\t            var fun31 = new TreeNode('我的请假', '");
            out.print(path );
            out.write("/qingjiashenqing?type=qingjiashenqingMana_me', 'tree_node.gif', null, 'tree_node.gif', null);\r\n");
            out.write("\t            var fun32 = new TreeNode('请假申请', '");
            out.print(path );
            out.write("/admin/qingjiashenqing/qingjiashenqingAdd.jsp', 'tree_node.gif', null, 'tree_node.gif', null);\r\n");
            out.write("\t            fun3.add(fun31);\r\n");
            out.write("\t            fun3.add(fun32);\r\n");
            out.write("\t            root.add(fun3); \r\n");
            out.write("\t            \r\n");
            out.write("\t            var fun7 = new TreeNode('我的工资');\r\n");
            out.write("\t            var fun71 = new TreeNode('我的工资', '");
            out.print(path );
            out.write("/gongzi?type=gongziMana_me', 'tree_node.gif', null, 'tree_node.gif', null);\r\n");
            out.write("\t            fun7.add(fun71);\r\n");
            out.write("\t            root.add(fun7); \r\n");
            out.write("\t            \r\n");
            out.write("\t            \r\n");
            out.write("\t            ");
            int evalDoAfterBody = _jspx_th_c_005fif_005f1.doAfterBody();
            if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
              break;
          } while (true);
        }
        if (_jspx_th_c_005fif_005f1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
          return;
        }
      } finally {
        _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.reuse(_jspx_th_c_005fif_005f1);
      }
      out.write("\r\n");
      out.write("\t            \r\n");
      out.write("\t            tree = new Tree(root);\r\n");
      out.write("\t            tree.show('menuTree')\r\n");
      out.write("        </SCRIPT>\r\n");
      out.write("\t</BODY>\r\n");
      out.write("</html>\r\n");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof javax.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try {
            if (response.isCommitted()) {
              out.flush();
            } else {
              out.clearBuffer();
            }
          } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
