class Aluno extends PessoaGenerica {
 
    //Construtor
    public Aluno() {
    }
 
    @Override
    public String getDados() {
        String dados = "";
        dados += "\nNome: " + nome;
        dados += "\nCPF: " + cpf;
        dados += "\nRG: " + rg;
        dados += "\ndtNascimento: " + dtNascimento;
        return dados;
    }
}