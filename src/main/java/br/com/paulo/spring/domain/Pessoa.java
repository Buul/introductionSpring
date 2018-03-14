package br.com.paulo.spring.domain;

import org.springframework.stereotype.Component;

@Component
public class Pessoa {

    private String nome;
    private int idade;

    public Pessoa(){
        System.out.print("Construtor de Pessoa executado");
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String name) {
        this.nome = name;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    @Override
    public String toString() {
        return "Pessoa(" +
                "nome='" + nome + '\'' +
                ", idade=" + idade +
                ')';
    }
}
