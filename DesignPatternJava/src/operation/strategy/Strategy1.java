/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package operation.strategy;

import operation.strategy.example1.Arithmeticoperation;
import operation.strategy.example1.Multiply;
import operation.strategy.example1.Subtraction;
import operation.strategy.example1.Sum;

/**
 *
 * @author eah1
 */
public class Strategy1 {
    
    public static void main(String[] args) {
        
        Arithmeticoperation context;
        
        context = new Arithmeticoperation( new Sum() );
        int suma = context.procesar( 3,4 );
        
        context = new Arithmeticoperation( new Subtraction() );
        int resta = context.procesar( 3,4 );
        
        context = new Arithmeticoperation( new Multiply() );
        int multip = context.procesar( 3,4 );
        
        System.out.println("Suma: " + suma );
        System.out.println("Resta: " + resta );
        System.out.println("Multiplicación: " + multip );
        
    }
    
}
