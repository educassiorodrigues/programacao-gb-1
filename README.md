# PetShop

Neste projeto foi desenvolvido o esqueleto de uma petshop utilizando o paradigma de orientação a objetivos.

## Issues

- Dentro da pasta issues você encontrará o diagrama UML das classes apresentadas.
- Talvez você encontre uma pasta de testes, ainda estou decidindo se irei fazer testes unitarios com JUnit

## Classes e suas funcionalidades

- Petshop
    - É possivel instanciar uma nova petshop passando como parametros apenas
      o nome e o cnpj que são propriedades privadas dentro da classe.
  ````java
    PetShop uniPet = new PetShop("UniPet", "62119615000199"); 
  ````

## Funcionalidades de Petshop

#### CLIENTES

- Adicionar clientes
  ```java
    Cliente cassio = new Cliente("Cássio", "34104111007");
    uniPet.adicionarCliente(cassio);
    ```
    - Desta maneira irá ser adicionado o cliente e os pets que o cliente possui se o cliente possuir pets


- Buscar Clientes por Cidade
  ```java
    PetShop uniPet = new PetShop("UniPet", "62119615000199");
    Cliente cassio = new Cliente("Cássio", "34104111007");
    cassio.withEndereco(new Endereco("Coronel alvaro de moraes", 1115, "fundos", "centro", "Montenegro", "Brasil"));
    cassio.adicionarPet(jade);

    Cliente moacir = new Cliente("Moacir", "34104111007");
    moacir.withEndereco("Antonio alvaro das flores", 1115, null, "centro", "Jacaranda", "Brasil");


    uniPet.adicionarCliente(cassio);
    uniPet.adicionarCliente(moacir);

    List<Cliente> clientesDeMontenegro = uniPet.buscarPorEnderecoCidade("Montenegro");
    for (Cliente cliente : clientesDeMontenegro) {
        System.out.println("nome:" + cliente.getNome() + " Cidade: " + cliente.getEndereco().getCidade());
        // retorno: nome:Cássio Cidade: Montenegro
    }
  ```

- Buscar Clientes por Logradouro

```java
    Cliente cassio=new Cliente("Cássio","34104111007");
    cassio.withEndereco(new Endereco("Coronel alvaro de moraes",1115,"fundos","centro","Montenegro","Brasil"));
    cassio.adicionarPet(jade);
    Cliente moacir=new Cliente("Moacir","34104111007");
    moacir.withEndereco("Antonio alvaro das flores",1115,null,"centro","Jacaranda","Brasil");
    List<Cliente> clientesDeCoronelAlvaroDeMoraes=uniPet.buscarPorEnderecoLogradouro("Coronel alvaro de moraes");

    for(Cliente cliente:clientesDeCoronelAlvaroDeMoraes){
        System.out.println("nome:"+cliente.getNome()+" Cidade: "+cliente.getEndereco().getLogradouro());
        // retorno: nome:Cássio Cidade: Coronel alvaro de moraes
    }
    
```

- Remover Cliente por Documento
  ```java
      Cliente cassio = new Cliente("Cássio", "34104111007");
      uniPet.adicionarCliente(cassio);
      uniPet.removerClientePorDocumento("34104111007");
  ```

#### PETS

- Adicionar pets de maneira isolada
   ```java
      Pet nemo = new Pet("Nemo", 1, "Peixe-Palhaço", TipoPet.PEIXE);
      uniPet.adicionarPet(nemo);
    ```


- Buscar Pet por Tipo
  ```java
      PetShop uniPet = new PetShop("UniPet", "62119615000199");
      Pet jade = new Pet("Jade", 9, "Perdigueiro", TipoPet.MAMIFERO);
      Pet nemo = new Pet("Nemo", 1, "Peixe-Palhaço", TipoPet.PEIXE);
      Cliente cassio = new Cliente("Cássio", "34104111007");
      cassio.adicionarPet(jade);
      uniPet.adicionarCliente(cassio);
      uniPet.adicionarPet(nemo);
      List<Pet> peixes = uniPet.buscarPetsPorTipo(TipoPet.PEIXE); 
        for (Pet peixe : peixes) {
        System.out.println("nome:" + peixe.getNome()); // retornará apenas o nemo
      }
  ```

#### FUNCIONÁRIOS

- Adicionar Funcionarios:
  ```java
    PetShop uniPet = new PetShop("UniPet", "62119615000199");
    Funcionario jorge = new Funcionario("Jorge Da Silva", "04759781021", new BigDecimal("5000"), TipoFuncionario.VETERINARIO);
    Funcionario matheus = new Funcionario("Matheus Da Rosa", "19399449025", new BigDecimal("9000"), TipoFuncionario.GESTOR);
    uniPet.adicionarFuncionario(jorge);
    uniPet.adicionarFuncionario(matheus);
  ```  

- Buscar Funcionarios por salario entre x a y:
  ```java
    PetShop uniPet = new PetShop("UniPet", "62119615000199");
    Funcionario jorge = new Funcionario("Jorge Da Silva", "04759781021", new BigDecimal("5000"), TipoFuncionario.VETERINARIO);
    Funcionario matheus = new Funcionario("Matheus Da Rosa", "19399449025", new BigDecimal("9000"), TipoFuncionario.GESTOR);
    uniPet.adicionarFuncionario(jorge);
    uniPet.adicionarFuncionario(matheus);
    List<Funcionario> funcionariosDeAltoCusto = uniPet.buscaFuncionarioPorSalario(new BigDecimal("7000"), new BigDecimal("12000"));
    for (Funcionario funcionario : funcionariosDeAltoCusto) {
        System.out.println("nome: " + funcionario.getNome() + " salario: " + funcionario.getSalario().toString());
        // retorno: nome: Matheus Da Rosa salario: 9000
    }
  ```

