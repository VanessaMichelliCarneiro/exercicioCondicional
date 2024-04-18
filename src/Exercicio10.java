import java.util.Scanner;

public class Exercicio10 {
    public static void main(String[] args) {
        // Crie um programa que recebe 
// o salário de um funcionário 
// e verifica se ele está acima do salário mínimo atual.

Scanner scanner = new Scanner(System.in);
    System.out.println("Informe seu salário: ");
    double salario = scanner.nextDouble();

    final double salarioMinimo = 1412;

    if (salario > salarioMinimo) {
      System.out.printf("Seu salário é maior que o salário minimo (R$ %.2f)", salarioMinimo);
    } else {
      System.out.printf("Seu salário é menor que o salário minimo (R$ %.2f)", salarioMinimo);
    }
    scanner.close();
  }
}