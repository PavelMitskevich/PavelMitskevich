package robot;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import robot.hand.IHand;
import robot.head.IHead;
import robot.leg.ILeg;

@Getter
@Setter
@AllArgsConstructor
public class Robot implements IRobot {

    private IHand hand;
    private IHead head;
    private ILeg leg;

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
