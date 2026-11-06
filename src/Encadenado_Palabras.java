import java.util.Scanner;
import java.util.Arrays;
public class Encadenado_Palabras {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Indique la frase que desea analizar: ");
        String frase = input.nextLine();
        System.out.println(validacion(frase));
    }
    public static Boolean validacion(String frase){
        boolean validator = true;
        String[] palabras=frase.split("\\s+");
        String palabra_1 = palabras[0];
        String silaba_final = palabra_1.substring(palabra_1.length()-2);
        for (int palabra = 1 ;palabra<palabras.length;palabra++){
            palabra_1 =palabras[palabra];
            if (!(palabra_1.substring(0, 2).equals(silaba_final))){
                validator=false;
            }else{
                silaba_final = palabra_1.substring(palabra_1.length()-2);
            }

        }
        return validator;
    }
}
