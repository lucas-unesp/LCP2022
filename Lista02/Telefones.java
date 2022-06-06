package bc.unesp.rc.lcp_lista02;

import java.util.Scanner;

public class Telefones {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
    
        System.out.print("Informe um telefone: ");
        String telefone = scanner.nextLine();
        
        String ddd = telefone.split(" ")[0];
        String tipo = telefone.split(" ")[1].split("-")[0];
        String resto = telefone.split(" ")[1].split("-")[1];

        if(tipo.length() == 4){
            System.out.println("O DDD do telefone residencial é "+ddd.split("[()]")[1]+" e o número é "+tipo+resto);
        }else if(tipo.length() == 5){
            System.out.println("O DDD do telefone celular é "+ddd.split("[()]")[1]+" e o número é "+tipo+resto);
        }else{
            System.out.println("Tipo inválido");
        }
    }
}
