package com.euzebio.patterns.singleton;
public class Singleton {

    // Instância única da classe
    private static Singleton instance;

    // Construtor privado para evitar a criação de instâncias diretamente
    private Singleton() {
        // Inicialização do Singleton
    }

    // Método para obter a instância única
    public static Singleton getInstance() {
        // Se a instância ainda não foi criada, crie-a
        if (instance == null) {
            instance = new Singleton();
        }
        // Retorne a instância existente
        return instance;
    }

    // Outros métodos da classe
    public void metodoExemplo() {
        System.out.println("Método de exemplo chamado.");
    }
}
