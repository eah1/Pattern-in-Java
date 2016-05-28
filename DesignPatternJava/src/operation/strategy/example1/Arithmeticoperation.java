/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package operation.strategy.example1;

/**
 *
 * @author eah1
 */
public class Arithmeticoperation {
    
    private InterfaceArithmetic strategy;

    public Arithmeticoperation( InterfaceArithmetic strategy ) {
        
        this.strategy = strategy;
    
    }
    
    public int procesar( int operator1, int operator2 ) {
         
        return strategy.makeOperacion( operator1, operator2 );
    
    }

    
}
