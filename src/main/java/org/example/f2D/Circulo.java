package org.example.f2D;

import org.example.figuras2d;

public class Circulo extends figuras2d {
    private double radio;

    public Circulo(){
    }

    public Circulo(String tipo, int nlado, double radio) {
        super(tipo, nlado);
        this.radio = radio;
    }

    public double getRadio(){
        return radio;
    }
    public void setRadio(double radio){
        this.radio = radio;
    }

    public void calcularAreaC(){
        System.out.println("Area circulo: ");
    }
    public void calcularPerimetroC(){
        System.out.println("Perimetro circulo: ");
    }
    public void mostrarCirculo(){
        System.out.println("datos Circulo");
    }
}
