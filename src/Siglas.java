import java.util.Scanner;

public class Siglas {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Indique la frase que desea analizar: ");
        String frase = input.nextLine();
        String[] palabras=frase.split("\\s+");
        System.out.println(siglas(palabras));
    }
    public static String siglas(String[] palabras){
        String iniciales = "";
        for (String palabra:palabras){
            if (Character.isUpperCase(palabra.charAt(0))){
                iniciales=iniciales+palabra.charAt(0);
            }
        }

        return iniciales;
    }
}
