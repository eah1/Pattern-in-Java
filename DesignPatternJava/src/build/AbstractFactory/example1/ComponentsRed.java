/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package build.AbstractFactory.example1;

/**
 *
 * @author eah1
 */
public class ComponentsRed implements Components {

    public ComponentsRed() {
        
    }
    
    @Override
    public Button getButton() {
        
        return new ButtonRed();
        
    }

    @Override
    public List getList() {
        
        return new ListRed();
        
    }
    
}
