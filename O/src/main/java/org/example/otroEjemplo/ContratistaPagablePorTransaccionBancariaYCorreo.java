package org.example.otroEjemplo;

class ContratistaPagablePorTransaccionBancariaYCorreo extends Contratista implements PagablePorTransaccionBancaria, PagablePorCorreo {
    public ContratistaPagablePorTransaccionBancariaYCorreo(String nombre, double tarifaPorHora) {
        super(nombre, tarifaPorHora);
    }

    @Override
    public void pagarPorTransaccionBancaria(double monto, String cuentaBancaria) {
        // Lógica para realizar el pago por transacción bancaria
        super.pagar(monto);
    }

    @Override
    public void pagarPorCorreo(double monto, String direccion) {
        // Lógica para realizar el pago por correo
        super.pagar(monto);
    }
}