package bc.unesp.rc.lcp_lista02;

import java.util.Scanner;

public class JogoVelha {
    
    public static void main(String[] args) {
        String[] jogoBoard = {"___","___","___"};
        Scanner scanner = new Scanner(System.in);
        String jogada = "";
        boolean fim = false;
        boolean ganhou = false;
        boolean jogador = false;
        int linha,coluna;
        char marcador;
        
        // Mostra tabuleiro
        for(String l : jogoBoard){
            System.out.println(l.replace("", " ").trim());
        }
        
        while(!fim && !ganhou){            
            // Computa jogada
            if(jogador ^= true){
                System.out.print("[Jogador 1] Informe uma linha e coluna(xy): ");
                jogada = scanner.nextLine();      
                marcador='X';
            }else{
                System.out.print("[Jogador 2] Informe uma linha e coluna(xy): ");
                jogada = scanner.nextLine();
                marcador='O';
            }
            linha = Integer.parseInt(jogada.substring(0, 1)) - 1;
            coluna = Integer.parseInt(jogada.substring(1, 2)) - 1;
            
            // Atualiza tabuleiro
            if(jogoBoard[linha].charAt(coluna) != '_'){
                System.out.println("Jogada inválida!");
            }else{
                String aux = jogoBoard[linha];
                String novaLinha = aux.substring(0,coluna) + marcador + aux.substring(coluna+1);
                jogoBoard[linha] = novaLinha;
            }
            
            // Verificando ganhador
            for(int j = 0; j < 3; j++){
                if(validaTabuleiro(jogoBoard[0].charAt(j), jogoBoard[1].charAt(j), jogoBoard[2].charAt(j))){
                    ganhou = true;
                }
                if(validaTabuleiro(jogoBoard[j].charAt(0), jogoBoard[j].charAt(1), jogoBoard[j].charAt(2))){
                    ganhou = true;
                }
            }
            if(validaTabuleiro(jogoBoard[0].charAt(0), jogoBoard[1].charAt(1), jogoBoard[2].charAt(2))){
                    ganhou = true;
            }
            if(validaTabuleiro(jogoBoard[0].charAt(2), jogoBoard[1].charAt(1), jogoBoard[2].charAt(0))){
                    ganhou = true;
            }
            
            
            // Mostra tabuleiro
            for (String l : jogoBoard) {
                System.out.println(l.replace("", " ").trim());
            }
            
            // Declara vencedor
            if(ganhou){
                if(marcador == 'X'){
                    System.out.println("Jogador 1 vence a partida.");
                }else{
                    System.out.println("Jogador 2 vence a partida.");
                }
            }
            
            // Não houve vencedor
            if(!ganhou && !jogoBoard[0].contains("_") && !jogoBoard[1].contains("_") && !jogoBoard[2].contains("_")){
                fim = true;
                System.out.println("Não houve vencedor.");
            }
        }
    }
    
    static Boolean validaTabuleiro(char a, char b, char c){
        return (a == b && b == c && b != '_');
    }

}
