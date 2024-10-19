package aula11;

public class TrabalhoPOO {

    public static void main(String[] args) {
        Aluno a1 = new Aluno("mateus", 18,"M");
        
        a1.setCurso("Informática");
        a1.setMatricula(1111);
        a1.pagarMensalidade();
        
        Bolsista b1 = new Bolsista("Juvenal", 49, "M");
        b1.setMatricula(22222);
        b1.setBolsa(16.5f);
        b1.pagarMensalidade();
        b1.toString();
    }
}
