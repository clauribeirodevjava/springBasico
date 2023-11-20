package com.euzebio.patterns.builder.factorymethod;
// Implementação concreta do produto
public class ProdutoConcretoA implements Produto {
    @Override
    public String operacao() {
        return "Operação do ProdutoConcretoA";
    }
}