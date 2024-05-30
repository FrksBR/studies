import java.util.Scanner;

public class VerificacaoDeNotas {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite sua nota: ");
        Float nota = scanner.nextFloat();
        String conceito;
        String mensagem;
        if (nota > 0 && nota <= 20) {
            conceito = "F";
        } else if (nota > 20 && nota <= 40) {
            conceito = "D";
        } else if (nota > 40 && nota <= 60) {
            conceito = "C";
        } else if (nota > 60 && nota <= 80) {
            conceito = "B";
        } else if (nota > 80 && nota <= 100) {
            conceito = "A";
        } else {
            conceito = "error";
        }
        switch (conceito) {
            case "A":
                mensagem = "Excelente, continue assim!";
                break;
            case "B":
                mensagem = "Parabéns pelo seu desempenho!";
                break;
            case "C":
                mensagem = "Muito bem!";
                break;
            case "D":
                mensagem = "Insuficiente";
                break;
            case "F":
                mensagem = "Horrível!";
                break;
            default:
                mensagem = "ERROR!";
        }
        System.out.println("Conceito: " + conceito);
        System.out.println(mensagem);
        scanner.close();
    }
}
