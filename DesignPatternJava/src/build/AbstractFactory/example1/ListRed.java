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
public class ListRed extends List {

    public ListRed(){
        
        this.config();
        
    }
    
    @Override
    public void config() {
        
        System.out.println("config lits red");
 
    }
    
    
    
}
