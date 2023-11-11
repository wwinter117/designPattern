package cn.wwinter.structurePattern.decorator.demo1;

import com.sun.source.tree.NewArrayTree;

/**
 * ClassName: SugarDecorator
 * Package: cn.wwinter.structurePattern.decorator.demo1
 * Description:
 * Datetime: 2023/11/11
 * Author: zhangdd
 */
public class SugarDecorator extends CoffeeDecorator{
    public SugarDecorator(Coffee coffee) {
        super(coffee);
    }

    @Override
    public String desc() {
        return super.desc()+", with sugar";
    }

    @Override
    public double cost() {
        return super.cost() + 1;
    }

    public static void main(String[] args) {
        Coffee simpleCoffee = new SimpleCoffee();
        System.out.println(simpleCoffee.desc() + ": " + simpleCoffee.cost() + "元");
        Coffee milkDecorator = new MilkDecorator(new SimpleCoffee());
        System.out.println(milkDecorator.desc() + ": " + milkDecorator.cost() + "元");
        Coffee sugarDecorator = new SugarDecorator(new SimpleCoffee());
        System.out.println(sugarDecorator.desc() + ": " + sugarDecorator.cost() + "元");
    }
}
