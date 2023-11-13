import static org.junit.Assert.assertSame;
import org.junit.Test;

public class TestSingleton {

    @Test
    public void testSingleton() {
        // Obtém a instância única do Singleton
        Singleton instancia1 = Singleton.getInstance();
        Singleton instancia2 = Singleton.getInstance();

        // As instâncias devem ser as mesmas, pois é um Singleton
        assertSame(instancia1, instancia2);
    }
}
