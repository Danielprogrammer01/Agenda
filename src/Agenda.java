import java.nio.channels.Pipe.SourceChannel;

public class Agenda {

    // Classe interna
    private class Pessoa {

        private String nome;
        private int idade;
        private float altura;

        public Pessoa(String nome, int idade, float altura) {
            setNome(nome);
            setIdade(idade);
            setAltura(altura);
        }

        public String getNome() {
            return nome;
        }

        public void setNome(String nome) {
            this.nome = nome;
        }

        public int getIdade() {
            return idade;
        }

        public void setIdade(int idade) {
            this.idade = idade;
        }

        public float getAltura() {
            return altura;
        }

        public void setAltura(float altura) {
            this.altura = altura;
        }

    }

    // Atributos Classe Agenda
    private Pessoa[] pessoa;
    private int contador;

    // Construtor Agenda
    public Agenda() {

        pessoa = new Pessoa[10];
        contador = 0;

    }

    public void armazenarPessoa(String nome, int idade, float altura) {

        if (contador < 10) {
            pessoa[contador] = new Pessoa(nome, idade, altura);
            contador++;
        } else {
            System.out.println("");
            System.out.println("Agenda cheia!");
            System.out.println("");
        }

    }

    public void removerPessoa(String nome) {

        for (int i = 0; i < contador; i++) {

            if (pessoa[i].getNome().equals(nome)) {

                for (int j = i; j < contador; j++) {

                    pessoa[j] = pessoa[j + 1];

                }

                pessoa[contador - 1] = null;
                contador--;
                System.out.println("");
                System.out.println(nome + " foi removido(a) da agenda!");
                System.out.println("");
                return;

            }

        }

        System.out.println(nome + " não encontrado(a) na agenda!");

    }

    public int buscarPessoa(String nome) {

        for (int i = 0; i < contador; i++) {
            if (pessoa[i].getNome().equals(nome)) {
                return i;
            } 
            
        }
        System.out.println("");
        System.out.println("Nome não encontrado na agenda!");
        System.out.println("");

        return -1;
    }

    public void imprimirAgenda() {

        if (contador == 0) {
            System.out.println("");
            System.out.println("Agenda vazia!");
            System.out.println("");
        } else {

            System.out.println("====================");
            System.out.println("       AGENDA       ");
            System.out.println("====================");
            System.out.println(" ");

            for (int i = 0; i < contador; i++) {
                System.out.println("-------------------");
                System.out.println("    " + (i+1) + "º CONTATO     ");
                System.out.println("-------------------");
                System.out.println("NOME: " + pessoa[i].getNome());
                System.out.println("IDADE: " + pessoa[i].getIdade() + " anos");
                System.out.printf("ALTURA: %.2f m%n", pessoa[i].getAltura());
                System.out.println("------------------- ");
                System.out.println(" ");
            }

        }
    }

    public void imprimirPessoa(int index) {
        if (index >= 0 && index < contador) {
            System.out.println("NOME: " + pessoa[index].getNome());
            System.out.println("IDADE: " + pessoa[index].getIdade() + " anos");
            System.out.printf("ALTURA: %.2f %n", pessoa[index].getAltura());
        } else{
            System.out.println("Índice inválido!");
        }

    }

}