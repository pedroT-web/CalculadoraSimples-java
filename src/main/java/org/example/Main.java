package org.example;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double num1 = 0, num2 = 0, resultado = 0;
        int operacao = 0;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o Primeiro Número: ");
        num1 = scanner.nextDouble();

        System.out.println("Digite o Segundo Número: ");
        num2 = scanner.nextDouble();

        System.out.println("Escolha a operação que deseja realizar");
        System.out.println("1 - Soma");
        System.out.println("2 - Subtração");
        System.out.println("3 - Multiplicação");
        System.out.println("4 - Divisão");
        operacao = scanner.nextInt();

        switch(operacao){
            case 1:
                resultado = num1 + num2;
                System.out.println("O resultado da soma é: " + resultado);
                break;
            case 2:
                resultado = num1 - num2;
                System.out.println("O resultado da subtração é: " + resultado);
                break;
            case 3:
                resultado = num1 * num2;
                System.out.println("O resultado da multiplicação é: " + resultado);
                break;
            case 4:
                resultado = num1 / num2;
                System.out.println("O resultado da divisão é: " + resultado);
                break;
            default:
                System.out.println("operação Inválida");
                break;
        }

        scanner.close();
    }
}
