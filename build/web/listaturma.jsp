<%-- 
    Document   : listaturma
    Created on : 22/10/2022, 10:27:22
    Author     : arTTh
--%>

<%@page import="java.util.ArrayList"%>
<%@page import="br.com.controle.Turma"%>
<%@page import="br.com.modelo.Manterturma"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title></title>
        <!-- Linha para utilizar o bootstrap -->
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/css/bootstrap.min.css" integrity="sha384-1q8mTJOASx8j1Au+a5WDVnPi2lkFfwwEAa8hDDdjZlpLegxhjVME1fgjWPGmkzs7" crossorigin="anonymous">
        <!-- Linha para utilizar o JavaScript -->
       <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/js/bootstrap.min.js" integrity="sha384-0mSbJDEHialfmuBBQP6A4Qrprq5OVfW37PRR3j5ELqxss1yVqOtnepnHVP9aJ7xS" crossorigin="anonymous"></script>
       
        </head>
    <body>
        <%@include file="menu.jsp" %>
        <%@include file="listaturma.jsp" %>

        <table class="table table-striped">
  <thead>
    <tr>
      <th scope="col">Codigo</th>
      <th scope="col">Turma</th>
      <th scope="col">Horario</th>
      <th scope="col"></th>
      <th scope="col"></th>
    </tr>
  </thead>
  
  
        <%
          String vcodigo="";
          String vnometurma="";
          String vhorario="";
          String vcontador="";
          //String ac = (String) request.getAttribute("relatorio");
         
           Manterturma mt = new Manterturma();
           Turma t = new Turma();
             ArrayList<Turma> nt = mt.pesquisarTudo();  
             
            for (int i = 0; i < nt.size(); i++) {                
                t = nt.get(i);
              vcodigo= String.valueOf(t.getCodigo());
              vnometurma = String.valueOf(t.getNometurma());
              vhorario = String.valueOf(t.getHorario());
             
               %>
              
            <tr>
              <th scope="row"><%=vcodigo%></th>
              <td><%=vnometurma%></td>
              <td><%=vhorario%></td>
           
            
              <td><a href="editar?codigo=<%=vcodigo%>" >Alterar</a></td>
              <td>
                   <a href="del?codigo=<%=vcodigo%>" onclick="return confirm('Confirma exclusão do registro <%=vnometurma%>?')">excluir </a>   
                 
              </td>
            </tr>
          
            <%} 
        %>
         
        </table>
</html>
