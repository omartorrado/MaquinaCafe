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
public class Monedero {
    //llevaremos la cuenta en centimos
    private int saldo;
    private int[] precio={50,40,60};

    public int getPrecio(int producto) {
        return precio[producto];
    }
                
    public int comprobarSaldo(){
        return saldo;
    }
    
    public void aumentarSaldo(int cantidad){
        //Meter una comprobacion de que cantidad es positiva?
        saldo+=cantidad;
    }
    
    public int devolverSaldo(){
        int vuelta=saldo;
        saldo=0;
        return vuelta;
    }
}
