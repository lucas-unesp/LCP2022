package bc.unesp.rc.lcp_lista01.ex04;

public class Cachorro extends Animal {
    
    public void correr() {
        System.out.println("Correndo");
    }

    @Override
    public void emitirSom() {
        System.out.println("Au au");
    }

}
