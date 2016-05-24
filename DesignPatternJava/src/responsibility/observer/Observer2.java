/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package responsibility.observer;

import responsibility.observer.example2.ToObserved;
import responsibility.observer.example2.ToObserver;

/**
 *
 * @author eah1
 */
public class Observer2 {
    
    public static void main(String[] args) {
        
        ToObserved objObserved = new ToObserved();
        
        objObserved.addObserver( new ToObserver() );
        objObserved.addObserver( new ToObserver() );
        
        objObserved.setName( "PEPE" );
        objObserved.setName( "MARTA" );
        
    }
    
}
