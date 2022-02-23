package br.fai.ex02;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Main app = new Main();
        app.start();
    }

    private void start() {
        System.out.println("Digite o valor do produto: ");

        Scanner scanner = new Scanner(System.in);

        double valor = scanner.nextDouble();

        // exemplo de cast
        int valorComCast = (int) valor;

        System.out.println("\nValor com casas decimais: " + valor + " | Valor inteiro: " + valorComCast);

        int novoValor = 10;
        double valorConvertidoDeFormaImplicita = novoValor;

        System.out.println("Novo: " + novoValor + " | Convertido: " + valorConvertidoDeFormaImplicita);
    }
}
