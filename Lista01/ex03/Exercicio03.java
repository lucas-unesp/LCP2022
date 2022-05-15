package bc.unesp.rc.lcp_lista01.ex03;

public class Exercicio03 {
    
    public static void main(String[] args) {        
        Funcionario f1 = new Funcionario();
        f1.setNome("Joao Silva");
        f1.setIdade(25);
        f1.setSalario(2000);
        calcularContribuicaoFuncionario(f1);
        calcularContribuicaoEmpresa(f1);
        System.out.println(f1.toString());
        
        Funcionario f2 = new Funcionario();
        f2.setNome("Jose Santos");
        f2.setIdade(32);
        f2.setSalario(4000);
        calcularContribuicaoFuncionario(f2);
        calcularContribuicaoEmpresa(f2);
        System.out.println(f2.toString());
        
        Funcionario f3 = new Funcionario();
        f3.setNome("Maria Souza");
        f3.setIdade(47);
        f3.setSalario(5000);
        calcularContribuicaoFuncionario(f3);
        calcularContribuicaoEmpresa(f3);
        System.out.println(f3.toString());
        
        Funcionario f4 = new Funcionario();
        f4.setNome("Marcio Martins");
        f4.setIdade(53);
        f4.setSalario(6000);
        f4 = calcularContribuicaoFuncionario(f4);
        f4 = calcularContribuicaoEmpresa(f4);
        System.out.println(f4.toString());
        
        Funcionario f5 = new Funcionario();
        f5.setNome("Ana Faria");
        f5.setIdade(68);
        f5.setSalario(10000);
        f5 = calcularContribuicaoFuncionario(f5);
        f5 = calcularContribuicaoEmpresa(f5);
        System.out.println(f5.toString());
    }
    
    
    public static Funcionario calcularContribuicaoFuncionario(Funcionario funcionario) {
        double excedente = 0;
        double contribuicao = 0;
        double salario = funcionario.getSalario();
        
        if (salario > 5000) {
            excedente = salario - 5000;
            salario = 5000;
        }
        
        if (funcionario.getIdade() < 30) {
            contribuicao = salario * 0.20;
        } else if (funcionario.getIdade() < 40) {
            contribuicao = salario * 0.18;
        } else if (funcionario.getIdade() < 50) {
            contribuicao = salario * 0.12;
        } else if (funcionario.getIdade() < 60) {
            contribuicao = salario * 0.07;
        } else {
            contribuicao = salario * 0.03;
        }
        
        funcionario.setContribuicaoFuncionario(contribuicao);
        funcionario.setSalarioFinal(salario - contribuicao + excedente);
        
        return funcionario;
    }
    
    public static Funcionario calcularContribuicaoEmpresa(Funcionario funcionario) {
        double contribuicao = 0;
        double salario = funcionario.getSalario();
        
        if (salario > 5000) {
            salario = 5000;
        }
        
        if (funcionario.getIdade() < 30) {
            contribuicao = salario * 0.18;
        } else if (funcionario.getIdade() < 50) {
            contribuicao = salario * 0.15;
        } else if (funcionario.getIdade() < 60) {
            contribuicao = salario * 0.10;
        } else {
            contribuicao = salario * 0.04;
        }
        
        funcionario.setContribuicaoEmpresa(contribuicao);
        
        return funcionario;
    }

}
