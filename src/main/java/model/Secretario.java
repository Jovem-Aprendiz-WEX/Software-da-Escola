package model;

import java.sql.Date;

public class Secretario {
    
    private String matricula;
    private Date data_entrada;
    private Date data_saida;
    private float tempo;

    public String getMatricula() {
        return matricula;
    }
    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }
    public Date getData_entrada() {
        return data_entrada;
    }
    public void setData_entrada(Date data_entrada) {
        this.data_entrada = data_entrada;
    }
    public Date getData_saida() {
        return data_saida;
    }
    public void setData_saida(Date data_saida) {
        this.data_saida = data_saida;
    }
    public float getTempo() {
        return tempo;
    }
    public void setTempo(float tempo) {
        this.tempo = tempo;
    }
    
}
