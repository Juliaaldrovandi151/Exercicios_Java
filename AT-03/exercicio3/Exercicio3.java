import java.util.Scanner; //  ler dados do teclado

public class Exercicio3 { // declara a classe
    public static void main(String[] args) { // metodo principal

        Scanner input = new Scanner(System.in);  // cria o Scanner
        int Producao = 0; // armazena a produção total

        for (int hora = 1; hora <= 5; hora++) { // Loop das 5 horas
            System.out.print("Insira a produção da hora " + hora + ": "); // pede a produção
            int Horaproducao = input.nextInt();  // le a produção da hora

           Producao += Horaproducao; // soma a produção total
        }

        double media = Producao / 5.0; // Calcula a média por hora

        System.out.println("Produção total: " + Producao); // Mostra a produção total
        System.out.println("Média por hora: " + media); // Mostra a média

        input.close(); // Fecha Scanner
    }
}
