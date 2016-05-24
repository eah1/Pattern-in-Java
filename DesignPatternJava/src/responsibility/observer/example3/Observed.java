/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package responsibility.observer.example3;

import java.util.ArrayList;

/**
 *
 * @author eah1
 */
public abstract class Observed {
    
    private ArrayList<InterfaceIObserver> observers = new ArrayList<>();
    
    public Observed() {
        
    }
    
    public void addObserver( InterfaceIObserver o ) {
      
        this.observers.add(o);
    
    }
     
    public void deliteObserver( InterfaceIObserver o ) {
        
        this.observers.remove( o );

    }
    
    public void notifyObservers() {
        
        for (InterfaceIObserver obj : this.observers) {
             obj.observerUpdated();
        }
    }
    
}
