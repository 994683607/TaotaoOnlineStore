/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/7.0.47
 * Generated at: 2018-07-11 02:02:12 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.WEB_002dINF.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class login_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
  }

  public void _jspDestroy() {
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
        throws java.io.IOException, javax.servlet.ServletException {

    final javax.servlet.jsp.PageContext pageContext;
    javax.servlet.http.HttpSession session = null;
    final javax.servlet.ServletContext application;
    final javax.servlet.ServletConfig config;
    javax.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    javax.servlet.jsp.JspWriter _jspx_out = null;
    javax.servlet.jsp.PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html; charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("<!DOCTYPE html PUBLIC \"-//W3C//DTD XHTML 1.0 Transitional//EN\" \"http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd\">\r\n");
      out.write("<html xmlns=\"http://www.w3.org/1999/xhtml\">\r\n");
      out.write("<head>\r\n");
      out.write("    <meta http-equiv=\"Content-Type\" content=\"text/html; charset=gb2312\"/>\r\n");
      out.write("    <title>登录长理网上商城</title>\r\n");
      out.write("    <link type=\"text/css\" rel=\"stylesheet\" href=\"/css/login.css\"/>\r\n");
      out.write("    <script type=\"text/javascript\" src=\"/js/jquery-1.6.4.js\"></script>\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("<div class=\"w\">\r\n");
      out.write("    <div id=\"logo\">\r\n");
      out.write("    \t<a href=\"http://localhost:8082\" clstag=\"passport|keycount|login|01\">\r\n");
      out.write("    \t\t<img src=\"/images/shoplogo.png\" alt=\"长理网上商城\" width=\"170\" height=\"60\"/>\r\n");
      out.write("    \t</a><b></b>\r\n");
      out.write("   \t</div>\r\n");
      out.write("</div>\r\n");
      out.write("<form id=\"formlogin\" method=\"post\" onsubmit=\"return false;\">\r\n");
      out.write("    <div class=\" w1\" id=\"entry\">\r\n");
      out.write("        <div class=\"mc \" id=\"bgDiv\">\r\n");
      out.write("            <div id=\"entry-bg\" clstag=\"passport|keycount|login|02\" style=\"width: 511px; height: 455px; position: absolute; left: -44px; top: -44px; background: url(/images/544a11d3Na5a3d566.png) 0px 0px no-repeat;\">\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("            <div class=\"form \">\r\n");
      out.write("                <div class=\"item fore1\">\r\n");
      out.write("                    <span>用户名</span>\r\n");
      out.write("                    <div class=\"item-ifo\">\r\n");
      out.write("                        <input type=\"text\" id=\"loginname\" name=\"username\" class=\"text\"  tabindex=\"1\" autocomplete=\"off\"/>\r\n");
      out.write("                        <div class=\"i-name ico\"></div>\r\n");
      out.write("                        <label id=\"loginname_succeed\" class=\"blank invisible\"></label>\r\n");
      out.write("                        <label id=\"loginname_error\" class=\"hide\"><b></b></label>\r\n");
      out.write("                    </div>\r\n");
      out.write("                </div>\r\n");
      out.write("                <script type=\"text/javascript\">\r\n");
      out.write("                    setTimeout(function () {\r\n");
      out.write("                        if (!$(\"#loginname\").val()) {\r\n");
      out.write("                            $(\"#loginname\").get(0).focus();\r\n");
      out.write("                        }\r\n");
      out.write("                    }, 0);\r\n");
      out.write("                </script>\r\n");
      out.write("                <div id=\"capslock\"><i></i><s></s>键盘大写锁定已打开，请注意大小写</div>\r\n");
      out.write("                <div class=\"item fore2\">\r\n");
      out.write("                    <span>密码</span>\r\n");
      out.write("                    <div class=\"item-ifo\">\r\n");
      out.write("                        <input type=\"password\" id=\"nloginpwd\" name=\"password\" class=\"text\" tabindex=\"2\" autocomplete=\"off\"/>\r\n");
      out.write("                        <div class=\"i-pass ico\"></div>\r\n");
      out.write("                        <label id=\"loginpwd_succeed\" class=\"blank invisible\"></label>\r\n");
      out.write("                        <label id=\"loginpwd_error\" class=\"hide\"></label>\r\n");
      out.write("                    </div>\r\n");
      out.write("                </div>\r\n");
      out.write("                <div class=\"item login-btn2013\">\r\n");
      out.write("                    <input type=\"button\" class=\"btn-img btn-entry\" id=\"loginsubmit\" value=\"登录\" tabindex=\"8\" clstag=\"passport|keycount|login|06\"/>\r\n");
      out.write("                </div>\r\n");
      out.write("            </div>\r\n");
      out.write("        </div>\r\n");
      out.write("        <div class=\"free-regist\">\r\n");
      out.write("            <span><a href=\"/user/showRegister\" clstag=\"passport|keycount|login|08\">免费注册&gt;&gt;</a></span>\r\n");
      out.write("        </div>\r\n");
      out.write("    </div>\r\n");
      out.write("</form>\r\n");
      out.write("<script type=\"text/javascript\">\r\n");
      out.write("\tvar redirectUrl = \"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${redirect}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("\";\r\n");
      out.write("\tvar LOGIN = {\r\n");
      out.write("\t\t\tcheckInput:function() {\r\n");
      out.write("\t\t\t\tif ($(\"#loginname\").val() == \"\") {\r\n");
      out.write("\t\t\t\t\talert(\"用户名不能为空\");\r\n");
      out.write("\t\t\t\t\t$(\"#loginname\").focus();\r\n");
      out.write("\t\t\t\t\treturn false;\r\n");
      out.write("\t\t\t\t}\r\n");
      out.write("\t\t\t\tif ($(\"#nloginpwd\").val() == \"\") {\r\n");
      out.write("\t\t\t\t\talert(\"密码不能为空\");\r\n");
      out.write("\t\t\t\t\t$(\"#nloginpwd\").focus();\r\n");
      out.write("\t\t\t\t\treturn false;\r\n");
      out.write("\t\t\t\t}\r\n");
      out.write("\t\t\t\treturn true;\r\n");
      out.write("\t\t\t},\r\n");
      out.write("\t\t\tdoLogin:function() {\r\n");
      out.write("\t\t\t\t$.post(\"/user/login\", $(\"#formlogin\").serialize(),function(data){\r\n");
      out.write("\t\t\t\t\tif (data.status == 200) {\r\n");
      out.write("\t\t\t\t\t\talert(\"登录成功！\");\r\n");
      out.write("\t\t\t\t\t\tif (redirectUrl == \"\") {\r\n");
      out.write("\t\t\t\t\t\t\tlocation.href = \"http://localhost:8082\";\r\n");
      out.write("\t\t\t\t\t\t} else {\r\n");
      out.write("\t\t\t\t\t\t\tlocation.href = redirectUrl;\r\n");
      out.write("\t\t\t\t\t\t}\r\n");
      out.write("\t\t\t\t\t} else {\r\n");
      out.write("\t\t\t\t\t\talert(\"登录失败，原因是：\" + data.msg);\r\n");
      out.write("\t\t\t\t\t\t$(\"#loginname\").select();\r\n");
      out.write("\t\t\t\t\t}\r\n");
      out.write("\t\t\t\t});\r\n");
      out.write("\t\t\t},\r\n");
      out.write("\t\t\tlogin:function() {\r\n");
      out.write("\t\t\t\tif (this.checkInput()) {\r\n");
      out.write("\t\t\t\t\tthis.doLogin();\r\n");
      out.write("\t\t\t\t}\r\n");
      out.write("\t\t\t}\r\n");
      out.write("\t\t\r\n");
      out.write("\t};\r\n");
      out.write("\t$(function(){\r\n");
      out.write("\t\t$(\"#loginsubmit\").click(function(){\r\n");
      out.write("\t\t\tLOGIN.login();\r\n");
      out.write("\t\t});\r\n");
      out.write("\t});\r\n");
      out.write("</script>\r\n");
      out.write("</body>\r\n");
      out.write("</html>");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof javax.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try { out.clearBuffer(); } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
