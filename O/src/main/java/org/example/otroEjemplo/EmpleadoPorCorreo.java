package org.example.otroEjemplo;

class EmpleadoPorCorreo extends Empleado implements PagablePorCorreo {
    public EmpleadoPorCorreo(String nombre, double salario) {
        super(nombre, salario);
    }

    @Override
    public void pagarPorCorreo(double monto, String direccion) {
        // Lógica para realizar el pago por correo
        super.pagar(monto);
    }
}