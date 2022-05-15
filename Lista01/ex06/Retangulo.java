package bc.unesp.rc.lcp_lista01.ex06;

public class Retangulo implements Geometria {
    private float altura;
    private float largura;

    public Retangulo(float altura, float largura) {
        this.altura = altura;
        this.largura = largura;
    }
    
    public void defineArea(){
        double area=altura*largura;
        
        System.out.printf("Area retangulo %f \n", area);
    }
    
    public void definePerimetro(){
        double perimetro = (altura*2) + (largura*2);
        
        System.out.printf("Perimetro retangulo %f \n", perimetro);
    }

}
