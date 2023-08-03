public class Pessoa {

    private String nome;
    private int idade;
    private String dataNascimento;

    public Pessoa(String nome, int idade, String dataNascimento) {
        this.nome = nome;
        this.idade = idade;
        this.dataNascimento = dataNascimento;
    }
    public String getNome(){
        return this.nome;
    }
    public void setNome() {
        this.nome = nome;
    }
    public int getIdade() {
        return this.idade;
    }
    public void setIdade(){
        this.idade = idade;
    }
    public String getDataNascimento(){
        return this.dataNascimento;
    }
    public void setDataNascimento(){
        this.dataNascimento = dataNascimento;
    }

}
