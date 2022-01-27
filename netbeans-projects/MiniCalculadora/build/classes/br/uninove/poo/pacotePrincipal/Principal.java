import java.util.Scanner;
 
public class Principal {
 
    public static void main(String args[]) {
 
        //Define o leitor do teclado
        Scanner leitor = new Scanner(System.in);
 
        //Define a variáveis locais
        int x, y;
 
        //Le:
        System.out.print("Infome o 1º valor: ");
        x = leitor.nextInt();
 
        System.out.print("Infome o 2º valor: ");
        y = leitor.nextInt();
 
        //Cria a instancia da classe matematica utilizando o construtor
        Matematica mat = new Matematica(x, y);
 
        // Imprime o resultado das operações através
        // de chamadas aos métodos da classe Matemática
        System.out.println("--------------------"); //Apenas para organiar a saída
        System.out.println("O valor da soma é: " + mat.soma());
        System.out.println("O valor da subtração é: " + mat.subtrai());
        System.out.println("O valor da multiplicação é: " + mat.multiplica());
        System.out.println("O valor da divisão é: " + mat.divide());
        System.out.println("--------------------"); //Apenas para organiar a saída
 
    }
}
