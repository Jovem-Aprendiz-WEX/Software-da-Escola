package model;
public class Pessoa{
    
    private String nome;
    private String cpf;
    private String sexo;
    private String data_nascimento;
    private String mae;
    private String telefone;
    private String endereco;
    private String logradouro;
    private String email;
    private String cep;
    private String cidade;
    private String estado;
    private String bairro;
    private int numero;
    
    public Pessoa(){

    }

    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getCpf() {
        return cpf;
    }
    public void setCpf(String cpf) {
        this.cpf = cpf;
    }
    public String getSexo() {
        return sexo;
    }
    public void setSexo(String sexo) {
        this.sexo = sexo;
    }
    public String getData_nascimento() {
        return data_nascimento;
    }
    public void setData_nascimento(String data_nascimento) {
        this.data_nascimento = data_nascimento;
    }
    public String getMae() {
        return mae;
    }
    public void setMae(String mae) {
        this.mae = mae;
    }
    public String getTelefone() {
        return telefone;
    }
    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }
    public String getEndereco() {
        return endereco;
    }
    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }
    public String getLogradouro() {
        return logradouro;
    }
    public void setLogradouro(String logradouro) {
        this.logradouro = logradouro;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public String getCep() {
        return cep;
    }
    public void setCep(String cep) {
        this.cep = cep;
    }
    public String getCidade() {
        return cidade;
    }
    public void setCidade(String cidade) {
        this.cidade = cidade;
    }
    public String getEstado() {
        return estado;
    }
    public void setEstado(String estado) {
        this.estado = estado;
    }
    public String getBairro() {
        return bairro;
    }
    public void setBairro(String bairro) {
        this.bairro = bairro;
    }
    public int getNumero() {
        return numero;
    }
    public void setNumero(int numero) {
        this.numero = numero;
    }


    @Override
    public String toString() {
        return "Pessoa [nome=" + nome + ", cpf=" + cpf + ", sexo=" + sexo + ", data_nascimento=" + data_nascimento
                + ", mae=" + mae + ", telefone=" + telefone + ", endereco=" + endereco + ", logradouro=" + logradouro
                + ", email=" + email + ", cep=" + cep + ", cidade=" + cidade + ", estado=" + estado + ", bairro="
                + bairro + ", numero=" + numero + "]";
    }

}