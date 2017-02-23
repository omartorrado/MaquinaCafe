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
public class Maquina {

    //el tipo de producto se refiere al boton que se pulse
    //si se kiere cambiar hay k modificar precio en monedero
    private int[] stock = {40, 40, 0};
    private int azucar = 5;
    private boolean preparando = false;

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

    public int getAzucar() {
        return azucar;
    }

    public boolean isPreparando() {
        return preparando;
    }

    public void masAzucar() {
        if (azucar < 10) {
            azucar++;
        }
    }

    public void menosAzucar() {
        if (azucar > 0) {
            azucar--;
        }
    }
}
