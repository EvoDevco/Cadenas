import java.util.Scanner;
public class Invertida {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Indique la frase que desea analizar: ");
        String frase = input.nextLine();
        System.out.println(invertir(frase));
    }

    public static String invertir(String frase){
        String frase_invertida = "";
        String[] palabras=frase.split("\\s+");
        for (int i = palabras.length-1;i >= 0;i--){
            String palabra = palabras[i];
            frase_invertida = frase_invertida + palabra + " ";
        }
        return frase_invertida;
    }
}
