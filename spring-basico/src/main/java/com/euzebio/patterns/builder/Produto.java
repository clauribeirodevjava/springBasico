package com.euzebio.patterns.builder;
// Classe Produto que será construída
public class Produto {
    private String parte1;
    private String parte2;
    private String parte3;

    // Construtor privado para forçar a construção através do Builder
    private Produto() {}

    public String getParte1() {
        return parte1;
    }

    public String getParte2() {
        return parte2;
    }

    public String getParte3() {
        return parte3;
    }

    @Override
    public String toString() {
        return "Produto [parte1=" + parte1 + ", parte2=" + parte2 + ", parte3=" + parte3 + "]";
    }

    // Builder estático interno à classe Produto
    public static class Builder {
        private Produto produto;

        public Builder() {
            this.produto = new Produto();
        }

        public Builder withParte1(String parte1) {
            this.produto.parte1 = parte1;
            return this;
        }

        public Builder withParte2(String parte2) {
            this.produto.parte2 = parte2;
            return this;
        }

        public Builder withParte3(String parte3) {
            this.produto.parte3 = parte3;
            return this;
        }

        public Produto build() {
            // Verificar se todas as partes necessárias foram configuradas
            // Pode lançar uma exceção se partes obrigatórias estiverem ausentes
        	if (produto.parte1 == null || produto.parte2 == null || produto.parte3 == null) {
                throw new IllegalStateException("Todas as partes obrigatórias do produto devem ser configuradas.");
            }
            return this.produto;
        }
    }
}

