package cn.wwinter.structurePattern.decorator.demo;

import java.util.Date;

/**
 * ClassName: TimeStampedDecorator
 * Package: cn.wwinter.structurePattern.decorator.demo
 * Description:
 * Datetime: 2023/11/11
 * Author: zhangdd
 */
public class SerializedNumberDecorator extends Basic {
    public static long count = 0;
    private final long id = count++;

    public SerializedNumberDecorator(Basic basic) {
        super();
    }

    public long getId() {
        return id;
    }

    public static void main(String[] args) {
        TimeStampedDecorator stampedDecorator = new TimeStampedDecorator(new Basic());
        System.out.println("stampedDecorator.getTimeStamped() = " + stampedDecorator.getTimeStamped());

        SerializedNumberDecorator serializedNumberDecorator = new SerializedNumberDecorator(new Basic());
        System.out.println("serializedNumberDecorator.getId() = " + serializedNumberDecorator.getId());
    }
}
