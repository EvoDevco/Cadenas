import java.util.Scanner;

public class Digitos2 {
    public static final String R = "\u001B[31m"; // Rojo
    public static final String V = "\u001B[32m"; // Verde
    public static final String G = "\u001B[0m";// Gris
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Introduce una frase: ");
        String frase = input.nextLine().trim();
        contarNumeros("1 20 hola 234 45a");
    }
    public static int contarNumeros(String frase){
        String[] palabras=frase.split("\\s+");
        int contador = 0;
        System.out.print(V+"Nombre Formateado: ");
        for (String palabra:palabras) {
            boolean numero=true;
            for (int caracter = 0; caracter < palabra.length(); caracter++) {
                if (!Character.isDigit(palabra.charAt(caracter))) {
                    numero=false;
                } else if (!numero){
                    continue;
                }
                if (caracter == palabra.length()-1 && numero){
                        contador++;
                }
            }
        }
        return contador;
    }
}
