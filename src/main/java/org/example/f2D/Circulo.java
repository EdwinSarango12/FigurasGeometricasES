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
        double areaCirculo = Math.PI * radio * radio;
        System.out.println("Area circulo: "+ areaCirculo);
    }
    @Override
    public void calcularPerimetro(){
        double perimetroCirculo = 2 * Math.PI * radio;
        System.out.println("Perimetro circulo: "+ perimetroCirculo);
    }
    @Override
    public void mostrarDatos(){
        System.out.println("datos Circulo");
    }
}
