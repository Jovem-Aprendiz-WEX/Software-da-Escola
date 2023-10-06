package model;

import java.util.List;

public class Aluno {
    
    private String matricula;
    private String data_entrada;
    private String data_saida;
    private String status;
    private List   notas;

    public Aluno(){

}

    public String getmatricula() {
        return matricula;
    } 

    public void setmatricula(String matricula) {
        this.matricula = matricula;
    }

    public String getdata_entrada() {
        return data_entrada;
    }

    public void setdata_entrada(String data_entrada){
        this.data_entrada = data_entrada;
    }
    
}