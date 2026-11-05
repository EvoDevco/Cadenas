import java.util.Scanner;

public class SumarBinario {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Indique el primer numero binario: ");
        String bin1 = input.nextLine();
        System.out.println("Indique ahora el 2ndo numero binario: ");
        String bin2 = input.nextLine();
    }
    public static String sumaBinario(String bin1,String bin2){
        int resultado = 0;
        int num1 = Integer.parseInt(bin1,2);
        int num2 = Integer.parseInt(bin2,2);
        resultado = num1+num2;

        return Integer.toBinaryString(resultado);
    }
}
