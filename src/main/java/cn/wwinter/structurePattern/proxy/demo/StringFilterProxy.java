package cn.wwinter.structurePattern.proxy.demo;

import cn.wwinter.structurePattern.adapter.demo.AbstractStringFilter;
import cn.wwinter.structurePattern.adapter.demo.DownCaseFilter;
import cn.wwinter.structurePattern.adapter.demo.Filter;
import cn.wwinter.structurePattern.adapter.demo.UpCaseFilter;
import cn.wwinter.structurePattern.proxy.FilterConsumer;

/**
 * ClassName: StringFilterProxy 代理过滤器，实现耗时计算
 * Package: cn.wwinter.structurePattern.proxy.demo
 * Description:
 * Datetime: 2023/10/29
 * Author: zhangdd
 */
public class StringFilterProxy extends AbstractStringFilter {
    private final Filter<String> filter;

    public StringFilterProxy(Filter<String> filter) {
        this.filter = filter;
    }

    @Override
    public String filter(String s) {
        long start = System.currentTimeMillis();
        System.out.println("开始过滤，使用：" + filter.filterName());
        String res = filter.filter(s);
        System.out.println("过滤完毕，耗时：" + (System.currentTimeMillis() - start) + "ms");
        return res;
    }

    public static void main(String[] args) {
        FilterConsumer.consumer(new StringFilterProxy(new UpCaseFilter()));
        FilterConsumer.consumer(new StringFilterProxy(new DownCaseFilter()));
    }
}
