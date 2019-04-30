/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package juego;

import java.util.Random;

/**
 *
 * @author María Á y Adrián L
 */
public class Partida {
    
    private String nombre;
    private int puntos;
    
    public Partida(){}
    
    public Partida(String nombre,int puntos){
        this.nombre=nombre;
        this.puntos=puntos;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getPuntos() {
        return puntos;
    }

    public void setPuntos(int puntos) {
        this.puntos = puntos;
    }
    
    
    public void jugadorRandom(){
        
        String nombres[]={"Cati","Coloretes","Haru","Se fue","Calcetines","Pelotudo el argentino","Bizcocho"};
        
        Random r=new Random();
        
        nombre=nombres[r.nextInt(nombres.length)];
        puntos=r.nextInt(999)*100;
    }
    
    public String verJugador(){
        return String.format("%-23s %-6d", nombre, puntos);
    }
}
