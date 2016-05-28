/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package extention.iterator.example1;

import java.util.Vector;

/**
 *
 * @author eah1
 */
public class AggregateConcret implements InterfaceAggregate{

    protected Vector aDate = new Vector();

    public AggregateConcret() {
        
        this.addV();
        
    }

    public void addV() {
        
        this.aDate.add("JOSE");
        
        this.aDate.add("MARTA");
        
        this.aDate.add("ANTONIO");
        
        this.aDate.add("ROMINA");
    }
    
    
    @Override
    public InterfaceIterator getIterator() {

        return new IteratorConcret( this );
        
    }
    
}
