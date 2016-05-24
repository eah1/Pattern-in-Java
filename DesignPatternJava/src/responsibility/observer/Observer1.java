/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package responsibility.observer;

import responsibility.observer.example1.ToObserved;
import responsibility.observer.example1.ToObserver;

/**
 *
 * @author eah1
 */
public class Observer1 {
    
    public static void main( String[] args ) {
        
        ToObserved objObserverd = new ToObserved();

        ToObserver objObserver1  = new ToObserver("Pepe");
        objObserverd.addObserver(objObserver1);

        ToObserver objObserver2  = new ToObserver("Juan");
        objObserverd.addObserver(objObserver2);

        ToObserver objObserver3 = new ToObserver("Marta");
        objObserverd.addObserver(objObserver3);
        
    }
    
}
