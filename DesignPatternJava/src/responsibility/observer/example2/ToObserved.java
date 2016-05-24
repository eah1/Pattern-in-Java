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
public class ToObserved extends Observed {
    
    private String name = "";

    public ToObserved() {
        
        super();
        
    }

    public String getName() {
        
        return this.name;
    
    }

    public void setName( String name ) {
        
        this.name = name;
        this.notifyObservadors( name );
        
    }
    
}
