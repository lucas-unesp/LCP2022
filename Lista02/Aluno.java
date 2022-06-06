package bc.unesp.rc.lcp_lista02;

public class Aluno {
    
    private String nome;
    private String ra;
    private int idade;
    private String curso;

    public Aluno() {
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getRa() {
        return ra;
    }

    public void setRa(String ra) {
        this.ra = ra;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    @Override
    public String toString() {
        return "Aluno{" + "nome=" + nome + ", ra=" + ra + ", idade=" + idade + ", curso=" + curso + '}';
    }
    
    

}
