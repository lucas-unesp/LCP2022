package bc.unesp.rc.lcp_lista01.ex02;

import java.util.Scanner;

public class Exercicio02 {
    
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
    
        System.out.print("Informe o primeiro numero: ");
        int a = ler.nextInt();
        
        System.out.print("Informe o segundo numero: ");
        int b = ler.nextInt();
        
        System.out.print("Informe o terceiro numero: ");
        int c = ler.nextInt();
        
        soma(a, b, c);
        produto(a, b, c);
        media(a, b, c);
        ordenado(a, b, c); 
    }
    
    
    public static void soma(int a, int b, int c) {
        int soma = a + b + c;
        System.out.println("Soma: " + soma);
    }
    
    public static void produto(int a, int b, int c) {
        int produto = a * b * c;
        System.out.println("Produto: " + produto);
    }
    
    public static void media(int a, int b, int c) {
        double media = (a + b + c) / 3.0;
        System.out.println("Media: " + media);
    }
    
    public static void ordenado(int a, int b, int c) {
        System.out.print("Numeros ordenados: ");
        if(a <= b && a <= c){
            if(b < c) {
                System.out.println(a + " - " + b + " - " + c);
            } else {
                System.out.println(a + " - " + c + " - " + b);
            }
        }
        else if(b <= a && b <= c){
            if(a < c) {
                System.out.println(b + " - " + a + " - " + c);
            } else {
                System.out.println(b + " - " + c + " - " + a);
            }
        }
        else if(c <= a && c <= b){
            if(a < b) {
                System.out.println(c + " - " + a + " - " + b);
            } else {
                System.out.println(c + " - " + b + " - " + a);
            }
        }	
    }
}
