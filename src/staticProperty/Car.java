package staticProperty;

public class Car {
    private String name;
    private String engine;

    private static int numberOfCar = 0;

    public Car(String name, String engine) {
        this.name = name;
        this.engine = engine;
        numberOfCar++;
    }
    void disPlay(){
        System.out.println(name + " " + engine + " " + "Number of car " +  numberOfCar);
    }
}
