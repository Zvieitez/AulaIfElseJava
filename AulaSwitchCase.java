import java.util.Scanner;

public class AulaSwitchCase {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Informe um número de 1 a 7 que correspondem ao dia da semana: ");
        int numero = scanner.nextInt(); scanner.nextLine();

        switch (numero){
            case(1):
                System.out.println("1 = domingo");
                break;
            case(2):
                System.out.println("2 = segunda");
                break;
            case(3):
                System.out.println("3 = terça");
                break;
            case(4):
                System.out.println("4 = quarta");
                break;
            case(5):
                System.out.println("5 = quinta");
                break;
            case(6):
                System.out.println("6 = sexta");
                break;
            case(7):
                System.out.println("7 = sábado");
                break;
            default:
                System.out.println("Dia da semana inválido");
                break;
        }

    }
}