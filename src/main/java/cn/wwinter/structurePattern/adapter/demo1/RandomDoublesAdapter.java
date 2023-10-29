package cn.wwinter.structurePattern.adapter.demo1;

import java.io.IOException;
import java.nio.CharBuffer;
import java.util.Scanner;

/**
 * ClassName: RandomDoublesAdapter
 * Package: cn.wwinter.structurePattern.adapter.demo1
 * Description:
 * Datetime: 2023/10/29
 * Author: zhangdd
 */
public class RandomDoublesAdapter extends RandomDoubles implements Readable {
    private int count;

    public RandomDoublesAdapter(int count) {
        this.count = count;
    }

    @Override
    public int read(CharBuffer cb) throws IOException {
        if (count-- == 0) {
            return -1;
        }
        String res = next() + " ";
        cb.append(res);
        return res.length();
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(new RandomDoublesAdapter(3));
        while (s.hasNextDouble()) {
            System.out.println(s.nextDouble() + " ");
        }
    }
}
