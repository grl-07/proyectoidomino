package presentacion;


import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import logica.*;


@WebServlet(name="Reporte", urlPatterns={"/Reporte"}) 
public class Reporte extends HttpServlet {  
   
    /** 
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code> methods.
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
    
    {
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter(); // estoy creando un objeto para el formato de salida(flujo de salida)

        Datos.inicializarListasDeDatos(); 
        Comunicacion.solicitarCargaDeDatos(); 

        try
        {

            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet Prueba</title>");
            out.println("</head>");
            out.println("<body>");
            Comunicacion.solicitarImpresionUsuariosJSP(out); 
            out.println("</body>");
            out.println("</html>");

        } finally
        {
            out.close(); 
        }
    } 
   
    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /** 
     * Handles the HTTP <code>GET</code> method.
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) //es una clase abstracta, por eso el circulio verde
    throws ServletException, IOException {
        processRequest(request, response);
    } 

    /** 
     * Handles the HTTP <code>POST</code> method.
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
    throws ServletException, IOException {
        processRequest(request, response);
    }

    /** 
     * Returns a short description of the servlet.
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
