package model;

import java.sql.Date;
import java.util.List;

public class Turma {
    
    private String nome_turma;
    private int codigo;
    private List<Disciplina> disciplinas;
    private String descricao;
    private List<Professor> professores;
    private List<Aluno> alunos;
    private Date ano_turma;

    public String getNome_turma() {
        return nome_turma;
    }
    public void setNome_turma(String nome_turma) {
        this.nome_turma = nome_turma;
    }
    public int getCodigo() {
        return codigo;
    }
    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }
    public List<Disciplina> getDisciplinas() {
        return disciplinas;
    }
    public void setDisciplinas(List<Disciplina> disciplinas) {
        this.disciplinas = disciplinas;
    }
    public String getDescricao() {
        return descricao;
    }
    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
    public List<Professor> getProfessores() {
        return professores;
    }
    public void setProfessores(List<Professor> professores) {
        this.professores = professores;
    }
    public List<Aluno> getAlunos() {
        return alunos;
    }
    public void setAlunos(List<Aluno> alunos) {
        this.alunos = alunos;
    }
    public Date getAno_turma() {
        return ano_turma;
    }
    public void setAno_turma(Date ano_turma) {
        this.ano_turma = ano_turma;
    }

}
