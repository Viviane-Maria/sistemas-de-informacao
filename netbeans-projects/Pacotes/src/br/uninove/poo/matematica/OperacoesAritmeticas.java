//instruções de pacote dessa classe
 
package br.uninove.poo.matematica;
 
public class OperacoesAritmeticas {
 
    public float multiplica(float a, float b) {
        return a * b;
    }
 
    public float soma(float a, float b) {
        return a + b;
    }
 
    public float subtrai(float a, float b) {
        return a - b;
    }
    
    public float divide(float a, float b){
        try{
            return a / b;
            
        }catch (Exception ex){
            System.out.println("Erro" + ex.getMessage());
            return 0;
        }
    }
}