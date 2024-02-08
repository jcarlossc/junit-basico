package edu.example.testjunit;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import edu.example.testjunit.classes.Calculos;

public class CalculosTest {
    
    Calculos calculos;

    @BeforeEach
    void setUp() {
        calculos = new Calculos();
    }

    @Test
    @DisplayName("Teste do volume do cilindro")
    void testCalculoCilindro() {
        assertEquals(141.3716694115407, calculos.volumeCilindro(3, 5));
    }

    @Test
    @DisplayName("Teste do volume do cone")
    void testCalculoCone() {
        assertEquals(20.943951023931955, calculos.volumeCone(2, 5));
    }

    @Test
    @DisplayName("Teste do volume do cubo")
    void testCalculoCubo() {
        assertEquals(125, calculos.volumeCubo(5));
    }

    @Test
    @DisplayName("Teste do volume da pirâmide")
    void testCalculoPiramide() {
        assertEquals(50, calculos.volumePiramide(5,6,5));
    }

    @Test
    @DisplayName("Teste do volume da esfera")
    void testCalculoEsfera() {
        assertEquals(33.510321638291124, calculos.volumeEsfera(2));
    }
}
