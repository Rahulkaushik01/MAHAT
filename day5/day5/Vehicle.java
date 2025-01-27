public class Vehicle{
    int speed;


}
class Car extends Vehicle{
    Car(int x) {
        speed = x;

    }
}
class Bike extends Vehicle{
    Bike(int x){
        speed = x;

    }
}
class Mains{
    public static void main(String[] args){
        Car car = new Car(50);
        Bike bike = new Bike(70);
        System.out.println(car.speed);
        System.out.println(bike.speed);
    }
}
