package ru.maxpetr.normalize.order.folder;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

/**
 *
 * @author Maxim Petruchenko <maxpetr@list.ru>
 */
public class MainTest {

    @AfterAll
    public static void tearDownClass() throws Exception {
        System.out.println("=== Stop tests ===");
        System.out.println("=== Stop tests 111===");
    }

    @BeforeEach
    public void setUp() throws Exception {
        System.out.println("= start test =");
    }

    @AfterEach
    public void tearDown() throws Exception {
        System.out.println("= stop test =");
    }

    @BeforeAll
    public static void setUpClass() throws Exception {
        System.out.println("=== Start tests 111===");
        System.out.println("=== Start tests ===");
    }

    /**
     * Test of main method, of class Main.
     */
    @Test
    public void testMain() {
        System.out.println("main");
        String[] args = null;
        Main.main(args);
        // DONE: review the generated test code and remove the default call to fail.
        // fail("The test case is a prototype.");
        assertTrue(true);
    }
    
}
