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
public class FileVideo implements InterfaceFile {
    
    public FileVideo() {
        
    }
    
    @Override
    public void reproduce() {
        
        System.out.println("Reproduce video file");
    
    }
    
}
