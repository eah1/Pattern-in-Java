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
public class ClassConcret1 extends ClassAbstract {

    public ClassConcret1(){
    
    }
    
    @Override
    public int mult(int num) {
        
        return num * 100;
    
    }

    @Override
    public int sum(int num) {
        
        return num + 10;
    
    }
    
}
