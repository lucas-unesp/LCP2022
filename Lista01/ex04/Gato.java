package bc.unesp.rc.lcp_lista01.ex04;

public class Gato extends Animal {

    public void correr() {
        System.out.println("Correndo");
    }
    
    public void pular() {
        System.out.println("Pulando");
    }
    
    @Override
    public void emitirSom() {
         System.out.println("Miau");
    }

}
