
import java.util.Scanner;
public class LeituraCode {
//VARIÁVEIS
   public static String Sensor; // String para guardar texto (nome)
   public static double Leitura; // double para guardar números com vírgula/ponto
   public static void main(String[] args) {
       Scanner input = new Scanner(System.in);
       //LEITURA DO NOME
        System.out.println("---------------------------"); // estética
        System.out.println("Insira o nome do sensor: ");
       Sensor = input.nextLine(); // O metodo .nextLine() le o texto digitado ate pressionar o ENTER
       //LEITURA DO VALOR
        System.out.println("---------------------------");
        System.out.println("Insira o valor da leitura: ");
       Leitura = input.nextDouble(); // O metodo .nextDouble() le um número decimal
        System.out.println("---------------------------");
        System.out.println("Sensor " + Sensor + " foi registrado com o valor " + Leitura + " unidades.");
       input.close();
   }
}
