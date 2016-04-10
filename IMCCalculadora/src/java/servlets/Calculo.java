/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servlets;

import calculos.RealizarCalculos;
import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author 15606574-9
 */
public class Calculo extends HttpServlet 
{
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
        procesarPeticion(request, response);
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
        procesarPeticion(request, response);
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

    private void procesarPeticion(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
    {
        String altura = request.getParameter("altura");
        String peso = request.getParameter("peso");
        
        int valorAlturaCM = Integer.parseInt(altura);
        double valorAltura = valorAlturaCM/100.0;
        
        int valorPeso = Integer.parseInt(peso);
        
        RealizarCalculos rc = new RealizarCalculos();
        double imc = rc.calcularIMC(valorAltura, valorPeso);
        String clasificacion = rc.obtenerClasificacion(valorAltura, valorPeso);
        
        request.setAttribute("imc", imc);
        request.setAttribute("clasificacion", clasificacion);
        
        request.getRequestDispatcher("/calculo.jsp").forward(request, response);
        
        System.out.println(altura + " " + peso);
    }

}
