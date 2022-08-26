package prova;

import java.util.Scanner;

public class e1 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        int n[] = new int[5];
        int maiorN=0, menorN=0;
        for (int i = 0; i < n.length; i++ ){
            System.out.println("Escreva o "+(i+1)+" número");
            n[i] = ler.nextInt();
       if (i==0){
    maiorN = n[i];
    menorN = n[i];
}
            if (n[i] > maiorN){
                maiorN = n[i];
            }
            if (n[i] < menorN){
                menorN = n[i];
            }
        }
        System.out.println("Maior número foi: "+maiorN);
        System.out.println("Menor número foi: "+menorN);
    }
}
