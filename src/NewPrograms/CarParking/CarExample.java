package NewPrograms.CarParking;

public class CarExample {

    public static void main(String[] args) {
        String[] garageParking = new String[5];
        System.out.println(Parking.infoParking(garageParking));
        Car bmw = new Car("BMW", "а273ту");
        Car toyota = new Car("Toyota","б978рш");
        Parking.putInParking(garageParking,bmw.toString());
        Parking.putInParking(garageParking, toyota.toString());
        System.out.println(Parking.infoParking(garageParking));
        Parking.removeParking(garageParking,toyota.toString());
        System.out.println(Parking.infoParking(garageParking));
        Parking.putInParking(garageParking, toyota.toString());
        System.out.println(Parking.infoParking(garageParking));
        Car hunday = new Car("Hunday", "и444мт");
        Parking.putInParking(garageParking,hunday.toString());
        System.out.println(Parking.infoParking(garageParking));
        Car car1 = new Car("Kia", "б267аф");
        Parking.putInParking(garageParking,car1.toString());
        System.out.println(Parking.infoParking(garageParking));
        Car car2 = new Car("Volvo", "и287рп");
        Car car3 = new Car("Reno", "о165ду");
        Parking.putInParking(garageParking,car2.toString());
        System.out.println(Parking.infoParking(garageParking));
        Parking.putInParking(garageParking,car3.toString());
        Parking.removeParking(garageParking, car1.toString());
        Parking.putInParking(garageParking,car3.toString());
        bmw.upCurrentSpeed(250.0);
        System.out.println(bmw.getCurrentspeed());
    }
}
