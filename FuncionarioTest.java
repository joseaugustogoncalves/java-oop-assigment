import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FuncionarioTest {

    @Test
    public void testCalculoSalarioGestor() {
        Gestor gestor = new Gestor("João", "123.456.789-00", 5000.0, 0.20);
        assertEquals(6000.0, gestor.calcularSalario(), 0.01);
    }

    @Test
    public void testCalculoSalarioColaborador() {
        Colaborador colaborador = new Colaborador("Maria", "987.654.321-00", 3000.0);
        assertEquals(2700.0, colaborador.calcularSalario(), 0.01);
    }
}