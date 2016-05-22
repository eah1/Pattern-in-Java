/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfaces.adapter;

/**
 *
 * @author eah1
 */
public class Adapter extends BoxEuros implements Pesetas {
    
    public Adapter() {
        super();
    }
   
    public double getSaldo() {

         return this.getEuros();
         
    }
    
    @Override
    public void drawPesetas(double pesetas) {
        
        double euros = pesetas / 166.386;
        this.drawEuros( euros );
        
    }

    @Override
    public void payInPesetas(double pesetas) {
        
        double euros = pesetas / 166.386;  
        this.payInEuros( euros );
        
    }
    
}
