package aula07;

public class Lutador {
    //Atributos
    private String nome;
    private String nacionalidade;
    private int idade;
    private float altura;
    private float peso;
    private String categoria;
    private int vitorias;
    private int derrotas;
    private int empates;
    
    //Metodos Publicos
     public void apresentar(){
        System.out.println("Lutador: "+ this.getNome());
        System.out.println("Origem:" + this.getNacionalidade());
        System.out.println(this.getIdade()+" anos");
        System.out.println(this.getAltura()+" m de altura");
        System.out.println("Pesando "+ this.getPeso()+"Kg");
        System.out.println("Ganhou: " + this.getVitorias());
        System.out.println("Perdeu: " + this.getDerrotas());
        System.out.println("Empatou: " + this.getEmpates());
    }
    
    public void status(){
        System.out.println(this.getNome());
        System.out.println("Peso "+ this.getCategoria());
        System.out.println(this.getVitorias()+" vitórias");
        System.out.println(this.getDerrotas()+" derrotas");
        System.out.println(this.getEmpates()+" empates");
    }
    
    public void ganharLuta(){
        this.setVitorias(this.getVitorias()+1);
    }
    
    public void perderLuta(){
        this.setDerrotas(this.getDerrotas()+1);
    }
    
    public void empatarLuta(){
        this.setEmpates(this.getEmpates()+1);
    }

    
    //Metodos especiais
    public Lutador(String no, String na, int id, double al, double pe, int vi, int de, int em) {
        this.nome = no;
        this.nacionalidade = na;
        this.idade = id;
        this.altura = (float) al;
        this.setPeso((float) pe);
        this.vitorias = vi;
        this.derrotas = de;
        this.empates = em;
        
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String no) {
        this.nome = no;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(float pe) {
        this.peso = pe;
        setCategoria();
    }

    public String getNacionalidade() {
        return nacionalidade;
    }

    public void setNacionalidade(String na) {
        this.nacionalidade = na;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int id) {
        this.idade = id;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(float al) {
        this.altura = al;
    }

    public int getVitorias() {
        return vitorias;
    }

    public void setVitorias(int vi) {
        this.vitorias = vi;
    }

    public int getDerrotas() {
        return derrotas;
    }

    public void setDerrotas(int de) {
        this.derrotas = de;
    }

    public int getEmpates() {
        return empates;
    }

    public void setEmpates(int em) {
        this.empates = em;
    }

    public String getCategoria() {
        return categoria;
    }
    
    private void setCategoria(){
        if(peso<53.2){
            this.categoria = "Inválido";
        }else if(peso <= 70.3){
            this.categoria = "Leve";
        }else if (peso <= 83.9){
            this.categoria = "Médio";
        }else if (peso <=120.2) {
            this.categoria = "Pesado";
        }else {
            this.categoria = "inválido";
        }
    }
    
   
}
