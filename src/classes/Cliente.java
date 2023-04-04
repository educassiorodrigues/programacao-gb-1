package classes;

import java.util.ArrayList;
import java.util.List;

public class Cliente {
    private String nome;
    private String documento;
    private Endereco endereco;
    private List<Pet> pets;

    public Cliente(String nome, String documento) {
        this.nome = nome;
        this.documento = documento;
        this.pets = new ArrayList<Pet>();
    }

    public void withPets(List<Pet> pets) {
        this.pets = pets;
    }

    public void adicionarPet(Pet pet) {
        this.pets.add(pet);
    }

    public void withEndereco(Endereco endereco) {
        this.endereco = endereco;
    }

    public void withEndereco(String logradouro, int numero, String complemento, String bairro, String cidade, String pais) {
        this.endereco = new Endereco(logradouro, numero, complemento, bairro, cidade, pais);
    }

    public String getDocumento() {
        return documento;
    }

    public List<Pet> getPets() {
        return pets;
    }

    public Endereco getEndereco() {
        return endereco;
    }
}
