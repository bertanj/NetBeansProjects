package aula09;

public class Livro implements Publicacao {
    //Atributos
    private String titulo;
    private String autor;
    private int totPag;
    private int pagAtual;
    private boolean aberto;
    private Pessoa leitor;
    
    //Metodos publicos
    public void detalhes(){
        System.out.println("Livro está a berto? "+ getAberto());
        System.out.println("Titulo: "+ getTitulo());
        System.out.println("Autor: "+ getAutor());
        System.out.println("Total de páginas: "+getTotPag() );
        System.out.println("Página atual: "+ getPagAtual());
        System.out.println("Leitor: "+ leitor.getNome());
        
    }
    
    //Metodos especiais
    public Livro(String titulo, String autor, int totPag, Pessoa leitor){
        this.titulo = titulo;
        this.autor = autor;
        this.totPag= totPag;
        this.pagAtual = 0;
        this.aberto = false;
        this.leitor = leitor;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getTotPag() {
        return totPag;
    }

    public void setTotPag(int totPag) {
        this.totPag = totPag;
    }

    public int getPagAtual() {
        return pagAtual;
    }

    public void setPagAtual(int pagAtual) {
        this.pagAtual = pagAtual;
    }

    public boolean getAberto() {
        return aberto;
    }

    public void setAberto(boolean aberto) {
        this.aberto = aberto;
    }

    public Pessoa getLeitor() {
        return leitor;
    }

    public void setLeitor(Pessoa leitor) {
        this.leitor = leitor;
    }

    @Override
    public void abrir() {
        this.setAberto(true);
    }

    @Override
    public void fechar() {
        this.setAberto(false);
    }

    @Override
    public void folhear(int p) {
        if(p > this.getTotPag()){
            this.setPagAtual(0);
        }else{
            this.pagAtual = p;
        }
    }

    @Override
    public void avacarPag() {
        if(getAberto()){
            this.setPagAtual(getPagAtual()+1);
        }else{
            System.out.println("impossivel avançar pagina com o livro fechado!");
        }
    }

    @Override
    public void voltarPag() {
        if(getAberto()){
            this.setPagAtual(getPagAtual()-1);
        }else{
            System.out.println("impossivel avançar pagina com o livro fechado!");
        }
    }
    
}
