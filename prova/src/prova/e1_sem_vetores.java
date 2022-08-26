package prova;

import java.util.Scanner;

public class e1_sem_vetores  {
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
        int n,n2,n3,n4,n5;
        int maiorN, menorN;
        System.out.println("Digite o 1º número: ");
        n = ler.nextInt();
        maiorN = n;
        menorN = n;
        System.out.println("Digite o 2º número: ");
        n2 = ler.nextInt();
        if (n2 > maiorN) {
        	maiorN = n2;
        }
        if (n2 < menorN) {
        	menorN = n2;
        }
        System.out.println("Digite o 3º número: ");
        n3 = ler.nextInt();
        if (n3 > maiorN) {
        	maiorN = n3;
        }
        if (n3 < menorN) {
        	menorN = n3;
        }
        System.out.println("Digite o 4º número: ");
        n4 = ler.nextInt();
        if (n4 > maiorN) {
        	maiorN = n4;
        }
        if (n4 < menorN) {
        	menorN = n4;
        }
        System.out.println("Digite o 5º número: ");
        n5 = ler.nextInt();
        if (n5 > maiorN) {
        	maiorN = n5;
        }
        if (n5 < menorN) {
        	menorN = n5;
        }
        System.out.println("Maior número: "+maiorN);
        System.out.println("Menor número: "+menorN);
	}
}
