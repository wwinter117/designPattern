package cn.wwinter.createPattern.factory.demo;

/**
 * ClassName: Factoriable
 * Package: cn.wwinter.createPattern.factory.demo
 * Description:
 * Datetime: 2023/10/30
 * Author: zhangdd
 */
public interface Factoriable<T> {
    Factory<T> factory();
}
