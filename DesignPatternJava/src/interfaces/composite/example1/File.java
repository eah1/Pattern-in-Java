/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfaces.composite.example1;

/**
 *
 * @author eah1
 */
public class File extends Node {

    public File( String name ) {

        super.setTipeNode( Node.FILE );
        super.setName( name );
        
    }
    
    
    @Override
    public void show() {

        System.out.println( "File: [" + this.getName() + "]" );

    }
    
}
