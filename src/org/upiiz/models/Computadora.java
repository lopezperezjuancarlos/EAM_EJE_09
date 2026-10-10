package org.upiiz.models;

public class Computadora {
    private String numeroSerie;
    private String codigo;
    private String marca;
    private float precio;

    //Constructor
    public Computadora(String numeroSerie, String marca, float precio) {
        this.numeroSerie = numeroSerie;
        this.marca = marca; //La marca que aparece en esta clase viene como parámetro
        this.precio = precio;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getMarca(){
        return this.marca;
    }
}