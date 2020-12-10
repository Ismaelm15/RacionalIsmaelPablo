/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pablomingolla.racionalismaelpablo;

/**
 *
 * @author Pablo Mingolla
 */
public class AppRacional {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Racional z = new Racional(4, 5);
        Racional k = new Racional(3, 4);

        Racional aleatorio = new Racional();
        aleatorio = aleatorio.aleatorio();
        System.out.printf("El numero racional aleatorio es %.3f\n", (double) aleatorio.nominador / aleatorio.denominador);
        System.out.printf("El numero racional z es %.3f\n", (double) z.nominador / z.denominador);
        System.out.printf("El numero racional x es %.3f\n", (double) k.nominador / k.denominador);

        System.out.println("La suma de los numeros z y k son " + z.suma(k));

        if (Racional.igualdad(z, k)) {
            System.out.println("Los racionales " + z.toString() + " y " + k.toString() + " son iguales.");
        } else {
            System.out.println("Los racionales " + z.toString() + " y " + k.toString() + " no son iguales.");
        }

        Racional a = new Racional();
        a = a.division(z, k);
        a.imprimirConsola();
    }

}
