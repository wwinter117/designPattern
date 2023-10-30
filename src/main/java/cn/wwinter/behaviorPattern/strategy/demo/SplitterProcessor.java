package cn.wwinter.behaviorPattern.strategy.demo;

import java.util.Arrays;

/**
 * ClassName: UpcaseProcessor
 * Package: cn.wwinter.behaviorPattern.strategy.demo
 * Description:
 * Datetime: 2023/10/28
 * Author: zhangdd
 */
public class SplitterProcessor extends AbstractStringProcessor {
    @Override
    public String process(String s) {
        return Arrays.toString(s.split(" "));
    }
}
