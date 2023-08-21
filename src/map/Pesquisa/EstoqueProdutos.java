package map.Pesquisa;

import java.util.HashMap;
import java.util.Map;

public class EstoqueProdutos {

    //Attribute
    private final Map<Long, Produto> produtoMap = new HashMap<>();

    //Constructor
    public EstoqueProdutos() {
    }

    public void adicionarProduto(Long cod, String nome, int quantidade, double preco) {
        produtoMap.put(cod, new Produto(nome, quantidade, preco));
    }

    public void exibirProdutos() {
        System.out.println(produtoMap);
    }

    public double calcularValorTotalDoEstoque() {
        double valoTotalEstoque = 0;
        for (Produto p : produtoMap.values()) {
            valoTotalEstoque += (double) p.getQuantidade() * p.getPreco();
        }
        return valoTotalEstoque;
    }

    public Produto obterProdutoMaisCaro() {
        Produto produtoMasCaro = null;
        double precoMaior = 0;
        int i = 0;
        for (Produto p : produtoMap.values()) {
            if (i == 0) {
                precoMaior = p.getPreco();
                produtoMasCaro = p;
                i = 1;
            } else if (p.getPreco() > precoMaior) {
                precoMaior = p.getPreco();
                produtoMasCaro = p;
            }
        }
        return produtoMasCaro;
    }

    public Produto obterProdutoMaisBarato() {
        Produto produtoMasBarato = null;
        double precoBarato = 0;
        int i = 0;
        for (Produto p : produtoMap.values()) {
            if (i == 0) {
                precoBarato = p.getPreco();
                produtoMasBarato = p;
                i = 1;
            } else if (p.getPreco() < precoBarato) {
                precoBarato = p.getPreco();
                produtoMasBarato = p;
            }
        }
        return produtoMasBarato;
    }

    public Produto obterProdutoMaiorQuantidadeTotalNoEstoque() {
        double produtoMasCaro = 0;
        Produto produto = null;
        for (Produto p : produtoMap.values()) {
            if ((p.getQuantidade() * p.getPreco()) > produtoMasCaro) {
                produtoMasCaro = (double) p.getQuantidade() * p.getPreco();
                produto = p;
            }
        }
        return produto;
    }

    public static void main(String[] args) {
        EstoqueProdutos estoqueProdutos = new EstoqueProdutos();
        estoqueProdutos.adicionarProduto(1L, "Produto 1", 10, 2.5);
        estoqueProdutos.adicionarProduto(2L, "Produto 2", 1, 6.78);
        estoqueProdutos.adicionarProduto(3L, "Produto 3", 11, 1.99);
        estoqueProdutos.adicionarProduto(4L, "Produto 4", 50, 0.33);
        estoqueProdutos.adicionarProduto(1L, "Produto 5", 17, 6.79);

        System.out.printf("O valor total é de R$ %.2f \n", estoqueProdutos.calcularValorTotalDoEstoque());
        System.out.println("O produto mas caro é: " + estoqueProdutos.obterProdutoMaisCaro());
        System.out.println("O produto mas barato é: " + estoqueProdutos.obterProdutoMaisBarato());
        System.out.println("O produto com maior quantidade mas caro é: " + estoqueProdutos.obterProdutoMaiorQuantidadeTotalNoEstoque());
        estoqueProdutos.exibirProdutos();
    }
}
