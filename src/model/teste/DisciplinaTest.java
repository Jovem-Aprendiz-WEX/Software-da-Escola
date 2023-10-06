package model.teste;

import static org.junit.Assert.assertEquals;
import org.junit.Test;
import model.Disciplina;

public class DisciplinaTest {

    @Test
    public void testGetSetNome_disciplina() {
        Disciplina disciplina = new Disciplina();
        disciplina.setNome_disciplina("Matemática");
        assertEquals("Matemática", disciplina.getNome_disciplina());
    }

    @Test
    public void testGetSetDescricao() {
        Disciplina disciplina = new Disciplina();
        disciplina.setDescricao("Esta é uma disciplina de matemática.");
        assertEquals("Esta é uma disciplina de matemática.", disciplina.getDescricao());
    }

    @Test
    public void testGetSetCarga_horaria() {
        Disciplina disciplina = new Disciplina();
        disciplina.setCarga_horaria(60.5f);
        assertEquals(60.5f, disciplina.getCarga_horaria(), 0.001f);
    }

    @Test
    public void testGetSetCodigo() {
        Disciplina disciplina = new Disciplina();
        disciplina.setCodigo(123);
        assertEquals(123, disciplina.getCodigo());
    }

    @Test
    public void testGetSetData_inicio() {
        Disciplina disciplina = new Disciplina();
        disciplina.setData_inicio("01/01/2022");
        assertEquals("01/01/2022", disciplina.getData_inicio());
    }

    @Test
    public void testGetSetData_fim() {
        Disciplina disciplina = new Disciplina();
        disciplina.setData_fim("31/12/2022");
        assertEquals("31/12/2022", disciplina.getData_fim());
    }

    @Test
    public void testGetSetModelo() {
        Disciplina disciplina = new Disciplina();
        disciplina.setModelo(5.5f);
        assertEquals(5.5f, disciplina.getModelo(), 0.001f);
    }
}
