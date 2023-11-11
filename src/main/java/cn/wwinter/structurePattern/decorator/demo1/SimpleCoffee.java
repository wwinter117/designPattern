package cn.wwinter.structurePattern.decorator.demo1;

/**
 * ClassName: SimpleCoffee
 * Package: cn.wwinter.structurePattern.decorator.demo1
 * Description:
 * Datetime: 2023/11/11
 * Author: zhangdd
 */
public class SimpleCoffee implements Coffee{
    @Override
    public String desc() {
        return "Simple Coffee";
    }

    @Override
    public double cost() {
        return 10;
    }
}
