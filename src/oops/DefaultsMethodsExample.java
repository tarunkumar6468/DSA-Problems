package oops;

interface Vehicle{
    default void print(){
        System.out.println("i am a vehicle");
    }
}
class Car implements Vehicle{
    public void print(){
        System.out.println("i am a Car");
    }
}
public class DefaultsMethodsExample {
    public static void main(String[] args)
    {
        Vehicle vehicle = new Car();
        vehicle.print();
    }
}
