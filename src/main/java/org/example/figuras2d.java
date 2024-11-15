package org.example;

public class figuras2d extends figurasGeometricas {
    private int nlado;

    public figuras2d() {
    }
    public figuras2d(String tipo, int nlado) {
        super(tipo);
        this.nlado = nlado;
    }

    public int getNlado() {
        return nlado;
    }
    public void setNlado(int nlado) {
        this.nlado = nlado;
    }



    public void calcularArea(){
        System.out.println("Area: ");
    }
    public void calcularPerimetro(){
        System.out.println("Perimetro: ");
    }
    @Override
    public void mostrarDatos(){
        System.out.println("datos 2D:");
    }

}
