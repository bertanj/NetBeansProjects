package aula09;

public class Aula09 {
    public static void main(String[] args) {
        Pessoa p1 = new Pessoa("Mateus", 17,"Homem");
        Livro l1 = new Livro("Harry Potter", "J.K Rolling", 856, p1);
        l1.abrir();
        l1.folhear(156);
        l1.detalhes();
    }
    
}
