import java.util.Scanner;

public class Digitos {
    public static final String R = "\u001B[31m"; // Rojo
    public static final String V = "\u001B[32m"; // Verde
    public static final String G = "\u001B[0m";// Gris
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Introduce una frase: ");
        String frase = input.nextLine().trim();
    }

    public static int cuantosSonDigitos(String frase){
        int contador =0;
        System.out.print(V+"Nombre Formateado: ");
            for (int caracter =0;caracter<frase.length();caracter++){
                if (Character.isDigit(frase.charAt(caracter))){
                    contador++;
                }else {
                    continue;
                }
            }
        return contador;
    }
}
