package cn.wwinter.behaviorPattern.strategy.demo;

/**
 * ClassName: Apply
 * Package: cn.wwinter.behaviorPattern.strategy.demo
 * Description:
 * Datetime: 2023/10/28
 * Author: zhangdd
 */
public class Apply {
    public static <T> void process(Processor<T> p, T t) {
        System.out.println("Using Processor: " + p.name());
        System.out.println(p.process(t));
    }

    public static void main(String[] args) {
        String s = "aYUGUIshiu UYDAFGJVH iaysgduy 1322 idausdga38427";
        Apply.process(new UpCaseProcessor(), s);
        Apply.process(new DownCaseProcessor(), s);
        Apply.process(new SplitterProcessor(), s);
    }
}
