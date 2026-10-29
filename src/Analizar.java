import java.util.Scanner;
import java.util.Arrays;
public class Analizar {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Indique la palabra que desea analizar: ");
        String palabra = input.nextLine();
        System.out.println("Longitud: " + palabra.length());
        System.out.println("Primera letra: " + palabra.charAt(0));
        System.out.println("Ultima letra: " + palabra.charAt(palabra.length()-1));
        System.out.println("Mayusculas: " + palabra.toUpperCase());
        System.out.println("Minusculas: " + palabra.toLowerCase());
        int contador =0;
        for(int posicion = 0; posicion<palabra.length();posicion++){
            if(palabra.toLowerCase().charAt(posicion) == 'a'){
                contador++;
            }else{
                continue;
            }
        }
        System.out.println("Y la letra A aparece un total de : " + contador + "  veces");
    }
}
