package bc.unesp.rc.lcp_lista01.ex06;

public class TestaGeometria {
    
    public static void main(String[] args) {
        Quadrado quadrado = new Quadrado(10);
        Retangulo retangulo = new Retangulo(10, 20);
        Circulo circulo = new Circulo(10);
        Triangulo triangulo = new Triangulo(10, 5, 7);
        
        System.out.println("Dados quadrado");
        quadrado.defineArea();
        quadrado.definePerimetro();
        
        System.out.println("Dados Retangulo");
        retangulo.defineArea();
        retangulo.definePerimetro();
        
        System.out.println("Dados Triangulo");
        triangulo.defineArea();
        triangulo.definePerimetro();
        
        System.out.println("Dados Circulo");
        circulo.defineArea();
        circulo.definePerimetro();
        
    }
}
