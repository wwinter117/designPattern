package cn.wwinter.behaviorPattern.strategy.demo;

/**
 * ClassName: Processor
 * Package: cn.wwinter.behaviorPattern.strategy.demo
 * Description:
 * Datetime: 2023/10/28
 * Author: zhangdd
 */
public interface Processor<T> {
    T process(T t);
    String name();
}
