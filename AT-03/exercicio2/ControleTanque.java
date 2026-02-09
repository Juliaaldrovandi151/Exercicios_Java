import java.util.Scanner; // Le dados do teclado 
public class ControleTanque { // Classe principal
   public static void main(String[] args) { // Início do programa
       Scanner input = new Scanner(System.in); // Entrada de dados
        System.out.println("====================================="); // estética
       System.out.println(" Insira valor do Tanque (de 0 a 100): "); // Solicita o valor
       int nivelTanque = input.nextInt();  // Lê o nível do tanque
       // IF/ELSE
       if (nivelTanque >= 90) {
           System.out.println("=====================================");
           System.out.println("ALERTA: Nivel do Tanque ALTO"); // tanque alto
       }else if (nivelTanque < 10) {
           System.out.println("=====================================");
           System.out.println("ALERTA: Nivel do Tanque BAIXO"); // tanque baixo
       }else{
           System.out.println("=====================================");
           System.out.println("Nivel do Tanque OK"); // nivel ok
       }
   }
}

