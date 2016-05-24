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
public class ToObserver implements InterfaceIObserver{

    private ToObserved toObserved;
    
    public ToObserver( ToObserved toObserved ) {
        
        this.toObserved = toObserved;
        this.toObserved.addObserver( this );

    }
    
    @Override
    public void observerUpdated() {
        
        System.out.println("The value Object Observed is change to [" + 
                this.toObserved.getNumber() + "]");
        
    }    
    
}
