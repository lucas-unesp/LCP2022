package bc.unesp.rc.lcp_lista01.ex06;

public class Quadrado implements Geometria {
    private float lado;

    public Quadrado(float lado) {
        this.lado = lado;
    }
    
    public void defineArea(){
        double area=Math.pow(lado, 2);
        
        System.out.printf("Area quadrado %f \n", area);
    }
    public void definePerimetro(){
        double perimetro = lado*4;
        
        System.out.printf("Perimetro quadrado %f \n", perimetro);
    }
}
