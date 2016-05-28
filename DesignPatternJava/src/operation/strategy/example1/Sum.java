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
public class Sum implements InterfaceArithmetic {

    public Sum() {
        
    }
    
    @Override
    public int makeOperacion(int operator1, int operator2) {

        return operator1 + operator2;

    }
    
}
