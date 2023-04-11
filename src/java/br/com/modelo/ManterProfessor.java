/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.modelo;

import br.com.controle.Professor;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

/**
 *
 * @author arTTh
 */
public class ManterProfessor extends DAO{
    public void inserir(Professor p) throws Exception {
    try {
    abrirBanco();
    String query = "INSERT INTO professor (codigo,nome,email,contato) "
            + "values(null,?,?,?)";
    ps =(PreparedStatement) con.prepareStatement(query);
    ps.setString(1, p.getNome());
    ps.setString(2, p.getEmail());
    ps.setInt(3, p.getContato());
    
    ps.execute();
    fecharBanco();
    } catch (Exception e) {
        System.out.println("Erro " + e.getMessage());
    }
   } 
  //=====iniico do listar===
   public ArrayList pesquisarTudo(){
   ArrayList<Professor> listantc = new ArrayList<Professor>();
         try{
         abrirBanco();  
         String query = "select  * FROM professor";
         ps = con.prepareStatement(query);
         ResultSet rs = ps.executeQuery();
         Professor ntcben ;
         while (rs.next()){ 
           ntcben = new Professor();
           ntcben.setCodigo(rs.getInt("codigo"));
           ntcben.setNome(rs.getString("nome"));
           ntcben.setEmail(rs.getString("email"));
           ntcben.setCodigo(rs.getInt("contato"));
           listantc.add(ntcben); 
         } 
         fecharBanco();
       }catch (Exception e){
           System.out.println("Erro " + e.getMessage());
     } 
       return listantc;
     }
   
   //=fim do litar==
   
   public void deletar(Professor pr) throws Exception{
         abrirBanco();
         String query = "delete FROM professor where codigo=?";
         ps=(PreparedStatement) con.prepareStatement(query);
         ps.setInt(1, pr.getCodigo());
         ps.execute();
        fecharBanco();   
     }
   
  
   public void editarProfessor(Professor pr) throws Exception {
        abrirBanco();
        String query = "UPDATE professor set nome = ?, email = ?, contato = ? where codigo = ?";
        ps = (PreparedStatement) con.prepareStatement(query);
        ps.setString(1, pr.getNome());
        ps.setString(2, pr.getEmail());
         ps.setInt(3, pr.getCodigo());
        ps.setInt(4, pr.getCodigo());
        ps.executeUpdate();
        fecharBanco();
    }

   public Professor pesquisar(int codigo) throws Exception {
    try {
            Professor pr = new Professor();
            System.out.println(" Chegou no pesquisar registo" + codigo);
            abrirBanco();
            String query = "select * FROM professor where codigo=?";
            ps = con.prepareStatement(query);
            ps.setInt(1, codigo);
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
              pr.setCodigo(rs.getInt("codigo"));
              pr.setNome(rs.getString("nome"));
              pr.setEmail(rs.getString("email"));
               pr.setCodigo(rs.getInt("contato"));
             
                return pr;
            }
            fecharBanco();
    } catch (Exception e) {
            System.out.println("Erro " + e.getMessage());
    }
    return null;
	}
    
}
