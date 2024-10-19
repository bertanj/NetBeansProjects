package aula06;

public class ControleRemoto implements Controlador {
    //Atributos
    private int volume;
    private boolean ligado;
    private boolean tocando;
    
    //Metodos especiais
    public ControleRemoto() {
        this.volume = 50;
        this.ligado = false;
        this.tocando = false;
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    public boolean getLigado() {
        return ligado;
    }

    public void setLigado(boolean ligado) {
        this.ligado = ligado;
    }

    public boolean getTocando() {
        return tocando;
    }

    public void setTocando(boolean tocando) {
        this.tocando = tocando;
    }
    
    //Metodos abstratos

    @Override
    public void ligar() {
        this.setLigado(true);
    }

    @Override
    public void desligar() {
        this.setLigado(false);
    }

    @Override
    public void abrirMenu() {
        System.out.println("---MENU---");
        System.out.println("Está ligado? "+ this.getLigado());
        System.out.println("Está tocando?" + this.getTocando());
        System.out.println("Volume: " + this.getVolume());
        for (int i = 0; i <= this.getVolume() ; i+=10) {
            System.out.print("|");
        }
        System.out.println("");
    }

    @Override
    public void fecharMenu() {
        System.out.println("Fechando Menu...");   
    }

    @Override
    public void maisVolume() {
        if(getLigado()){
            setVolume(getVolume()+5);
        }
    }

    @Override
    public void menosVolume() {
        if(getLigado()){
            setVolume(getVolume() - 5);
        }
    }

    @Override
    public void ligarMudo() {
        if(getLigado() && getVolume()>0){
            setVolume(0);
        }
    }

    @Override
    public void deligarMudo() {
        if (getLigado() && getVolume()== 0){
            setVolume(50);
        }
    }

    @Override
    public void play() {
        if(getLigado() && !getTocando()){
            setTocando(true);
        }
    }

    @Override
    public void pause() {
        if (getLigado() && getTocando()){
            setTocando(false);
        }
    }
        
}
