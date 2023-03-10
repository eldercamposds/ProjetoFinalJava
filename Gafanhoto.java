/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package projetofinaljava;

/**
 *
 * @author Casa
 */
public class Gafanhoto  extends Pessoa{
    private String login;
    private int totAssistido;
    
    public Gafanhoto(String nome, int idade, String sexo, String login){
        super(nome, idade, sexo);
        this.setLogin(login);
        this.setTotAssistido(0);
    }
    
    public void viuMaisUm(){
        this.setTotAssistido(getTotAssistido()+1);
    }

    public String getLogin() {
        return login;
    }

    public final void setLogin(String login) {
        this.login = login;
    }

    public int getTotAssistido() {
        return totAssistido;
    }

    public final void setTotAssistido(int totAssitido) {
        this.totAssistido = totAssitido;
    }

    @Override
    public String toString() {
        return "Gafanhoto{" + super.toString() + "login=" + login + ", totAssistido=" + totAssistido + '}';
    }
    
}
