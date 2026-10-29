import java.util.Scanner;
import java.util.Arrays;
public class NombreUsuario {
    public static final String R = "\u001B[31m"; // Rojo
    public static final String V = "\u001B[32m"; // Verde
    public static final String G = "\u001B[0m";// Gris
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Indique su nombre completo:");
        String nombre_completo = input.nextLine().trim();
        String[] palabras=nombre_completo.split("\\s+");
        if (palabras.length!=3){
            System.out.println(R+"ERROR! El numero de palabras no es 3"+G);
        }else {
            System.out.print(V+"Nombre Formateado: ");
            for (String palabra : palabras) {
                palabra = palabra.toLowerCase();
                palabra = palabra.substring(0, 1).toUpperCase() + palabra.substring(1);
                System.out.print(palabra + " ");
            }
            System.out.println();
            System.out.print("iniciales: ");
            for (String palabra2 : palabras) {
                System.out.print(palabra2.toUpperCase().charAt(0) + ".");
            }
            System.out.println();
            System.out.println("Usuario: " + palabras[0].toLowerCase().charAt(0) + palabras[1].toLowerCase() + palabras[2].toLowerCase().charAt(0)+G);
        }
    }
}
