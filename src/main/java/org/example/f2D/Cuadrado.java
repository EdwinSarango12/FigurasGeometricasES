package org.example.f2D;

import org.example.figuras2d;

public class Cuadrado extends figuras2d {
    private double lado;
    public Cuadrado() {
    }

    public Cuadrado(String tipo, int nlado, double lado) {
        super(tipo, nlado);
        this.lado = lado;
    }

    public Cuadrado(double lado) {
        this.lado = lado;
    }
    public double getLado() {
        return lado;
    }
    public void setLado(double lado) {
        this.lado = lado;
    }

    @Override
    public void calcularArea() {
        double areaCuadrado = lado * lado;
        System.out.println("Area Cuadrado: "+ areaCuadrado);
    }
    @Override
    public void calcularPerimetro() {
        double perimetroCuadrado = lado * 4;
        System.out.println("Perimetro Cuadrado: "+ perimetroCuadrado);
    }
    @Override
    public void mostrarDatos() {
        System.out.println("Cuadrado");
    }
}
