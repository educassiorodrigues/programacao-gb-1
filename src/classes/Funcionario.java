package classes;

import enums.TipoFuncionario;

import java.math.BigDecimal;

public class Funcionario {
    private String nome;
    private String documento;
    private Endereco endereco;
    private BigDecimal salario;
    private TipoFuncionario tipoFuncionario;

    public Funcionario(String nome, String documento, BigDecimal salario, TipoFuncionario tipoFuncionario) {
        this.nome = nome;
        this.salario = salario;
        this.tipoFuncionario = tipoFuncionario;
        this.documento = documento;
    }

    public Funcionario(String nome, String documento, BigDecimal salario, TipoFuncionario tipoFuncionario, Endereco endereco) {
        this.nome = nome;
        this.salario = salario;
        this.endereco = endereco;
        this.tipoFuncionario = tipoFuncionario;
        this.documento = documento;
    }

    public String getNome() {
        return nome;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void withEndereco(String logradouro, int numero, String complemento, String bairro, String cidade, String pais) {
        this.endereco = new Endereco(logradouro, numero, complemento, bairro, cidade, pais);
    }

    public void withEndereco(Endereco endereco) {
        this.endereco = endereco;
    }

    public BigDecimal getSalario() {
        return salario;
    }

    public void setSalario(BigDecimal salario) {
        this.salario = salario;
    }

    public void toVeterinario() {
        this.tipoFuncionario = TipoFuncionario.VETERINARIO;
    }

    public void toGestor() {
        this.tipoFuncionario = TipoFuncionario.GESTOR;
    }

    public String getDocumento() {
        return documento;
    }

    public TipoFuncionario getTipoFuncionario() {
        return tipoFuncionario;
    }
}
