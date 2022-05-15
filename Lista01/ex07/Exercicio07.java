package bc.unesp.rc.lcp_lista01.ex07;

public class Exercicio07 {
    
    public static void calcular(double param1, double param2) {
        System.out.printf("Resultado dois parametros: %f\n", param1 + Math.pow(param2, 2));
    }
    
    public static void calcular(double param1, double param2, double param3) {
        System.out.printf("Resultado tres parametros: %f\n", param1 + Math.pow(param2, 2) + Math.pow(param3, 3));
    }
    
    public static void calcular(double param1, double param2, double param3, double param4) {
        System.out.printf("Resultado quatro parametros: %f\n", param1 + Math.pow(param2, 2) + Math.pow(param3, 3) + Math.pow(param4, 4));
    }
    
    public static void main(String[] args) {
        
        calcular(2,4);
        calcular(2,4,2);
        calcular(2,4,2,2);
        
    }
    
}
