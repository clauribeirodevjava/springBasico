package com.euzebio.springbasico;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;
import static org.junit.jupiter.api.Assertions.assertSame;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import com.euzebio.patterns.prototype.MinhaClasse;
import com.euzebio.patterns.singleton.Singleton;

@SpringBootTest
class SpringBasicoApplicationTests {

	@Test
	void contextLoads() {
	}

	@Test
	void testSingleton() {
		Singleton instancia1 = Singleton.getInstance();
		Singleton instancia2 = Singleton.getInstance();

		// As instâncias devem ser as mesmas, pois é um Singleton
		assertSame(instancia1, instancia2);
	}

	@Test
	void testPrototype() {
		// Teste do Prototype (adapte conforme necessário)
		MinhaClasse original = new MinhaClasse("Objeto Original");

		// Clona o objeto original
		MinhaClasse clone = (MinhaClasse) original.clone();

		// Testa se a cópia foi bem-sucedida
		assertEquals(original.getMensagem(), clone.getMensagem());

		// Modifica o objeto original
		original.setMensagem("Objeto Original Modificado");

		// Testa se as modificações afetam apenas o objeto original
		assertNotEquals(original.getMensagem(), clone.getMensagem());
	}

}
