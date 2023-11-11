package cn.wwinter.structurePattern.decorator.demo;

import java.util.Date;

/**
 * ClassName: TimeStampedDecorator
 * Package: cn.wwinter.structurePattern.decorator.demo
 * Description:
 * Datetime: 2023/11/11
 * Author: zhangdd
 */
public class TimeStampedDecorator extends Basic {
    private final long timeStamped;

    public TimeStampedDecorator(Basic basic) {
        super();
        this.timeStamped = new Date().getTime();
    }

    public long getTimeStamped() {
        return timeStamped;
    }
}
