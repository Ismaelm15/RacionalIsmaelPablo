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
        this.nominador = nominador;
        this.denominador = denominador;
    }

    public Racional() {
        this.nominador=1;
        this.denominador=1;
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
    
    
    
}
