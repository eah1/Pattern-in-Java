/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package build.factoryMethod.example2;

/**
 *
 * @author eah1
 */
public class Creator {

    public static final int AUDIO = 1;
    
    public static final int VIDEO = 2;

    
    public Creator(){
        
    }
    
    public static InterfaceFile getFile( int tipe ) {
        
        InterfaceFile file;
        
        switch (tipe) {
            
            case AUDIO :
                file = new FileAudio();
                break;
            
            case VIDEO :
                file = new FileVideo();
                break;
            
            default:
                file = null;
        }
        
        return file;
        
    }
    
}
