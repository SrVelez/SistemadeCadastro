
package br.com.modelo;

import br.com.controle.Aluno;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

/**
 *
 * @author note
 */
public class ManterAluno extends DAO{
   public void inserir(Aluno al) throws Exception {
    try {
    abrirBanco();
    String query = "INSERT INTO aluno (codigo,nome,email) "
            + "values(null,?,?)";
    ps=(PreparedStatement) con.prepareStatement(query);
    ps.setString(1, al.getNome());
    ps.setString(2, al.getEmail());
    
    ps.execute();
    fecharBanco();
    } catch (Exception e) {
        System.out.println("Erro " + e.getMessage());
    }
   } 

   //=====iniico do listar===
   public ArrayList pesquisarTudo(){
   ArrayList<Aluno> listantc = new ArrayList<Aluno>();
         try{
         abrirBanco();  
         String query = "select  * FROM aluno";
         ps = con.prepareStatement(query);
         ResultSet rs = ps.executeQuery();
         Aluno ntcben ;
         while (rs.next()){ 
           ntcben = new Aluno();
           ntcben.setCodigo(rs.getInt("codigo"));
           ntcben.setNome(rs.getString("nome"));
           ntcben.setEmail(rs.getString("email"));
           listantc.add(ntcben); 
         } 
         fecharBanco();
       }catch (Exception e){
           System.out.println("Erro " + e.getMessage());
     } 
       return listantc;
     }
   
   //=fim do litar==
   
   public void deletar(Aluno al) throws Exception{
         abrirBanco();
         String query = "delete FROM aluno where codigo=?";
         ps=(PreparedStatement) con.prepareStatement(query);
         ps.setInt(1, al.getCodigo());
         ps.execute();
        fecharBanco();   
     }
   
  
   public void editarAluno(Aluno al) throws Exception {
        abrirBanco();
        String query = "UPDATE aluno set nome = ?, email = ? where codigo = ?";
        ps = (PreparedStatement) con.prepareStatement(query);
        ps.setString(1, al.getNome());
        ps.setString(2, al.getEmail());
        ps.setInt(3, al.getCodigo());
        ps.executeUpdate();
        fecharBanco();
    }

   public Aluno pesquisar(int codigo) throws Exception {
    try {
            Aluno al = new Aluno();
            System.out.println(" Chegou no pesquisar registo" + codigo);
            abrirBanco();
            String query = "select * FROM aluno where codigo=?";
            ps = con.prepareStatement(query);
            ps.setInt(1, codigo);
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
              al.setCodigo(rs.getInt("codigo"));
              al.setNome(rs.getString("nome"));
              al.setEmail(rs.getString("email"));
             
                return al;
            }
            fecharBanco();
    } catch (Exception e) {
            System.out.println("Erro " + e.getMessage());
    }
    return null;
	}
   
}
