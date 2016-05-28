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
public abstract class ClassAbstract {
    
    public int get( int num ) {
        
        this.mesaje();
        
        int numero = this.mult( num );
        numero = this.sum( numero );
        
        return numero;
    
    }

    public void mesaje() {
        
        System.out.println("Operation ...");
    
    }
   
    public abstract int mult( int num );
    
    public abstract int sum(  int num  );
    
}
