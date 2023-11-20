package com.euzebio.patterns.builder.factorymethod;
// Cliente que utiliza a fábrica para criar objetos Produto
public class Cliente {
    private Fabrica fabrica;

    public Cliente(Fabrica fabrica) {
        this.fabrica = fabrica;
    }

    public String executarOperacao() {
        Produto produto = fabrica.criarProduto();
       return produto.operacao();
    }

    public static void main(String[] args) {
        // Utilizando a fábrica para criar ProdutoConcretoA
        Fabrica fabricaA = new FabricaConcretaA();
        Cliente clienteA = new Cliente(fabricaA);
        clienteA.executarOperacao();

        // Utilizando a fábrica para criar ProdutoConcretoB
        Fabrica fabricaB = new FabricaConcretaB();
        Cliente clienteB = new Cliente(fabricaB);
        clienteB.executarOperacao();
    }
}