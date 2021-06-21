package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class index_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

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
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("<!doctype html>\n");
      out.write("\n");
      out.write("<html lang=\"en\">\n");
      out.write("<head>\n");
      out.write("    <!-- Required meta tags -->\n");
      out.write("    <meta charset=\"utf-8\">\n");
      out.write("    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1, shrink-to-fit=no\">\n");
      out.write("\n");
      out.write("    <!-- awesone fonts css-->\n");
      out.write("    <link href=\"css/font-awesome.css\" rel=\"stylesheet\" type=\"text/css\">\n");
      out.write("    <!-- owl carousel css-->\n");
      out.write("    <link rel=\"stylesheet\" href=\"owl-carousel/assets/owl.carousel.min.css\" type=\"text/css\">\n");
      out.write("    <!-- Bootstrap CSS -->\n");
      out.write("    <link rel=\"stylesheet\" href=\"css/bootstrap.min.css\">\n");
      out.write("    <!-- custom CSS -->\n");
      out.write("    <link rel=\"stylesheet\" href=\"css/style.css\">\n");
      out.write("    <title>Final</title>\n");
      out.write("    <style>\n");
      out.write("\n");
      out.write("    </style>\n");
      out.write("</head>\n");
      out.write("<body>\n");
      out.write("<nav class=\"navbar navbar-expand-lg navbar-light bg-light bg-transparent\" id=\"gtco-main-nav\">\n");
      out.write("    <div class=\"container\"><a class=\"navbar-brand\">HDFC</a>\n");
      out.write("        <button class=\"navbar-toggler\" data-target=\"#my-nav\" onclick=\"myFunction(this)\" data-toggle=\"collapse\"><span\n");
      out.write("                class=\"bar1\"></span> <span class=\"bar2\"></span> <span class=\"bar3\"></span></button>\n");
      out.write("        <div id=\"my-nav\" class=\"collapse navbar-collapse\">\n");
      out.write("            <ul class=\"navbar-nav mr-auto\">\n");
      out.write("                <li class=\"nav-item\"><a class=\"nav-link\" href=\"index.jsp\">Home</a></li>\n");
      out.write("                <li class=\"nav-item\"><a class=\"nav-link\" href=\"service.html\">Services</a></li>\n");
      out.write("                <li class=\"nav-item\"><a class=\"nav-link\" href=\"about.html\">About Us</a></li>\n");
      out.write("                                <li class=\"nav-item\"><a class=\"nav-link\" href=\"contact.html\">Contact</a></li>\n");
      out.write("\n");
      out.write("            </ul>\n");
      out.write("           \n");
      out.write("        </div>\n");
      out.write("    </div>\n");
      out.write("</nav>\n");
      out.write("<div class=\"container-fluid gtco-banner-area\">\n");
      out.write("    <div class=\"container\">\n");
      out.write("        <div class=\"row\">\n");
      out.write("            <div class=\"col-md-6\">\n");
      out.write("\n");
      out.write("                <h1 class=\"word\">  <span></span> </h1>\n");
      out.write("                <p> Lorem ipsum dolor sit amet, consectetur adipiscing elit. In rhoncus turpis nisl.  Lorem ipsum dolor sit amet, consectetur adipiscing elit. In rhoncus turpis nisl. Lorem ipsum dolor sit amet, consectetur adipiscing elit. In rhoncus turpis nisl.</p>\n");
      out.write("                <a href=\"services.html\" class=\"button\">Learn More</a></div>\n");
      out.write("            <div class=\"col-md-6\">\n");
      out.write("                <div class=\"card\"><img class=\"card-img-top img-fluid\" src=\"images/bgg.png\" alt=\"\"><img class=\"card-img-top img-fluid\" src=\"images/bg1.png\" alt=\"\"></div>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("    </div>\n");
      out.write("</div>\n");
      out.write("\n");
      out.write("\n");
      out.write("<!-- Optional JavaScript -->\n");
      out.write("<!-- jQuery first, then Popper.js, then Bootstrap JS -->\n");
      out.write("<script src=\"js/jquery-3.3.1.slim.min.js\"></script>\n");
      out.write("<script src=\"js/popper.min.js\"></script>\n");
      out.write("<script src=\"js/bootstrap.min.js\"></script>\n");
      out.write("<!-- owl carousel js-->\n");
      out.write("<script src=\"owl-carousel/owl.carousel.min.js\"></script>\n");
      out.write("<script src=\"js/main.js\"></script>\n");
      out.write("<script src=\"js/word.js\"></script>\n");
      out.write("\n");
      out.write("</body>\n");
      out.write("</html>\n");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
