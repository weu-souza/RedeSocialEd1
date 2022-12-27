package Dados;

import java.util.List;

public class Amigos  {
    private String nome;
    private String sexo;
    private Integer idade;

    public Amigos(String nome, String sexo, Integer idade) {
        setNome(nome);
        setSexo(sexo);
        setIdade(idade);
    }
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public Integer getIdade() {
        return idade;
    }

    public void setIdade(Integer idade) {
        this.idade = idade;
    }

    @Override
    public String toString() {
        return  "nome= " + nome +
                ",sexo= " + sexo +
                ",idade= " + idade;
    }


}
