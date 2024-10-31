/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.entidade;
import java.sql.PreparedStatement;
import br.com.controle.Aluno;
import java.util.ArrayList;
import java.sql.ResultSet;

/**
 *
 * @author pedrohenrique.clima
 */
public class ManterAluno extends DAO{
    public void inserir(Aluno a) throws Exception {
        try {
            abrirBanco();
            String query = "INSERT INTO alunos(codigo,nome,email)" + "values (null,?,?)";
            pst = (PreparedStatement) con.prepareStatement(query);
            pst.setString(1, a.getNome());
            pst.setString(2, a.getEmail());
            pst.execute();
            fecharBanco();
            
        } catch (Exception e){
            System.out.println("Erro "+ e.getMessage());
        }
    }
    
    public ArrayList<Aluno> PesquisarTudo () throws Exception {
       ArrayList<Aluno> alunos = new ArrayList<Aluno>();
         try{
         abrirBanco();  
         String query = "select codigo, nome FROM alunos";
         pst = (PreparedStatement) con.prepareStatement(query);
         ResultSet tr = pst.executeQuery();
         Aluno a ;
         while (tr.next()){               
           a = new Aluno();
           a.setCodigo(tr.getInt("codigo"));
           a.setNome(tr.getString("nome"));
           alunos.add(a);
         } 
         fecharBanco();
       }catch (Exception e){
           System.out.println("Erro " + e.getMessage());
     } 
       return alunos;
     }
}
