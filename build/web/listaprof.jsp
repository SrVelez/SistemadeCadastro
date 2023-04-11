<%@page import="br.com.controle.Professor"%>
<%@page import="br.com.modelo.ManterProfessor"%>
<%@page import="java.util.ArrayList"%>
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
   </div>
        <table class="table table-striped">
  <thead>
    <tr>
      <th scope="col">Codigo</th>
      <th scope="col">Nome</th>
      <th scope="col">E-mail</th>
      <th scope="col">Contato</th>
      <th scope="col"></th>
      <th scope="col"></th>
    </tr>
  </thead>
  
  
        <%
          String vcodigo="";
          String vnome="";
          String vemail="";
          String vcontato="";
          String vcontador="";
          //String ac = (String) request.getAttribute("relatorio");
         
           ManterProfessor dao = new ManterProfessor();
           Professor pr = new Professor();
             ArrayList<Professor> nt = dao.pesquisarTudo();  
             
            for (int i = 0; i < nt.size(); i++) {                
                pr = nt.get(i);
              vcodigo= String.valueOf(pr.getCodigo());
              vnome = String.valueOf(pr.getNome());
              vemail = String.valueOf(pr.getEmail());
              vcontato = String.valueOf(pr.getContato());
             
               %>
              
            <tr>
              <th scope="row"><%=vcodigo%></th>
              <td><%=vnome%></td>
              <td><%=vemail%></td>
              <td><%=vcontato%></td>
           
            
              <td><a href="editar?codigo=<%=vcodigo%>" >Alterar</a></td>
              <td>
                   <a href="del?codigo=<%=vcodigo%>" onclick="return confirm('Confirma exclusão do registro <%=vnome%>?')">excluir </a>   
                 
              </td>
            </tr>
          
            <%} 
        %>
         
        </table>
</html>
