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
public abstract class CreatorAbstract {
    
    public static final int AUDIO = 1;
    
    public static final int VIDEO = 2;
    
    public abstract InterfaceFile create( int tipe );
    
}
