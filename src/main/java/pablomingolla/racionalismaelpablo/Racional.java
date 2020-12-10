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
public class Racional {

    int nominador;
    int denominador;

    public Racional(int nominador, int denominador) {
        if (denominador == 0) {
            this.denominador = 1;
            System.out.println("Se ha introducido un denominador 0 por lo tanto"
                    + " su nuevo valor pasa a ser 1");
        } else {
            this.nominador = nominador;
            this.denominador = denominador;
        }

    }

    public Racional() {
        this.nominador = 1;
        this.denominador = 1;
    }

    public int getNominador() {
        return nominador;
    }

    public int getDenominador() {
        return denominador;
    }

    public void setNominador(int nominador) {
        this.nominador = nominador;
    }

    public void setDenominador(int denominador) {
        this.denominador = denominador;
    }

    @Override
    public String toString() {
        return "Numero racional " + nominador + "/" + denominador;
    }

    public double suma(Racional objeto) {
        double resultado = 0;
        if (this.denominador == objeto.denominador) {
            resultado = (this.nominador + objeto.nominador) / this.denominador;
        } else {
            resultado = ((this.nominador * objeto.denominador) + (this.denominador * objeto.nominador)) / (this.denominador * objeto.denominador);
        }

        return resultado;
    }

    public void producto(Racional objeto) {

        this.nominador = this.nominador * objeto.nominador;
        this.denominador = this.denominador * objeto.denominador;
    }
}
