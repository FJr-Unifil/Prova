package prova;

import java.text.DecimalFormat;
import java.util.Scanner;

public class e2 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("0.00");
        double salarioI = 1000;
        double salarioF = salarioI + (0.015*salarioI);
        int ano = 1997;
        int cont = 0;
        double taxa=0.015;
        do{
            taxa = taxa*2;
            salarioF = salarioF + (taxa*salarioF);
            ano = ano+1;
        } while(ano != 2023);
  System.out.println("O salario dele em "+(ano-1)+" foi de R$"+df.format(salarioF));

    }
}
