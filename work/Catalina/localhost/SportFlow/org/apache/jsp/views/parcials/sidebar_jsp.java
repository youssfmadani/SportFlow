/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/10.1.36
 * Generated at: 2025-03-15 14:56:33 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.views.parcials;

import jakarta.servlet.*;
import jakarta.servlet.http.*;
import jakarta.servlet.jsp.*;

public final class sidebar_jsp extends org.apache.jasper.runtime.HttpJspBase
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

      out.write("<!DOCTYPE html>\n");
      out.write("<html :class=\"{ 'theme-dark': dark }\" x-data=\"data()\" lang=\"en\">\n");
      out.write("  <head>\n");
      out.write("    <meta charset=\"UTF-8\" />\n");
      out.write("    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\" />\n");
      out.write("    <title>SportFlow Dashboard</title>\n");
      out.write("    <link\n");
      out.write("      href=\"https://fonts.googleapis.com/css2?family=Inter:wght@400;500;600;700;800&display=swap\"\n");
      out.write("      rel=\"stylesheet\"\n");
      out.write("    />\n");
      out.write("    <link rel=\"stylesheet\" href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (jakarta.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("/resources/assets/css/tailwind.output.css\" />\n");
      out.write("    <script\n");
      out.write("      src=\"https://cdn.jsdelivr.net/gh/alpinejs/alpine@v2.x.x/dist/alpine.min.js\"\n");
      out.write("      defer\n");
      out.write("    ></script>\n");
      out.write("    <script src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (jakarta.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("/resources/assets/js/init-alpine.js\"></script>\n");
      out.write("    <link\n");
      out.write("      rel=\"stylesheet\"\n");
      out.write("      href=\"https://cdnjs.cloudflare.com/ajax/libs/Chart.js/2.9.3/Chart.min.css\"\n");
      out.write("    />\n");
      out.write("    <script\n");
      out.write("      src=\"https://cdnjs.cloudflare.com/ajax/libs/Chart.js/2.9.3/Chart.min.js\"\n");
      out.write("      defer\n");
      out.write("    ></script>\n");
      out.write("    <script src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (jakarta.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("/resources/assets/js/charts-lines.js\" defer></script>\n");
      out.write("    <script src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (jakarta.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("/resources/assets/js/charts-pie.js\" defer></script>\n");
      out.write("  </head>\n");
      out.write("  <body>\n");
      out.write("    <div\n");
      out.write("      class=\"flex h-screen bg-gray-50 dark:bg-gray-900\"\n");
      out.write("      :class=\"{ 'overflow-hidden': isSideMenuOpen }\"\n");
      out.write("    >\n");
      out.write("      <!-- Desktop sidebar -->\n");
      out.write("      <aside\n");
      out.write("        class=\"z-20 hidden w-64 overflow-y-auto bg-white dark:bg-gray-800 md:block flex-shrink-0\"\n");
      out.write("      >\n");
      out.write("        <div class=\"py-4 text-gray-500 dark:text-gray-400\">\n");
      out.write("          <a\n");
      out.write("            class=\"ml-6 text-lg font-bold text-gray-800 dark:text-gray-200\"\n");
      out.write("            href=\"#\"\n");
      out.write("          >\n");
      out.write("            SportFlow\n");
      out.write("          </a>\n");
      out.write("          <ul class=\"mt-6\">\n");
      out.write("            <li class=\"relative px-6 py-3\">\n");
      out.write("              <span\n");
      out.write("                class=\"absolute inset-y-0 left-0 w-1 bg-purple-600 rounded-tr-lg rounded-br-lg\"\n");
      out.write("                aria-hidden=\"true\"\n");
      out.write("              ></span>\n");
      out.write("              <a\n");
      out.write("                class=\"inline-flex items-center w-full text-sm font-semibold text-gray-800 transition-colors duration-150 hover:text-gray-800 dark:hover:text-gray-200 dark:text-gray-100\"\n");
      out.write("                href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (jakarta.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("/user/dashboard\"\n");
      out.write("              >\n");
      out.write("                <svg\n");
      out.write("                  class=\"w-5 h-5\"\n");
      out.write("                  aria-hidden=\"true\"\n");
      out.write("                  fill=\"none\"\n");
      out.write("                  stroke-linecap=\"round\"\n");
      out.write("                  stroke-linejoin=\"round\"\n");
      out.write("                  stroke-width=\"2\"\n");
      out.write("                  viewBox=\"0 0 24 24\"\n");
      out.write("                  stroke=\"currentColor\"\n");
      out.write("                >\n");
      out.write("                  <path\n");
      out.write("                    d=\"M3 12l2-2m0 0l7-7 7 7M5 10v10a1 1 0 001 1h3m10-11l2 2m-2-2v10a1 1 0 01-1 1h-3m-6 0a1 1 0 001-1v-4a1 1 0 011-1h2a1 1 0 011 1v4a1 1 0 001 1m-6 0h6\"\n");
      out.write("                  ></path>\n");
      out.write("                </svg>\n");
      out.write("                <span class=\"ml-4\">Dashboard</span>\n");
      out.write("              </a>\n");
      out.write("            </li>\n");
      out.write("          </ul>\n");
      out.write("          <ul>\n");
      out.write("            <li class=\"relative px-6 py-3\">\n");
      out.write("              <button\n");
      out.write("                class=\"inline-flex items-center justify-between w-full text-sm font-semibold transition-colors duration-150 hover:text-gray-800 dark:hover:text-gray-200\"\n");
      out.write("                @click=\"togglePagesMenu\"\n");
      out.write("                aria-haspopup=\"true\"\n");
      out.write("              >\n");
      out.write("                <span class=\"inline-flex items-center\">\n");
      out.write("                  <svg\n");
      out.write("                    class=\"w-5 h-5\"\n");
      out.write("                    aria-hidden=\"true\"\n");
      out.write("                    fill=\"none\"\n");
      out.write("                    stroke-linecap=\"round\"\n");
      out.write("                    stroke-linejoin=\"round\"\n");
      out.write("                    stroke-width=\"2\"\n");
      out.write("                    viewBox=\"0 0 24 24\"\n");
      out.write("                    stroke=\"currentColor\"\n");
      out.write("                  >\n");
      out.write("                    <path\n");
      out.write("                      d=\"M4 5a1 1 0 011-1h14a1 1 0 011 1v2a1 1 0 01-1 1H5a1 1 0 01-1-1V5zM4 13a1 1 0 011-1h6a1 1 0 011 1v6a1 1 0 01-1 1H5a1 1 0 01-1-1v-6zM16 13a1 1 0 011-1h2a1 1 0 011 1v6a1 1 0 01-1 1h-2a1 1 0 01-1-1v-6z\"\n");
      out.write("                    ></path>\n");
      out.write("                  </svg>\n");
      out.write("                  <span class=\"ml-4\">Trainers</span>\n");
      out.write("                </span>\n");
      out.write("                <svg\n");
      out.write("                  class=\"w-4 h-4\"\n");
      out.write("                  aria-hidden=\"true\"\n");
      out.write("                  fill=\"currentColor\"\n");
      out.write("                  viewBox=\"0 0 20 20\"\n");
      out.write("                >\n");
      out.write("                  <path\n");
      out.write("                    fill-rule=\"evenodd\"\n");
      out.write("                    d=\"M5.293 7.293a1 1 0 011.414 0L10 10.586l3.293-3.293a1 1 0 111.414 1.414l-4 4a1 1 0 01-1.414 0l-4-4a1 1 0 010-1.414z\"\n");
      out.write("                    clip-rule=\"evenodd\"\n");
      out.write("                  ></path>\n");
      out.write("                </svg>\n");
      out.write("              </button>\n");
      out.write("              <template x-if=\"isPagesMenuOpen\">\n");
      out.write("                <ul\n");
      out.write("                  x-transition:enter=\"transition-all ease-in-out duration-300\"\n");
      out.write("                  x-transition:enter-start=\"opacity-25 max-h-0\"\n");
      out.write("                  x-transition:enter-end=\"opacity-100 max-h-xl\"\n");
      out.write("                  x-transition:leave=\"transition-all ease-in-out duration-300\"\n");
      out.write("                  x-transition:leave-start=\"opacity-100 max-h-xl\"\n");
      out.write("                  x-transition:leave-end=\"opacity-0 max-h-0\"\n");
      out.write("                  class=\"p-2 mt-2 space-y-2 overflow-hidden text-sm font-medium text-gray-500 rounded-md shadow-inner bg-gray-50 dark:text-gray-400 dark:bg-gray-900\"\n");
      out.write("                  aria-label=\"submenu\"\n");
      out.write("                >\n");
      out.write("                  <li\n");
      out.write("                    class=\"px-2 py-1 transition-colors duration-150 hover:text-gray-800 dark:hover:text-gray-200\"\n");
      out.write("                  >\n");
      out.write("                    <a class=\"w-full\" href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (jakarta.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("/trainer\">List trainers</a>\n");
      out.write("                  </li>\n");
      out.write("                  <li\n");
      out.write("                    class=\"px-2 py-1 transition-colors duration-150 hover:text-gray-800 dark:hover:text-gray-200\"\n");
      out.write("                  >\n");
      out.write("                    <a class=\"w-full\" href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (jakarta.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("/trainer/create\">\n");
      out.write("                      Create new trainer\n");
      out.write("                    </a>\n");
      out.write("                  </li>\n");
      out.write("                </ul>\n");
      out.write("              </template>\n");
      out.write("            </li>\n");
      out.write("\n");
      out.write("            <li class=\"relative px-6 py-3\">\n");
      out.write("              <button\n");
      out.write("                class=\"inline-flex items-center justify-between w-full text-sm font-semibold transition-colors duration-150 hover:text-gray-800 dark:hover:text-gray-200\"\n");
      out.write("                @click=\"togglePagesMenu\"\n");
      out.write("                aria-haspopup=\"true\"\n");
      out.write("              >\n");
      out.write("                <span class=\"inline-flex items-center\">\n");
      out.write("                  <svg\n");
      out.write("                    class=\"w-5 h-5\"\n");
      out.write("                    aria-hidden=\"true\"\n");
      out.write("                    fill=\"none\"\n");
      out.write("                    stroke-linecap=\"round\"\n");
      out.write("                    stroke-linejoin=\"round\"\n");
      out.write("                    stroke-width=\"2\"\n");
      out.write("                    viewBox=\"0 0 24 24\"\n");
      out.write("                    stroke=\"currentColor\"\n");
      out.write("                  >\n");
      out.write("                    <path\n");
      out.write("                      d=\"M4 5a1 1 0 011-1h14a1 1 0 011 1v2a1 1 0 01-1 1H5a1 1 0 01-1-1V5zM4 13a1 1 0 011-1h6a1 1 0 011 1v6a1 1 0 01-1 1H5a1 1 0 01-1-1v-6zM16 13a1 1 0 011-1h2a1 1 0 011 1v6a1 1 0 01-1 1h-2a1 1 0 01-1-1v-6z\"\n");
      out.write("                    ></path>\n");
      out.write("                  </svg>\n");
      out.write("                  <span class=\"ml-4\">Members</span>\n");
      out.write("                </span>\n");
      out.write("                <svg\n");
      out.write("                  class=\"w-4 h-4\"\n");
      out.write("                  aria-hidden=\"true\"\n");
      out.write("                  fill=\"currentColor\"\n");
      out.write("                  viewBox=\"0 0 20 20\"\n");
      out.write("                >\n");
      out.write("                  <path\n");
      out.write("                    fill-rule=\"evenodd\"\n");
      out.write("                    d=\"M5.293 7.293a1 1 0 011.414 0L10 10.586l3.293-3.293a1 1 0 111.414 1.414l-4 4a1 1 0 01-1.414 0l-4-4a1 1 0 010-1.414z\"\n");
      out.write("                    clip-rule=\"evenodd\"\n");
      out.write("                  ></path>\n");
      out.write("                </svg>\n");
      out.write("              </button>\n");
      out.write("              <template x-if=\"isPagesMenuOpen\">\n");
      out.write("                <ul\n");
      out.write("                  x-transition:enter=\"transition-all ease-in-out duration-300\"\n");
      out.write("                  x-transition:enter-start=\"opacity-25 max-h-0\"\n");
      out.write("                  x-transition:enter-end=\"opacity-100 max-h-xl\"\n");
      out.write("                  x-transition:leave=\"transition-all ease-in-out duration-300\"\n");
      out.write("                  x-transition:leave-start=\"opacity-100 max-h-xl\"\n");
      out.write("                  x-transition:leave-end=\"opacity-0 max-h-0\"\n");
      out.write("                  class=\"p-2 mt-2 space-y-2 overflow-hidden text-sm font-medium text-gray-500 rounded-md shadow-inner bg-gray-50 dark:text-gray-400 dark:bg-gray-900\"\n");
      out.write("                  aria-label=\"submenu\"\n");
      out.write("                >\n");
      out.write("                  <li\n");
      out.write("                    class=\"px-2 py-1 transition-colors duration-150 hover:text-gray-800 dark:hover:text-gray-200\"\n");
      out.write("                  >\n");
      out.write("                    <a class=\"w-full\" href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (jakarta.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("/member\">List members</a>\n");
      out.write("                  </li>\n");
      out.write("                  <li\n");
      out.write("                    class=\"px-2 py-1 transition-colors duration-150 hover:text-gray-800 dark:hover:text-gray-200\"\n");
      out.write("                  >\n");
      out.write("                    <a class=\"w-full\" href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (jakarta.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("/member/create\">\n");
      out.write("                      Create new member\n");
      out.write("                    </a>\n");
      out.write("                  </li>\n");
      out.write("                </ul>\n");
      out.write("              </template>\n");
      out.write("            </li>\n");
      out.write("            <li class=\"relative px-6 py-3\">\n");
      out.write("              <a\n");
      out.write("                class=\"inline-flex items-center w-full text-sm font-semibold transition-colors duration-150 hover:text-gray-800 dark:hover:text-gray-200\"\n");
      out.write("              >\n");
      out.write("                <svg\n");
      out.write("                  class=\"w-5 h-5\"\n");
      out.write("                  aria-hidden=\"true\"\n");
      out.write("                  fill=\"none\"\n");
      out.write("                  stroke-linecap=\"round\"\n");
      out.write("                  stroke-linejoin=\"round\"\n");
      out.write("                  stroke-width=\"2\"\n");
      out.write("                  viewBox=\"0 0 24 24\"\n");
      out.write("                  stroke=\"currentColor\"\n");
      out.write("                >\n");
      out.write("                  <path\n");
      out.write("                    d=\"M8 16H6a2 2 0 01-2-2V6a2 2 0 012-2h8a2 2 0 012 2v2m-6 12h8a2 2 0 002-2v-8a2 2 0 00-2-2h-8a2 2 0 00-2 2v8a2 2 0 002 2z\"\n");
      out.write("                  ></path>\n");
      out.write("                </svg>\n");
      out.write("                <span class=\"ml-4\">Sessions</span>\n");
      out.write("              </a>\n");
      out.write("            </li>\n");
      out.write("\n");
      out.write("            <li class=\"relative px-6 py-3\">\n");
      out.write("              <button\n");
      out.write("                class=\"inline-flex items-center justify-between w-full text-sm font-semibold transition-colors duration-150 hover:text-gray-800 dark:hover:text-gray-200\"\n");
      out.write("                @click=\"togglePagesMenu\"\n");
      out.write("                aria-haspopup=\"true\"\n");
      out.write("              >\n");
      out.write("                <span class=\"inline-flex items-center\">\n");
      out.write("                  <svg\n");
      out.write("                    class=\"w-5 h-5\"\n");
      out.write("                    aria-hidden=\"true\"\n");
      out.write("                    fill=\"none\"\n");
      out.write("                    stroke-linecap=\"round\"\n");
      out.write("                    stroke-linejoin=\"round\"\n");
      out.write("                    stroke-width=\"2\"\n");
      out.write("                    viewBox=\"0 0 24 24\"\n");
      out.write("                    stroke=\"currentColor\"\n");
      out.write("                  >\n");
      out.write("                    <path\n");
      out.write("                      d=\"M4 5a1 1 0 011-1h14a1 1 0 011 1v2a1 1 0 01-1 1H5a1 1 0 01-1-1V5zM4 13a1 1 0 011-1h6a1 1 0 011 1v6a1 1 0 01-1 1H5a1 1 0 01-1-1v-6zM16 13a1 1 0 011-1h2a1 1 0 011 1v6a1 1 0 01-1 1h-2a1 1 0 01-1-1v-6z\"\n");
      out.write("                    ></path>\n");
      out.write("                  </svg>\n");
      out.write("                  <span class=\"ml-4\">Pages</span>\n");
      out.write("                </span>\n");
      out.write("                <svg\n");
      out.write("                  class=\"w-4 h-4\"\n");
      out.write("                  aria-hidden=\"true\"\n");
      out.write("                  fill=\"currentColor\"\n");
      out.write("                  viewBox=\"0 0 20 20\"\n");
      out.write("                >\n");
      out.write("                  <path\n");
      out.write("                    fill-rule=\"evenodd\"\n");
      out.write("                    d=\"M5.293 7.293a1 1 0 011.414 0L10 10.586l3.293-3.293a1 1 0 111.414 1.414l-4 4a1 1 0 01-1.414 0l-4-4a1 1 0 010-1.414z\"\n");
      out.write("                    clip-rule=\"evenodd\"\n");
      out.write("                  ></path>\n");
      out.write("                </svg>\n");
      out.write("              </button>\n");
      out.write("              <template x-if=\"isPagesMenuOpen\">\n");
      out.write("                <ul\n");
      out.write("                  x-transition:enter=\"transition-all ease-in-out duration-300\"\n");
      out.write("                  x-transition:enter-start=\"opacity-25 max-h-0\"\n");
      out.write("                  x-transition:enter-end=\"opacity-100 max-h-xl\"\n");
      out.write("                  x-transition:leave=\"transition-all ease-in-out duration-300\"\n");
      out.write("                  x-transition:leave-start=\"opacity-100 max-h-xl\"\n");
      out.write("                  x-transition:leave-end=\"opacity-0 max-h-0\"\n");
      out.write("                  class=\"p-2 mt-2 space-y-2 overflow-hidden text-sm font-medium text-gray-500 rounded-md shadow-inner bg-gray-50 dark:text-gray-400 dark:bg-gray-900\"\n");
      out.write("                  aria-label=\"submenu\"\n");
      out.write("                >\n");
      out.write("                  <li\n");
      out.write("                    class=\"px-2 py-1 transition-colors duration-150 hover:text-gray-800 dark:hover:text-gray-200\"\n");
      out.write("                  >\n");
      out.write("                    <a class=\"w-full\" href=\"../user/dashboard.jsp\">Login</a>\n");
      out.write("                  </li>\n");
      out.write("                  <li\n");
      out.write("                    class=\"px-2 py-1 transition-colors duration-150 hover:text-gray-800 dark:hover:text-gray-200\">\n");
      out.write("                    <a class=\"w-full\" href=\"href=");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (jakarta.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("/user/dashboard\">\n");
      out.write("                      Create account\n");
      out.write("                    </a>\n");
      out.write("                  </li>\n");
      out.write("                </ul>\n");
      out.write("              </template>\n");
      out.write("            </li>\n");
      out.write("          </ul>\n");
      out.write("          <div class=\"px-6 my-6\">\n");
      out.write("            <button\n");
      out.write("              class=\"flex items-center justify-between w-full px-4 py-2 text-sm font-medium leading-5 text-white transition-colors duration-150 bg-purple-600 border border-transparent rounded-lg active:bg-purple-600 hover:bg-purple-700 focus:outline-none focus:shadow-outline-purple\"\n");
      out.write("            >\n");
      out.write("\n");
      out.write("              <a class=\"w-full\" href=\"../auth/register.jsp\">\n");
      out.write("                Create account\n");
      out.write("              </a>              <span class=\"ml-2\" aria-hidden=\"true\">+</span>\n");
      out.write("            </button>\n");
      out.write("          </div>\n");
      out.write("        </div>\n");
      out.write("      </aside>\n");
      out.write("      <!-- Mobile sidebar -->\n");
      out.write("      <!-- Backdrop -->\n");
      out.write("      <div\n");
      out.write("        x-show=\"isSideMenuOpen\"\n");
      out.write("        x-transition:enter=\"transition ease-in-out duration-150\"\n");
      out.write("        x-transition:enter-start=\"opacity-0\"\n");
      out.write("        x-transition:enter-end=\"opacity-100\"\n");
      out.write("        x-transition:leave=\"transition ease-in-out duration-150\"\n");
      out.write("        x-transition:leave-start=\"opacity-100\"\n");
      out.write("        x-transition:leave-end=\"opacity-0\"\n");
      out.write("        class=\"fixed inset-0 z-10 flex items-end bg-black bg-opacity-50 sm:items-center sm:justify-center\"\n");
      out.write("      ></div>\n");
      out.write("      <aside\n");
      out.write("        class=\"fixed inset-y-0 z-20 flex-shrink-0 w-64 mt-16 overflow-y-auto bg-white dark:bg-gray-800 md:hidden\"\n");
      out.write("        x-show=\"isSideMenuOpen\"\n");
      out.write("        x-transition:enter=\"transition ease-in-out duration-150\"\n");
      out.write("        x-transition:enter-start=\"opacity-0 transform -translate-x-20\"\n");
      out.write("        x-transition:enter-end=\"opacity-100\"\n");
      out.write("        x-transition:leave=\"transition ease-in-out duration-150\"\n");
      out.write("        x-transition:leave-start=\"opacity-100\"\n");
      out.write("        x-transition:leave-end=\"opacity-0 transform -translate-x-20\"\n");
      out.write("        @click.away=\"closeSideMenu\"\n");
      out.write("        @keydown.escape=\"closeSideMenu\"\n");
      out.write("      >\n");
      out.write("        <div class=\"py-4 text-gray-500 dark:text-gray-400\">\n");
      out.write("          <a\n");
      out.write("            class=\"ml-6 text-lg font-bold text-gray-800 dark:text-gray-200\"\n");
      out.write("            href=\"#\"\n");
      out.write("          >\n");
      out.write("            Windmill\n");
      out.write("          </a>\n");
      out.write("          <ul class=\"mt-6\">\n");
      out.write("            <li class=\"relative px-6 py-3\">\n");
      out.write("              <span\n");
      out.write("                class=\"absolute inset-y-0 left-0 w-1 bg-purple-600 rounded-tr-lg rounded-br-lg\"\n");
      out.write("                aria-hidden=\"true\"\n");
      out.write("              ></span>\n");
      out.write("              <a\n");
      out.write("                class=\"inline-flex items-center w-full text-sm font-semibold text-gray-800 transition-colors duration-150 hover:text-gray-800 dark:hover:text-gray-200 dark:text-gray-100\"\n");
      out.write("                href=\"index.html\"\n");
      out.write("              >\n");
      out.write("                <svg\n");
      out.write("                  class=\"w-5 h-5\"\n");
      out.write("                  aria-hidden=\"true\"\n");
      out.write("                  fill=\"none\"\n");
      out.write("                  stroke-linecap=\"round\"\n");
      out.write("                  stroke-linejoin=\"round\"\n");
      out.write("                  stroke-width=\"2\"\n");
      out.write("                  viewBox=\"0 0 24 24\"\n");
      out.write("                  stroke=\"currentColor\"\n");
      out.write("                >\n");
      out.write("                  <path\n");
      out.write("                    d=\"M3 12l2-2m0 0l7-7 7 7M5 10v10a1 1 0 001 1h3m10-11l2 2m-2-2v10a1 1 0 01-1 1h-3m-6 0a1 1 0 001-1v-4a1 1 0 011-1h2a1 1 0 011 1v4a1 1 0 001 1m-6 0h6\"\n");
      out.write("                  ></path>\n");
      out.write("                </svg>\n");
      out.write("                <span class=\"ml-4\">Dashboard</span>\n");
      out.write("              </a>\n");
      out.write("            </li>\n");
      out.write("          </ul>\n");
      out.write("          <ul>\n");
      out.write("\n");
      out.write("            <li class=\"relative px-6 py-3\">\n");
      out.write("              <button\n");
      out.write("                class=\"inline-flex items-center justify-between w-full text-sm font-semibold transition-colors duration-150 hover:text-gray-800 dark:hover:text-gray-200\"\n");
      out.write("                @click=\"togglePagesMenu\"\n");
      out.write("                aria-haspopup=\"true\"\n");
      out.write("              >\n");
      out.write("                <span class=\"inline-flex items-center\">\n");
      out.write("                  <svg\n");
      out.write("                    class=\"w-5 h-5\"\n");
      out.write("                    aria-hidden=\"true\"\n");
      out.write("                    fill=\"none\"\n");
      out.write("                    stroke-linecap=\"round\"\n");
      out.write("                    stroke-linejoin=\"round\"\n");
      out.write("                    stroke-width=\"2\"\n");
      out.write("                    viewBox=\"0 0 24 24\"\n");
      out.write("                    stroke=\"currentColor\"\n");
      out.write("                  >\n");
      out.write("                    <path\n");
      out.write("                      d=\"M4 5a1 1 0 011-1h14a1 1 0 011 1v2a1 1 0 01-1 1H5a1 1 0 01-1-1V5zM4 13a1 1 0 011-1h6a1 1 0 011 1v6a1 1 0 01-1 1H5a1 1 0 01-1-1v-6zM16 13a1 1 0 011-1h2a1 1 0 011 1v6a1 1 0 01-1 1h-2a1 1 0 01-1-1v-6z\"\n");
      out.write("                    ></path>\n");
      out.write("                  </svg>\n");
      out.write("                  <span class=\"ml-4\">Pages</span>\n");
      out.write("                </span>\n");
      out.write("                <svg\n");
      out.write("                  class=\"w-4 h-4\"\n");
      out.write("                  aria-hidden=\"true\"\n");
      out.write("                  fill=\"currentColor\"\n");
      out.write("                  viewBox=\"0 0 20 20\"\n");
      out.write("                >\n");
      out.write("                  <path\n");
      out.write("                    fill-rule=\"evenodd\"\n");
      out.write("                    d=\"M5.293 7.293a1 1 0 011.414 0L10 10.586l3.293-3.293a1 1 0 111.414 1.414l-4 4a1 1 0 01-1.414 0l-4-4a1 1 0 010-1.414z\"\n");
      out.write("                    clip-rule=\"evenodd\"\n");
      out.write("                  ></path>\n");
      out.write("                </svg>\n");
      out.write("              </button>\n");
      out.write("              <template x-if=\"isPagesMenuOpen\">\n");
      out.write("                <ul\n");
      out.write("                  x-transition:enter=\"transition-all ease-in-out duration-300\"\n");
      out.write("                  x-transition:enter-start=\"opacity-25 max-h-0\"\n");
      out.write("                  x-transition:enter-end=\"opacity-100 max-h-xl\"\n");
      out.write("                  x-transition:leave=\"transition-all ease-in-out duration-300\"\n");
      out.write("                  x-transition:leave-start=\"opacity-100 max-h-xl\"\n");
      out.write("                  x-transition:leave-end=\"opacity-0 max-h-0\"\n");
      out.write("                  class=\"p-2 mt-2 space-y-2 overflow-hidden text-sm font-medium text-gray-500 rounded-md shadow-inner bg-gray-50 dark:text-gray-400 dark:bg-gray-900\"\n");
      out.write("                  aria-label=\"submenu\"\n");
      out.write("                >\n");
      out.write("                  <li\n");
      out.write("                    class=\"px-2 py-1 transition-colors duration-150 hover:text-gray-800 dark:hover:text-gray-200\"\n");
      out.write("                  >\n");
      out.write("                    <a class=\"w-full\" href=\"pages/login.html\">Login</a>\n");
      out.write("                  </li>\n");
      out.write("                  <li\n");
      out.write("                    class=\"px-2 py-1 transition-colors duration-150 hover:text-gray-800 dark:hover:text-gray-200\"\n");
      out.write("                  >\n");
      out.write("                    <a class=\"w-full\" href=\"pages/create-account.html\">\n");
      out.write("                      Create account\n");
      out.write("                    </a>\n");
      out.write("                  </li>\n");
      out.write("                </ul>\n");
      out.write("              </template>\n");
      out.write("            </li>\n");
      out.write("          </ul>\n");
      out.write("          <div class=\"px-6 my-6\">\n");
      out.write("            <button\n");
      out.write("              class=\"flex items-center justify-between px-4 py-2 text-sm font-medium leading-5 text-white transition-colors duration-150 bg-purple-600 border border-transparent rounded-lg active:bg-purple-600 hover:bg-purple-700 focus:outline-none focus:shadow-outline-purple\">\n");
      out.write("              Create account\n");
      out.write("              <span class=\"ml-2\" aria-hidden=\"true\">+</span>\n");
      out.write("            </button>\n");
      out.write("          </div>\n");
      out.write("        </div>\n");
      out.write("      </aside>");
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
