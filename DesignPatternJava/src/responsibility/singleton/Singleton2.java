/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package responsibility.singleton;

import responsibility.singleton.example2.Car;

/**
 *
 * @author eah1
 */
public class Singleton2 {

    public static void main( String[] args ) {
        
        for ( int i = 0; i < 5; i++ ) {
            
            Car.getCar();
            
        }
        
    }
    
}
