/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package extention.visitor.example2;

import java.util.List;

/**
 *
 * @author eah1
 */
public class EquipIncantation implements InterfaceVisitor{

    @Override
    public void visit(Magician magician) {
    
        if ( magician.getLevelMagic() <= 5) {
            
            magician.setIncantion( "Bola de Fuego" );
            
        } else {
            
            magician.setIncantion( "Rayo de hielo" );
            
        }
        
    }

    @Override
    public void visit(Warrior warrior) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void visit(List<InterfacePersonaje> elementList) {

        for (InterfacePersonaje personaje : elementList) {
            
            personaje.accept( this );
            
        }
        
    }
    
}
