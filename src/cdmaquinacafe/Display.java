/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cdmaquinacafe;

/**
 *Engloba las funciones utilizadas para mostrar datos por pantalla
 * @author otorradomiguez
 */
public class Display {
    
    /**
     * Muestra por consola el valor de la variable azucar de la Maquina m1
     * @param m1 
     */
    public static void verAzucar(Maquina m1){
        System.out.println("Azucar: "+m1.getAzucar());
    }
    
    /**
     * Muestra por consola el valor de la variable saldo del Monedero m1
     * @param m1 
     */
    public static void verSaldo(Monedero m1){
        System.out.println("SAldo: "+m1.comprobarSaldo());
    }
    
    /**
     * Muestra por consola el valor de la variable precio para el elemento 
     * indicado por producto del monedero m1
     * @param m1
     * @param producto 
     */
    public static void verPrecio(Monedero m1, int producto){
        System.out.println("Precio: "+m1.getPrecio(producto));
    }
    
    /**
     * Muestra por consola el numero que indica que producto se esta preparando
     * @param producto 
     */
    public static void preparando(int producto){
        System.out.println("Preparando producto nº"+producto);
    }
  
}
