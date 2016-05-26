/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package build.factoryMethod;

import build.factoryMethod.examle1.Creator;
import build.factoryMethod.examle1.CreatorAbstract;
import build.factoryMethod.examle1.InterfaceFile;

/**
 *
 * @author eah1
 */
public class FactoryMethod1 {
    
    public static void main(String[] args) {

        CreatorAbstract creator = new Creator();
        
        InterfaceFile audio = creator.create( Creator.AUDIO );
        audio.reproduce();
        
        InterfaceFile video = creator.create( Creator.VIDEO );
        video.reproduce();
        
    }
    
}
