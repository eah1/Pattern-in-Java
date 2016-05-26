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
public class ConstructorCocheMedio extends BuilderCar {

    public ConstructorCocheMedio() {
    
    }
    
    @Override
    public void builderMotor() {
        
        this.car.setMotor( "Motor de potencia media" );
        
    }

    @Override
    public void builderCarroceria() {
        
        this.car.setCarroceria( "Carrocería de protección media" );
        
    }

    @Override
    public void builderAireAcond() {
        
        this.car.setAireAcond( false );
        
    }

    @Override
    public void builderElevalunas() {
        
        this.car.setElevalunasElec( true );
        
    }
    
}
