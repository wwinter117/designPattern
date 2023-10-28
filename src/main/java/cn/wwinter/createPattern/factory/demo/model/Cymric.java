package cn.wwinter.createPattern.factory.demo.model;

import cn.wwinter.createPattern.factory.demo.Factory;

/**
 * ClassName: Mutt
 * Package: cn.wwinter.factory.demo
 * Description:
 * Datetime: 2023/10/28
 * Author: zhangdd
 */
public class Cymric extends Cat{
    public static class CymricFactory implements Factory<Cymric> {
        @Override
        public Cymric creat() {
            return new Cymric();
        }
    }
}
