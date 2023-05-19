package iniciante;

import java.util.Scanner;

public class beecrowd1003 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Insira o valor de A: ");
        int A = input.nextInt();

        System.out.println("Insira o valor de B: ");
        int B = input.nextInt();

        int Soma = A + B;

        System.out.println("SOMA = " + Soma);
    }
}
