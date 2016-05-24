/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package responsibility.observer;

import responsibility.observer.example3.ToObserved;
import responsibility.observer.example3.ToObserver;

/**
 *
 * @author eah1
 */
public class Observer3 {
    
    public static void main(String[] args) {
        
        ToObserved Observed = new ToObserved();

        ToObserver ToObserver1 = new ToObserver( Observed );
        ToObserver ToObserver2 = new ToObserver( Observed );

        Observed.setNumbe(14);
    }
    
}
