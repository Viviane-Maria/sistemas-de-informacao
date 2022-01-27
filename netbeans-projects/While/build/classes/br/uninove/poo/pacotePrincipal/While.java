import java.util.Scanner;
 
public class While {
 
    public static void main(String[] args) {
        int i = 0;
while(i <= 10){
     if (i % 2 != 0) //Verifica se o resto da divisão por 2 é zero. Se não for, então o número é impar
          System.out.println(i);
     i++; //Incrementa a variável de controle
}
    }
}
