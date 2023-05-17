package org.example;

public class Venta {
    private IImpresora impresora;

    public Venta(IImpresora impresora) {
        this.impresora = impresora;
    }

    public void imprimirRecibo() {
        // Código para generar el recibo de venta
        impresora.imprimir(this);
    }

}
