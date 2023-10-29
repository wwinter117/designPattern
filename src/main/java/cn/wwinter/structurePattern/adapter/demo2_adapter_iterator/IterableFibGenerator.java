package cn.wwinter.structurePattern.adapter.demo2_adapter_iterator;

import cn.wwinter.createPattern.factory.demo1.FibGenerator;

import java.util.Iterator;

/**
 * ClassName: IterableFibGenerator
 * Package: cn.wwinter.structurePattern.adapter.demo2
 * Description:
 * Datetime: 2023/10/29
 * Author: zhangdd
 */
public class IterableFibGenerator extends FibGenerator implements Iterable<Integer> {
    private int maxN;

    public IterableFibGenerator(int maxN) {
        this.maxN = maxN;
    }

    @Override
    public Iterator<Integer> iterator() {
        return new FibIterator();
    }

    class FibIterator implements Iterator<Integer> {
        @Override
        public boolean hasNext() {
            return maxN > 0;
        }

        @Override
        public Integer next() {
            maxN--;
            return creat();
        }
    }


    public static void main(String[] args) {
        IterableFibGenerator fibGenerator = new IterableFibGenerator(18);
        for (Integer i : fibGenerator) {
            System.out.print(i + " ");
        }

    }
}
