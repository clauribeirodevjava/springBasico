package com.euzebio.patterns.builder.factorymethod;
// Outra implementação concreta do produto
public class ProdutoConcretoB implements Produto {
    @Override
    public String operacao() {
        return "Operação do ProdutoConcretoB";
    }
}