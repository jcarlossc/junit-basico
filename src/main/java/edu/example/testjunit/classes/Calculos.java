package edu.example.testjunit.classes;

public class Calculos {
    
    public double volumeCilindro(double raio, double altura) {
        double resultado = Math.PI * Math.pow(raio, 2) * altura;
        return resultado;
    }

    public double volumeCone(double raio, double altura) {
        double resultado = (Math.PI * Math.pow(raio, 2) * altura) / 3;
        return resultado;
    }

    public double volumeCubo(double aresta) {
        double resultado = aresta * aresta * aresta;
        return resultado;
    }

    public double volumePiramide(double aresta1, double aresta2, double altura) {
        double base = aresta1 * aresta2;
        double resultado = (base * altura) / 3;
        return resultado;
    }

    public double volumeEsfera(double raio) {
        double resultado = ((4 * Math.PI) * Math.pow(raio, 3)) / 3;
        return resultado;
    }
}
