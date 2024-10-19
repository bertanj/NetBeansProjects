package aula07;
import java.util.Random;

public class Luta {
    //Atributos
    private Lutador desafiado;
    private Lutador desafiante;
    private int round;
    private boolean aprovada;
    
    //Metodos
    public void marcarLutta(Lutador l1,Lutador l2){
        if(l1.getCategoria().equals(l2.getCategoria()) && l1 != l2){
            this.aprovada = true;
            this.desafiado = l1;
            this.desafiante = l2;
        }else{
            this.aprovada = false;
            this.desafiado = null;
            this.desafiante = null;
        }
    }
    
    public void lutar(){
        if(this.aprovada){
            System.out.println("### DESAFIADO ###");
           this.desafiado.apresentar();
            System.out.println("### DESAFIANTE ###");
           this.desafiante.apresentar();
           
           //sorteio
           Random aleatorio = new Random();
           int vencedor = aleatorio.nextInt(3);
           
           switch(vencedor){
               case 0: //Empate
                   System.out.println("Empatou");
                   this.desafiado.empatarLuta();
                   this.desafiado.empatarLuta();
                   break;
                
               case 1: // GAnhou desafiado
                   System.out.println(this.desafiado.getNome()+ " venceu a luta!!!");
                   this.desafiado.ganharLuta();
                   this.desafiante.perderLuta();
                   break;
                   
               case 2: // GAnhou desafiante
                   System.out.println(this.desafiante.getNome()+" venceu a luta!!!");
                   this.desafiado.perderLuta();
                   this.desafiante.ganharLuta();
                   break;
           } 
        }else{
            System.out.println("Luta não pode acontecer!");
        }
    }
    
    //Metodos especiais

    public Lutador getDesafiado() {
        return desafiado;
    }

    public void setDesafiado(Lutador desafiado) {
        this.desafiado = desafiado;
    }

    public Lutador getDesafiante() {
        return desafiante;
    }

    public void setDesafiante(Lutador desafiante) {
        this.desafiante = desafiante;
    }
    
}
