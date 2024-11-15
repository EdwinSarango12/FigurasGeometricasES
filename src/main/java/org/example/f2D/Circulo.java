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

    @Override  /**/
    public void calcularArea(){
        System.out.println("Area circulo: ");
    }
    @Override
    public void calcularPerimetro(){
        System.out.println("Perimetro circulo: ");
    }
    @Override
    public void mostrarDatos(){
        System.out.println("datos Circulo");
    }
}
