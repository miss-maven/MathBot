/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */
package com.mathbot.controller;

import com.mathbot.model.UsersModel;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Maven
 */
public class HomeServlet extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
    String uri = request.getRequestURI();
    System.out.println(uri); //make switch
    if (uri.equals("/main-page")) {
       List<UsersModel> users = new ArrayList<>();
       users.add(new UsersModel("Student", "freddycharizard@realemails.com"));
       users.add(new UsersModel("Teacher", "smartypants@realemails.com"));
       users.add(new UsersModel("Parent", "thatsmydad@realemails.com"));
       request.setAttribute("users", users);
       request.setAttribute("WelcomeMessage", "Howdy user");
       request.getRequestDispatcher("/WEB-INF/view/main-page.jsp").forward(request, response);
}
    else if (uri.equals("/register")){
       String method = request.getMethod();
       System.out.println(method);
       if (method.equals("GET")){
       request.getRequestDispatcher("/WEB-INF/view/register.jsp").forward(request, response);
}
       else {
            //process register logic here
        String email = request.getParameter("email");
        String password = request.getParameter("password");
       // String name = request.getParameter("name");
        

}
}

    else {
       request.getRequestDispatcher("/WEB-INF/view/index.jsp").forward(request, response);
}

//   request.getRequestDispatcher("/WEB-INF/view/index.jsp").forward(request, response);
//        response.setContentType("text/html;charset=UTF-8");
//        try (PrintWriter out = response.getWriter()) {
//            /* TODO output your page here. You may use following sample code. */
//            out.println("<!DOCTYPE html>");
//            out.println("<html>");
//            out.println("<head>");
//            out.println("<title>Servlet HomeServlet</title>");            
//            out.println("</head>");
//            out.println("<body>");
//            out.println("<h1>Welcome to MathBot!!!" + request.getContextPath() + "</h1>");
//            out.println("</body>");
//            out.println("</html>");
        
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
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
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
