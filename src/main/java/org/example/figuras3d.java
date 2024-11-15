package org.example;

public class figuras3d extends figurasGeometricas {
    private double lado;
    private int nlados;
    private int ncaras;

    public figuras3d() {
    }
    public figuras3d(String tipo,double lado, int nlados, int ncaras) {
        super(tipo);
        this.lado = lado;
        this.nlados = nlados;
        this.ncaras = ncaras;
    }
    public double getLado() {
        return lado;
    }
    public void setLado(double lado) {
        this.lado = lado;
    }
    public int getNcaras() {
        return ncaras;
    }
    public void setNcaras(int ncaras) {
        this.ncaras = ncaras;
    }
    public int getNlados() {
        return nlados;
    }
    public void setNlados(int nlados) {
        this.nlados = nlados;
    }

    public void calcularArea(){
        System.out.println("Area: ");
    }
    public void calcularVolumen(){
        System.out.println("Volume: ");
    }
    public void mostrarDatos3d(){
        System.out.println("Datos 3D: ");
    }
}
