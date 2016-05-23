/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package responsibility.singleton.example1;

/**
 *
 * @author eah1
 */
public class Car {
    
    private static Car car = null;
    
    private Car() {
        
    }
    
    public static Car getCar(){
        
        if ( car == null ) {
            
            car = new Car();
            System.out.println("Car is created");
            
        } else {
            
            System.out.println("Car exist");

        }
        
        return car;
        
    }
    
}
