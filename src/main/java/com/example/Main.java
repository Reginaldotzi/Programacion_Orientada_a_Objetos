package com.example;

import com.example.Padre.Pizza;
import com.example.Hijo.PizzaItaliana;
import com.example.Hijo.Topping;

public class Main {

    public static void main (String [] args) {
        Pizza PizzaOriginal = new Pizza("Pizza Original", 20.0, " tomate, queso, jamon, cebolla");
        Topping PizzaPeperoni = new Topping("peperoni");
        PizzaPeperoni.Agregar(PizzaOriginal);
        System.out.println(PizzaOriginal.obtenerDetalles());
        PizzaOriginal.Preparar();


        PizzaItaliana PizzaItaliana = new PizzaItaliana("Pizza Italiana", 25.0, "tomate, queso, cebolla, pimiento,", "Italian", "30 minutos");
        Topping PizzaChampiñon = new Topping("Champiñones");
        PizzaChampiñon.Agregar(PizzaItaliana);
        System.out.println(PizzaItaliana.obtenerDetalles());
        PizzaItaliana.Preparar();
    }


}