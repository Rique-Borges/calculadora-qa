package com.example;

public class Calculadora {

    /*
     * Calcula a adição de dois números.
     * @param a O primeiro número a ser adicionado.
     * @param b O segundo número a ser adicionado.
     * @return A soma de a e b.
     */
    public double soma(double a, double b) {
        return a + b;
    }

    /*
     * Calcula a subtração de dois números.
     * @param a O primeiro número a ser subtraído.
     * @param b O segundo número a ser subtraído.
     * @return A subtração de a e b.
     */
    public double subtrai(double a, double b) {
        return a - b;
    }

    /*
     * Calcula a multiplicação de dois números.
     * @param a O primeiro número a ser multiplicado.
     * @param b O segundo número a ser multiplicado.
     * @return A multiplicação de a e b.
     */
    public double multiplica(double a, double b) {
        return a * b;
    }

    /*
     * Calcula a divisão de dois números.
     * @param a O primeiro número a ser dividido.
     * @param b O segundo número a ser dividido.
     * @return A divisão de a e b.
     * @throws ArithmeticException se b for zero.
     */
    public double divide(double a, double b) {
        if (b == 0) {
            throw new ArithmeticException("Não é possível dividir por zero");
        }
        return a / b;
    }
}
 