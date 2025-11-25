public class Funciones 
{
    public static boolean esMayorDeEdad(int edad)
    {
        return edad >= 18;
    }

    public static String nombrePersona (String persona)
    {
        if(persona == null)
            return null;
        return persona;
    }

    public static int sumar (int a, int b)
    {
        return a + b;
    }

    public static int[] unirArrays (int[] a, int[] b)
    {
        int[] resultado = new int[a.length + b.length];
        System.arraycopy(a, 0, resultado, 0, a.length);
        System.arraycopy(b, 0, resultado, a.length, b.length);
        return resultado;
    }

    public static double dividir (double a, double b)
    {
        if (b == 0) {
            throw new ArithmeticException("División por cero");
        }
        return a / b;
    }
}
