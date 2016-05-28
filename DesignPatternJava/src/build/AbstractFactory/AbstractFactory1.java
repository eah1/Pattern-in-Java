/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package build.AbstractFactory;

import build.AbstractFactory.example1.Client;
import build.AbstractFactory.example1.ComponentsBlue;
import build.AbstractFactory.example1.ComponentsRed;

/**
 *
 * @author eah1
 */
public class AbstractFactory1 {
 
    public static void main(String[] args) {
        
        Client client1 = new Client( new ComponentsBlue() );
        
        System.out.println("----------------------------");
        
        Client client2 = new Client( new ComponentsRed() );
        
    }
    
}
