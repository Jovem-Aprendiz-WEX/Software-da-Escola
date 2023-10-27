package model;

import java.util.Date;

public class Professor {
    private String matricula;
    private Date data_entrada;
    private Date data_saida;
    private Float tempo;

    public Professor(String matricula, Date data_entrada, Date data_saida, Float tempo) {
        this.matricula = matricula;
        this.data_entrada = data_entrada;
        this.data_saida = data_saida;
        this.tempo = tempo;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public Date getDataEntrada() {
        return data_entrada;
    }

    public void setDataEntrada(Date data_entrada) {
        this.data_entrada = data_entrada;
    }

    public Date getDataSaida() {
        return data_saida;
    }

    public void setDataSaida(Date data_saida) {
        this.data_saida = data_saida;
    }

    public Float getTempo() {
        return tempo;
    }

    public void setTempo(Float tempo) {
        this.tempo = tempo;
    }
    @Override
    public String toString() {
        return "Professor [matricula=" + matricula + ", data_entrada=" + data_entrada + ", data_saida=" + data_saida + ", tempo=" + tempo + "]";
    }
}
