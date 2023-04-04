import classes.*;
import enums.TipoFuncionario;
import enums.TipoPet;

import java.math.BigDecimal;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        PetShop uniPet = new PetShop("UniPet", "62119615000199");
        Pet jade = new Pet("Jade", 9, "Perdigueiro", TipoPet.MAMIFERO);
        Pet nemo = new Pet("Nemo", 1, "Peixe-Palhaço", TipoPet.PEIXE);

        Funcionario jorge = new Funcionario("Jorge Da Silva", "04759781021", new BigDecimal("5000"), TipoFuncionario.VETERINARIO);
        Funcionario matheus = new Funcionario("Matheus Da Rosa", "19399449025", new BigDecimal("9000"), TipoFuncionario.GESTOR);

        Cliente cassio = new Cliente("Cássio", "34104111007");
        cassio.withEndereco(new Endereco("Coronel alvaro de moraes", 1115, "fundos", "centro", "Montenegro", "Brasil"));
        cassio.adicionarPet(jade);

        Cliente moacir = new Cliente("Moacir", "34104111007");
        moacir.withEndereco("Antonio alvaro das flores", 1115, null, "centro", "Jacaranda", "Brasil");


        uniPet.adicionarCliente(cassio);
        uniPet.adicionarCliente(moacir);

        // uniPet.removerClientePorDocumento("34104111007");

        uniPet.adicionarPet(nemo);

        uniPet.adicionarFuncionario(jorge);
        uniPet.adicionarFuncionario(matheus);

        List<Cliente> clientesDeCoronelAlvaroDeMoraes = uniPet.buscarPorEnderecoLogradouro("Coronel alvaro de moraes");

        for (Cliente cliente : clientesDeCoronelAlvaroDeMoraes) {
            System.out.println("nome:" + cliente.getNome() + " Cidade: " + cliente.getEndereco().getLogradouro());
        }

//        List<Cliente> clientesDeMontenegro = uniPet.buscarPorEnderecoCidade("Montenegro");
//        for (Cliente cliente : clientesDeMontenegro) {
//            System.out.println("nome:" + cliente.getNome() + " Cidade: " + cliente.getEndereco().getCidade());
//        }

//        List<Funcionario> funcionariosDeAltoCusto = uniPet.buscaFuncionarioPorSalario(new BigDecimal("7000"), new BigDecimal("12000"));
//        for (Funcionario funcionario : funcionariosDeAltoCusto) {
//            System.out.println("nome: " + funcionario.getNome() + " salario: " + funcionario.getSalario().toString());
//        }

//        List<Pet> peixes = uniPet.buscarPetsPorTipo(TipoPet.PEIXE);
//        for (Pet peixe : peixes) {
//            System.out.println("nome:" + peixe.getNome());
//        }
    }
}
