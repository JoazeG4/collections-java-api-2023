package set.Ordenacao;

import java.util.Comparator;
import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class CadastroProduto {

    private final Set<Produto> produtoSet = new HashSet<>();

    public CadastroProduto() {
    }

    public void adicionarProduto(long codigo, String nome, double preco, int quantidade) {
        produtoSet.add(new Produto(codigo,  nome,  preco, quantidade));
    }

    public Set<Produto> exibirProdutosPorNome() {
        return new TreeSet<>(produtoSet);
    }

    public Set<Produto> exibirProdutosPorPreco() {
        Set<Produto> produtosPorPreco = new TreeSet<>(new comparatorPorPreco());
        produtosPorPreco.addAll(produtoSet);
        return produtosPorPreco;
    }

    public static void main(String[] args) {
        CadastroProduto cadastroProduto = new CadastroProduto();
        cadastroProduto.adicionarProduto(1L, "Produto 1", 15d, 10);
        cadastroProduto.adicionarProduto(2L, "Produto 2", 17d, 8);
        cadastroProduto.adicionarProduto(3L, "Produto 3", 14.5d, 6);
        cadastroProduto.adicionarProduto(4L, "Produto 4", 10.11d, 11);
        cadastroProduto.adicionarProduto(5L, "Produto 5", 18d, 1);

        System.out.println(cadastroProduto.produtoSet);

        System.out.println(cadastroProduto.exibirProdutosPorNome());
        System.out.println(cadastroProduto.exibirProdutosPorPreco());
    }
}