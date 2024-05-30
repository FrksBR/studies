import java.util.Scanner;

public class FilmesPreferidos {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String[] filmes = new String[5];
        for (int i = 0; i < 5; i++) {
            System.out.println("Digite o nome do filme " + (i + 1) + ":");
            filmes[i] = input.next();
        }
        for (int j = 0; j < 5; j++) {
            System.out.println("Filme " + (j + 1) + ": " + filmes[j]);
        }
        input.close();
    }
}