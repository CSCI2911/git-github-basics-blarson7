/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author larsons907
 */
public class MathMetTest {
    
    public MathMetTest() {
    }

    /**
     * Test of add integer method, of class MathMet.
     */
    @Test
    public void testAddTwoFive() {
        System.out.println("Add Int");
        assertEquals(7, MathMet.add(2, 5));    
    }
    /**
     * Test of add integer method, of class MathMet.
     */
    @Test
    public void testNegNineNegTwentySix() {
        System.out.println("Add Int");
        assertEquals(-35, MathMet.add(-9, -26));
        
    }
    /**
     * Test of add integer method, of class MathMet.
     */
    @Test
    public void testAddNeg253And434() {
        System.out.println("Add Int");
        assertEquals(181, MathMet.add(-253, 434));
    }

    /**
     * Test of add double method, of class MathMet.
     */
    @Test
    public void testAdd2dot2And4dot6() {
        System.out.println("Add Double");
        assertEquals(6.8, MathMet.add(2.2, 4.6));
        
    }
    /**
     * Test of add double method, of class MathMet.
     */
    @Test
    public void testAddNeg15dot3AndNeg61dot6() {
        System.out.println("Add Double");
        assertEquals(-76.9, MathMet.add(-15.3, -61.6));    
    }
    /**
     * Test of add double method, of class MathMet.
     */   
    @Test
    public void testAdd234dot33AndNeg642dot01() {
        System.out.println("Add Double");
        assertEquals(-408.12, MathMet.add(234.33, -642.45));    
    }
    /**
     * Test of subtract integer method, of class MathMet.
     */
    @Test
    public void testSubtractThirteenAndSeven() {
        System.out.println("Subtract Int");
        assertEquals(6, MathMet.subtract(13, 7)); 
    }
    /**
     * Test of subtract integer method, of class MathMet.
     */
    @Test
    public void testSubtractNegthirtyAndNegNine() {
        System.out.println("Subtract Int");
        assertEquals(-21, MathMet.subtract(-30, -9)); 
    }
    /**
     * Test of subtract integer method, of class MathMet.
     */
    @Test
    public void testSubtractNeg55And225() {
        System.out.println("Subtract Int");
        assertEquals(-280, MathMet.subtract(-55, 225)); 
    }
    /**
     * Test of subtract double method, of class MathMet.
     */
    @Test
    public void testSubtract9Dot222And4dot654() {
        System.out.println("Subtract Double");
        assertEquals(4.568, MathMet.subtract(9.222, 4.654));
    }
    /**
     * Test of subtract double method, of class MathMet.
     */
    @Test
    public void testSubtractNeg12dot5AndNeg7dot2() {
        System.out.println("Subtract Double");
        assertEquals(-5.3, MathMet.subtract(-12.5, -7.2));
    }
    /**
     * Test of subtract double method, of class MathMet.
     */
    @Test
    public void testSubtract0dot55547And12dot56() {
        System.out.println("Subtract Double");
        assertEquals(-12.00453, MathMet.subtract(0.55547,12.56));
    }
    /**
     * Test of multiply integer method, of class MathMet.
     */
    @Test
    public void testMultiply3And9() {
        System.out.println("Multiply Int");
        assertEquals(27, MathMet.multiply(3, 9));
    }
    /**
     * Test of multiply integer method, of class MathMet.
     */
    @Test
    public void testMultiplyNeg14AndNeg15() {
        System.out.println("Multiply Int");
        assertEquals(210, MathMet.multiply(-14, -15));
    }
    /**
     * Test of multiply integer method, of class MathMet.
     */
    @Test
    public void testMultiplyNeg53And27() {
        System.out.println("Multiply Int");
        assertEquals(-1431, MathMet.multiply(-53, 27));
    }
    /**
     * Test of multiply double method, of class MathMet.
     */
    @Test
    public void testMultiply2dot25And4() {
        System.out.println("Multiply Double");
        assertEquals(9.00, MathMet.multiply(2.25, 4));  
    }
     /**
     * Test of multiply double method, of class MathMet.
     */
    @Test
    public void testMultiplyNeg53dot55And23dot80() {
        System.out.println("Multiply Double");
        assertEquals(51.975, MathMet.multiply(2.25, 23.10));  
    }
     /**
     * Test of multiply double method, of class MathMet.
     */
    @Test
    public void testMultiplyNeg3dot15AndNeg2dot72() {
        System.out.println("Multiply Double");
        assertEquals(8.568, MathMet.multiply(-3.15, -2.72));  
    }

    /**
     * Test of isEvenNumber method, of class MathMet.
     */
    @Test
    public void testIsTenEvenNumber() {
        System.out.println("Is Even Number");
        int number = 10;
        boolean expResult = true;
        boolean result = MathMet.isEvenNumber(number);
        assertEquals(expResult, result);
        
    }
    /**
     * Test of isEvenNumber method, of class MathMet.
     */
    @Test
    public void testIsTwentyFiveEvenNumber() {
        System.out.println("Is Even Number");
        int number = 25;
        boolean expResult = false;
        boolean result = MathMet.isEvenNumber(number);
        assertEquals(expResult, result);
        
    }
    /**
     * Test of isEvenNumber method, of class MathMet.
     */
    @Test
    public void testIsNegativeSixEvenNumber() {
        System.out.println("Is Even Number");
        int number = -6;
        boolean expResult = true;
        boolean result = MathMet.isEvenNumber(number);
        assertEquals(expResult, result);
        
    }
    
}
