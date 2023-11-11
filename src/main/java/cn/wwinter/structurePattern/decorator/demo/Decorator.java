package cn.wwinter.structurePattern.decorator.demo;

/**
 * ClassName: Decorator
 * Package: cn.wwinter.structurePattern.decorator.demo
 * Description:
 * Datetime: 2023/11/11
 * Author: zhangdd
 */
public class Decorator extends Basic {
    protected final Basic basic;

    public Decorator(Basic basic) {
        this.basic = basic;
    }

    public String getVal() {
        return basic.getVal();
    }

    public void setVal(String val) {
        this.basic.setVal(val);
    }

}
