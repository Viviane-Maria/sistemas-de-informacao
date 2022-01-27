//instruções de pacote dessa classe
package br.uninove.poo.principal;
 
//Importa a classe trigonometria. Se quisessemos importar todas as
//clases do pacote, ficaria assim:
//      import br.uninove.poo.matematica.*
import br.uninove.poo.matematica.Trigonometria;
import br.uninove.poo.matematica.Trigonometria;
 
//Importa uma classe do Java, para usar o Scanner do teclado
import java.util.Scanner;
 
public class Principal {
 
    public static void main(String args[]) {
        Trigonometria tri = new Trigonometria();
        Scanner sc = new Scanner(System.in);
        float base, altura;
 
        System.out.print("Informe o valor da base do triângulo: ");
        base = sc.nextFloat();
 
        System.out.print("Informe o valor da altura do triângulo: ");
        altura = sc.nextFloat();
 
        System.out.print("\nA área deste triângulo é: ");
        System.out.println(tri.areaTriangulo(base, altura));
    }
}