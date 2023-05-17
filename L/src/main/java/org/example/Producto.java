package org.example;

public class Producto implements IPagable {
    private String nombre;
    private double precio;

    public Producto(String nombre, double precio) {
        this.nombre = nombre;
        this.precio = precio;
    }

    @Override
    public double getPrecio() {
        return precio;
    }

    //estaria violando el Open/CLose con esta implementacion?
    public void nombreProducto(){
        /*
        * En el código que proporcionas, la clase Servicio implementa la interfaz Pagable y define el método getPrecio(), lo que
        *  indica que está siguiendo el principio O de SOLID. Sin embargo, la clase también define un nuevo método nombreServicio()
        *  que no está relacionado con la interfaz Pagable. Por lo tanto, si se necesitara agregar una nueva funcionalidad a la clase
        * Servicio, se tendría que modificar el código existente para hacerlo, lo que violaría el principio O.

        Para corregir esto, puedes considerar extender la clase Servicio y agregar la nueva funcionalidad en la clase extendida
        * sin modificar el código existente. Otra opción es crear una nueva interfaz que incluya el método nombreServicio() y
        * hacer que la clase Servicio implemente ambas interfaces. De esta manera, la clase Servicio estaría abierta a la extensión
        *  para la nueva interfaz, pero cerrada para la modificación de la interfaz Pagable.
        * */
    }

}
