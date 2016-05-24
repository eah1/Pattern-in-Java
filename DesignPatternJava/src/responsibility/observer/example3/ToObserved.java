/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package responsibility.observer.example3;

/**
 *
 * @author eah1
 */
public class ToObserved extends Observed {
    
    private int number = 0;

    public ToObserved(){
        
    }
    
    public int getNumber() {
        
        return this.number;
    
    }
    
    public void setNumbe( int number ) {
        
        this.number = number;
        super.notifyObservers();
        
    }
    
}
