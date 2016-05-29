/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package extention.visitor.example1;

import java.util.List;

/**
 *
 * @author eah1
 */
public class EquipWeapon implements InterfaceVisitor {

    @Override
    public void visit(Magician magician) {

        magician.setweapon( "Daga" );
        
    }

    @Override
    public void visit(Warrior warrior) {
        
        warrior.setWarrior( "Espada" );

    }

    @Override
    public void visit(List<InterfacePersonaje> elementList) {

        for (InterfacePersonaje personaje : elementList) {
            personaje.accept( this );
        }
        
    }
    
}
