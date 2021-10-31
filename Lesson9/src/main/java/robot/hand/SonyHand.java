package robot.hand;

public class SonyHand implements IHand{
    private int price;

    public SonyHand(int price) {
        this.price = price;
    }

    @Override
    public void upHand() {
        System.out.println("Sony up hand");
    }

    @Override
    public int getPrice() {
        return price;
    }
}
