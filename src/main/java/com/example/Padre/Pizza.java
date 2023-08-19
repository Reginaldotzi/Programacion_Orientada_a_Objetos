package com.example.Padre;

public class Pizza {
    private String nombre;
    private double precio;
    private String ingredientes;

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public void setIngredientes(String ingredientes) {
        this.ingredientes = ingredientes;
    }

    public String getNombre() {
        return nombre;
    }

    public double getPrecio() {
        return precio;
    }

    public String getIngredientes() {
        return ingredientes;
    }

    public Pizza(String nombre, double precio, String ingredientes) {
        this.nombre = nombre;
        this.precio = precio;
        this.ingredientes = ingredientes;
    }

    public String obtenerDetalles()
    {
        return "*Nombre: " + this.getNombre() + "\n*Precio: " + this.getPrecio() + "\n*Ingredientes: " + this.getIngredientes();
    }

    public void Preparar()
    {
        System.out.println("La pizza esta lista! A disfrutar ;D");
    }

}
