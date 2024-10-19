package aula14;

public class Aula14 {
    public static void main(String[] args) {
        Video v[] = new Video [3];
        
        v[0] = new Video("Aula 1 POO");
        v[1] = new Video("Aula 12 Java");
        v[2] = new Video("Aula 3 PHP");
        
        Gafanhoto g[] = new Gafanhoto[2];
        
        g[0] = new Gafanhoto("Mateus", 18, "M", "Bertanj");
        g[1] = new Gafanhoto("Ana", 29, "F", "Nanatgh");
        
        Visualizacao vis[] = new Visualizacao[5];
        vis[0] = new Visualizacao(g[0], v[2]);
        vis[0].avaliar(85.0);
        System.out.println(vis[0].toString());
        
        /*
        System.out.println("===Videos===");
        System.out.println(v[0].toString());
        System.out.println(v[1].toString());
        System.out.println(v[2].toString());
        System.out.println("===GAFANHOTOS===");
        System.out.println(g[0].toString());
        System.out.println(g[1].toString());*/
    }
    
}
