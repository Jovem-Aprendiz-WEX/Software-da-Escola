package model.teste;

import static org.junit.Assert.assertEquals;
import org.junit.Test;
import model.Pessoa;

public class PessoaTest {

    @Test
    public void testGetSetBairro() {
        Pessoa pessoa = new Pessoa();
        pessoa.setBairro("Centro");
        assertEquals("Centro", pessoa.getBairro());
    }

    @Test
    public void testGetSetCep() {
        Pessoa pessoa = new Pessoa();
        pessoa.setCep("12345-678");
        assertEquals("12345-678", pessoa.getCep());
    }

    @Test
    public void testGetSetCidade() {
        Pessoa pessoa = new Pessoa();
        pessoa.setCidade("Cidade X");
        assertEquals("Cidade X", pessoa.getCidade());
    }

    @Test
    public void testGetSetCpf() {
        Pessoa pessoa = new Pessoa();
        pessoa.setCpf("123456789");
        assertEquals("123456789", pessoa.getCpf());
    }

    @Test
    public void testGetSetData_nascimento() {
        Pessoa pessoa = new Pessoa();
        pessoa.setData_nascimento("01/01/2000");
        assertEquals("01/01/2000", pessoa.getData_nascimento());
    }

    @Test
    public void testGetSetEmail() {
        Pessoa pessoa = new Pessoa();
        pessoa.setEmail("jorge@example.com");
        assertEquals("jorge@example.com", pessoa.getEmail());
    }

    @Test
    public void testGetSetEndereco() {
        Pessoa pessoa = new Pessoa();
        pessoa.setEndereco("Rua ABC, 123");
        assertEquals("Rua ABC, 123", pessoa.getEndereco());
    }

    @Test
    public void testGetSetEstado() {
        Pessoa pessoa = new Pessoa();
        pessoa.setEstado("Estado Y");
        assertEquals("Estado Y", pessoa.getEstado());
    }

    @Test
    public void testGetSetLogradouro() {
        Pessoa pessoa = new Pessoa();
        pessoa.setLogradouro("Logradouro Z");
        assertEquals("Logradouro Z", pessoa.getLogradouro());
    }

    @Test
    public void testGetSetMae() {
        Pessoa pessoa = new Pessoa();
        pessoa.setMae("Maria");
        assertEquals("Maria", pessoa.getMae());
    }

    @Test
    public void testGetSetNome() {
        Pessoa pessoa = new Pessoa();
        pessoa.setNome("Jorge");
        assertEquals("Jorge", pessoa.getNome());
    }

    @Test
    public void testGetSetNumero() {
        Pessoa pessoa = new Pessoa();
        pessoa.setNumero(42);
        assertEquals(42, pessoa.getNumero());
    }

    @Test
    public void testGetSetSexo() {
        Pessoa pessoa = new Pessoa();
        pessoa.setSexo("Masculino");
        assertEquals("Masculino", pessoa.getSexo());
    }

    @Test
    public void testGetSetTelefone() {
        Pessoa pessoa = new Pessoa();
        pessoa.setTelefone("123-456-789");
        assertEquals("123-456-789", pessoa.getTelefone());
    }

    @Test
    public void testToString() {
        Pessoa pessoa = new Pessoa();
        pessoa.setNome("Jorge");
        pessoa.setCpf("123456789");
        pessoa.setEndereco("Rua XYZ, 123");

        String expected = "Pessoa [nome=Jorge, cpf=123456789, sexo=null, data_nascimento=null, mae=null, " +
                          "telefone=null, endereco=Rua XYZ, 123, logradouro=null, email=null, cep=null, " +
                          "cidade=null, estado=null, bairro=null, numero=0]";

        assertEquals(expected, pessoa.toString());
    }
}
