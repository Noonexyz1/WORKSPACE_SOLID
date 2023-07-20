package org.example;

/*
 * En lugar de tener una unica clase que registre un usuario nuevo
 * y enviar un email de bienvenida, si tubiera atributos, y estos son
 * modificados por los mismos metodos de la clase, por cada uno de ellos,
 * deberia existir un metodo o dos o N, y solo asi podre darme cuenta que
 * metodos si son parte de la clase que cumple S "principio de responsabilidad unica"
 * */
public class EmailManager {
    public void sendWelcomeEmail(User user) {
        // Lógica para enviar un correo electrónico de bienvenida al nuevo usuario
    }

    //Los demas metodos que tienen que ver con EmailManager unicamente
}
