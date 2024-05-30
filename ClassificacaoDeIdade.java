import java.util.Scanner;

public class ClassificacaoDeIdade {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite sua idade: ");
        int idade = scanner.nextInt();
        if (idade >= 0 && idade <= 12) {
            System.out.println("Você é uma criança!");
        } else if (idade > 12 && idade <= 17) {
            System.out.println("Você é um adolescente!");
        } else if (idade > 17 && idade <= 64) {
            System.out.println("Você é um adulto!");
        } else if (idade > 64) {
            System.out.println("Você é um idoso!");
        } else {
            System.out.println("Idade inválida!");
        }
        scanner.close();
    }
}