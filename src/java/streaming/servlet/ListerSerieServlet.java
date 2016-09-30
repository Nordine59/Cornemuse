/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package streaming.servlet;

import java.io.IOException;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import streaming.entity.Serie;
import streaming.service.SerieService;

/**
 *
 * @author admin
 */
@WebServlet(name = "ListerSerieServlet", urlPatterns = {"/lister_serie"})
public class ListerSerieServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        
        
        List<Serie> series = new SerieService().lister();
       
       req.setAttribute("titre", "TEST LISTE SERIES");
       req.setAttribute("mesSeries", series);
       req.setAttribute("Nordine", "NORDINE Copyright 2016");
       req.getRequestDispatcher("lister_serie.jsp").forward(req, resp);
       
    
}   
    
}