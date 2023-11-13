package com.euzebio.springbasico;

import static org.junit.jupiter.api.Assertions.assertSame;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

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

}
