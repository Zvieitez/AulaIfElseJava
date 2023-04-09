import java.util.Scanner;

public class AulaIfElse {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Informe um número de 1 a 7 que correspondem ao dia da semana: ");
        int numero = scanner.nextInt(); scanner.nextLine();

        if (numero == 1) {
            System.out.println("1 = domingo");
        } else if (numero == 2) {
            System.out.println("2 = segunda");
        } else if (numero == 3) {
            System.out.println("3 = terça");
        } else if (numero == 4) {
            System.out.println("4 = quarta");
        } else if (numero == 5) {
            System.out.println("5 = quinta");
        } else if (numero == 6) {
            System.out.println("6 = sexta");
        } else if (numero == 7) {
            System.out.println("7 = sábado");
        } else {
            System.out.println("Dia inválido");
        }
    }
}