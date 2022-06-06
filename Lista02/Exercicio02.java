package bc.unesp.rc.lcp_lista02;

import java.util.Scanner;

public class Exercicio02 {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
    
        System.out.print("Informe uma frase: ");
        String frase1 = scanner.nextLine();
        System.out.print("Informe outra frase: ");
        String frase2 = scanner.nextLine();
        
        frase1 = intercala(frase1,frase2);  
        
        System.out.printf("Resultado: %s",frase1);
    }
    
    static String intercala(String frase1, String frase2){
        String[] separado1 = frase1.split("");
        String[] separado2 = frase2.split("");
        
        String[] maiorFrase;
        
        if(frase1.length() > frase2.length()) maiorFrase = separado1; else maiorFrase = separado2;
        
        String novafrase = "";
        
        for(int i = 0; i <= maiorFrase.length ; i++){
            if(separado1.length > i) novafrase += separado1[i];
            if(separado2.length > i) novafrase += separado2[i];
        }
        
        return novafrase;
    }

}
