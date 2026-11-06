import java.util.Scanner;

public class SumarBinario {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Indique el primer numero binario: ");
        String bin1 = input.nextLine();
        System.out.println("Indique ahora el 2ndo numero binario: ");
        String bin2 = input.nextLine();
        System.out.println(sumaBinario(bin1, bin2));
    }

    public static String sumaBinario(String bin1, String bin2) {
        String resultado = "";
        boolean llevamos = false;
        int suma;
        for (int posicion = bin1.length() - 1; posicion > -1; posicion--) {
            int CB1 = Character.getNumericValue(bin1.charAt(posicion));
            int CB2 = Character.getNumericValue(bin2.charAt(posicion));
            if (CB1 + CB2 == 0 && !llevamos) {
                resultado =  "0"  + resultado;
            } else if (CB1 + CB2 == 1 && !llevamos) {
                resultado =  "1"  + resultado;
            } else if (CB1 + CB2 == 2 && !llevamos) {
                resultado =  "0"  + resultado;
                llevamos = true;
            } else if (CB1 + CB2 == 0 && llevamos) {
                resultado =  "1"  + resultado;
                llevamos = false;
            } else if (CB1 + CB2 == 1 && llevamos) {
                resultado =  "0"  + resultado;
            } else if (CB1 + CB2 == 2 && llevamos) {
                resultado =  "1"  + resultado;
            }
        }
        if (llevamos) {
            resultado =  "1" + resultado;
        }
        return resultado;
    }
}
