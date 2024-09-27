public abstract class Pessoa { // Classe abstrata que define uma pessoa com atributos nome e idade
    private String nome;
    private Integer idade;

    public String getNome(){ // Método para obter o nome da pessoa
        return this.nome;
    };
    public void setNome(String nome){ // Método para definir o nome da pessoa
        this.nome = nome;
    }
    public Integer getIdade(){ // Método para obter a idade da pessoa
        return this.idade;
    }
    public void setIdade(Integer idade){ // Método para definir a idade da pessoa
        this.idade = idade;
    }
}