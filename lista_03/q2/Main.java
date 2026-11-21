package q2;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        // Usando vetor tradicional
        FormaGeometrica[] vetorFormas = new FormaGeometrica[3];

        vetorFormas[0] = new Circulo(10);
        vetorFormas[1] = new Retangulo(20);
        vetorFormas[2] = new Triangulo(8, 10);

        for(int i = 0; i<3 ; i++){
            System.out.println(vetorFormas[i].calcularArea());
        }

        // Usando ArrayList com forEach
        ArrayList<FormaGeometrica> lista = new ArrayList<>();
        lista.add(new Circulo(11));
        lista.add(new Retangulo(21));
        lista.add(new Triangulo(9, 11));

        for (FormaGeometrica formaGeometrica : lista) {
            System.out.printf("Área: %.2f \n", formaGeometrica.calcularArea());
        }
    }

}
