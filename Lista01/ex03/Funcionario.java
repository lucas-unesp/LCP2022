package bc.unesp.rc.lcp_lista01.ex03;

public class Funcionario {
    
    private String nome;
    private int idade;
    private double salario;
    private double contribuicaoFuncionario;
    private double contribuicaoEmpresa;
    private double salarioFinal;

    public Funcionario() {
    }
    
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public double getContribuicaoFuncionario() {
        return contribuicaoFuncionario;
    }

    public void setContribuicaoFuncionario(double contribuicaoFuncionario) {
        this.contribuicaoFuncionario = contribuicaoFuncionario;
    }

    public double getContribuicaoEmpresa() {
        return contribuicaoEmpresa;
    }

    public void setContribuicaoEmpresa(double contribuicaoEmpresa) {
        this.contribuicaoEmpresa = contribuicaoEmpresa;
    }

    public double getSalarioFinal() {
        return salarioFinal;
    }

    public void setSalarioFinal(double salarioFinal) {
        this.salarioFinal = salarioFinal;
    }

    @Override
    public String toString() {
        return "Funcionario(" 
                + "nome=" + nome 
                + " / idade=" + idade 
                + " / salario=" + String.format("%,.2f", salario)
                + " / contribuicaoFuncionario=" + String.format("%,.2f", contribuicaoFuncionario)
                + " / contribuicaoEmpresa=" + String.format("%,.2f", contribuicaoEmpresa)
                + " / salarioFinal=" + String.format("%,.2f", salarioFinal)
                + ')';
    }

//    @Override
//    public String toString() {
//        return "Funcionario{" + "nome=" + nome + ", idade=" + idade + ", salario=" + salario + ", contribuicaoFuncionario=" + contribuicaoFuncionario + ", contribuicaoEmpresa=" + contribuicaoEmpresa + ", salarioFinal=" + salarioFinal + '}';
//    }

    
}
