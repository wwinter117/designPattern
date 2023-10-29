package cn.wwinter.structurePattern.proxy.demo;

import cn.wwinter.common.StringConst;
import cn.wwinter.structurePattern.adapter.demo.DownCaseFilter;
import cn.wwinter.structurePattern.adapter.demo.Filter;
import cn.wwinter.structurePattern.adapter.demo.StringFilter;
import cn.wwinter.structurePattern.adapter.demo.UpCaseFilter;

/**
 * ClassName: StringFilterProxy 代理过滤器，实现耗时计算
 * Package: cn.wwinter.structurePattern.proxy.demo
 * Description:
 * Datetime: 2023/10/29
 * Author: zhangdd
 */
public class StringFilterProxy extends StringFilter {
    private Filter<String> filter;

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

    public static void consumer(Filter<String> filter) {
        System.out.println(filter.filter(StringConst.TEST_STRING));
    }
    public static void main(String[] args) {
        consumer(new StringFilterProxy(new UpCaseFilter()));
        consumer(new StringFilterProxy(new DownCaseFilter()));
    }
}
