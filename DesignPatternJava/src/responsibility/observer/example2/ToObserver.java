/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package responsibility.observer.example2;

/**
 *
 * @author eah1
 */
public class ToObserver implements InterfaceIObserver {

    public ToObserver() {
        
    }
    
    @Override
    public void observerUpdated( Observed observed, Object obj ) {
    
        System.out.println("The value of Object change to [" 
                + ((String) obj) + "]");
        
    }
    
}
