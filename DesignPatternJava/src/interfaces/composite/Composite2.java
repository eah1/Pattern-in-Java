/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfaces.composite;

import interfaces.composite.example2.File;
import interfaces.composite.example2.Folder;

/**
 *
 * @author eah1
 */
public class Composite2 {
    
    public static void main(String[] args) {
        
        Folder c1 = new Folder("Folder_1", null);

        c1.insertNode( new File( "File1.txt", c1 ) );
        c1.insertNode( new File( "File2.txt", c1 ) );
        c1.insertNode( new File( "File3.txt", c1 ) );
                
        Folder c2 = new Folder( "Folder_2", c1 );
        
        c2.insertNode( new File( "File4.txt", c2 ) );
        c2.insertNode( new File( "File5.txt", c2 ) );
                
        c1.insertNode( c2 );
        c1.insertNode( new File( "File6.txt", c1 ) );
        
        Folder c3 = new Folder( "Folder_3", c2 );
        
        c3.insertNode( new File( "File7.txt", c3 ) );
        c3.insertNode( new File( "File8.txt", c3 ) );
        
        c2.insertNode( c3 );
        
        c1.showParent();
        
    }
    
}
