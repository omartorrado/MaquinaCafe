/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cdmaquinacafe;

import javax.swing.JOptionPane;

/**
 *
 * @author otorradomiguez
 */
public class CDMaquinaCafe {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Maquina maquina1 = new Maquina();
        Monedero monedero1 = new Monedero();

        while (maquina1.isPreparando() == false) {
            int select = Integer.parseInt(JOptionPane.showInputDialog("Elije una opcion:\n1.Meter monedas\n2.Cancelar\n3.Té\n4.Café\n5.Chocolate\n6.Mas azucar\n7.Menos azucar"));
            switch (select) {
                case 1:
                    //introducir dinero
                    monedero1.aumentarSaldo(Integer.parseInt(JOptionPane.showInputDialog("Indique que moneda en centimos:")));
                    Display.verSaldo(monedero1);
                    break;
                case 2:
                    //cancelar
                    monedero1.devolverSaldo();
                    Display.verSaldo(monedero1);
                    break;
                case 3:
                    //te
                    if (monedero1.comprobarSaldo() >= monedero1.getPrecio(0)) {
                        maquina1.preparar(0);
                                                } else {
                        Display.verPrecio(monedero1, 0);
                    }
                    break;
                case 4:
                    //cafe
                    if (monedero1.comprobarSaldo() >= monedero1.getPrecio(1)) {
                        maquina1.preparar(1);

                    } else {
                        Display.verPrecio(monedero1, 1);
                    }
                    break;
                case 5:
                    //chocolate
                    if (monedero1.comprobarSaldo() >= monedero1.getPrecio(2)) {
                        maquina1.preparar(2);

                    } else {
                        Display.verPrecio(monedero1, 2);
                    }
                    break;
                case 6:
                    //azucar+
                    maquina1.masAzucar();
                    Display.verAzucar(maquina1);
                    break;
                case 7:
                    //azucar-
                    maquina1.menosAzucar();
                    Display.verAzucar(maquina1);
                    break;
            }
        }
    }

}
