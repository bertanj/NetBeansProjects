package aula11;

public class Aluno extends Pessoa{
    //Atributos
    private int matricula;
    private String curso;

    //Construtor da classe abstrata Pessoa
    public Aluno(String nome, int idade, String sexo) {
        super(nome, idade, sexo);
    }
    
    //Metodos
    public void pagarMensalidade(){
        System.out.println("Pagando mensalidade de aluno");
    }
    
    //Metodos especiais
    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }
    
}
