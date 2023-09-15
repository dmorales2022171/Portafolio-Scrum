package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class Programadores_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html lang=\"es\">\n");
      out.write("<head>\n");
      out.write("    <meta charset=\"UTF-8\">\n");
      out.write("    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\n");
      out.write("    <title>Galería de Imágenes</title>\n");
      out.write("    <style>\n");
      out.write("        .galeria {\n");
      out.write("            display: flex;\n");
      out.write("            align-items: center;\n");
      out.write("            justify-content: center;\n");
      out.write("            text-align: center;\n");
      out.write("            height: 100vh;\n");
      out.write("        }\n");
      out.write("        .imagen-galeria {\n");
      out.write("            max-width: 100%;\n");
      out.write("            max-height: 300px;\n");
      out.write("            transition: opacity 0.5s;\n");
      out.write("        }\n");
      out.write("        .controles {\n");
      out.write("            display: flex;\n");
      out.write("            align-items: center;\n");
      out.write("            margin-top: 10px;\n");
      out.write("        }\n");
      out.write("        .boton {\n");
      out.write("            cursor: pointer;\n");
      out.write("            font-size: 24px;\n");
      out.write("            border: none;\n");
      out.write("            background: none;\n");
      out.write("            outline: none;\n");
      out.write("        }\n");
      out.write("        .titulo {\n");
      out.write("            margin-top: 10px;\n");
      out.write("        }\n");
      out.write("    </style>\n");
      out.write("</head>\n");
      out.write("<body style=\"background-image: url('img/fondoAdm.png'); background-size: cover; background-repeat: no-repeat;\">\n");
      out.write("    <div class=\"galeria\">\n");
      out.write("        <button class=\"boton\" onclick=\"cambiarImagen(-1)\">❮</button>\n");
      out.write("        <div>\n");
      out.write("            <img class=\"imagen-galeria\" id=\"imagenActual\" src=\"img/programers.jpg\" >\n");
      out.write("            \n");
      out.write("            <h2 id=\"tituloImagen\" class=\"titulo\">Programadores</h2>\n");
      out.write("        </div>\n");
      out.write("        <button class=\"boton\" onclick=\"cambiarImagen(1)\">❯</button>\n");
      out.write("    </div>\n");
      out.write("\n");
      out.write("    <script>\n");
      out.write("        var imagenes = ['img/luismichu.png', 'img/quezada.png', 'img/Jimenez.png', 'img/adolfo.jpg', 'img/Palma.jpeg', 'img/carlos.jpeg', 'img/Sebastian.jpeg','img/brandon.jpeg', 'img/McLovin.jpg', 'img/quiyuch.png', 'img/herlin.jpeg'];\n");
      out.write("        var titulos = ['Luis Monterroso', 'Josue Quezada', 'José Jiménez', 'Adolfo Gregorio', 'Angello javier', 'Carlos Juarez', 'Sebastian Ramirez', 'Brandon Gomez', 'Diego Morales', 'Luis Fernando', 'Herlin Gomez'];\n");
      out.write("        var imagenActual = 0;\n");
      out.write("\n");
      out.write("        function cambiarImagen(direccion) {\n");
      out.write("            imagenActual += direccion;\n");
      out.write("            if (imagenActual < 0) imagenActual = imagenes.length - 1;\n");
      out.write("            if (imagenActual >= imagenes.length) imagenActual = 0;\n");
      out.write("\n");
      out.write("            var imagen = document.getElementById('imagenActual');\n");
      out.write("            imagen.src = imagenes[imagenActual];\n");
      out.write("\n");
      out.write("            var titulo = document.getElementById('tituloImagen');\n");
      out.write("            titulo.innerText = titulos[imagenActual];\n");
      out.write("        }\n");
      out.write("    </script>\n");
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
