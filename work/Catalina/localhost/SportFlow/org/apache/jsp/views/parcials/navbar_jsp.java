/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/10.1.36
 * Generated at: 2025-03-15 14:56:34 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.views.parcials;

import jakarta.servlet.*;
import jakarta.servlet.http.*;
import jakarta.servlet.jsp.*;

public final class navbar_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports,
                 org.apache.jasper.runtime.JspSourceDirectives {

  private static final jakarta.servlet.jsp.JspFactory _jspxFactory =
          jakarta.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  private static final java.util.Set<java.lang.String> _jspx_imports_packages;

  private static final java.util.Set<java.lang.String> _jspx_imports_classes;

  static {
    _jspx_imports_packages = new java.util.LinkedHashSet<>(4);
    _jspx_imports_packages.add("jakarta.servlet");
    _jspx_imports_packages.add("jakarta.servlet.http");
    _jspx_imports_packages.add("jakarta.servlet.jsp");
    _jspx_imports_classes = null;
  }

  private volatile jakarta.el.ExpressionFactory _el_expressionfactory;
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

  public boolean getErrorOnELNotFound() {
    return false;
  }

  public jakarta.el.ExpressionFactory _jsp_getExpressionFactory() {
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
  }

  public void _jspDestroy() {
  }

  public void _jspService(final jakarta.servlet.http.HttpServletRequest request, final jakarta.servlet.http.HttpServletResponse response)
      throws java.io.IOException, jakarta.servlet.ServletException {

    if (!jakarta.servlet.DispatcherType.ERROR.equals(request.getDispatcherType())) {
      final java.lang.String _jspx_method = request.getMethod();
      if ("OPTIONS".equals(_jspx_method)) {
        response.setHeader("Allow","GET, HEAD, POST, OPTIONS");
        return;
      }
      if (!"GET".equals(_jspx_method) && !"POST".equals(_jspx_method) && !"HEAD".equals(_jspx_method)) {
        response.setHeader("Allow","GET, HEAD, POST, OPTIONS");
        response.sendError(HttpServletResponse.SC_METHOD_NOT_ALLOWED, "Les JSPs ne permettent que GET, POST ou HEAD. Jasper permet aussi OPTIONS");
        return;
      }
    }

    final jakarta.servlet.jsp.PageContext pageContext;
    jakarta.servlet.http.HttpSession session = null;
    final jakarta.servlet.ServletContext application;
    final jakarta.servlet.ServletConfig config;
    jakarta.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    jakarta.servlet.jsp.JspWriter _jspx_out = null;
    jakarta.servlet.jsp.PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("<header class=\"z-10 py-4 bg-white shadow-md dark:bg-gray-800\">\n");
      out.write("  <div\n");
      out.write("    class=\"container flex items-center justify-between h-full px-6 mx-auto text-purple-600 dark:text-purple-300\"\n");
      out.write("  >\n");
      out.write("    <!-- Mobile hamburger -->\n");
      out.write("    <button\n");
      out.write("      class=\"p-1 mr-5 -ml-1 rounded-md md:hidden focus:outline-none focus:shadow-outline-purple\"\n");
      out.write("      @click=\"toggleSideMenu\"\n");
      out.write("      aria-label=\"Menu\"\n");
      out.write("    >\n");
      out.write("      <svg\n");
      out.write("        class=\"w-6 h-6\"\n");
      out.write("        aria-hidden=\"true\"\n");
      out.write("        fill=\"currentColor\"\n");
      out.write("        viewBox=\"0 0 20 20\"\n");
      out.write("      >\n");
      out.write("        <path\n");
      out.write("          fill-rule=\"evenodd\"\n");
      out.write("          d=\"M3 5a1 1 0 011-1h12a1 1 0 110 2H4a1 1 0 01-1-1zM3 10a1 1 0 011-1h12a1 1 0 110 2H4a1 1 0 01-1-1zM3 15a1 1 0 011-1h12a1 1 0 110 2H4a1 1 0 01-1-1z\"\n");
      out.write("          clip-rule=\"evenodd\"\n");
      out.write("        ></path>\n");
      out.write("      </svg>\n");
      out.write("    </button>\n");
      out.write("    <!-- Search input -->\n");
      out.write("    <div class=\"flex justify-center flex-1 lg:mr-32\">\n");
      out.write("      <div\n");
      out.write("        class=\"relative w-full max-w-xl mr-6 focus-within:text-purple-500\"\n");
      out.write("      >\n");
      out.write("        <div class=\"absolute inset-y-0 flex items-center pl-2\">\n");
      out.write("          <svg\n");
      out.write("            class=\"w-4 h-4\"\n");
      out.write("            aria-hidden=\"true\"\n");
      out.write("            fill=\"currentColor\"\n");
      out.write("            viewBox=\"0 0 20 20\"\n");
      out.write("          >\n");
      out.write("            <path\n");
      out.write("              fill-rule=\"evenodd\"\n");
      out.write("              d=\"M8 4a4 4 0 100 8 4 4 0 000-8zM2 8a6 6 0 1110.89 3.476l4.817 4.817a1 1 0 01-1.414 1.414l-4.816-4.816A6 6 0 012 8z\"\n");
      out.write("              clip-rule=\"evenodd\"\n");
      out.write("            ></path>\n");
      out.write("          </svg>\n");
      out.write("        </div>\n");
      out.write("        <input\n");
      out.write("          class=\"w-full pl-8 pr-2 text-sm text-gray-700 placeholder-gray-600 bg-gray-100 border-0 rounded-md dark:placeholder-gray-500 dark:focus:shadow-outline-gray dark:focus:placeholder-gray-600 dark:bg-gray-700 dark:text-gray-200 focus:placeholder-gray-500 focus:bg-white focus:border-purple-300 focus:outline-none focus:shadow-outline-purple form-input\"\n");
      out.write("          type=\"text\"\n");
      out.write("          placeholder=\"Search for projects\"\n");
      out.write("          aria-label=\"Search\"\n");
      out.write("        />\n");
      out.write("      </div>\n");
      out.write("    </div>\n");
      out.write("    <ul class=\"flex items-center flex-shrink-0 space-x-6\">\n");
      out.write("      <!-- Theme toggler -->\n");
      out.write("      <li class=\"flex\">\n");
      out.write("        <button\n");
      out.write("          class=\"rounded-md focus:outline-none focus:shadow-outline-purple\"\n");
      out.write("          @click=\"toggleTheme\"\n");
      out.write("          aria-label=\"Toggle color mode\"\n");
      out.write("        >\n");
      out.write("          <template x-if=\"!dark\">\n");
      out.write("            <svg\n");
      out.write("              class=\"w-5 h-5\"\n");
      out.write("              aria-hidden=\"true\"\n");
      out.write("              fill=\"currentColor\"\n");
      out.write("              viewBox=\"0 0 20 20\"\n");
      out.write("            >\n");
      out.write("              <path\n");
      out.write("                d=\"M17.293 13.293A8 8 0 016.707 2.707a8.001 8.001 0 1010.586 10.586z\"\n");
      out.write("              ></path>\n");
      out.write("            </svg>\n");
      out.write("          </template>\n");
      out.write("          <template x-if=\"dark\">\n");
      out.write("            <svg\n");
      out.write("              class=\"w-5 h-5\"\n");
      out.write("              aria-hidden=\"true\"\n");
      out.write("              fill=\"currentColor\"\n");
      out.write("              viewBox=\"0 0 20 20\"\n");
      out.write("            >\n");
      out.write("              <path\n");
      out.write("                fill-rule=\"evenodd\"\n");
      out.write("                d=\"M10 2a1 1 0 011 1v1a1 1 0 11-2 0V3a1 1 0 011-1zm4 8a4 4 0 11-8 0 4 4 0 018 0zm-.464 4.95l.707.707a1 1 0 001.414-1.414l-.707-.707a1 1 0 00-1.414 1.414zm2.12-10.607a1 1 0 010 1.414l-.706.707a1 1 0 11-1.414-1.414l.707-.707a1 1 0 011.414 0zM17 11a1 1 0 100-2h-1a1 1 0 100 2h1zm-7 4a1 1 0 011 1v1a1 1 0 11-2 0v-1a1 1 0 011-1zM5.05 6.464A1 1 0 106.465 5.05l-.708-.707a1 1 0 00-1.414 1.414l.707.707zm1.414 8.486l-.707.707a1 1 0 01-1.414-1.414l.707-.707a1 1 0 011.414 1.414zM4 11a1 1 0 100-2H3a1 1 0 000 2h1z\"\n");
      out.write("                clip-rule=\"evenodd\"\n");
      out.write("              ></path>\n");
      out.write("            </svg>\n");
      out.write("          </template>\n");
      out.write("        </button>\n");
      out.write("      </li>\n");
      out.write("      <!-- Notifications menu -->\n");
      out.write("      <li class=\"relative\">\n");
      out.write("        <button\n");
      out.write("          class=\"relative align-middle rounded-md focus:outline-none focus:shadow-outline-purple\"\n");
      out.write("          @click=\"toggleNotificationsMenu\"\n");
      out.write("          @keydown.escape=\"closeNotificationsMenu\"\n");
      out.write("          aria-label=\"Notifications\"\n");
      out.write("          aria-haspopup=\"true\"\n");
      out.write("        >\n");
      out.write("          <svg\n");
      out.write("            class=\"w-5 h-5\"\n");
      out.write("            aria-hidden=\"true\"\n");
      out.write("            fill=\"currentColor\"\n");
      out.write("            viewBox=\"0 0 20 20\"\n");
      out.write("          >\n");
      out.write("            <path\n");
      out.write("              d=\"M10 2a6 6 0 00-6 6v3.586l-.707.707A1 1 0 004 14h12a1 1 0 00.707-1.707L16 11.586V8a6 6 0 00-6-6zM10 18a3 3 0 01-3-3h6a3 3 0 01-3 3z\"\n");
      out.write("            ></path>\n");
      out.write("          </svg>\n");
      out.write("          <!-- Notification badge -->\n");
      out.write("          <span\n");
      out.write("            aria-hidden=\"true\"\n");
      out.write("            class=\"absolute top-0 right-0 inline-block w-3 h-3 transform translate-x-1 -translate-y-1 bg-red-600 border-2 border-white rounded-full dark:border-gray-800\"\n");
      out.write("          ></span>\n");
      out.write("        </button>\n");
      out.write("        <template x-if=\"isNotificationsMenuOpen\">\n");
      out.write("          <ul\n");
      out.write("            x-transition:leave=\"transition ease-in duration-150\"\n");
      out.write("            x-transition:leave-start=\"opacity-100\"\n");
      out.write("            x-transition:leave-end=\"opacity-0\"\n");
      out.write("            @click.away=\"closeNotificationsMenu\"\n");
      out.write("            @keydown.escape=\"closeNotificationsMenu\"\n");
      out.write("            class=\"absolute right-0 w-56 p-2 mt-2 space-y-2 text-gray-600 bg-white border border-gray-100 rounded-md shadow-md dark:text-gray-300 dark:border-gray-700 dark:bg-gray-700\"\n");
      out.write("          >\n");
      out.write("            <li class=\"flex\">\n");
      out.write("              <a\n");
      out.write("                class=\"inline-flex items-center justify-between w-full px-2 py-1 text-sm font-semibold transition-colors duration-150 rounded-md hover:bg-gray-100 hover:text-gray-800 dark:hover:bg-gray-800 dark:hover:text-gray-200\"\n");
      out.write("                href=\"#\"\n");
      out.write("              >\n");
      out.write("                <span>Messages</span>\n");
      out.write("                <span\n");
      out.write("                  class=\"inline-flex items-center justify-center px-2 py-1 text-xs font-bold leading-none text-red-600 bg-red-100 rounded-full dark:text-red-100 dark:bg-red-600\"\n");
      out.write("                >\n");
      out.write("                  13\n");
      out.write("                </span>\n");
      out.write("              </a>\n");
      out.write("            </li>\n");
      out.write("            <li class=\"flex\">\n");
      out.write("              <a\n");
      out.write("                class=\"inline-flex items-center justify-between w-full px-2 py-1 text-sm font-semibold transition-colors duration-150 rounded-md hover:bg-gray-100 hover:text-gray-800 dark:hover:bg-gray-800 dark:hover:text-gray-200\"\n");
      out.write("                href=\"#\"\n");
      out.write("              >\n");
      out.write("                <span>Sales</span>\n");
      out.write("                <span\n");
      out.write("                  class=\"inline-flex items-center justify-center px-2 py-1 text-xs font-bold leading-none text-red-600 bg-red-100 rounded-full dark:text-red-100 dark:bg-red-600\"\n");
      out.write("                >\n");
      out.write("                  2\n");
      out.write("                </span>\n");
      out.write("              </a>\n");
      out.write("            </li>\n");
      out.write("            <li class=\"flex\">\n");
      out.write("              <a\n");
      out.write("                class=\"inline-flex items-center justify-between w-full px-2 py-1 text-sm font-semibold transition-colors duration-150 rounded-md hover:bg-gray-100 hover:text-gray-800 dark:hover:bg-gray-800 dark:hover:text-gray-200\"\n");
      out.write("                href=\"#\"\n");
      out.write("              >\n");
      out.write("                <span>Alerts</span>\n");
      out.write("              </a>\n");
      out.write("            </li>\n");
      out.write("          </ul>\n");
      out.write("        </template>\n");
      out.write("      </li>\n");
      out.write("      <!-- Profile menu -->\n");
      out.write("      <li class=\"relative\">\n");
      out.write("        <button\n");
      out.write("          class=\"align-middle rounded-full focus:shadow-outline-purple focus:outline-none\"\n");
      out.write("          @click=\"toggleProfileMenu\"\n");
      out.write("          @keydown.escape=\"closeProfileMenu\"\n");
      out.write("          aria-label=\"Account\"\n");
      out.write("          aria-haspopup=\"true\"\n");
      out.write("        >\n");
      out.write("          <img\n");
      out.write("            class=\"object-cover w-8 h-8 rounded-full\"\n");
      out.write("            src=\"https://images.unsplash.com/photo-1502378735452-bc7d86632805?ixlib=rb-0.3.5&q=80&fm=jpg&crop=entropy&cs=tinysrgb&w=200&fit=max&s=aa3a807e1bbdfd4364d1f449eaa96d82\"\n");
      out.write("            alt=\"\"\n");
      out.write("            aria-hidden=\"true\"\n");
      out.write("          />\n");
      out.write("        </button>\n");
      out.write("        <template x-if=\"isProfileMenuOpen\">\n");
      out.write("          <ul\n");
      out.write("            x-transition:leave=\"transition ease-in duration-150\"\n");
      out.write("            x-transition:leave-start=\"opacity-100\"\n");
      out.write("            x-transition:leave-end=\"opacity-0\"\n");
      out.write("            @click.away=\"closeProfileMenu\"\n");
      out.write("            @keydown.escape=\"closeProfileMenu\"\n");
      out.write("            class=\"absolute right-0 w-56 p-2 mt-2 space-y-2 text-gray-600 bg-white border border-gray-100 rounded-md shadow-md dark:border-gray-700 dark:text-gray-300 dark:bg-gray-700\"\n");
      out.write("            aria-label=\"submenu\"\n");
      out.write("          >\n");
      out.write("            <li class=\"flex\">\n");
      out.write("              <a\n");
      out.write("                class=\"inline-flex items-center w-full px-2 py-1 text-sm font-semibold transition-colors duration-150 rounded-md hover:bg-gray-100 hover:text-gray-800 dark:hover:bg-gray-800 dark:hover:text-gray-200\"\n");
      out.write("                href=\"#\"\n");
      out.write("              >\n");
      out.write("                <svg\n");
      out.write("                  class=\"w-4 h-4 mr-3\"\n");
      out.write("                  aria-hidden=\"true\"\n");
      out.write("                  fill=\"none\"\n");
      out.write("                  stroke-linecap=\"round\"\n");
      out.write("                  stroke-linejoin=\"round\"\n");
      out.write("                  stroke-width=\"2\"\n");
      out.write("                  viewBox=\"0 0 24 24\"\n");
      out.write("                  stroke=\"currentColor\"\n");
      out.write("                >\n");
      out.write("                  <path\n");
      out.write("                    d=\"M16 7a4 4 0 11-8 0 4 4 0 018 0zM12 14a7 7 0 00-7 7h14a7 7 0 00-7-7z\"\n");
      out.write("                  ></path>\n");
      out.write("                </svg>\n");
      out.write("                <span>Profile</span>\n");
      out.write("              </a>\n");
      out.write("            </li>\n");
      out.write("            <li class=\"flex\">\n");
      out.write("              <a\n");
      out.write("                class=\"inline-flex items-center w-full px-2 py-1 text-sm font-semibold transition-colors duration-150 rounded-md hover:bg-gray-100 hover:text-gray-800 dark:hover:bg-gray-800 dark:hover:text-gray-200\"\n");
      out.write("                href=\"#\"\n");
      out.write("              >\n");
      out.write("                <svg\n");
      out.write("                  class=\"w-4 h-4 mr-3\"\n");
      out.write("                  aria-hidden=\"true\"\n");
      out.write("                  fill=\"none\"\n");
      out.write("                  stroke-linecap=\"round\"\n");
      out.write("                  stroke-linejoin=\"round\"\n");
      out.write("                  stroke-width=\"2\"\n");
      out.write("                  viewBox=\"0 0 24 24\"\n");
      out.write("                  stroke=\"currentColor\"\n");
      out.write("                >\n");
      out.write("                  <path\n");
      out.write("                    d=\"M10.325 4.317c.426-1.756 2.924-1.756 3.35 0a1.724 1.724 0 002.573 1.066c1.543-.94 3.31.826 2.37 2.37a1.724 1.724 0 001.065 2.572c1.756.426 1.756 2.924 0 3.35a1.724 1.724 0 00-1.066 2.573c.94 1.543-.826 3.31-2.37 2.37a1.724 1.724 0 00-2.572 1.065c-.426 1.756-2.924 1.756-3.35 0a1.724 1.724 0 00-2.573-1.066c-1.543.94-3.31-.826-2.37-2.37a1.724 1.724 0 00-1.065-2.572c-1.756-.426-1.756-2.924 0-3.35a1.724 1.724 0 001.066-2.573c-.94-1.543.826-3.31 2.37-2.37.996.608 2.296.07 2.572-1.065z\"\n");
      out.write("                  ></path>\n");
      out.write("                  <path d=\"M15 12a3 3 0 11-6 0 3 3 0 016 0z\"></path>\n");
      out.write("                </svg>\n");
      out.write("                <span>Settings</span>\n");
      out.write("              </a>\n");
      out.write("            </li>\n");
      out.write("            <li class=\"flex\">\n");
      out.write("                <form action=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (jakarta.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("/auth/logout\" method=\"POST\">\n");
      out.write("                    <button\n");
      out.write("                        class=\"inline-flex items-center w-full px-2 py-1 text-sm font-semibold transition-colors duration-150 rounded-md hover:bg-gray-100 hover:text-gray-800 dark:hover:bg-gray-800 dark:hover:text-gray-200\"\n");
      out.write("                        type=\"submit\"\n");
      out.write("                      >\n");
      out.write("                        <svg\n");
      out.write("                          class=\"w-4 h-4 mr-3\"\n");
      out.write("                          aria-hidden=\"true\"\n");
      out.write("                          fill=\"none\"\n");
      out.write("                          stroke-linecap=\"round\"\n");
      out.write("                          stroke-linejoin=\"round\"\n");
      out.write("                          stroke-width=\"2\"\n");
      out.write("                          viewBox=\"0 0 24 24\"\n");
      out.write("                          stroke=\"currentColor\"\n");
      out.write("                        >\n");
      out.write("                          <path\n");
      out.write("                            d=\"M11 16l-4-4m0 0l4-4m-4 4h14m-5 4v1a3 3 0 01-3 3H6a3 3 0 01-3-3V7a3 3 0 013-3h7a3 3 0 013 3v1\"\n");
      out.write("                          ></path>\n");
      out.write("                        </svg>\n");
      out.write("                        <span>Log out</span>\n");
      out.write("                      </button>\n");
      out.write("                </form>\n");
      out.write("\n");
      out.write("            </li>\n");
      out.write("          </ul>\n");
      out.write("        </template>\n");
      out.write("      </li>\n");
      out.write("    </ul>\n");
      out.write("  </div>\n");
      out.write("</header>");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof jakarta.servlet.jsp.SkipPageException)){
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
