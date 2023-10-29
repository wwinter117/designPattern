package cn.wwinter.structurePattern.adapter.demo1;

import java.util.Random;

/**
 * ClassName: RandomDoubles
 * Package: cn.wwinter.structurePattern.adapter.demo1
 * Description:
 * Datetime: 2023/10/29
 * Author: zhangdd
 */
public class RandomDoubles {
    private final Random random = new Random();
    public double next() {
        return random.nextDouble();
    }
}
