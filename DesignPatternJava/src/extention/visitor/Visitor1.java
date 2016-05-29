/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package extention.visitor;

import extention.visitor.example1.EquipWeapon;
import extention.visitor.example1.InterfacePersonaje;
import extention.visitor.example1.InterfaceVisitor;
import extention.visitor.example1.Magician;
import extention.visitor.example1.Warrior;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author eah1
 */
public class Visitor1 {
    
    public static void main(String[] args) {

        Warrior g1 = new Warrior();
        Warrior g2 = new Warrior();
        
        Magician m1 = new Magician();
        Magician m2 = new Magician();
        
        List<InterfacePersonaje> personajes = new ArrayList<>();

        personajes.add(g1);
        personajes.add(g2);
        personajes.add(m1);
        personajes.add(m2);
        
        InterfaceVisitor visitorArma = new EquipWeapon();
        visitorArma.visit( personajes );
        
        System.out.println( "Arma del guerrero g1: " + g1.getWarrior());
        System.out.println( "Arma del guerrero g2: " + g2.getWarrior());
        System.out.println( "Arma del mago m1: " + m1.getWeapon());
        System.out.println( "Arma del mago m1: " + m2.getWeapon());
        
    }
    
}
