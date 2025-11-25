import org.junit.*;

public class FuncionesTest {
    
    @Test /*Ejercicio_01 */
    public void testEsMayorDeEdad_true()
    {
        Assert.assertTrue(Funciones.esMayorDeEdad(20));
    }

    @Test /*Ejercicio_02 */
    public void testEsMayorDeEdad_False()
    {
        Assert.assertFalse(Funciones.esMayorDeEdad(14));
    }

    @Test /*Ejercicio_03 */
    public void devolucionNombre_Null()
    {
        Assert.assertNull(Funciones.nombrePersona(null));
    }

    @Test /*Ejercicio_04 */
    public void devolucionNombre_NoNull()
    {
        Assert.assertNotNull(Funciones.nombrePersona("Marcos"));
    }

    @Test /*Ejercicio_05 */
    public void comparacionIgual_A_B()
    {
        Assert.assertEquals(7, Funciones.sumar(3, 4));
    }

    @Test /*Ejercicio_06 */
    public void comparacionNoIgual_A_B()
    {
        Assert.assertNotEquals(6, Funciones.sumar(2, 3));
    }

    @Test /*Ejercicio_07 */
    public void unirArrays()
    {
        int[] a = {1, 2};
        int[] b = {3, 4};
        int[] resultado = {1, 2, 3, 4};

        Assert.assertArrayEquals(resultado, Funciones.unirArrays(a, b));
    }

    @Test /*Ejercicio_08 */
    public void Excepciones()
    {
        Assert.assertThrows(ArithmeticException.class, () -> Funciones.dividir(5, 0));
    } 
    public static void main(String[] args) throws Exception 
    {

    }
}
