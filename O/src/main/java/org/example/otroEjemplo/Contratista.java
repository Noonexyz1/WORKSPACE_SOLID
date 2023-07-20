package org.example.otroEjemplo;

class Contratista extends Empleado {
    private double horasTrabajadas;
    private double tarifaPorHora;

    public Contratista(String nombre, double tarifaPorHora) {
        super(nombre, 0);
        this.tarifaPorHora = tarifaPorHora;
    }

    public void registrarHoras(double horas) {
        this.horasTrabajadas += horas;
    }

    @Override
    public void pagar(double monto) {
        super.pagar(this.horasTrabajadas * this.tarifaPorHora);
        this.horasTrabajadas = 0;
    }
}