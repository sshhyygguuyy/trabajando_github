/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package juego;

import java.util.LinkedList;
import java.util.List;

/**
 *
 * @author María Á y Adrián L
 */
public class Lista {
    
    private List<Partida> resultados=new LinkedList<>();
    private Partida persona;
    
    public Lista(){}
    
    public Lista(List<Partida> resultados){
        this.resultados=resultados;
    }

    public List<Partida> getResultados() {
        return resultados;
    }

    public void setResultados(List<Partida> resultados) {
        this.resultados = resultados;
    }
    
    
    public void jugar(){
        
        persona=new Partida();
        
        persona.jugadorRandom();
        
        resultados.add(persona); //metemos a la persona que tiene el nombre y puntos del metodo jugar
    }
    
    public void buscarGanador(){
        
        int max=0;
        String nom="";
        for (int i=0; i<resultados.size(); i++) {
            if(resultados.get(i).getPuntos()>max){
                max=resultados.get(i).getPuntos();
                nom=resultados.get(i).getNombre();
            } 
        }
        System.out.println("El ganador es................. CHAN CHAN CHAAAN........");
        System.out.println("........................................");
        System.out.println(".");
        System.out.printf("%s!!!!",nom);
        System.out.println("");
        System.out.println(" Con una puntuación de.................");
        System.out.println("................. CHAN CHAN CHAAAN........");
        System.out.println("........................................");
        System.out.printf("%d", max);
        System.out.println("");
        
    }
    
    public void verRanking(){
        
        persona=new Partida();
        
        persona.verJugador();
        for (int i=0; i<resultados.size(); i++) {
            System.out.println(resultados.get(i).verJugador()); 
        }
        
    }
    
}
