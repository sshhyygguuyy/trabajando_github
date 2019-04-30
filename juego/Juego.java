/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package juego;

import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author María Á y Adrián L
 */
public class Juego {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        System.out.println(" EJEMPLO DE CAMBIO EN GITHUB PARA OTRA RAMA!! ");
        
        Lista listaJuego=new Lista();
        int menu;
        //aqui el menu to wapo pa elegir
        do{
            System.out.println("0: Jugar || 1: Lista || 2: Ganador || Otro: Salir");
            Scanner sc=new Scanner(System.in);
            menu=sc.nextInt();
            switch(menu){
                case 0: listaJuego.jugar();
                    break;
                case 1: listaJuego.verRanking();
                    break;
                case 2: listaJuego.buscarGanador();
                    break;
                default: menu=3;
            }
        }while(menu!=3);
    }
    
}
