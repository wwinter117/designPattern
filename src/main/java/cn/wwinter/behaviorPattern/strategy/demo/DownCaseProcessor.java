package cn.wwinter.behaviorPattern.strategy.demo;

/**
 * ClassName: UpcaseProcessor
 * Package: cn.wwinter.behaviorPattern.strategy.demo
 * Description:
 * Datetime: 2023/10/28
 * Author: zhangdd
 */
public class DownCaseProcessor extends AbstractStringProcessor {
    @Override
    public String process(String s) {
        return s.toLowerCase();
    }
}
