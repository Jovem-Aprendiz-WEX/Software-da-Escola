package model;

public class Notas {
    
    private String nota1;
    private String nota2;
    private String nota3;
    private String nota4;
    private String nota_media;
    private String prova_final;
    private Disciplina disciplina;
    private int idAluno;

    
    public Notas(){

        }
    public String getnota1(){
        return nota1;
    }

    public int getIdAluno() {
        return idAluno;
    }
    public void setIdAluno(int idAluno) {
        this.idAluno = idAluno;
    }
    
    public void setnota1(String nota1){
        this.nota1 = nota1;
    }

    public String getnota2(){
        return nota2;
    }

    public void setnota2(String nota2){
        this.nota2 = nota2;
    }

    public String getnota3(){
        return nota3;
    }

    public void setnota3(String nota3){
        this.nota3 = nota3;
    }

    public String getnota4(){
        return nota4;
    }

    public void setnota4(String nota4){
        this.nota4 = nota4;
    }

    public String getnota_media(){
        return nota_media;
    }

    public void setnota_media(String nota_media){
        this.nota_media = nota_media;
    }

    public String getprova_final(){
        return prova_final;
    }

    public void setprova_final(String prova_final){
        this.prova_final = prova_final;
    }

    public Disciplina getdisciplina(){
        return disciplina;
    }

    public void setdisciplina(Disciplina disciplina){
        this.disciplina = disciplina;
    }
}
