package bc.unesp.rc.lcp_lista01.ex04;

public class Passaro extends Animal {
    
    public void voar() {
        System.out.println("Voando");
    }

    @Override
    public void emitirSom() {
        System.out.println("Piu");
    }
    
}
