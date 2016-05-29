/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package extention.visitor.example2;

import extention.visitor.example1.*;

/**
 *
 * @author eah1
 */
public class Warrior implements InterfacePersonaje {

    private String weapon = "";

    public Warrior() {
    
    }

    public String getWarrior() {
        
        return this.weapon;
    
    }

    public void setWarrior( String weapon ) {
        
        this.weapon = weapon;
    
    }
   
    @Override
    public void accept( InterfaceVisitor visitor ) {

        if (visitor.getClass().equals( EquipWeapon.class )) {
            
            visitor.visit( this );
            
        }

    }
    
}
