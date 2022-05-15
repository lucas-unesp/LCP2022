package bc.unesp.rc.lcp_lista01.ex04;

public class ChamaAnimal {

    public static void main(String[] args) {
        Cachorro cachorro = new Cachorro();
        cachorro.setIdade(2);
        cachorro.setNome("");
        
        cachorro.emitirSom();
        cachorro.correr();
        
        Gato gato = new Gato();
        gato.setIdade(4);
        gato.setNome("");
        
        gato.emitirSom();
        gato.correr();
        gato.pular();
        
        Passaro passaro = new Passaro();
        passaro.setIdade(1);
        passaro.setNome("");
        
        passaro.emitirSom();
        passaro.voar();      
        
    }
    
}
