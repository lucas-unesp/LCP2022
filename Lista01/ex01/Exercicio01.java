package bc.unesp.rc.lcp_lista01.ex01;

import java.util.Scanner;

public class Exercicio01 {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
    
        System.out.print("Informe um numero de 1 a 20: ");
        int i = scanner.nextInt();
        
        if (i < 1 || i > 20) {
            System.out.println("Numero inserido invalido");
        } else {
            for (int j = 1; j <= i; j++) {
                System.out.println("*".repeat(j));
            }
        }
    }
    
}
