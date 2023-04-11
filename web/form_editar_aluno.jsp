<%-- 
    Document   : form_editar_aluno
    Created on : 21/10/2022, 15:11:23
    Author     : note
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <%  
        String vcodigo="";
        String vnome="";
        String vemail="";
       
         vcodigo = (String) request.getAttribute("aCodigo").toString();
         vnome    = (String) request.getAttribute("atNome").toString();
         vemail    = (String) request.getAttribute("aEmail").toString();
        
    %>
    <body>
        <%@include file="menu.jsp" %>
        
        <header>
            <h3 class="h3 text-center" >Alterar este Aluno?</h3><br/>
        </header>
        
        <div class="col-md-offset-4 col-md-4">
            <div class="well well-lg"> 
        
                <form name="form" action="alterar" method="post">
                     Código do aluno: <span class="badge"> <%=vcodigo%></span>
                    <input type="hidden" name="codigo" value="<%=vcodigo%>">
                    <br/>
                    
                    <div class="form-group">
                        <label class="control-label" for="nome">Nome:</label> <br>
                        <div class="input-group">
                            <div class="input-group-addon">
                                <span class="glyphicon glyphicon-user"></span> 
                            </div>   
                            <input type="text" name="nome" value="<%=vnome%>" class="form-control" id="nome">  
                        </div>
                    </div>
                  
                                          
                    <div class="form-group">
                        <label class="control-label" for="E-mail">Email:</label> <br>
                        <div class="input-group">
                            <div class="input-group-addon">
                                <span class="glyphicon glyphicon-lock"></span> 
                            </div>  
                            <input type="text" name="email" value="<%=vemail%>" class="form-control" id="email">
                        </div>
                    </div>
                   <input type="submit" value="Alterar" class="btn btn-info">
                </form>
            </div>
        </div>
        
    </body>
</html>