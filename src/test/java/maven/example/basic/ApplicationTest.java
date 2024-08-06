package maven.example.basic;

import junit.framework.TestCase;
import org.junit.Before;
import org.junit.Test;

public class ApplicationTest extends TestCase {

    //declarando una aplicación
    private Application app;

    //se agrega ANOTACIÓN DE JUNIT "@before" para que comience antes de la aplicación
    @Before
    public void setUp() throws Exception {
        app = new Application();
    }
    @Test
    public void testCountWords() {
        int count = app.countWords("Hola Enfermera son dos palabras");
        assertTrue(count == 5);
    }

    @Test
    public void testCountEmpty() {
        int count = app.countWords("");
        assertTrue(count == 0);
    }

    @Test
    public void testCountCountNull() {
        int count = app.countWords(null);
        assertTrue(count == 0);
    }


}