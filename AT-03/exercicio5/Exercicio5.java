import java.util.Scanner; // Scanner para ler os dados do teclado

public class Exercicio5 { 
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in); // Scanner para entrada de dados

        System.out.print("Digite o valor bruto do PLC (0 a 1023): "); // Solicita o valor
        double valorBruto = input.nextDouble(); // Lê o valor digitado

        double resultado = converterEscala(valorBruto); // Converte o valor
        System.out.println("============================================================");
        System.out.println("O valor na escala de 0-100% é: " + resultado); // Exibe o resultado

        input.close(); // Fecha o Scanner
    }

    // Método de conversão
    public static double converterEscala(double valor) { // Recebe o valor bruto
        return (valor / 1023.0) * 100; // Converte para porcentagem
    }
}
