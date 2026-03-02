import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class Ejercicio_01P 
{
    
    @Test
    void numeroPositivoDebeRetornarTrue() {
        assertTrue(Ejercicio_01.esPositivo(6243));
    }

    @Test
    void numeroNegativoDebeRetornarFalse() {
        assertFalse(Ejercicio_01.esPositivo(-7354));
    }

    @Test
    void ceroDebeRetornarFalse() {
        assertFalse(Ejercicio_01.esPositivo(0));
    }
}
