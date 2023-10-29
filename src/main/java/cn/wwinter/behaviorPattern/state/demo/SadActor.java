package cn.wwinter.behaviorPattern.state.demo;

/**
 * ClassName: SadActor
 * Package: cn.wwinter.behaviorPattern.state.demo
 * Description:
 * Datetime: 2023/10/29
 * Author: zhangdd
 */
public class SadActor extends Actor {
    @Override
    public void act() {
        System.out.println("Sad");
    }
}
