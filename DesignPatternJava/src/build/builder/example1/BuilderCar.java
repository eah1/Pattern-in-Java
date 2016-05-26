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
public abstract class BuilderCar {
    
    protected Car car;

    public Car getCoche() {
        
        return this.car;
        
    }

    public void createNewCar() {
        
        this.car = new Car();
        
    }
    
    public abstract void builderMotor();
    
    public abstract void builderCarroceria();
    
    public abstract void builderAireAcond();
    
    public abstract void builderElevalunas();
    
    
}
