public class Exercicio4 { // Declara a classe
    public static void main(String[] args) {  // Método principal
        
        // 1 = em operação
        // 0 = Parado
        int[] historico = {1, 0, 1, 1}; 
        int contador = 0; // Variável para contar quantas vezes a máquina operou
       
        for (int i = 0; i <=3; i++) {  // Percorre o array 
            if (historico[i] == 1) {  // Verifica se estava em operação
                contador++; // Toda vez de aparecer 1 = +1
            }
        }
        System.out.println("====================================================="); // estética
        System.out.println("A máquina esteve em operação " + contador + " vezes."); // Exibe o resultado
    }
}