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
public abstract class Node {
    
    public static final int FILE = 1;
    public static final int FOLDER = 2;

    protected String name = "";
    protected int tipeNode;
    protected Node nodeParent;
    
    public String getName() {
        
        return this.name;
        
    }

    public void setName( String name ) {
        
        this.name = name;
        
    }

    public int getTipeNode() {
        
        return this.tipeNode;
        
    }

    public void setTipeNode( int tipeNode ) {
        
        this.tipeNode = tipeNode;
        
    }
    
    public Node getNodeParent() {
        
        return this.nodeParent;
        
    }
    
    public void setNodeParent( Node nodeParent ) {
        
        this.nodeParent = nodeParent;
        
    }

    public abstract void show();
    
}
