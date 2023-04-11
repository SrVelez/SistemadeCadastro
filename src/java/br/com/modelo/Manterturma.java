/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.modelo;

import br.com.controle.Turma;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

/**
 *
 * @author arTTh
 */
public class Manterturma extends DAO{
    public void inserir(Turma t) throws Exception {
    try {
    abrirBanco();
    String query = "INSERT INTO turma (codigo,nometurma,horario) "
            + "values(null,?,?)";
    ps=(PreparedStatement) con.prepareStatement(query);
    ps.setString(1, t.getNometurma());
    ps.setString(2, t.getHorario());
    
    ps.execute();
    fecharBanco();
    } catch (Exception e) {
        System.out.println("Erro " + e.getMessage());
    }
   } 
   public ArrayList pesquisarTudo(){
   ArrayList<Turma> listaturma = new ArrayList<Turma>();
         try{
         abrirBanco();
         String query = "select  * FROM turma";
         ps = con.prepareStatement(query);
         ResultSet rs = ps.executeQuery();
         Turma ntcben ;
         while (rs.next()){
           ntcben = new Turma();
           ntcben.setCodigo(rs.getInt("codigo"));
           ntcben.setNometurma(rs.getString("nometurma"));
           ntcben.setHorario(rs.getInt("horario"));
           listaturma.add(ntcben);
         }
         fecharBanco();
       }catch (Exception e){
           System.out.println("Erro " + e.getMessage());
     }
       return listaturma;
     }  
    
}
