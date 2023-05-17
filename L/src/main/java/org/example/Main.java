package org.example;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        /*si una clase A es una superclase de una clase B, cualquier instancia de la clase A debe poder ser
        *reemplazada por una instancia de la clase B sin alterar el comportamiento del programa.
        * */

        List<IPagable> lista = new ArrayList<>();
        lista.add(new Producto("Libro", 20.0));
        lista.add(new Servicio("Mantenimiento", 15.0, 2));

        System.out.println(lista.get(0).getPrecio());
        System.out.println(lista.get(1).getPrecio());


        //Otra implementacion
        IPagable pag1 = new Producto("Libro D,", 40);
        IPagable pag2 = new Servicio("Libro D,", 40, 2);

        pag1.getPrecio(); //solo tengo acceso a los metodos del padre

        //Otra implementacion
        Producto producto1 = new Producto("Agua", 20);
        producto1.nombreProducto();
        producto1.getPrecio(); //aqui tengo acceso a los dos metodos de la clase







    }
}