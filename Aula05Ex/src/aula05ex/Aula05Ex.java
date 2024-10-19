package aula05ex;

public class Aula05Ex {

    public static void main(String[] args) {
        ContaBanco p1 = new ContaBanco();
        p1.setNumConta(1111);
        p1.setDono("Mateus");
        p1.abrirConta("CC");
        p1.depositar(100);
        p1.fecharConta();
        
        p1.estadoAtual();
        
        ContaBanco p2 = new ContaBanco();
        p2.setNumConta(2222);
        p2.setDono("Maria");
        p2.abrirConta("CP");
        p2.depositar(500);
        p2.sacar(100);
        
        p2.estadoAtual();
        
        
    }
    
}
