package cn.wwinter.createPattern.factory.demo.model;

import cn.wwinter.createPattern.factory.demo.Factory;

/**
 * ClassName: Mutt
 * Package: cn.wwinter.factory.demo
 * Description:
 * Datetime: 2023/10/28
 * Author: zhangdd
 */
public class Manx extends Cat{
    public static class ManxFactory implements Factory<Manx> {
        @Override
        public Manx creat() {
            return new Manx();
        }
    }
}
