package org.example;
/*
* Esto significa que se deben poder agregar nuevas funcionalidades sin necesidad de
* cambiar el código existente, evitando así la introducción de errores y aumentando la modularidad y la reutilización
*  del código.
    No unicamente las Clases si no, establece que las entidades de software (clases, módulos, funciones, etc.) deben
    estar abiertas para su extensión, pero cerradas para su modificación.

    Sí, has entendido correctamente. El principio de abierto/cerrado establece que las entidades de software (como las clases)
     deben estar abiertas para su extensión, pero cerradas para su modificación. Esto significa que, si deseas agregar una nueva 
     funcionalidad a una clase, en lugar de modificar el código fuente de la clase existente, puedes crear una nueva subclase que 
     herede de la clase original y agregar la nueva funcionalidad allí.

    Por “funcionalidad” me refiero a cualquier comportamiento o característica que desees 
    agregar a la clase. Esto podría incluir nuevos métodos, nuevas propiedades o nuevas formas de procesar datos. Al crear una nueva
    subclase y agregar la nueva funcionalidad allí, puedes extender el comportamiento de la clase original sin tener que modificar 
    su código fuente.
* */
public interface OperacionAritmetica {
    public double realizarOperacion(double num1, double num2);
}
