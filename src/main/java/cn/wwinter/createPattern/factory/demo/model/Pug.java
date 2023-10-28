package cn.wwinter.createPattern.factory.demo.model;

import cn.wwinter.createPattern.factory.demo.Factory;

/**
 * ClassName: Mutt
 * Package: cn.wwinter.factory.demo
 * Description:
 * Datetime: 2023/10/28
 * Author: zhangdd
 */
public class Pug extends Dog{
    public static class PugFactory implements Factory<Pug> {
        @Override
        public Pug creat() {
            return new Pug();
        }
    }
}
