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
public class Car {
    
    private String motor = "";
    private String carroceria = "";
    private Boolean elevalunasElec = false;
    private Boolean aireAcond = false;

    public Car() {
    
    }

    public String getMotor() {
        
        return motor;
        
    }

    public void setMotor(String motor) {
        
        this.motor = motor;
        
    }

    public String getCarroceria() {
        
        return carroceria;
        
    }
    
    public void setCarroceria(String carroceria) {
        
        this.carroceria = carroceria;
        
    }

    public Boolean getElevalunasElec() {
        
        return elevalunasElec;
        
    }

    public void setElevalunasElec(Boolean elevalunasElec) {
        
        this.elevalunasElec = elevalunasElec;
        
    }
   
    public Boolean getAireAcond() {
        
        return aireAcond;
        
    }

    public void setAireAcond(Boolean aireAcond) {
        
        this.aireAcond = aireAcond;
        
    }
    
}
