/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package build.AbstractFactory.example1;

import java.util.ArrayList;

/**
 *
 * @author eah1
 */
public abstract class List {
    
    private ArrayList<String> elements = new ArrayList();

    public String getElemento( int pos ) {
        
        return this.elements.get( pos );
    
    }

    public void insertarElemento( String tex ) {
        
        this.elements.add( tex );
    
    }
    
    public void draw() {
        
        System.out.println("Draw List");
        
    
    }

    public abstract void config();
    
}
