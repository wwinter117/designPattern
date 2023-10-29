package cn.wwinter.behaviorPattern.state.demo;

/**
 * ClassName: Stage
 * Package: cn.wwinter.behaviorPattern.state.demo
 * Description:
 * Datetime: 2023/10/29
 * Author: zhangdd
 */
public class Stage {
    private Actor actor = new HappyActor();

    public void change() {
        this.actor = new SadActor();
    }
    public void perform() {
        this.actor.act();
    }

    public static void main(String[] args) {
        Stage stage = new Stage();
        stage.perform();
        stage.change();
        stage.perform();
    }
}
