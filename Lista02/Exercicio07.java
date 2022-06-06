package bc.unesp.rc.lcp_lista02;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Exercicio07 {
    
    public static void main(String[] args) {
        List<Aluno> alunos = new ArrayList<>();
        Scanner scan = new Scanner(System.in);     
        
        int op = -1;

        while (op != 6) {
            op = leitura();

            switch (op) {
                case 1: {
                    Aluno aluno = new Aluno();
                    
                    System.out.print("Digite o nome do aluno: ");
                    String nome = scan.nextLine();
                    aluno.setNome(nome);
                    
                    System.out.print("Digite R.A. do aluno: ");
                    String ra = scan.nextLine();
                    aluno.setRa(ra);
                    
                    System.out.print("Digite a idade do aluno: ");
                    int idade = Integer.parseInt(scan.nextLine());
                    aluno.setIdade(idade);
                    
                    System.out.print("Digite o curso do aluno: ");
                    String curso = scan.nextLine();
                    aluno.setCurso(curso);
                    
                    alunos.add(aluno);
                    System.out.println("Aluno adicionado!");
                }
                break;
                case 2: {
                    System.out.print("Digite R.A. do aluno que deseja excluir: ");
                    String ra = scan.nextLine();
                    
                    boolean removido = alunos.removeIf(aluno -> aluno.getRa().equals(ra));
                    if (removido) {
                        System.out.println("Aluno removido!");
                    } else {
                        System.out.println("RA não existente.");
                    }
                }
                break;
                case 3: {
                    for (Aluno aluno: alunos) {
                        System.out.println(aluno.toString());
                    }
                }
                break;
                case 0: {
                    System.out.println("Saindo...");
                    op = 6;
                }
                break;
            }
        }       
        
        
    }
    
    
    private static int leitura() {
        System.out.println("\nMenu");
        
        System.out.println("1 - Adicionar");
        System.out.println("2 - Remover");
        System.out.println("3 - Exibir todos");
        System.out.println("0 - Sair");
        
        System.out.print("Opcao: ");
        Scanner sc = new Scanner(System.in);

        return sc.nextInt();
    }
}
