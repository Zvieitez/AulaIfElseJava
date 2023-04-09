import java.util.Scanner;
/*Crie um programa dentro de um loop infinito que tenha as seguintes opções
  de menu e só pode sair do loop passando a opção correspondente no menu.
  Ao final de cada processo, o menu deve ser exibido novamente para uma nova escolha*/

public class Exercicio10Menu {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String nomeAluno = null;
        int idadeAluno = 0;
        String sexoAluno = null;
        String anoNascimentoAluno = null;

        String rua = null;
        int numero = 0;
        String bairro = null;
        String cep = null;

        System.out.println("*****************************************");
        System.out.println("Digite a opção do Menu: ");
        System.out.println("(1) Cadastro de Aluno");
        System.out.println("(2) Cadastro de Endereço");
        System.out.println("(3) Imprimir Aluno");
        System.out.println("(4) Imprimir Endereço");
        System.out.println("(5) Sair");
        System.out.println("*****************************************");

        int numeroMenu = scanner.nextInt();
        scanner.nextLine();

        while (numeroMenu <= 5) {

            if (numeroMenu == 1) {
                System.out.println("*********** Cadastro de Aluno ***********");
                System.out.println("Nome do Aluno: ");
                nomeAluno = scanner.nextLine();
                System.out.println("Informe a idade do aluno: ");
                idadeAluno = scanner.nextInt();
                scanner.nextLine();
                System.out.println("Informe o sexo do aluno: ");
                sexoAluno = scanner.nextLine();
                System.out.println("Informe o ano de nascimento do aluno: ");
                anoNascimentoAluno = scanner.nextLine();
                System.out.println("*****************************************");

            }
            if (numeroMenu == 2) {
                System.out.println("********** Cadastro de Endereço **********");
                System.out.println("Informe o nome da rua: ");
                rua = scanner.nextLine();
                System.out.println("Informe o número da rua: ");
                numero = scanner.nextInt();
                scanner.nextLine();
                System.out.println("Informe o bairro: ");
                bairro = scanner.nextLine();
                System.out.println("Informe o CEP: ");
                cep = scanner.nextLine();
                System.out.println("*****************************************");

            }
            if (numeroMenu == 3) {
                System.out.println("************ Imprimir Aluno **************");
                System.out.println("Nome: " + nomeAluno + "     Idade: " + idadeAluno);
                System.out.println("Sexo: " + sexoAluno + "     Ano de nascimento: " + anoNascimentoAluno);
                System.out.println("*****************************************");

            }
            if (numeroMenu == 4) {
                System.out.println("**************** Endereço ***************");
                System.out.println("Rua: " + rua + "        Nº: " + numero);
                System.out.println("Bairro: " + bairro + "     CEP: " + cep);
                System.out.println("*****************************************");

            }
            if (numeroMenu == 5) {
                System.out.println("Sair");
                System.out.println("*****************************************");

                numeroMenu++;
            }
            System.out.println("*****************************************");
            System.out.println("Digite a opção do Menu: ");
            System.out.println("(1) Cadastro de Aluno");
            System.out.println("(2) Cadastro de Endereço");
            System.out.println("(3) Imprimir Aluno");
            System.out.println("(4) Imprimir Endereço");
            System.out.println("(5) Sair");
            System.out.println("*****************************************");

            numeroMenu = scanner.nextInt();
            scanner.nextLine();
        }
    }
}
