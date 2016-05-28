/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package operation.templateMethod.example1;

/**
 *
 * @author eah1
 */
public class ClassConcret2 extends ClassAbstract {

    public ClassConcret2() {
        
    }
    
    @Override
    public int mult(int num) {
        
        return num * 1000;
        
    }

    @Override
    public int sum(int num) {
        
        return num + 100;
        
    }
    
}
