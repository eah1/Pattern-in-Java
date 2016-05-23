/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfaces.composite.example2;

/**
 *
 * @author eah1
 */
public class File extends Node {

    public File( String name, Node nodeParent ) {
        
        super();       
        this.setTipeNode( Node.FILE );
        this.setName( name );
        this.setNodeParent( nodeParent );
        
    }
    
    
    @Override
    public void show() {

        System.out.println( "File: [" + this.getName() + "]" );

    }
    
}
