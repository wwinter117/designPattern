package cn.wwinter.structurePattern.proxy.demo1;

import cn.wwinter.structurePattern.adapter.demo.DownCaseFilter;
import cn.wwinter.structurePattern.adapter.demo.Filter;
import cn.wwinter.structurePattern.adapter.demo.UpCaseFilter;
import cn.wwinter.structurePattern.proxy.FilterConsumer;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * ClassName: DynamicStringFilterProxy
 * Package: cn.wwinter.structurePattern.proxy.demo1
 * Description:
 * Datetime: 2023/10/29
 * Author: zhangdd
 */
public class DynamicStringFilterProxy implements InvocationHandler {
    private final Filter<String> filter;

    public DynamicStringFilterProxy(Filter<String> filter) {
        this.filter = filter;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        long start = System.currentTimeMillis();
        System.out.println("proxy: " + proxy.getClass());
        System.out.println("开始过滤，使用：" + filter.filterName());
        Object res = method.invoke(filter, args);
        System.out.println("过滤完毕，耗时：" + (System.currentTimeMillis() - start) + "ms");
        return res;
    }

    @SuppressWarnings("unchecked")
    public static void main(String[] args) {
        Filter<String> upCaseFilter = (Filter<String>) Proxy.newProxyInstance(Filter.class.getClassLoader(), new Class[]{Filter.class}, new DynamicStringFilterProxy(new UpCaseFilter()));
        Filter<String> downCaseFilter = (Filter<String>) Proxy.newProxyInstance(Filter.class.getClassLoader(), new Class[]{Filter.class}, new DynamicStringFilterProxy(new DownCaseFilter()));

        FilterConsumer.consumer(upCaseFilter);
        FilterConsumer.consumer(downCaseFilter);
    }
}
