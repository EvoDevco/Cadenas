import java.util.List;
import java.util.Scanner;
import java.util.ArrayList;
public class Parentesis {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        boolean error = false;
        System.out.println("Indique la frase que desea analizar: ");
        String frase = input.nextLine();
        System.out.println(esParentizada(frase));

    }

    public static Boolean esParentizada(String frase){
        List<Character> parejas = new ArrayList<>();
        parejas.add('S');
        boolean error = true;
        for (int posicion = 0; posicion<frase.length();posicion++){
            char caracter = frase.charAt(posicion);
            if (caracter=='('){
                parejas.add(caracter);
            }
            if (caracter==')' && parejas.getLast()=='('){
                parejas.removeLast();
            }else if (caracter==')'){
                error=false;
            }
        }
        if (parejas.getLast()=='('){
            error=false;
        }
        return error;
    }
}