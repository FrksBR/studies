import java.util.Scanner;

public class VerificacaoDeParidade {
  public static void main(String[] args) {
    System.out.println("Sistema de verificaçõ de números pares e ímpares.");
    Scanner scanner = new Scanner(System.in);
    System.out.println("Digite um número: ");
    int x = scanner.nextInt();
    if (x % 2 == 0) {
      System.out.println("Este é um número par");
    } else {
      System.out.println("Este número é um número ímpar");
    }
    scanner.close();
  }
}