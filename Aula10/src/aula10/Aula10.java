package aula10;

public class Aula10 {

    public static void main(String[] args) {
      Pessoa  p1 = new Pessoa();
      Aluno  p2 = new Aluno();
        Professor p3 = new Professor();
        Funcionario p4 = new Funcionario();
        
        p1.setNome("Pedro");
        p2.setNome("Maria");
        p3.setNome("Claudio");
        p4.setNome("Fabiana");
        
        p2.setCurso("Informatica");
        p3.setSalario(2500.00);
        p4.setSetor("Estoque");
        
        p1.setIdade(18);
        p1.setSexo("M");
        
        System.out.println(p1.toString());
        System.out.println(p2.toString());
        System.out.println(p3.toString());
        
        //p1.receberAum(550.20);
        //p2.mudarTrabalho()
        //p4.cancelarMatr();
        
    }
    
}
