package classes;

import enums.TipoPet;

public class Pet {
    private String nome;
    private int idade;
    private String raca;
    private TipoPet tipoPet;

    public Pet(String nome, int idade, String raca, TipoPet tipoPet) {
        this.nome = nome;
        this.idade = idade;
        this.raca = raca;
        this.tipoPet = tipoPet;
    }

    public String getNome() {
        return nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getRaca() {
        return raca;
    }

    public TipoPet getTipoPet() {
        return tipoPet;
    }
}
