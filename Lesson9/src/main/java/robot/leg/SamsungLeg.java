package robot.leg;

public class SamsungLeg implements ILeg {
    private int price;

    public SamsungLeg(int price) {
        this.price = price;
    }

    @Override
    public void step() {
        System.out.println("Sony step");
    }

    @Override
    public int getPrice() {
        return price;
    }
}
