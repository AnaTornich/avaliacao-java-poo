package exercicio_10.app;

import java.util.Scanner;

import exercicio_10.core.Multiplo;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite dois números inteiros:");
        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();

        if (Multiplo.verificar(num1, num2)) {
            System.out.println("São múltiplos");
        } else {
            System.out.println("Não são múltiplos");
        }

        scanner.close();
    }
}
