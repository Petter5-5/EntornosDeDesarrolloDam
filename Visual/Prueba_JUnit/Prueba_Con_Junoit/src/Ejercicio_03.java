public class Ejercicio_03 {
    
    public static int contarCaracteres(String texto, char caracter) {
        int contador = 0;

        for (int i = 0; i < texto.length(); i++) {
            if (texto.charAt(i) == caracter) {
                contador++;
            }
        }

        return contador;
    }
}
