package bc.unesp.rc.lcp_lista01.ex05;

public class Biblioteca {
    
    public static void main(String[] args) {
        LivroGratuito livroBrecho = new LivroGratuito();
        LivroPago livroNovo = new LivroPago();
        
        livroBrecho.setTitulo("Hobbit");
        
        livroNovo.setTitulo("Duna");
        livroNovo.setValor(49.99);
        
        System.out.println("Mostrando livro gratuito:");
        System.out.println(livroBrecho.getTitulo());
        
        System.out.println("Mostrando livro pago:");
        System.out.println(livroNovo.getTitulo());
        System.out.println(livroNovo.getValor());
        
        
    }

}
