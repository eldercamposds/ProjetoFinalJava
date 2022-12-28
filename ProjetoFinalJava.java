/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package projetofinaljava;

/**
 *
 * @author Casa
 */
public class ProjetoFinalJava {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Video v[];
        Gafanhoto g[] = new Gafanhoto[2];
        
        v = new Video[3];
        v[0] = new Video("Aula 1 de Poo");
        v[1] = new Video("Aula 12 de PHP");
        v[2] = new Video("Aula 10 de HTML");
        
        g[1]=new Gafanhoto("Jubileu", 22, "M", "juba");
        
        Visualizacao vis [] = new Visualizacao[5];
        vis[0]= new Visualizacao( g[1], v[0]);
        vis[0].avaliar();
        vis[1]= new Visualizacao( g[1], v[1]);
        vis[1].avaliar(87.0f);
        
        System.out.println(v[0].toString());
        System.out.println("-------------");
        System.out.println(vis[0].toString());
        System.out.println("-------------");
        System.out.println(vis[1].toString());
        
    }
    
}
