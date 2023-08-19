package com.example.Hijo;
import com.example.Padre.Pizza;
public class PizzaItaliana extends Pizza{
    private String salsa;
    private String tiempo;

    public String getSalsa() {
        return salsa;
    }

    public void setSalsa(String salsa) {
        this.salsa = salsa;
    }

    public String getTiempo() {
        return tiempo;
    }

    public void setTiempo(String tiempo) {
        this.tiempo = tiempo;
    }

    public PizzaItaliana(String nombre, double precio, String ingredientes, String salsa, String tiempo) {
        super(nombre, precio, ingredientes);
        this.salsa = salsa;
        this.tiempo = tiempo;
    }
    public void Preparar()
    {
        System.out.println("Estamos agregandole la salsa...");
        System.out.println("Pizza Lista!");
    }

    public String obtenerDetalles()
    {
        return "*Nombre: " + this.getNombre() + "\n*Precio: " + this.getPrecio() + "\n*Ingredientes: " + this.getIngredientes() + "\n*Salsa: " + this.getSalsa() + "\n*Tiempo: " + this.getTiempo();
    }
}
