package exfila;

import java.util.ArrayList;
import java.util.Collections;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

public class FilaTest {    
    public FilaTest() {
    }    
    @BeforeClass
    public static void setUpClass() {
    }    
    @AfterClass
    public static void tearDownClass() {
    }    
    @Before
    public void setUp() {
    }    
    @After
    public void tearDown() {
    }
    @Test
    public void testInsert() {
        System.out.println("insert");
        Paciente paciente = null;
        Fila instance = new Fila();
        boolean expResult = true;
        boolean result = instance.insert(paciente);
        assertEquals(expResult, result);
    }

    @Test
    public void testLista5() {
        System.out.println("lista5");
        Fila instance = new Fila();
        ArrayList<Paciente> expResult = new ArrayList<Paciente>();
        
        Paciente pa1 = new Paciente("Vanessa", 31, "Amarelo", 1);
        instance.insert(pa1);
        expResult.add(pa1);
        Paciente pa2 = new Paciente("Ricardo", 33, "Azul", 1);
        instance.insert(pa2);
        Paciente pa3  = new Paciente("Marcos", 21, "vermelho", 3);
        instance.insert(pa3);
        expResult.add(pa3);
        Paciente pa4  = new Paciente("Renata", 37, "Rosa", 3);
        instance.insert(pa4);
        expResult.add(pa4);
        Paciente pa5  = new Paciente("Alexandre", 28, "Cinza", 2);
        instance.insert(pa5);
        expResult.add(pa5);
        Paciente pa6  = new Paciente("Jamil", 26, "Preto", 1);
        instance.insert(pa6);
        Paciente pa7  = new Paciente("Filipe", 47, "Azul", 2);
        instance.insert(pa7);
        expResult.add(pa7);
        Collections.sort(expResult);
        
        ArrayList<Paciente> result = instance.lista5();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
}
