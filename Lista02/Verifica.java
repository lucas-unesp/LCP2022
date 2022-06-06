package bc.unesp.rc.lcp_lista02;

import java.util.Scanner;

public class Verifica {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
    
        System.out.print("Informe um RG: ");
        String rg = scanner.nextLine();
        
        if(Valida(rg))        
            System.out.printf("RG válido");
        else
            System.out.println("RG inválido");
    }
    
    static Boolean Valida(String rg){
        return (rg.matches("[0-9]{2}\\.[0-9]{3}\\.[0-9]{3}-[0-9X]{1}"));
        
    }
}
