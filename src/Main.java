import com.dependencyinjection.constructor.CarDIConstructor;
import com.dependencyinjection.field.CarDIField;
import com.engines.Engine;
import com.engines.Gas;
import com.nodependency.Car;
import com.nodependency.CarGas;

/**
 * Author: Gabriel Aquino
 * Purpose: Practice of Dependency Injection
 * Source: https://developer.android.com/training/dependency-injection#:~:text=For%20example%2C%20a%20Car%20class,constructs%20the%20dependency%20it%20needs.
 */
public class Main {
    public static void main(String[] args) {
        System.out.println("** No Dependency Injection **");
        System.out.println();
        System.out.println("Car with engine");
        Car car = new Car();
        car.start();
        System.out.println();
        System.out.println("Car with gas engine");
        CarGas carGas = new CarGas();
        carGas.start();

        System.out.println();
        System.out.println("** Dependency Injection - Constructor Injection **");
        System.out.println("First build the engine, then build the car with the engine");
        System.out.println();
        System.out.println("Engine created seperately");
        Engine engine = new Engine();
        System.out.println("Car with engine");
        CarDIConstructor carDIConstr = new CarDIConstructor(engine);
        carDIConstr.start(); // car di started
        System.out.println();
        System.out.println();
        System.out.println("Gas Engine created seperately");
        Engine gasEngine = new Gas();
        System.out.println();
        System.out.println("Same car now with gas engine");
        carDIConstr = new CarDIConstructor(gasEngine);
        carDIConstr.start();

        System.out.println("** Dependency Injection - Field Injection **");
        System.out.println("First build the engine, then build the car without the engine, then set engine in the car");
        System.out.println("Car without engine");
        CarDIField carDIField = new CarDIField();
        try {
            System.out.println("Trying to start a car without engine!");
            carDIField.start();
        } catch (NullPointerException ex) {
            System.out.printf("No way, you can't start a car with no engine on it!");
        }

        System.out.println("Installing engine in the car");
        carDIField.setEngine(engine);
        carDIField.start();
        System.out.println("Now replacing engine with gas engine in the SAME car!");
        carDIField.setEngine(gasEngine);
        carDIField.start();
        System.out.println();




    }
}