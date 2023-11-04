package cn.wwinter.behaviorPattern.strategy.demo;

/**
 * ClassName: ProcessorConsumer
 * Package: cn.wwinter.behaviorPattern.strategy.demo
 * Description:
 * Datetime: 2023/10/28
 * Author: zhangdd
 */
public class ProcessorConsumer {
    public static <T> void process(Processor<T> p, T t) {
        System.out.println("Using Processor: " + p.name());
        System.out.println(p.process(t));
    }

    public static void main(String[] args) {
        String s = "aYUGUIshiu UYDAFGJVH iaysgduy 1322 idausdga38427";
        ProcessorConsumer.process(new UpCaseProcessor(), s);
        ProcessorConsumer.process(new DownCaseProcessor(), s);
        ProcessorConsumer.process(new SplitterProcessor(), s);
    }
}
