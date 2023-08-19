package com.example.Hijo;
import com.example.Padre.Pizza;
public class Topping {
    private String nombre;


    public Topping(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void Agregar (Pizza pizza) {
        String ingredientesUsados = pizza.getIngredientes();
        if (!ingredientesUsados.isEmpty()) {
            ingredientesUsados += ", ";
        }
        ingredientesUsados += this.nombre;
        pizza.setIngredientes(ingredientesUsados);
    }
}
