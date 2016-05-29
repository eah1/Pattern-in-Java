/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package extention.visitor.example2;

/**
 *
 * @author eah1
 */
public class Magician implements InterfacePersonaje {

    private String weapon = "";
    
    private int levelMagic = 1;
    private String incantion = "";
     
    public Magician() {
    
    }

    public String getWeapon() {
        
        return this.weapon;
    
    }

    public void setweapon( String weapon ) {
        
        this.weapon = weapon;
    
    }
    
     public int getLevelMagic() {
        
        return this.levelMagic;
        
    }
    
    public void setLevelMagic( int levelMagic ) {
        this.levelMagic = levelMagic;
    }
    
    public String getIncantion() {
        
        return this.incantion;
    
    }

    public void setIncantion( String incantion ) {
        
        this.incantion = incantion;
        
    }
    
    @Override
    public void accept( InterfaceVisitor visitor ) {
        
        visitor.visit( this );
    
    }
    
}
