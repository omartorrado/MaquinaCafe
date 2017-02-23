/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cdmaquinacafe;

/**
 *
 * @author otorradomiguez
 */
public class Display {
    
    public static void verAzucar(Maquina m1){
        System.out.println("Azucar: "+m1.getAzucar());
    }
    
    public static void verSaldo(Monedero m1){
        System.out.println("SAldo: "+m1.comprobarSaldo());
    }
    
    public static void verPrecio(Monedero m1, int producto){
        System.out.println("Precio: "+m1.getPrecio(producto));
    }
    
    public static void preparando(int producto){
        System.out.println("Preparando producto nº"+producto);
    }
  
}
