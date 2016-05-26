/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package build.factoryMethod;

import build.factoryMethod.example2.Creator;
import build.factoryMethod.example2.InterfaceFile;

/**
 *
 * @author eah1
 */
public class FactoryMethod2 {
 
    public static void main(String[] args) {
        
        InterfaceFile video = Creator.getFile( Creator.VIDEO );
        video.reproduce();
        
        InterfaceFile audio = Creator.getFile( Creator.AUDIO );
        audio.reproduce();
        
    }
    
}
