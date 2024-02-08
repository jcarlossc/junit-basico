package edu.example.testjunit;

import java.text.DecimalFormat;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import edu.example.testjunit.classes.Calculos;

@Component
public class AppCalculo implements CommandLineRunner {
    
    @Override
    public void run(String... args) throws Exception {

        System.out.println("Calculadora de sólidos");
        
        Calculos c1 = new Calculos();

        double resultadoCilindro = c1.volumeCilindro(2, 5);
        System.out.println("Cilindro: " + new DecimalFormat("#.##").format(resultadoCilindro) + " cm³");

        double resultadoCone = c1.volumeCone(2, 5);
        System.out.println("Cone: " + new DecimalFormat("#.##").format(resultadoCone) + " cm³");
        
        double resultadoCubo = c1.volumeCubo(5);
        System.out.println("Cubo: " + new DecimalFormat("#.##").format(resultadoCubo) + " cm³");

        double resultadoPiramide = c1.volumePiramide(5, 6, 7);
        System.out.println("Pirâmide: " + new DecimalFormat("#.##").format(resultadoPiramide) + " cm³");

        double resultadoEsfera = c1.volumeEsfera(2);
        System.out.println("Esfera: " + new DecimalFormat("#.##").format(resultadoEsfera) + " cm³");
    }
}
