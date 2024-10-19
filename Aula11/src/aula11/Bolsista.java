package aula11;

public class Bolsista extends Aluno{
    //Atributos
    private float bolsa;

    //Construtor da classe abstrata Pessoa
    public Bolsista(String nome, int idade, String sexo) {
        super(nome, idade, sexo);
    }
    
    //Metodos
    public void renovarBolsa(){
        System.out.println("Renovando bolsa...");
    }
    
    @Override
    public void pagarMensalidade(){
        System.out.println("Pagamento facilitado por conta da bolsa!");
    }
    
    //Metodos especiais

    public float getBolsa() {
        return bolsa;
    }

    public void setBolsa(float bolsa) {
        this.bolsa = bolsa;
    }
    
}
