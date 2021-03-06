/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.ucundi.carrerahilos;

/**
 *  Clase que guarda los valores de un equipo
 * @author Eduard Fierro, Arley Rivera
 */

public class Equipo {
   
    /**
     * Variables estaticas que guardan colores 
     */
    public static final String ANSI_RED = "\u001B[31m";
    public static final String ANSI_GREEN = "\u001B[32m";
    public static final String ANSI_BLUE = "\u001B[34m";
    /**
     * Variable que guarda el nombre del equipo
     */
    private String nombreEquipo;
    /**
     * Variable que gusrada la posicion anterios de un corredor
     */
    private int anterior;
    /**
     * Contructor de la clase
     * @param nombre 
     */
    public Equipo(String nombre) {
        this.nombreEquipo = nombre;
    }
    /**
     * Metodo que soncroniza tanto la impresion como los hilos
     * @return la impresion de los equipos
     */
    public synchronized String sincronizarImpresion(){
        String imprimir="";
        imprimir = "\n" + nombreEquipo + " ";
        for (int i = 0; i <= 100; i++) {
            if (i == 33) {
                if(nombreEquipo=="Equipo Rojo")
                {imprimir += ""+ANSI_RED+"||";}
                else if(nombreEquipo=="Equipo Azul")
                {imprimir += ""+ANSI_BLUE+"||";}
                else{imprimir += ""+ANSI_GREEN+"||";}
            } else if (i == 66) {
                imprimir += "||";
            } else if (i == anterior) {
                imprimir += "/*";
            } else {
                imprimir += "_";
            }
            
        } 
        return imprimir;
        
    }
    /**
     * 
     * @return 
     */
    public String getNombreEquipo() {
        return nombreEquipo;
    }
    /**
     * 
     * @param nombre 
     */
    public void setNombreEquipo(String nombre) {
        this.nombreEquipo = nombreEquipo;
    }
    /**
     * 
     * @return 
     */
    public int getAnterior() {
        return anterior;
    }
    /**
     * 
     * @param anterior 
     */
    public void setAnterior(int anterior) {
        this.anterior = anterior;
    }
    

    /**
     * Metodo usado para poder limpiar la consola 
     */
    public void limpiaConsola(){
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        
    }
}

