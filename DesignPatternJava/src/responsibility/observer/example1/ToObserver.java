/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package responsibility.observer.example1;

/**
 *
 * @author eah1
 */
public class ToObserver implements InterfaceIObserver {

    private String name;
    
    public ToObserver( String name ) {
        
        this.name = name;
        System.out.println("Observer [" + this.name + "] created");
        
    }

    public String getName() {
        
        return this.name;
        
    }
    
    @Override
    public void observerUpdated() {
        System.out.println("Observer [" + this.getName() + "] recive notify");
    }
    
}
