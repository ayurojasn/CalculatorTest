/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package businessLogic;

import org.junit.*;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThrows;

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
    public void testAdd1() {
        System.out.println("add");
        float a = 3F;
        float b = 5F;
        float expResult = 8F;
        float result = Calculadora.add(a, b);
        assertEquals(expResult, result, 0.0);
    }

    @Test
    public void testAdd2() {
        System.out.println("add");
        float a = 0F;
        float b = 0F;
        float expResult = 0F;
        float result = Calculadora.add(a, b);
        assertEquals(expResult, result,         0.0);
    }

    @Test
    public void testAdd3() {
        System.out.println("add");
        float a = -5F;
        float b = -9F;
        float expResult = -14F;
        float result = Calculadora.add(a, b);
        assertEquals(expResult, result, 0.0);
    }

    @Test
    public void testAdd4() {
        System.out.println("add");
        float a = 3F;
        float b = -24F;
        float expResult = -21F;
        float result = Calculadora.add(a, b);
        assertEquals(expResult, result, 0.0);
    }

    @Test
    public void testAdd5() {
        System.out.println("add");
        float a = 0F;
        float b = -80F;
        float expResult = -80F;
        float result = Calculadora.add(a, b);
        assertEquals(expResult, result, 0.0);
    }

    @Test
    public void testAdd6() {
        System.out.println("add");
        float a = -10.2F;
        float b = 0F;
        float expResult = -10.2F;
        float result = Calculadora.add(a, b);
        assertEquals(expResult, result, 0.0);
    }

    @Test
    public void testAdd7() {
        System.out.println("add");
        float a = 1.5F;
        float b = 1.5F;
        float expResult = 3F;
        float result = Calculadora.add(a, b);
        assertEquals(expResult, result, 0.0);
    }

    @Test
    public void testAdd8() {
        System.out.println("add");
        float a = 10.8F;
        float b = 0.2F;
        float expResult = 11F;
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
    public void testDiv1() {
        System.out.println("div");
        float a = 20F;
        float b = 5F;
        float expResult = 4F;
        float result = Calculadora.div(a, b);
        assertEquals(expResult, result, 0.0);
        
    }
    @Test
    public void testDiv2() {
        System.out.println("div");
        float a = -10F;
        float b = 2F;
        float expResult = -5;
        float result = Calculadora.div(a, b);
        assertEquals(expResult, result, 0.0);

    }
    @Test
    public void testDiv3() {
        System.out.println("div");
        float a = -10F;
        float b = -2F;
        float expResult = 5;
        float result = Calculadora.div(a, b);
        assertEquals(expResult, result, 0.0);
    }

    @Test
    public void testDivByZero1() {
        System.out.println("div by zero");
        float a = 5;
        float b = 0;
        assertThrows(ArithmeticException.class, ()->{Calculadora.div(a,b);});
    }

    @Test
    public void testDivByZero2() {
        System.out.println("div by zero");
        float a = 0;
        float b = 0;
        assertThrows(ArithmeticException.class, ()->{Calculadora.div(a,b);});
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
    public void testMod5() {
        System.out.println("mod by zero");
        float a = 20F;
        float b = 0F;
        assertThrows(ArithmeticException.class,()->{Calculadora.mod(a,b);});
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
        float expResult = 1024;
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

    @Test
    public void testNegativeSqrt() {
        System.out.println("negative sqrt");
        float a = -5F;
        assertThrows(ArithmeticException.class, ()->{Calculadora.sqrt(a);});
    }

    @Test
    public void testSqrt1() {
        System.out.println("sqrt");
        float a = 100F;
        float expResult = 10F;
        double result = Calculadora.sqrt(a);
        assertEquals(expResult, result, 0.0);

    }

    @Test
    public void testSqrt2() {
        System.out.println("sqrt");
        float a = 0F;
        float expResult = 0F;
        double result = Calculadora.sqrt(a);
        assertEquals(expResult, result, 0.0);

    }

    @Test
    public void testSqrt3() {
        System.out.println("sqrt");
        float a = 10F;
        float expResult = 3.162F;
        double result = Calculadora.sqrt(a);

        assertEquals(expResult, result, 0.01);

    }

    @Test
    public void testSqrt4() {
        System.out.println("sqrt");
        float a = 125F;
        float expResult = 11.180F;
        double result = Calculadora.sqrt(a);

        assertEquals(expResult, result, 0.01);

    }


    @Test
    public void testNegativeFactorial() {
        System.out.println("negative factorial");
        float a = -5;
        assertThrows(ArithmeticException.class, ()->{Calculadora.factorial(a);});
    }

    @Test
    public void testFactorial2() {
        System.out.println("factorial");
        float a = 5;
        float expResult = 120;
        double result = Calculadora.factorial(a);
        assertEquals(expResult, result, 0.0);
    }

    @Test
    public void testFactorial3() {
        System.out.println("factorial");
        float a = 1;
        float expResult = 1;
        double result = Calculadora.factorial(a);
        assertEquals(expResult, result, 0.0);
    }

    @Test
    public void testFactorial4() {
        System.out.println("factorial");
        float a = 0;
        float expResult = 1;
        double result = Calculadora.factorial(a);
        assertEquals(expResult, result, 0.0);
    }

    @Test
    public void testFactorial5() {
        System.out.println("factorial");
        float a = 10;
        float expResult = 3628800;
        double result = Calculadora.factorial(a);
        assertEquals(expResult, result, 0.0);
    }

    @Test
    public void testLog1() {
        System.out.println("logaritmo n");
        float a = 10;
        double expResult = 2.3025;
        double result = Calculadora.log(a);
        assertEquals(expResult, result, 0.001);
    }

    @Test
    public void testNegativeLog() {
        System.out.println("negative log");
        float a = -5;
        assertThrows(ArithmeticException.class, ()->{Calculadora.log(a);});
    }

}
