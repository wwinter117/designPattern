package cn.wwinter.createPattern.factory.demo1;

import cn.wwinter.createPattern.factory.demo.Factory;

/**
 * ClassName: FibGenerator
 * Package: cn.wwinter.createPattern.factory.demo1
 * Description:
 * Datetime: 2023/10/29
 * Author: zhangdd
 */
public class FibGenerator implements Factory<Integer> {
    private int count = 0;

    @Override
    public Integer creat() {
        return fib(count++);
    }

    private Integer fib(int n) {
        if (n < 2) {
            return 1;
        }
        return fib(n - 1) + fib(n - 2);
    }

    public static void main(String[] args) {
        FibGenerator fibGenerator = new FibGenerator();
        for (int i = 0; i < 18; i++) {
            System.out.print(fibGenerator.creat() + " ");
        }
    }
}
