import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class Alfabetica {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Indique la palabra que desea analizar: ");
        String palabra = input.nextLine();
        System.out.println(esAlfabetica(palabra));
    }
    public static boolean esAlfabetica(String palabra){
        boolean boleano = false;
        String[] palabras=palabra.split("");
        String[] palabras_ordenadas =palabra.split("");
                Arrays.sort(palabras_ordenadas);
        if (Arrays.equals(palabras,palabras_ordenadas)){
            boleano=true;
        }
        return boleano;
    }
}
