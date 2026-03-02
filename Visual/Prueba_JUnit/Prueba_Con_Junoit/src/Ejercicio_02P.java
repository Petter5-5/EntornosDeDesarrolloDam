import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class Ejercicio_02P {
    
    @Test
    void numeroParDebeRetornarTrue() {
        assertTrue(Ejercicio_02.esPar(8));
    }

    @Test
    void numeroImparDebeRetornarFalse() {
        assertFalse(Ejercicio_02.esPar(7));
    }
}
