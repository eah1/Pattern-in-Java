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
public class Client {
    
    public Client( Components style) {
        
        Button button = style.getButton();
        button.draw();
        
        List list = style.getList();
        list.draw();
        
    }
    
}
