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
public class Main {
    
    public static void main(String[] args) {
        
        Adapter conversor = new Adapter();
        
        conversor.payInPesetas( 2000 );
        conversor.payInPesetas( 5000 );
        conversor.payInPesetas( 1000 );
        
        conversor.drawPesetas( 3000 );
        
        System.out.println( "Total euros: " + conversor.getSaldo() );
    }
    
}
