package org.example;

import org.example.f2D.Circulo;
import org.example.f2D.Triangulo;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        /*figurasGeometricas figura1= new figurasGeometricas();
        figura1.mostrarDatos();
        figuras2d figura2D1= new figuras2d();
        figura2D1.mostrarDatos();
        figura2D1.mostrarDatos2d();
        figuras3d figura3D1= new figuras3d();
        figura3D1.mostrarDatos();
        figura3D1.mostrarDatos3d();

        Circulo circulo1= new Circulo();
        circulo1.mostrarDatos();*/

        Triangulo triangulo1= new Triangulo();
        System.out.println("-------------Calculo del Triangulo--------------");
        System.out.println("Ingrese la base: ");
        double base = sc.nextDouble();
        triangulo1.setBase(base);
        System.out.println("Ingrese la altura: ");
        double altura = sc.nextDouble();
        triangulo1.setAltura(altura);

        triangulo1.calcularArea();
        triangulo1.calcularPerimetro();



    }
}