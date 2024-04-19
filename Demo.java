/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author larsons907
 */
public class Demo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int number1 = 3;
        int number2 = 8;
        
        int result1 = MathMet.add(number1, number2);
        int result2 = MathMet.subtract(number1, number2);
        
        System.out.println(number1 + " + " + number2 + " = " + result1);
        System.out.println("11 + 12 = " + MathMet.add(11,12));
        
        System.out.println(number1 + " - " + number2 + " = " + result2);
        
        double result3 = MathMet.add(23.34, 43.76);
        System.out.println("23.34 + 43.76 = "+result3);
        
        System.out.println("43.11 + 9.99 + " + MathMet.add(43.11, 9.99));
        
        double q = MathMet.subtract(234.33,-642.65);
        System.out.println("234.33 - -642.65 = " + q);
        
        System.out.println("32 * 44 = " + MathMet.multiply(32, 44));
        
        System.out.println("23.45 * 6.2 = " + MathMet.multiply(23.45, 6.2));
        
        System.out.println("23 is even? " + MathMet.isEvenNumber(23));
        
        System.out.println("-42 is even? " + MathMet.isEvenNumber(-42));
        
        
                
    }
    
}
