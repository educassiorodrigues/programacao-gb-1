package classes;

import enums.TipoPet;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

import static java.util.Objects.isNull;

public class PetShop {
    public Estoque estoque;
    private String nome;
    private String cnpj;
    private List<Funcionario> funcionarios;
    private List<Cliente> clientes;
    private List<Pet> pets;

    public PetShop(String nome, String cnpj) {
        this.nome = nome;
        this.cnpj = cnpj;
        this.funcionarios = new ArrayList<>();
        this.clientes = new ArrayList<>();
        this.pets = new ArrayList<>();
        this.estoque = new Estoque();
    }

    public void adicionarCliente(Cliente cliente) {
        this.clientes.add(cliente);
        if (cliente.getPets().size() > 0) {
            this.pets.addAll(cliente.getPets());
        }
    }

    public List<Pet> buscarPetsPorTipo(TipoPet tipoPet) {
        return this.pets.stream().filter(_pet -> _pet.getTipoPet().equals(tipoPet)).toList();
    }

    public List<Cliente> buscarPorEnderecoCidade(String cidade) {
        return this.clientes.stream().filter(_cliente -> _cliente.getEndereco().getCidade().equals(cidade)).toList();
    }

    public List<Cliente> buscarPorEnderecoLogradouro(String logradouro) {
        return this.clientes.stream().filter(_cliente -> _cliente.getEndereco().getLogradouro().equals(logradouro)).toList();
    }

    public List<Funcionario> buscaFuncionarioPorSalario(BigDecimal min, BigDecimal max) {
        return this.funcionarios.stream().filter(_funcionario -> (_funcionario.getSalario().compareTo(min) >= 0) && (_funcionario.getSalario().compareTo(max) <= 0)).toList();
    }

    public boolean removerClientePorDocumento(String documento) {
        Cliente cliente = this.clientes.stream().filter(_cliente -> _cliente.getDocumento().equals(documento)).findFirst().orElse(null);
        if (isNull(cliente)) {
            return false;
        }

        this.clientes.remove(cliente);
        return true;
    }

    public void adicionarFuncionario(Funcionario funcionario) {
        this.funcionarios.add(funcionario);
    }

    public boolean removerFuncionarioPorDocumento(String documento) {
        Funcionario funcionario = this.funcionarios.stream().filter(_funcionario -> _funcionario.getDocumento().equals(documento)).findFirst().orElse(null);
        if (isNull(funcionario)) {
            return false;
        }

        this.funcionarios.remove(funcionario);
        return true;
    }

    public void adicionarPet(Pet pet) {
        this.pets.add(pet);
    }

    public String getNome() {
        return this.nome;
    }

    public String getCnpj() {
        return this.cnpj;
    }

    public List<Funcionario> getFuncionarios() {
        return this.funcionarios;
    }

    public List<Cliente> getClientes() {
        return this.clientes;
    }

    public List<Pet> getPets() {
        return this.pets;
    }

    public Estoque getEstoque() {
        return estoque;
    }
}

