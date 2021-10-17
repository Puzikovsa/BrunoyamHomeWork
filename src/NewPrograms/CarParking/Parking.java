package NewPrograms.CarParking;

import java.util.Arrays;
import java.util.Objects;

public class Parking {
    String[] garage;

    public Parking(String[] garage) {
        this.garage = garage;
    }

    public static String infoParking(String[] garage) {
        return Arrays.toString(garage);
    }

    public static boolean checkAvailability(String[] garage) {
        boolean busy = false;
        for (int i = 0; i < garage.length; i++) {
            if (Objects.equals(garage[i], null)) {
                busy = true;
                break;
            }
        }
        return busy;
    }

    public static void putInParking(String[] garage, String car) {
        if (checkAvailability(garage)) {
            for (int i = 0; i < garage.length; i++) {
                if (Objects.equals(garage[i], null)) {
                    garage[i] = car;
                    System.out.println("Автомобиль " + car + " поставлен на парковку на место " + i);
                    break;
                }
            }
        }else System.out.println("Все парковочные места заняты. Парковка не произведена");
    }

    public static void removeParking(String[] garage, String car) {
        for (int i = 0; i < garage.length; i++) {
            if (garage[i].equals(car)) {
                garage[i] = null;
                System.out.println("Автомобиль " + car + " выехал с парковки");
                break;
            }
        }
    }
}
