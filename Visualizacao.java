/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package projetofinaljava;

/**
 *
 * @author Casa
 */
public class Visualizacao {
    
    private Gafanhoto espectador;
    private Video filme;

    public Visualizacao(Gafanhoto espectador, Video filme) {
        this.espectador = espectador;
        this.filme = filme;
        this.espectador.setTotAssistido(this.espectador.getTotAssistido()+1);
        this.filme.setViews(this.filme.getViews()+1);
    }

    
    
    
    public void avaliar(){
        this.filme.setAvaliacao(5);       
        
    }
    public void avaliar(int nota){
        this.filme.setAvaliacao(nota);
        
    }
    public void avaliar(float porc){
        int tot = 0;
        if (porc <=50){
            tot=5;
        }else{
            tot=10;
        }
        
    }
    

    public Gafanhoto getEspectador() {
        return espectador;
    }

    public void setEspectador(Gafanhoto espectador) {
        this.espectador = espectador;
    }

    public Video getFilme() {
        return filme;
    }

    public void setFilme(Video filme) {
        this.filme = filme;
    }

    @Override
    public String toString() {
        return "Visualizacao{" + "espectador=" + espectador + ", filme=" + filme + '}';
    }
    
     
    
}
