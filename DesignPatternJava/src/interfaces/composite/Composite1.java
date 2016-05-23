/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfaces.composite;

import interfaces.composite.example1.File;
import interfaces.composite.example1.Folder;

/**
 *
 * @author eah1
 */
public class Composite1 {
    
    public static void main(String[] args) {
                
        Folder c1 = new Folder("Folder_1");

        c1.insertNode( new File( "File1.txt" ) );
        c1.insertNode( new File( "File2.txt" ) );
        c1.insertNode( new File( "File3.txt" ) );
                
        Folder c2 = new Folder( "Folder_2" );
        
        c2.insertNode( new File( "File4.txt" ) );
        c2.insertNode( new File( "File5.txt" ) );
                
        c1.insertNode( c2 );      
        c1.insertNode( new File( "File6.txt" ) );
        c1.show();
        
        System.out.println("--------------------");
                
        c1.deliteNode( c2 );
        c1.show();
        
    }
    
}
