package cn.wwinter.createPattern.factory.demo.model;

import cn.wwinter.createPattern.factory.demo.Factory;

/**
 * ClassName: Mutt
 * Package: cn.wwinter.factory.demo
 * Description:
 * Datetime: 2023/10/28
 * Author: zhangdd
 */
public class Mutt extends Dog{
    public static class MuttFactory implements Factory<Mutt> {
        @Override
        public Mutt creat() {
            return new Mutt();
        }
    }
}
