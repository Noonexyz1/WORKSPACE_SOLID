package org.example.otroEjemplo;

interface PagablePorTransaccionBancaria extends Pagable {
    void pagarPorTransaccionBancaria(double monto, String cuentaBancaria);
}