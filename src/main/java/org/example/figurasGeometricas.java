package org.example;

public class figurasGeometricas {
    private String tipo;

    public figurasGeometricas() {
    }
    public figurasGeometricas(String tipo) {
        this.tipo = tipo;
    }
    public String getTipo() {
        return tipo;
    }
    public void setTipo(String tipo) {
        this.tipo = tipo;
    }


    public void mostrarDatos() {
        System.out.println("Datos Generales: ");
    }
}
