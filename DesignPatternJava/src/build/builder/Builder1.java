/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package build.builder;

import build.builder.example1.BuilderCar;
import build.builder.example1.Car;
import build.builder.example1.ConstructorCocheBase;
import build.builder.example1.ConstructorCocheFull;
import build.builder.example1.ConstructorCocheMedio;
import build.builder.example1.Director;

/**
 *
 * @author eah1
 */
public class Builder1 {
    
    public static void main(String[] args) {
        
        Director objFabrica = new Director();

        BuilderCar base  = new ConstructorCocheBase();
        BuilderCar medio = new ConstructorCocheMedio();
        BuilderCar full  = new ConstructorCocheFull();

        objFabrica.construir( base );
        Car cocheBase = base.getCoche();

        objFabrica.construir( medio );
        Car cocheMedio = medio.getCoche();

        objFabrica.construir( full );
        Car cocheFull = full.getCoche();

        show( cocheBase );
        show( cocheMedio );
        show( cocheFull );
        
    }

    private static void show(Car car) {

        System.out.println( "Motor: " + car.getMotor() );
        System.out.println( "Carrocería: " + car.getCarroceria() );
        System.out.println( "Elevalunas eléctrico: " + car.getElevalunasElec() );
        System.out.println( "Airea acondicionado: " + car.getAireAcond() );

        System.out.println("===================================");

    }
    
}
