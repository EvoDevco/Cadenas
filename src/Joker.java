import java.util.Scanner;
import java.util.Arrays;

public class Joker {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Indique el primer numero de boleto: ");
        String num1 = input.nextLine();
        System.out.println("Ahora indique el segundo: ");
        String num2 = input.nextLine();
        System.out.println(comprobarBoleto(num1,num2));
    }
    public static boolean comprobarBoleto(String num1,String num2){
        boolean iguales = false;
        String[] cifras1=num1.split("");
        String[] cifras2=num2.split("");
        Arrays.sort(cifras1);
        Arrays.sort(cifras2);
        if (Arrays.equals(cifras1,cifras2)){
            iguales = true;
        }
        return iguales;

    }
}
