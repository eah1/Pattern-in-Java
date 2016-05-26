/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package build.builder.example1;

/**
 *
 * @author eah1
 */
public class Director {
    
    public Director() {
        
    }

    public void construir( BuilderCar builder ) {
        
        builder.createNewCar();

        builder.builderMotor();
        builder.builderCarroceria();
        builder.builderElevalunas();
        builder.builderAireAcond();
        
    }
    
}
