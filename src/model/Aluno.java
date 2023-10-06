package model;

import java.util.List;

public class Aluno {
    
    private String matricula;
    private String data_entrada;
    private String data_saida;
    private String status;
    private List<Notas>   notas;

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

    public String getdata_saida(){
        return data_saida;
    }
    
    public void setdata_saida(String data_saida) {
        this.data_saida = data_saida;
    }

    public String getstatus(){
        return status;
    }

    public void setstatus(String status){
        this.status = status;
    }

    public List<Notas> getnotas(){
        return notas;
    }

    public void setnotas(List<Notas> notas){
        this.notas = notas;
    }

}