/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfaces.adapter.example1;

/**
 *
 * @author eah1
 */
public class Adapter implements Pesetas {
    
    public BoxEuros boxEuros = new BoxEuros();
    
    public Adapter() {
        super();
    }
   
    public double getSaldo() {

         return this.boxEuros.getEuros();
         
    }
    
    @Override
    public void drawPesetas(double pesetas) {
        
        double euros = pesetas / 166.386;
        this.boxEuros.drawEuros( euros );
        
    }

    @Override
    public void payInPesetas(double pesetas) {
        
        double euros = pesetas / 166.386;  
        this.boxEuros.payInEuros( euros );
        
    }
    
}
