/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package businessLogic;

import org.junit.*;

import static org.junit.Assert.assertEquals;

/**
 *
 * @author Anabel
 */
public class CalculadoraIT {
    
    public CalculadoraIT() {
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

    /**
     * Test of add method, of class Calculadora.
     */
    @Test
    public void testAdd() {
        System.out.println("add");
        float a = 3F;
        float b = 5F;
        float expResult = 8F;
        float result = Calculadora.add(a, b);
        assertEquals(expResult, result, 0.0);
    }

    /**
     * Test of substract method, of class Calculadora.
     */
    @Test
    public void testSubstract1() {
        System.out.println("substract");
        float a = 10F;
        float b = 5F;
        float expResult = 5F;
        float result = Calculadora.substract(a, b);
        assertEquals(expResult, result, 0.0);
        
    }

    @Test
    public void testSubstract2() {
        System.out.println("substract");
        float a = -3F;
        float b = 5F;
        float expResult = -8F;
        float result = Calculadora.substract(a, b);
        assertEquals(expResult, result, 0.0);

    }

    @Test
    public void testSubstract3() {
        System.out.println("substract");
        float a = 0F;
        float b = 0F;
        float expResult = 0F;
        float result = Calculadora.substract(a, b);
        assertEquals(expResult, result, 0.0);

    }

    @Test
    public void testSubstract4() {
        System.out.println("substract");
        float a = -4F;
        float b = -5F;
        float expResult = 1F;
        float result = Calculadora.substract(a, b);
        assertEquals(expResult, result, 0.0);

    }

    @Test
    public void testSubstract5() {
        System.out.println("substract");
        float a = 10F;
        float b = 10F;
        float expResult = 0F;
        float result = Calculadora.substract(a, b);
        assertEquals(expResult, result, 0.0);

    }



    /**
     * Test of multiply method, of class Calculadora.
     */
    @Test
    public void testMultiply1() {
        System.out.println("multiply");
        float a = 7F;
        float b = 2F;
        float expResult = 14F;
        float result = Calculadora.multiply(a, b);
        assertEquals(expResult, result, 0.0);
        
    }
    @Test
    public void testMultiply2() {
        System.out.println("multiply");
        float a = 7F;
        float b = 0F;
        float expResult = 0F;
        float result = Calculadora.multiply(a, b);
        assertEquals(expResult, result, 0.0);

    }
    @Test
    public void testMultiply3() {
        System.out.println("multiply");
        float a = 7F;
        float b = -1F;
        float expResult = -7F;
        float result = Calculadora.multiply(a, b);
        assertEquals(expResult, result, 0.0);

    }
    @Test
    public void testMultiply4() {
        System.out.println("multiply");
        float a = 2.5F;
        float b = 2F;
        float expResult = 5F;
        float result = Calculadora.multiply(a, b);
        assertEquals(expResult, result, 0.0);

    }
    @Test
    public void testMultiply5() {
        System.out.println("multiply");
        float a = -7F;
        float b = -2F;
        float expResult = 14F;
        float result = Calculadora.multiply(a, b);
        assertEquals(expResult, result, 0.0);

    }

    /**
     * Test of div method, of class Calculadora.
     */
    @Test
    public void testDiv() {
        System.out.println("div");
        float a = 20F;
        float b = 5F;
        float expResult = 4F;
        float result = Calculadora.div(a, b);
        assertEquals(expResult, result, 0.0);
        
    }

    /**
     * Test of mod method, of class Calculadora.
     */
    @Test
    public void testMod1() {
        System.out.println("mod");
        float a = 20F;
        float b = 5F;
        float expResult = 0F;
        float result = Calculadora.mod(a, b);
        assertEquals(expResult, result, 0.0);

    }

    @Test
    public void testMod2() {
        System.out.println("mod");
        float a = 20F;
        float b = 3F;
        float expResult = 2F;
        float result = Calculadora.mod(a, b);
        assertEquals(expResult, result, 0.0);

    }

    @Test
    public void testMod3() {
        System.out.println("mod");
        float a = 20F;
        float b = -3F;
        float expResult = 2F;
        float result = Calculadora.mod(a, b);
        assertEquals(expResult, result, 0.0);

    }

    @Test
    public void testMod4() {
        System.out.println("mod");
        float a = -20F;
        float b = 3F;
        float expResult = -2F;
        float result = Calculadora.mod(a, b);
        assertEquals(expResult, result, 0.0);

    }


    /**
     * Test of sign method, of class Calculadora.
     */
    @Test
    public void testSign() {
        System.out.println("sign");
        float a = 1F;
        float expResult = -1F;
        float result = Calculadora.sign(a);
        assertEquals(expResult, result, 0.0);

    }

    /**
     * Test of powOfTen method, of class Calculadora.
     */
    @Test
    public void testPowOfTen1() {
        System.out.println("powOfTen");
        float a = 2F;
        float expResult = 1024F;
        double result = Calculadora.powOfTen(a);
        assertEquals(expResult, result, 0.0);

    }

    @Test
    public void testPowOfTen2() {
        System.out.println("powOfTen");
        float a = 0F;
        float expResult = 0F;
        double result = Calculadora.powOfTen(a);
        assertEquals(expResult, result, 0.0);

    }

    @Test
    public void testPowOfTen3() {
        System.out.println("powOfTen");
        float a = 1F;
        float expResult = 1F;
        double result = Calculadora.powOfTen(a);
        assertEquals(expResult, result, 0.0);

    }

    @Test
    public void testPowOfTen4() {
        System.out.println("powOfTen");
        float a = 3F;
        float expResult = 59049;
        double result = Calculadora.powOfTen(a);
        assertEquals(expResult, result, 0.0);

    }

    @Test
    public void testPowOfTen5() {
        System.out.println("powOfTen");
        float a = -2F;
        float expResult = -1024;
        double result = Calculadora.powOfTen(a);
        assertEquals(expResult, result, 0.0);

    }

    /**
     * Test of sqrt method, of class Calculadora.
     */
    @Test
    public void testSqrt() {
        System.out.println("sqrt");
        float a = 16F;
        float expResult = 4F;
        double result = Calculadora.sqrt(a);
        assertEquals(expResult, result, 0.0);

    }


}
