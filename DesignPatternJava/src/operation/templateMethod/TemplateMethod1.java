/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package operation.templateMethod;

import operation.templateMethod.example1.ClassConcret1;
import operation.templateMethod.example1.ClassConcret2;

/**
 *
 * @author eah1
 */
public class TemplateMethod1 {
    
    public static void main(String[] args) {
        
        ClassConcret1 cc1 = new ClassConcret1();
        ClassConcret2 cc2 = new ClassConcret2();

        int num1 = cc1.get(3);
        System.out.println( "num1: " + num1 );
        
        int num2 = cc2.get(50);
        System.out.println( "num2: " + num2 );
        
    }
    
}
