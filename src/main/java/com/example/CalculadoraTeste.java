package com.example;

public class CalculadoraTeste {
    public static void main(String[] args) {
        Calculadora calculadora = new Calculadora();

        double soma;
        double multiplicacao;
        double divisao;
        double subtracao;

        // SOMA
        // Testando a soma de dois números positivos.
        soma = calculadora.soma(5, 9);
        System.out.println(soma);

        // Testando a soma de um número positivo com zero.
        soma = calculadora.soma(8, 0);
        System.out.println(soma);

        // Testando a soma de dois zeros.
        soma = calculadora.soma(0, 0);
        System.out.println(soma);

        // Testando a soma de um número positivo com um número negativo.
        soma = calculadora.soma(10, -3);
        System.out.println(soma);

        // SUBTRAÇÃO
        // Testando a subtração de um número positivo por outro maior.
        subtracao = calculadora.subtrai(5, 7);
        System.out.println(subtracao);

        // Testando a subtração de um número positivo por zero.
        subtracao = calculadora.subtrai(5, 0);
        System.out.println(subtracao);

        // Testando a subtração de zero por zero.
        subtracao = calculadora.subtrai(0, 0);
        System.out.println(subtracao);

        // Testando a subtração de um número positivo por um número negativo.
        subtracao = calculadora.subtrai(8, -4);
        System.out.println(subtracao);

        // MULTIPLICAÇÃO
        // Testando a multiplicação de dois números positivos.
        multiplicacao = calculadora.multiplica(4, 7);
        System.out.println(multiplicacao);

        // Testando a multiplicação de um número positivo por zero.
        multiplicacao = calculadora.multiplica(9, 0);
        System.out.println(multiplicacao);

        // Testando a multiplicação de zero por zero.
        multiplicacao = calculadora.multiplica(0, 0);
        System.out.println(multiplicacao);

        // Testando a multiplicação de um número positivo por um número negativo.
        multiplicacao = calculadora.multiplica(6, -2);
        System.out.println(multiplicacao);

        // DIVISÃO
        // Testando a divisão de um número positivo por outro maior.
        divisao = calculadora.divide(10, 2);
        System.out.println(divisao);

        // Testando a divisão por zero.
        divisao = calculadora.divide(15, 0);
        System.out.println(divisao);

        // Testando a divisão de zero por zero.
        divisao = calculadora.divide(0, 0);
        System.out.println(divisao);

        // Testando a divisão de um número positivo por um número negativo.
        divisao = calculadora.divide(12, -3);
        System.out.println(divisao);
    }
}
