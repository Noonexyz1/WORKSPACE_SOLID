package org.example.otroEjemplo;

interface PagablePorCorreo extends Pagable {
    void pagarPorCorreo(double monto, String direccion);
}