/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package extention.visitor.example1;

/**
 *
 * @author eah1
 */
public class Magician implements InterfacePersonaje {

    private String weapon = "";

    public Magician() {
    
    }

    public String getWeapon() {
        
        return this.weapon;
    
    }

    public void setweapon(String weapon) {
        
        this.weapon = weapon;
    
    }
 
    @Override
    public void accept(InterfaceVisitor visitor) {
        
        visitor.visit( this );
    
    }
    
}
