package robot.leg;

public class ToshibaLeg implements ILeg{
    private int price;

    public ToshibaLeg(int price) {
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
