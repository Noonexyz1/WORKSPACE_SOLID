package org.example.otroEjemplo;

class EmpleadoPorTransaccionBancaria extends Empleado implements PagablePorTransaccionBancaria {
    public EmpleadoPorTransaccionBancaria(String nombre, double salario) {
        super(nombre, salario);
    }

    @Override
    public void pagarPorTransaccionBancaria(double monto, String cuentaBancaria) {
        // Lógica para realizar el pago por transacción bancaria
        super.pagar(monto);
    }
}