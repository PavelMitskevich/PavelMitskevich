package robot.hand;

public class SamsungHand implements IHand{
    private int price;

    public SamsungHand(int price) {
        this.price = price;
    }

    @Override
    public void upHand() {
        System.out.println("Samsung up hand");
    }

    @Override
    public int getPrice() {
        return price;
    }
}
