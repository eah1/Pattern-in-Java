/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfaces.adapter;

/**
 *
 * @author eah1
 */
public class BoxEuros {
    
    private double euros = 0;
    
    public BoxEuros(){ 
    
    }
    
    public double getEuros() {
        
        return this.euros;
        
    }
    
    public void drawEuros( double euros ) {
        
        this.euros -=  euros;
        
    }
    
    public void payInEuros( double euros ) {
        
        this.euros +=  euros;
        
    }
    
}
