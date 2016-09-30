<%-- 
    Document   : _TEMPLATE
    Created on : 28 sept. 2016, 16:09:18
    Author     : admin
--%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <c:import url="_HEAD.jsp"/>
    </head>
    <body>
        
        
        
        <div class="menu">
           
            <c:import url="_MENU.jsp"/>
                     
        </div>
        
        
        
        <div class="titre">
           
            
        </div>
        
        <div class="contenu">
           
            <c:forEach items="${mesFilms}" var="monFilm">  
                
            
                ${monFilm.titre} <a href="supprimer_film?id=${monFilm.id}">Supprimer</a>   
                <br>
            </c:forEach>
        </div>
        
        <div class="pied">
          
            <c:import url="_PIED.jsp"/>
            
        </div>
        
        
    </body>
</html>
