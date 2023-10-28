package cn.wwinter.behaviorPattern.strategy.demo;

/**
 * ClassName: StringProcessor
 * Package: cn.wwinter.behaviorPattern.strategy.demo
 * Description:
 * Datetime: 2023/10/28
 * Author: zhangdd
 */
public abstract class StringProcessor implements Processor<String> {
    public abstract String process(String s);
    public String name() {
        return getClass().getSimpleName();
    }
}
