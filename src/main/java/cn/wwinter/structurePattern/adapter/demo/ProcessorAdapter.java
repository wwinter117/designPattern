package cn.wwinter.structurePattern.adapter.demo;

import cn.wwinter.behaviorPattern.strategy.demo.*;

/**
 * ClassName: ProcessorAdapter 将Filter适配到Processor
 * Package: cn.wwinter.structurePattern.adapter.demo
 * Description:
 * Datetime: 2023/10/28
 * Author: zhangdd
 */
public class ProcessorAdapter<T> implements Processor<T>{
    private final Filter<T> filter;

    public ProcessorAdapter(Filter<T> filter) {
        this.filter = filter;
    }

    @Override
    public T process(T t) {
        return filter.filter(t);
    }

    @Override
    public String name() {
        return filter.filterName();
    }

    public static void main(String[] args) {
        String s = "aYUGUIshiu UYDAFGJVH iaysgduy 1322 idausdga38427";
        Apply.process(new ProcessorAdapter<String>(new UpCaseFilter()), s);
        Apply.process(new ProcessorAdapter<String>(new DownCaseFilter()), s);
    }
}
