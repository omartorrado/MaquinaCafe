/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cdmaquinacafe;

/**
 *Esta clase lleva el control del saldo y de los precios de la maquina
 * @author otorradomiguez
 */
public class Monedero {
    //llevaremos la cuenta en centimos
    private int saldo;
    private int[] precio={50,40,60};

    /**
     * Devuelve el valor guardado en la posicion producto del array precio
     * @param producto
     * @return Un int indicando el precio para ese elemento
     */
    public int getPrecio(int producto) {
        return precio[producto];
    }
                
    /**
     * Devuelve el valor de la variable saldo
     * @return el saldo actual
     */
    public int comprobarSaldo(){
        return saldo;
    }
    
    /**
     * Incrementa el saldo en la cantidad indicada por cantidad
     * @param cantidad 
     */
    public void aumentarSaldo(int cantidad){
        //Meter una comprobacion de que cantidad es positiva?
        saldo+=cantidad;
    }
    
    /**
     * Devuelve el valor de saldo y lo pone a 0
     * @return el saldo restante
     */
    public int devolverSaldo(){
        int vuelta=saldo;
        saldo=0;
        return vuelta;
    }
}
