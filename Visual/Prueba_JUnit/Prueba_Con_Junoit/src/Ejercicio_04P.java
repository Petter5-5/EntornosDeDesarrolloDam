import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class Ejercicio_04P {
    
    @Test
    void debeSumarCorrectamente() {
        assertEquals(60, Ejercicio_04.sumar(55, 5));
    }

    @Test
    void debeRestarCorrectamente() {
        assertEquals(50, Ejercicio_04.restar(55, 5));
    }

    @Test
    void debeMultiplicarCorrectamente() {
        assertEquals(200, Ejercicio_04.multiplicar(100, 2));
    }

    @Test
    void debeDividirCorrectamente() {
        assertEquals(2, Ejercicio_04.dividir(4, 2));
    }

    @Test
    void divisionConResultadoEntero() {
        assertEquals(2, Ejercicio_04.dividir(9, 4));
    }

    @Test
    void dividirPorCeroDebeLanzarExcepcion() {
        Exception exception = assertThrows(
                IllegalArgumentException.class,
                () -> Ejercicio_04.dividir(10, 0)
        );

        assertEquals("No se puede dividir por cero", exception.getMessage());
    }
}
