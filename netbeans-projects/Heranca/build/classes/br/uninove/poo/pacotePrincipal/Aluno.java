public class Aluno extends PessoaGenerica {
 
    int registroAcademico;
    float notaVestibular;
    String curso, dataIngresso;
 
    //Cosnturtor de Aluno, vazio
    public Aluno() {
        //Ao criar a instância de um aluno, é preciso criar a instância de
        //uma pessoa genérica com o consturtor padrão da herança:
        super();
    }
 
    //Sobrecarregando o construtor, com outra assinatura (já
    //recebendo os atributos):
    public Aluno(String nome, String RG, String cpf, String endereco,
            String telFixo, String telCelular, String dataNascimento,
            int registroAcademico, float notaVestibular,
            String curso, String dataIngresso) {
 
        super();
 
        //Atribui os dados para o objeto mãe
        //Como os nomes dos atributos são iguais, é preciso dizer a qual
        //estmoas referenciando. Usamos a palavra reservada "this"
        //para indicar que estamos usando os parametros locais (recebidos
        //nos atributos do construtor):
        this.RG = RG;
        this.nome = nome;
        this.cpf = cpf;
        this.endereco = endereco;
        this.telCelular = telCelular;
        this.telFixo = telFixo;
        this.dataNascimento = dataNascimento;
 
        //Agora atribui os valores locais:
        this.registroAcademico = registroAcademico;
        this.notaVestibular = notaVestibular;
        this.curso = curso;
        this.dataIngresso = dataIngresso;
    }
 
    //Note que o nome do método é exatamente o mesmo da classe mãe
    @Override
    public String retornaDados() {
        String dados;
 
        //Pega os dados da classe herdada
        dados = super.retornaDados();
 
        //Acrescenta os dados do aluno:
        dados += "\tRegistro Academico: " + registroAcademico + "\n";
        dados += "\tNota no Vestibular: " + notaVestibular + "\n";
        dados += "\tCurso: " + curso + "\n";
        dados += "\tData de ingresso: " + dataIngresso + "\n";
 
        return dados;
    }
}
