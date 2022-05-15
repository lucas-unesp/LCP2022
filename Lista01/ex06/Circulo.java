package bc.unesp.rc.lcp_lista01.ex06;

public class Circulo implements Geometria {
    private double raio;

    public Circulo(double raio) {
        this.raio = raio;
    }
    
    public void defineArea() {
        double area = raio * Math.PI;
        
        System.out.printf("Area circulo: %f \n", area);
    }

    @Override
    public void definePerimetro() {
        double perimetro = 2 * Math.PI * raio;
        
        System.out.printf("Perimetro circulo: %f \n", perimetro);
    }
    
    

    

}
