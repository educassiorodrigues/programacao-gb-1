package classes;

import java.util.ArrayList;
import java.util.List;

import static java.util.Objects.isNull;

public class Estoque {
    private List<Produto> produtos;

    public Estoque() {
        this.produtos = new ArrayList<Produto>();
    }

    public void adicionarProduto(Produto produto) {
        this.produtos.add(produto);
    }
    public boolean removerProdutoPorNome(String nome){
        Produto produto = this.produtos.stream().filter(_produto -> _produto.getNome().equals(nome)).findFirst().orElse(null);
        if(isNull(produto)){
            return false;
        }

        this.produtos.remove(produto);
        return true;
    }
}
