package bc.unesp.rc.lcp_lista02;

import java.util.Scanner;

public class Exercicio01 {
    
     public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
    
        System.out.print("Informe um nome: ");
        String nome = scanner.nextLine();
        
        nome = BeautifyName(nome);
        
        System.out.printf("Resultado: %s",nome);
    }
    
    static String BeautifyName(String nome){
        String[] tokens = nome.split(" ");
        boolean primeiro = true;        
        String novoNome = ""; 
        
        for(char l : nome.toCharArray()){
            if(primeiro){
                novoNome += String.valueOf(l).toUpperCase();
                primeiro = false;
            }else if(String.valueOf(l).equals(" ")){
                novoNome += String.valueOf(l);
                primeiro = true;
            }else{
                novoNome += String.valueOf(l);
            }
        }
        novoNome = novoNome.replaceAll("Do ", "do ");
        novoNome = novoNome.replaceAll("Da ", "da ");
        novoNome = novoNome.replaceAll("De ", "de ");
        return novoNome;
    }

}
