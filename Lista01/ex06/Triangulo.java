package bc.unesp.rc.lcp_lista01.ex06;

public class Triangulo implements Geometria {
    private double base;
    private double altura;
    private double lado;

    public Triangulo(double base, double altura, double lado) {
        this.base = base;
        this.altura = altura;
        this.lado = lado;
    }
    
    public void defineArea(){
        double area = (base*altura)/2;
        
        System.out.printf("Area triangulo %f \n", area);
    }
    
    public void definePerimetro(){
        double perimetro = base+(lado*2);
        
        System.out.printf("Perimetro triangulo %f \n", perimetro);
    }

}
