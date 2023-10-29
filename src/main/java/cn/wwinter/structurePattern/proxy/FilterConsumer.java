package cn.wwinter.structurePattern.proxy;

import cn.wwinter.common.StringConst;
import cn.wwinter.structurePattern.adapter.demo.Filter;

/**
 * ClassName: FilterConsumer
 * Package: cn.wwinter.structurePattern.proxy
 * Description:
 * Datetime: 2023/10/29
 * Author: zhangdd
 */
public class FilterConsumer {
    public static void consumer(Filter<String> filter) {
        System.out.println(filter.filter(StringConst.TEST_STRING));
    }
}
