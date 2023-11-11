package cn.wwinter.structurePattern.decorator.demo1;

/**
 * ClassName: CoffeeDecorator
 * Package: cn.wwinter.structurePattern.decorator.demo1
 * Description:
 * Datetime: 2023/11/11
 * Author: zhangdd
 */
public abstract class CoffeeDecorator implements Coffee{
    protected final Coffee coffee;

    public CoffeeDecorator(Coffee coffee) {
        this.coffee = coffee;
    }

    @Override
    public String desc() {
        return coffee.desc();
    }

    @Override
    public double cost() {
        return coffee.cost();
    }
}
