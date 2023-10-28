package cn.wwinter.createPattern.factory.demo;

import java.util.Random;

/**
 * ClassName: AbstractCreator
 * Package: cn.wwinter.factory.demo
 * Description:
 * Datetime: 2023/10/28
 * Author: zhangdd
 */
public abstract class AbstractCreator<T> implements Creator<T> {
    private final Random rand = new Random(47);

    abstract T create();

}
