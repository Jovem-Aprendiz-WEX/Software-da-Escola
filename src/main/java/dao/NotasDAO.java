package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import conexao.Conexao;
import model.Notas;

public class NotasDAO {
    
    private Connection conexao;
    
    // Construtor que recebe uma conexão como parâmetro
    public NotasDAO(){
        new Conexao();
        this.conexao = Conexao.getConexao();
    }


    // Método para inserir notas no banco de dados
    public void inserirNotas(Notas notas) {
        try {
            String sql = "INSERT INTO notas (nota1, nota2, nota3, nota4, nota_media, prova_final, id_disciplina, id_aluno) VALUES (?, ?, ?, ?, ?, ?, ?, ?)";

            PreparedStatement ps = conexao.prepareStatement(sql);   //obejeto Stament 

            ps.setString(1, notas.getnota1());
            ps.setString(2, notas.getnota2());
            ps.setString(3, notas.getnota3());
            ps.setString(4, notas.getnota4());
            ps.setString(5, notas.getnota_media());
            ps.setString(6, notas.getprova_final());
            ps.setInt(7, notas.getdisciplina().getId_disciplina()); // Supondo que você tenha um método getId() na classe Disciplina
            ps.setInt(8, notas.getIdAluno());
            
            ps.executeUpdate();                                       //Executa sql
            ps.close();


        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    // Método para inserir notas no banco de dados


    // Outros métodos para atualizar, recuperar ou excluir notas podem ser adicionados conforme a necessidade
}
