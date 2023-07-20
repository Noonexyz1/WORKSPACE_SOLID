package org.example.otroEjemplo;

class Empleado implements Pagable {
    private String nombre;
    private double salario;

    public Empleado(String nombre, double salario) {
        this.nombre = nombre;
        this.salario = salario;
    }

    @Override
    public void pagar(double monto) {
        this.salario += monto;
    }
}