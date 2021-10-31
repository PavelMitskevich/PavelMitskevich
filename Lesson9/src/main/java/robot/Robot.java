package robot;

import robot.hand.IHand;
import robot.head.IHead;
import robot.leg.ILeg;

public class Robot implements IRobot {

    private IHand hand;
    private IHead head;
    private ILeg leg;

    public Robot(IHand hand, IHead head, ILeg leg) {
        setHand(hand);
        setHead(head);
        setLeg(leg);
    }

    public Robot() {

    }

    public IHand getHand() {
        return hand;
    }

    public void setHand(IHand hand) {
        this.hand = hand;
    }

    public IHead getHead() {
        return head;
    }

    public void setHead(IHead head) {
        this.head = head;
    }

    public ILeg getLeg() {
        return leg;
    }

    public void setLeg(ILeg leg) {
        this.leg = leg;
    }

    public static void checkPrice(Robot[] robot) {
        int max = 0;
        for (Robot r : robot) {
            if (max < r.getPrice()) {
                max = r.getPrice();
            }
        }
        System.out.println("Max price = " + max);
    }

    @Override
    public void action() {
        head.speak();
        hand.upHand();
        leg.step();
    }

    @Override
    public int getPrice() {
        return head.getPrice() + hand.getPrice() + leg.getPrice();
    }


}
