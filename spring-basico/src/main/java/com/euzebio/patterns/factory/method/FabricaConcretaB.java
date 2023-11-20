package com.euzebio.patterns.builder.factorymethod;
// Implementação concreta da fábrica que cria ProdutoConcretoB
public class FabricaConcretaB implements Fabrica {
    @Override
    public Produto criarProduto() {
        return new ProdutoConcretoB();
    }
}
