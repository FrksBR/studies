import java.util.Scanner;

public class CalculadoraSimples {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o primeiro número: ");
        Float num1 = scanner.nextFloat();
        System.out.println("Escolha a operação matemática (+, -, *, /): ");
        String operacao = scanner.next();
        System.out.println("Digite o segundo número: ");
        Float num2 = scanner.nextFloat();

        Float resultado;
        switch (operacao) {
            case "+":
                resultado = num1 + num2;
                System.out.println("O resultado é: " + resultado);
                break;
            case "-":
                resultado = num1 + num2;
                System.out.println("O resultado é: " + resultado);
                break;
            case "*":
                resultado = num1 * num2;
                System.out.println("O resultado é: " + resultado);
            case "/":
                if (num2 != 0) {
                    resultado = num1 / num2;
                    System.out.println("O resultado é: " + resultado);
                } else {
                    System.out.println("Divisão inválida");
                }
                break;
            default:
                System.out.println("Parâmetro desconhecido");
                break;
        }
        scanner.close();
    }
}