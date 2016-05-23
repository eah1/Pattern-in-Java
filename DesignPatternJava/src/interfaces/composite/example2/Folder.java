/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfaces.composite.example2;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author eah1
 */
public class Folder extends Node {

    
    List<Node> nodes = new ArrayList<>();

    public Folder( String name, Node nodeParent ) {
        
        super.setTipeNode( Node.FOLDER );
        super.setName( name );
        super.setNodeParent(nodeParent);
        
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
    
        return this.nodes.get( pos);
        
    }

    public void showParent() {
        
        for (Node node : this.nodes) {
            
            System.out.println( "The node parent [" + node.getName() 
                    + "] is [" + node.getNodeParent().getName() + "]" );
            
            if( node.getTipeNode() == Node.FOLDER ) {
                ( ( Folder ) node).showParent();
            }
            
        }
        
    }
    
    @Override
    public void show() {
        
        System.out.println( "Folder [" + this.getName() + "]" );

        for (Node nodo : this.nodes) {
            
            nodo.show();
            
        }

    }
    
}
