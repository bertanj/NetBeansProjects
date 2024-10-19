
package aula05ex;

public class ContaBanco {
    //Atributos
    public int numConta;
    protected String tipo;
    private String dono;
    private double saldo;
    private boolean status;
    
    //Metodos
    public void estadoAtual(){
        System.out.println("----------------------------------");
        System.out.println("Conta: "+ this.getNumConta());
        System.out.println("Tipo: "+ this.getTipo());
        System.out.println("Dono: "+this.getDono());
        System.out.println("Saldo: "+ this.getSaldo());
        System.out.println("Status: "+ this.getStatus());
    }
    
    public void abrirConta(String t){
        this.setTipo(t);
        this.setStatus(true);
        if ("CC".equals(t)) {
            this.setSaldo(50);   
        } else if("CP".equals(t)){
            this.setSaldo(150);
        }
        System.out.println("Conta aberta com sucesso!");
    }
    
    public void fecharConta(){
        if(this.getSaldo()> 0){
            System.out.println("Realize o saque antes de fechar a conta!");
        }else if(this.getSaldo()<0){
            System.out.println("Conta não pode ser fechada pois está em débito!");
        }else{
            this.setStatus(false);
            System.out.println("Conta fechada com sucesso!");
        }
    }
    
    public void depositar(double v){
        if (this.getStatus()){
            this.setSaldo(this.getSaldo() + v);
            System.out.println("Depósito realizado na conta de " + this.getDono());
        }else{
            System.out.println("Impossível depositar em uma conta fechada!");
        }
    }
    
    public void sacar(double v){
        if (this.getStatus()){
            if (this.getSaldo() >= v){
                this.setSaldo(this.getSaldo() - v);
                System.out.println("Saque realizado na conta de " + this.getDono());
            }else{
                System.out.println("Saldo insuficiente para saque!");
            }
        }else{
            System.out.println("impossível sacar de uma conta fechada!");
        }
    }
    
    public void pagarMensal(){
        double v=0;
        
        if("CC".equals(this.getTipo())){
            v = 12;
        }else if("CP".equals(this.getTipo())){
            v = 20;
        }
        
        if(this.getStatus()){
            this.setSaldo(this.getSaldo() - v);
            System.out.println("Mensalidade paga com sucesso por "+ this.getDono());
        }else{
            System.out.println("impossível pagar uma conta fechada!");
        }
    
    }
    
    //Metodos especiais
    public void ContaBanco(){ //Metodo construtor
       this.setSaldo(0);
       this.setStatus(false);
               
    }
    
    public int getNumConta(){
        return this.numConta;
    }
    
    public void setNumConta(int num){
        numConta = num;
        
    }
    
    public String getTipo(){
        return this.tipo;
    }
    
    public void setTipo(String tip){
        tipo = tip;
    }

    public String getDono() {
        return dono;
    }

    public void setDono(String dono) {
        this.dono = dono;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public boolean getStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }
    
    
}
