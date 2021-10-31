package robot;

import robot.hand.SamsungHand;
import robot.hand.SonyHand;
import robot.hand.ToshibaHand;
import robot.head.SamsungHead;
import robot.head.SonyHead;
import robot.head.ToshibaHead;
import robot.leg.SamsungLeg;
import robot.leg.SonyLeg;
import robot.leg.ToshibaLeg;

public class Run {
    public static void main(String[] args) {
        SonyLeg sonyLeg = new SonyLeg(5);
        SonyHand sonyHand = new SonyHand(10);
        SonyHead sonyHead = new SonyHead(13);

        ToshibaLeg toshibaLeg = new ToshibaLeg(8);
        ToshibaHand toshibaHand = new ToshibaHand(5);
        ToshibaHead toshibaHead = new ToshibaHead(11);

        SamsungLeg samsungLeg = new SamsungLeg(4);
        SamsungHand samsungHand = new SamsungHand(15);
        SamsungHead samsungHead = new SamsungHead(10);

        Robot robot = new Robot(toshibaHand, samsungHead, sonyLeg);
        System.out.println(robot.getPrice());
        robot.action();
        System.out.println("---------");

        Robot robot1 = new Robot(samsungHand, sonyHead, toshibaLeg);
        System.out.println(robot1.getPrice());
        robot1.action();
        System.out.println("---------");

        Robot robot2 = new Robot(sonyHand, toshibaHead, samsungLeg);
        System.out.println(robot2.getPrice());
        robot2.action();
        System.out.println("---------");

        Robot.checkPrice(new Robot[]{robot, robot1, robot2});
    }
}
