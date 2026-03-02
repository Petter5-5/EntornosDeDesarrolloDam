import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;


public class Ejercicio_03P {

    @Test
    void debeContarCaracteresRepetidos() {
        assertEquals(2, Ejercicio_03.contarCaracteres("rama", 'a'));
    }

    @Test
    void debeRetornarCeroSiNoExisteElCaracter() {
        assertEquals(0, Ejercicio_03.contarCaracteres("banana", 'x'));
    }

    @Test
    void debeContarCaracteresEnCadenaVacia() {
        assertEquals(0, Ejercicio_03.contarCaracteres("", 'a'));
    }

    @Test
    void debeDistinguirMayusculasYMinusculas() {
        assertEquals(1, Ejercicio_03.contarCaracteres("Casa", 'C'));
        assertEquals(2, Ejercicio_03.contarCaracteres("Casa", 'a'));
    }

    @Test
    void debeContarEspacios() {
        assertEquals(2, Ejercicio_03.contarCaracteres("Hola que tal", ' '));
    }
}