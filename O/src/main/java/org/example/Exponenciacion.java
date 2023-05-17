package org.example;

public class Exponenciacion implements OperacionAritmetica{
    @Override
    public double realizarOperacion(double num1, double num2) {
        return Math.pow(num1, num2);
    }
}
