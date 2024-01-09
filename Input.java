import java.util.Scanner;

public class Input {
    public static void main(String[] args) {
        System.out.println("Por favor, digite seu ano de nascimento:");
        Scanner scandt = new Scanner(System.in);
        int datanasc = scandt.nextInt();
        System.out.println("Você tem " + (2023 - datanasc) + " anos.");
        scandt.close();
    }
}
