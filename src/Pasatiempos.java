import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Pasatiempos {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Indique la frase que desea analizar: ");
        String c = input.nextLine();
    }

    public static String crearPasatiempo(String palabra){
        char[] vocales = {'a','e','i','o','u'};
        for (int i = 0; i<vocales.length;i++){
                palabra = palabra.replace(vocales[i],'.');
            }
        return palabra;
        }
    }
