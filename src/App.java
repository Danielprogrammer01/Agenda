import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");

        Scanner sc = new Scanner(System.in);

        Agenda agenda = new Agenda();

        agenda.armazenarPessoa("Daniel",19, 1.75f);
        agenda.armazenarPessoa("Jeane",20, 1.70f);

        agenda.imprimirAgenda();

        agenda.removerPessoa("Daniel");

        agenda.buscarPessoa("Daniel");

        System.out.println("Digite um nome para descobrir o índice: ");
        String nome = sc.nextLine();
        System.out.println("");
        System.out.println("Índece de " + nome + ": " + agenda.buscarPessoa(nome));

        agenda.removerPessoa("Jeane");

        agenda.imprimirAgenda();
    }
}
