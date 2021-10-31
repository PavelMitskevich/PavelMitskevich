package robot.leg;

public class SonyLeg implements ILeg{
    private int price;

    public SonyLeg(int price) {
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
