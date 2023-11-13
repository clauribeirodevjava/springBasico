package com.euzebio.patterns.prototype;

// Classe concreta que implementa a interface Prototype
public class MinhaClasse implements Prototype {
	private String mensagem;

	public MinhaClasse(String mensagem) {
		this.mensagem = mensagem;
	}

	// Construtor de cópia para realizar a cópia profunda
	private MinhaClasse(MinhaClasse original) {
		this.mensagem = original.mensagem;
	}

	@Override
	public Prototype clone() {
		// Cria uma cópia profunda do objeto
		return new MinhaClasse(this);
	}

	public String getMensagem() {
		return mensagem;
	}

	public void setMensagem(String novaMensagem) {
		this.mensagem = novaMensagem;
	}
}