package com.example;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

/**
 *
 * @author Henrique Borges
 * @version 1.0
 * @since Release 1.0 da aplicação
*/
public class CalculadoraJUnitTeste {

    /*
     * Testa o método de adição da Calculadora.
     * Verifica se a soma de dois números positivos é calculada corretamente.
     */
    @Test
    public void testSoma() {
        Calculadora calculadora = new Calculadora();

        // Teste de soma de dois números positivos
        assertEquals(10.0, calculadora.soma(5, 5), 0.0001);

        // Teste de soma de um número positivo com zero
        assertEquals(7.5, calculadora.soma(7.5, 0), 0.0001);

        // Teste de soma de dois zeros
        assertEquals(0.0, calculadora.soma(0, 0), 0.0001);

        // Teste de soma de um número positivo com um número negativo
        assertEquals(2.0, calculadora.soma(5, -3), 0.0001);
    }

    /*
     * Testa o método de subtração da Calculadora.
     * Verifica se a subtração de dois números positivos é calculada corretamente.
     */
    @Test
    public void testSubtrai() {
        Calculadora calculadora = new Calculadora();

        // Teste de subtração de um número positivo por outro maior
        assertEquals(-2.0, calculadora.subtrai(3, 5), 0.0001);

        // Teste de subtração de um número positivo por zero
        assertEquals(5.0, calculadora.subtrai(5, 0), 0.0001);

        // Teste de subtração de zero por zero
        assertEquals(0.0, calculadora.subtrai(0, 0), 0.0001);

        // Teste de subtração de um número positivo por um número negativo
        assertEquals(8.0, calculadora.subtrai(5, -3), 0.0001);
    }

    /*
     * Testa o método de multiplicação da Calculadora.
     * Verifica se a multiplicação de dois números positivos é calculada corretamente.
     */
    @Test
    public void testMultiplica() {
        Calculadora calculadora = new Calculadora();

        // Teste de multiplicação de dois números positivos
        assertEquals(15.0, calculadora.multiplica(3, 5), 0.0001);

        // Teste de multiplicação de um número positivo por zero
        assertEquals(0.0, calculadora.multiplica(5, 0), 0.0001);

        // Teste de multiplicação de zero por zero
        assertEquals(0.0, calculadora.multiplica(0, 0), 0.0001);

        // Teste de multiplicação de um número positivo por um número negativo
        assertEquals(-15.0, calculadora.multiplica(3, -5), 0.0001);
    }

    /*
     * Testa o método de divisão da Calculadora.
     * Verifica se a divisão de dois números positivos é calculada corretamente.
     * Lança exceção se tentar dividir por zero.
     */
    @Test
    public void testDivide() {
        Calculadora calculadora = new Calculadora();

        // Teste de divisão de um número positivo por outro maior
        assertEquals(2.0, calculadora.divide(10, 5), 0.0001);

        // Teste de divisão por zero
        try {
            calculadora.divide(5, 0);
        } catch (ArithmeticException e) {
            assertEquals("Não é possível dividir por zero", e.getMessage());
        }

        // Teste de divisão de zero por zero
        try {
            calculadora.divide(0, 0);
        } catch (ArithmeticException e) {
            assertEquals("Não é possível dividir por zero", e.getMessage());
        }

        // Teste de divisão de um número positivo por um número negativo
        assertEquals(-2.0, calculadora.divide(10, -5), 0.0001);
    }
}
