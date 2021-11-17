package first;

import lombok.Getter;
import lombok.Setter;

import java.util.Random;

@Setter
@Getter
public class Car implements CarService {
    private String model;
    private double maxSpeed;
    private double value;
    private boolean flagStart;

    public Car(String model, double maxSpeed, double value) {
        this.model = model;
        this.maxSpeed = maxSpeed;
        this.value = value;
    }

    public Car() {
    }

    @Override
    public void start() {
        Random random = new Random();
        int i = random.nextInt(20);
        if (i % 2 == 0) {
            try {
                throw new WrongStartException("Unsuccessful attempt, of car random = " + i);
            } catch (WrongStartException e) {
                e.printStackTrace();
                start();
            }
        } else {
            System.out.println("Car " + getModel() + " is started");
        }
    }
}
