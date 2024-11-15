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

    public void calcularAreaCu() {
        System.out.println("Area Cuadrado: ");
    }
    public void calcularPerimetroCu() {
        System.out.println("Perimetro Cuadrado: ");
    }
    public void mostrarCuadrado() {
        System.out.println("Cuadrado");
    }
}
