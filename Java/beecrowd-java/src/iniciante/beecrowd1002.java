package iniciante;

import java.util.Scanner;

public class beecrowd1002 {
    public static void main(String[] args) {

        double n = 3.14159;

        Scanner input = new Scanner(System.in);

        System.out.println("Insira o valor do raio: ");
        double raio = input.nextDouble();

        double area = n * (raio * raio);

        System.out.println("A = " + area);

    }
}
