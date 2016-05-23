/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package responsibility.singleton.example2;

import java.io.Serializable;

/**
 *
 * @author eah1
 */
public class Car implements Serializable {
    
    private static Car car = null;
     
    private Car() {
         
    }
    
    private static void createCar() {
        
        if (car == null) {

            synchronized( Car.class ) {
               
                if ( car == null ) { 
                    car = new Car();
                }
                
            }
        }
        
    }
    
    public static Car getCar() {
        
        if ( car == null ) {
            
            createCar();
            
        } else {
            System.out.println("Car exist!");
        }
        
        return car;
        
    }
    
}
