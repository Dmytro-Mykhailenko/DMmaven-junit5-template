package org.example;
import org.junit.jupiter.api.*;
import static org.junit.jupiter.api.Assertions.*;

public class CalculatorTest {

    private Calculator calc;

   /*
   @BeforeAll
    static void setBefore() {
        System.out.println("set before all");
    }
    */

    @BeforeEach void setUp() {
        calc = new Calculator();
        System.out.println("Setting up test environment");
    }

    /*
    @AfterEach
    void after() {
        System.out.println("clear test env.");
    }

    @AfterAll
    static void afterTests() {
        System.out.println("clear after all");
    }
    */

    @Test
    public void addTwoPositiveNumbers(){
      //  Calculator calc=new Calculator();
        assertEquals(10, calc.addition(5, 5));
    }

    @Test
    public void addTwoNegativeNumbers(){
        //Calculator calc=new Calculator();
        assertEquals(-9, calc.addition(-5, -4));
    }

    @Test
    public void addNumberAndZero(){
        //Calculator calc=new Calculator();
        assertEquals(6, calc.addition(6, 0));
    }

    @Test
    public void addZeroAndNumber(){
        //Calculator calc=new Calculator();
        assertEquals(3, calc.addition(0, 3));
    }

    @Test
    public void subtractTwoPositiveNumbers(){
       // Calculator calc=new Calculator();
        assertEquals(1, calc.subtraction(6, 5));
    }

    @Test
    public void subtractTwoNegativeNumbers(){
       // Calculator calc=new Calculator();
        assertEquals(1, calc.subtraction(-1, -2));
    }

    @Test
    public void subtractZero(){
       // Calculator calc=new Calculator();
        assertEquals(1, calc.subtraction(1, 0));
    }

    @Test
    public void subtractFromZero(){
       // Calculator calc=new Calculator();
        assertEquals(-8, calc.subtraction(0, 8));
    }

    @Test
    public void comparisonWhenNum1Bigger(){
       // Calculator calc=new Calculator();
        assertTrue(calc.isNum1Bigger(5, 4));
    }

    @Test
    public void comparisonWhenNum1Smaller(){
       // Calculator calc=new Calculator();
        assertFalse(calc.isNum1Bigger(4, 5));
    }

    @Test
    public void comparisonWhenNumbersAreEqual(){
        //Calculator calc=new Calculator();
        assertFalse(calc.isNum1Bigger(5, 5));
    }

    @Test
    public void multipleFloatByZero(){
        assertEquals(0, calc.multipleTwoFloatNumbers(4.1, 0), 0.001);
    }

    @Test
    public void multipleTwoPositiveFloatNumbers(){
        assertEquals(3.25, calc.multipleTwoFloatNumbers(2.5, 1.3), 0.001);
    }

    @Test
    public void multipleTwoNegativeFloatNumbers(){
        assertEquals(7.475, calc.multipleTwoFloatNumbers(-3.25, -2.3), 0.001);
    }

    @Test
    public void multiplePositiveFloatByNegativeFloat(){
        assertEquals(-14.4384, calc.multipleTwoFloatNumbers(5.12,-2.82), 0.001);
    }

    @Test
    public void divisionFloatByZero(){
        assertEquals(0,calc.divideTwoFloatNumbers(4,0), 0);
    }

    @Test
    public void divisionZeroByFloat(){
        assertEquals(0, calc.divideTwoFloatNumbers(0,2.4),0);
    }

    @Test
    public void divisionTwoPositiveFloatNumbers(){
        assertEquals(0.75, calc.divideTwoFloatNumbers(0.3, 0.4), 0.001);
    }

    @Test
    public void divisionTwoNegativeFloatNumbers(){
        assertEquals(2.5, calc.divideTwoFloatNumbers(-0.5, -0.2), 0.001);
    }
}
