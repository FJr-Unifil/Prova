package prova;

import java.util.Scanner;

public class e3 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        int t = 0;
        double massaI;
        double massaF = 0;
        int t2 = 0;
        int t3 = 0;
        int cont = 0;
        do{
        System.out.println("Digite a massa(em gramas)");
        massaI = ler.nextDouble();
        } while (massaI <= 0.5);
        massaF = massaI;
        do{
            massaF = massaF/2;
            t = t + 50;
            cont++;
        } while (massaF > 0.5);
        if (t >= 3600){
            t2 = t/60;
            t3 = t2/60;
            t2 = t2 % 60;
            t = t % 60;
        } else if (t <= 3599 && t > 60){
            t2 = t/60;
            t = t % 60;
        }
        System.out.println("Massa inicial: "+massaI);
        System.out.println("Massa final: "+massaF);
        System.out.println("Tempo: "+t3+" horas, "+t2+" minutos e "+t+" segundos");
        System.out.println(cont);


    }
}
