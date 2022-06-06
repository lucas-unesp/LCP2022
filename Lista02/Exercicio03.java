package bc.unesp.rc.lcp_lista02;

import java.util.Scanner;

public class Exercicio03 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
    
        System.out.print("Informe uma palavra: ");
        String palavra = scanner.nextLine();
        
        if(ValidaPalindromo(palavra))        
            System.out.printf("É palindromo.");
        else
            System.out.println("Não é palindromo");
    }
    
    static Boolean ValidaPalindromo(String palavra){
        int tamanho = palavra.length()-1;
        boolean palindromo = true;
        for(int i = 0; i <= ((tamanho-1)/2); i++){
            if(palavra.toUpperCase().charAt(i) != palavra.toUpperCase().charAt(tamanho-i)){
                palindromo = false;
            }
        }        
        return palindromo;        
    }
}
