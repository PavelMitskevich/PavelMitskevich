package robot.head;

public class ToshibaHead implements IHead {
    private int price;

    public ToshibaHead(int price) {
        this.price = price;
    }

    @Override
    public void speak() {
        System.out.println("Toshiba speak");
    }

    @Override
    public int getPrice() {
        return price;
    }
}
