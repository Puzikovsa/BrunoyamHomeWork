package NewPrograms.CarParking;

public class Car {
    public String model;
    public String number;
    private double currentspeed;

    public Car(String model, String number) {
        this.model = model;
        this.number = number;
    }

    @Override
    public String toString() {
        return model + " number " + number;
    }

    public double getCurrentspeed() {
        return currentspeed;
    }

    public void setCurrentspeed(double currentspeed) {
        if (currentspeed > 180.0) {
            this.currentspeed = 180.0;
        } else this.currentspeed = currentspeed;
    }
    public void upCurrentSpeed(double acceleration){
        if ((currentspeed + acceleration) < 180.0){
            currentspeed = currentspeed + acceleration;
        }else currentspeed = 180;
    }

    public void downCurrentSpeed(double slow){
        if((currentspeed - slow) >= 0){
            currentspeed = currentspeed - slow;
        }else currentspeed = 0;
    }
}
