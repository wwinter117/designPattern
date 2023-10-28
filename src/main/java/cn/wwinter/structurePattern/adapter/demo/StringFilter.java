package cn.wwinter.structurePattern.adapter.demo;

/**
 * ClassName: StringFilter
 * Package: cn.wwinter.structurePattern.adapter.demo
 * Description:
 * Datetime: 2023/10/28
 * Author: zhangdd
 */
public abstract class StringFilter implements Filter<String> {
    public abstract String filter(String s);
    public String filterName() {
        return getClass().getSimpleName();
    }
}
