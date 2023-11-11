package cn.wwinter.structurePattern.decorator.demo1;

/**
 * ClassName: MilkDecorator
 * Package: cn.wwinter.structurePattern.decorator.demo1
 * Description:
 * Datetime: 2023/11/11
 * Author: zhangdd
 */
public class MilkDecorator extends CoffeeDecorator{
    public MilkDecorator(Coffee coffee) {
        super(coffee);
    }

    @Override
    public String desc() {
        return super.desc() + ", with milk";
    }

    @Override
    public double cost() {
        return super.cost() + 2;
    }
}
