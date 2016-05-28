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
public abstract  class Button {
    
    private String tex;
    
    public String getTex() {
        
        return this.tex;
        
    }

    public void setTexto( String tex ) {
        
        this.tex = tex;
        
    }

    public void draw() {
        
        System.out.println("draw el button");
        
    }
    
    public abstract void config();
    
}
