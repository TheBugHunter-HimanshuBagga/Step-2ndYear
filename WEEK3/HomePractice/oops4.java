//Create a base class and demonstrate how OOP promotes code reusability.

class Vehicle{

    String brand;
    int year;

    Vehicle(String brand , int year){
        this.brand = brand;
        this.year = year;
    }

    void displayInfo(){
        System.out.println("The brand is " + brand + " and its year is: " + year);
    }
    void start(){
        System.out.println("The Vehicle is starting......");
    }

}
class Car extends Vehicle{
    int doors;

    Car(String brand , int year , int doors){
        super(brand , year);
        this.doors = doors;
    }

    void displayCarInfo(){
        displayInfo();
        System.out.println("The number of doors is: " + doors);
    }
}

class Bike extends Vehicle{

    int seats;
    
    Bike(String brand , int year , int seats){
        super(brand , year);
        this.seats = seats;
    }

    void bikeInfo(){    
        displayInfo();
        System.out.println("The number of Seats:  " + seats);
    }
}
public class oops4 {
    public static void main(String[] args){

        Car car = new Car("Mercedes" , 2024 , 4);
        Bike bike = new Bike("Yamaha" , 2025 , 3);

        car.displayCarInfo();
        bike.bikeInfo();
    }
}
