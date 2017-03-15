/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cdmaquinacafe;

/**
 *Esta clase lleva el control del stock, del azucar, y del estado de la maquina
 *Tambien incluye los metodos para controlar el funcionamiento de la maquina
 * @author otorradomiguez
 */
public class Maquina {

    //el tipo de producto se refiere al boton que se pulse
    //si se kiere cambiar hay k modificar precio en monedero
    private int[] stock = {40, 40, 0};
    private int azucar = 5;
    private boolean preparando = false;

    /**
     * Inicia el proceso de preparacion del elemento indicado por producto en caso 
     * de que el stock de dicho producto sea mayor que 0. Lo simula 
     * sacando por consola un mensaje al que se le van añadiendo puntos suspensivos 
     * a medida que se elabara el producto.
     * @param producto Un int indicando la posicion del producto en el array stock
     */
    public void preparar(int producto) {
        if (stock[producto] > 0) {
            preparando = true;
            int counter = 0;
            Display.preparando(producto);
            System.out.print("Preparando");
            do {
                try {
                    Thread.sleep(500);
                    System.out.print(".");
                    Thread.sleep(500);
                    System.out.print(".");
                    Thread.sleep(500);
                    System.out.print(".");
                    counter++;
                } catch (Exception e) {
                    System.out.println("ERROR");
                }
            } while (counter < 6);
            System.out.println(".");
            System.out.println("Producto listo");
        } else {
            System.out.println("Lo sentimos, producto agotado");
        }
        preparando=false;
    }

    /**
     * Devuelve el valor de la variable azucar
     * @return 
     */
    public int getAzucar() {
        return azucar;
    }

    /**
     * Devuelve true si el programa esta ejecutando el metodo preparar()
     * @return 
     */
    public boolean isPreparando() {
        return preparando;
    }

    /**
     * Incrementa en 1 el valor de la variable azucar. Maximo 10
     */
    public void masAzucar() {
        if (azucar < 10) {
            azucar++;
        }
    }

    /**
     * Reduce en 1 el valor de la variable azucar. Minimo 0
     */
    public void menosAzucar() {
        if (azucar > 0) {
            azucar--;
        }
    }
}
