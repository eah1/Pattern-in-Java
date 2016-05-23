/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfaces.composite.example1;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author eah1
 */
public class Folder extends Node {

    List<Node> nodes = new ArrayList<Node>();

    public Folder( String name ) {
        
        super.setTipeNode( Node.FOLDER );
        super.setName( name );
        
    }

    public void insertNode( Node node ) {
        
        this.nodes.add(node);
        
    }

    public void deliteNode( Node node ) {
        
        this.nodes.remove( node );
        
    }

    public List<Node> getNodes() {
        
        return this.nodes;
    
    }

    public Node getNode( int pos ) {
    
        return this.nodes.get( pos) ;
        
    }
    
    @Override
    public void show() {

        System.out.println( "Folder [" + this.getName() + "]" );

        for (Node nodo : nodes) {
            
            nodo.show();
            
        }

    }
    
}
