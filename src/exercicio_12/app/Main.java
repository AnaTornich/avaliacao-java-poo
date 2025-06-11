package exercicio_12.app;

import java.util.Scanner;

import exercicio_12.core.Jogo;


public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicita ao usuário que digite a hora inicial e final
        System.out.print("Digite a hora inicial: ");
        int horaInicial = scanner.nextInt();
        System.out.print("Digite a hora final: ");
        int horaFinal = scanner.nextInt();

        // Cria um objeto Jogo com as horas informadas
        Jogo jogo = new Jogo(horaInicial, horaFinal);

        // Calcula a duração do jogo
        int duracao = jogo.calcularDuracao();

        // Exibe a duração do jogo
        System.out.printf("O JOGO DUROU %d HORA(S)%n", duracao);

        scanner.close();
    }
}
