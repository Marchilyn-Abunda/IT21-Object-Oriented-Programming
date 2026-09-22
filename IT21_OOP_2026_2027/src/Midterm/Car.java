package Prelim;

public class Car {

    String carMake;     //Instance Variables
    String carModel;
    int carYear;

//    Constructor
    public Car(String make, String model, int year) {
        this.carMake = make;
        this.carModel = model;
        this.carYear = year;
    }

    public static void main(String[] args) {
        Car ToyotaWigo = new Car("Toyota", "Wigo", 2022);  // Object instantiation
        Car HondaCivic = new Car("Honda", "Civic", 2021);
        Car FordMustang = new Car("Ford", "Mustang", 2023);

//        Display through object and instance variable value
        System.out.println(ToyotaWigo.carMake + " " + ToyotaWigo.carModel + " " + ToyotaWigo.carYear);
        System.out.println(HondaCivic.carMake + " " + HondaCivic.carModel + " " + HondaCivic.carYear);
        System.out.println(FordMustang.carMake + " " + FordMustang.carModel + " " + FordMustang.carYear);

    }

}
