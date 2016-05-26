/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package build.factoryMethod.examle1;

/**
 *
 * @author eah1
 */
public class Creator extends CreatorAbstract {

    public Creator(){
        
    }
    
    @Override
    public InterfaceFile create( int tipe ) {
        
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
