package robot.head;

public class SonyHead implements IHead{
    private int price;

    public SonyHead(int price) {
        this.price = price;
    }

    @Override
    public void speak() {
        System.out.println("Sony speak");
    }

    @Override
    public int getPrice() {
        return price;
    }
}
