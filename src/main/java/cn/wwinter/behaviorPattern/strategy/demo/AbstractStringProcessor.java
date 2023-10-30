package cn.wwinter.behaviorPattern.strategy.demo;

/**
 * ClassName: AbstractStringProcessor
 * Package: cn.wwinter.behaviorPattern.strategy.demo
 * Description:
 * Datetime: 2023/10/28
 * Author: zhangdd
 */
public abstract class AbstractStringProcessor implements Processor<String> {
    public abstract String process(String s);
    public String name() {
        return getClass().getSimpleName();
    }
}
