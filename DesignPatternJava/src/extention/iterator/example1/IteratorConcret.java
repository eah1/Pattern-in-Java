/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package extention.iterator.example1;

/**
 *
 * @author eah1
 */
public class IteratorConcret implements InterfaceIterator {

    private AggregateConcret aggregate;
    private int posActual = 0;
    
    public IteratorConcret( AggregateConcret aggregate ) {
        
         this.aggregate = aggregate;
    
    }
    
    @Override
    public Object first() {

        Object obj = null;
        
        if( this.aggregate.aDate.isEmpty() == false ) {
            this.posActual = 0;
            obj = this.aggregate.aDate.firstElement();
        }
        
        return obj;
    
    }

    @Override
    public Object next() {

        Object obj = null;
        
        if( (this.posActual ) < this.aggregate.aDate.size() ) {
            
            obj = this.aggregate.aDate.elementAt(this.posActual);
            this.posActual = this.posActual + 1;
            
        }
        
        return obj;
    
    }

    @Override
    public boolean hasNext() {

        boolean ok = false;
        
        if( this.posActual < ( this.aggregate.aDate.size() ) ) {
            ok = true;
        }
        
        return ok;
        
    }

    @Override
    public Object actual() {
        
        Object obj = null;
        
        if( this.posActual < this.aggregate.aDate.size() ) {
            obj = this.aggregate.aDate.elementAt( this.posActual );
        }
        
        return obj;

    }
    
}
