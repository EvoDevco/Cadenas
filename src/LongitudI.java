import java.util.Scanner;

public class LongitudI {
    public static final String R = "\u001B[31m"; // Rojo
    public static final String V = "\u001B[32m"; // Verde
    public static final String G = "\u001B[0m";// Gris
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Introduce una frase: ");
        String frase = input.nextLine().trim();
        System.out.print("Y una longitud");
        int numero = input.nextInt();
    }

    public static int comprueba(String frase, int numero){
        String[] palabras=frase.split("\\s+");
        int contador =0;
        System.out.print(V+"Nombre Formateado: ");
        for (String palabra : palabras) {
            if (palabra.length()==numero){
                contador++;
            }
        }
        return contador;
    }
}
