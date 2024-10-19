package aula12;

public class Mamifero extends Animal{
    //Atributos
    protected String corPelo;
    
    //Metodos
    @Override
    public void locomover(){
        System.out.println("Correndo...");
    }

    @Override
    public void alimentar() {
        System.out.println("Mamando (lá ele)");
    }

    @Override
    public void emitirSom() {
        System.out.println("Som mamifero");
    }
    
    //Get Set

    public String getCorPelo() {
        return corPelo;
    }

    public void setCorPelo(String corPelo) {
        this.corPelo = corPelo;
    }
    
}
