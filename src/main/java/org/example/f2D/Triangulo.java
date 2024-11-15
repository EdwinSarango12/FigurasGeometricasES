package org.example.f2D;

import org.example.figuras2d;
import java.lang.Math;

public class Triangulo extends figuras2d {
    private double base;
    private double altura;

    public Triangulo() {
    }

    public Triangulo(String tipo, int nlado, double base, double altura) {
        super(tipo, nlado);
        this.base = base;
        this.altura = altura;
    }

    public double getBase() {
        return base;
    }
    public void setBase(double base) {
        this.base = base;
    }
    public double getAltura() {
        return altura;
    }
    public void setAltura(double altura) {
        this.altura = altura;
    }

    @Override
    public void calcularArea() {
        double areaTriangulo = (base*altura)/2;
        System.out.println("Area triangulo: " + areaTriangulo);
    }

    @Override
    public void calcularPerimetro() {
        double perimetroTriangulo = Math.sqrt(base * base + altura * altura);
        System.out.println("Perimetro triangulo: " + perimetroTriangulo);
    }

    @Override
    public void mostrarDatos() {
        System.out.println("Triangulo");
    }

}
