package model;

import java.util.List;

public class Curso {
    
    private String nome_curso;
    private String descricao;
    private List<Disciplina> disciplinas;
    private int codigo;
    
    public Curso() {
    }
    
    public String getNome_curso() {
        return nome_curso;
    }
    public void setNome_curso(String nome_curso) {
        this.nome_curso = nome_curso;
    }
    public String getDescricao() {
        return descricao;
    }
    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
    public List<Disciplina> getDisciplinas() {
        return disciplinas;
    }
    public void setDisciplinas(List<Disciplina> disciplinas) {
        this.disciplinas = disciplinas;
    }
    public int getCodigo() {
        return codigo;
    }
    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }
    
    @Override
    public String toString() {
        return "Curso [nome_curso=" + nome_curso + ", descricao=" + descricao + ", disciplinas=" + disciplinas
                + ", codigo=" + codigo + "]";
    }
}
