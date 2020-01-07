package jinterface;

public class jinterfaceMain {
    public static void main(String[] args) {
        SportCar sport=new SportCar();
        AntiqueCar antique=new AntiqueCar();


        Car car=antique;
        Antique ant=antique;

        Car car2=sport;
        car2.beep();
        sport.beep();
        car.beep();

        System.out.println(car2.hashCode());
        System.out.println(sport.hashCode());
        System.out.println(car.hashCode());
        System.out.println(ant.hashCode());


        Car[] cars = new Car[]{antique, sport};

    }
}
