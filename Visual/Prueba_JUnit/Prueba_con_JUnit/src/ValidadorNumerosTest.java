import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class ValidadorNumerosTest {

    @Test
    void numeroPositivoDebeRetornarTrue() {
        assertTrue(ValidadorNumeros.esPositivo(5));
    }

    @Test
    void numeroNegativoDebeRetornarFalse() {
        assertFalse(ValidadorNumeros.esPositivo(-3));
    }

    @Test
    void ceroDebeRetornarFalse() {
        assertFalse(ValidadorNumeros.esPositivo(0));
    }
}
