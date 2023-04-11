
package br.com.modelo;

import java.sql.SQLException;


public class Teste extends  DAO{
    public static void main(String[] args) throws SQLException {
        DAO con = new DAO();
        con.abrirBanco();
    }
  
}
