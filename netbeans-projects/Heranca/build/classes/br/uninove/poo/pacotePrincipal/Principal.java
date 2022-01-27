public class Principal {
 
    public static void main(String args[]) {
        //Agora podemos criar o aluno com os dados diretmante no cosntrutor dele
        /*
        Lembre-se que os atributos devem ir na mesma ordem do construtor da classe
        A ordem é:
 
         String nome, String RG, String cpf, String endereco,
         String telFixo, String telCelular, String dataNascimento,
         int registroAcademico, float notaVestibular,
         String curso, String dataIngresso
 
         */
        Aluno a1 = new Aluno("Josefino Sauro", "001101-X", "001.002.003-00", "Rua das Ruas, 10",
                "(44) 22302-323", "(444) 2323-2323", "10/02/1901",
                1902192, 8.0F, "Bacharelado em Artes Marciais", "10/10/2017");
 
        //Vamos imprimir os dados do aluno a1
        System.out.println("Dados pessoais do aluno: ");
        //Na hora de chamar, você chama o mesmo método:
        System.out.println(a1.retornaDados());
    }
}
