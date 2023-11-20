package com.euzebio.patterns.builder.factorymethod;
// Implementação concreta da fábrica que cria ProdutoConcretoA
public class FabricaConcretaA implements Fabrica {
    @Override
    public Produto criarProduto() {
        return new ProdutoConcretoA();
    }
}
