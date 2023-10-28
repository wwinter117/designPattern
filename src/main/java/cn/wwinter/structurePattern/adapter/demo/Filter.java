package cn.wwinter.structurePattern.adapter.demo;

/**
 * ClassName: Filter: 被适配者
 * Package: cn.wwinter.structurePattern.adapter.demo
 * Description:
 * Datetime: 2023/10/28
 * Author: zhangdd
 */
public interface Filter<T> {
    T filter(T t);
    String filterName();
}
