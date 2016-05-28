/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package extention.iterator;

import extention.iterator.example1.AggregateConcret;
import extention.iterator.example1.InterfaceIterator;

/**
 *
 * @author eah1
 */
public class Iterator1 {
    
    public static void main(String[] args) {
        
        try {

            AggregateConcret aggregate = new AggregateConcret();

            InterfaceIterator iterator = aggregate.getIterator();
            
            String obj = (String) iterator.first();
            System.out.println( obj );

            iterator.next();
            iterator.next();
            
            System.out.println( (String) iterator.actual() + "\n" );
            iterator.first();

            while( iterator.hasNext() == true ) {
                System.out.println( iterator.next());
            }
            
        }
        catch( Exception e ) {
            
            e.printStackTrace();
            
        }
        
    }
    
}
