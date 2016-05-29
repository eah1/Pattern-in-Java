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
public interface InterfaceVisitor {
    
    public void visit( Magician magician );
    
    public void visit( Warrior warrior );
    
    public void visit( List<InterfacePersonaje> elementList );
    
}
