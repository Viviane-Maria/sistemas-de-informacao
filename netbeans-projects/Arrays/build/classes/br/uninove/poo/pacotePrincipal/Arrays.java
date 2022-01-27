package br.uninove.poo.pacotePrincipal;

/**
 *
 * @author vivia
 */
public class Arrays {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //Declaração do array de strings de tamanho 3
        String nomes[] = new String[3];
 
        //seta, manualmente, cada posição do array, de 0 a 2 (três posições)
        nomes[0] = "Josefino";
        nomes[1] = "Josefina";
        nomes[2] = "Marcelinho";
 
        //E para acessar cada posição, podemos usar um laço, de 0 a 2 (0, 1, 2 - três posições):
        for (int i = 0; i <= 2; i++) {
            System.out.print("Na posição " + i + " do array, temos: ");
            System.out.println(nomes[i]);
        }
    }
    
}
