package model;

import java.util.Date;

public class Disciplina {

    private String nome_disciplina;
    private String descricao;
    private float carga_horaria;
    private int codigo;
    private Date data_inicio;
    private Date data_fim;
    private float modelo;

    public String getNome_disciplina(){
        return nome_disciplina;
    }

    public void setNome_disciplina(String nome_disciplina){
        this.nome_disciplina = nome_disciplina;
    }

    public String getDescricao(){
        return descricao;
    }

    public void setDescricao(String descricao){
        this.descricao = descricao;
    }

    public float getCarga_horaria(){
        return carga_horaria;
    }

    public void setCarga_horaria(float carga_horaria){
        this.carga_horaria = carga_horaria;
    }

    public int getCodigo(){
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public Date getData_inicio() {
        return data_inicio;
    }

    public void setData_inicio(Date data_inicio) {
        this.data_inicio = data_inicio;
    }

    public Date getData_fim() {
        return data_fim;
    }

    public void setData_fim(Date data_fim) {
        this.data_fim = data_fim;
    }

    public float getModelo() {
        return modelo;
    }

    public void setModelo(float modelo) {
        this.modelo = modelo;
    }
}
