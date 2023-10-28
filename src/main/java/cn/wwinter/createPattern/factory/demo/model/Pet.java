package cn.wwinter.createPattern.factory.demo.model;

import cn.wwinter.createPattern.factory.demo.Factory;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 * ClassName: Pet
 * Package: cn.wwinter.factory.demo
 * Description:
 * Datetime: 2023/10/28
 * Author: zhangdd
 */
public class Pet {
    private static final Random random = new Random();
    private static final List<Factory<? extends Pet>> factories = new ArrayList<>();
    static {
        factories.add(new Cymric.CymricFactory());
        factories.add(new Manx.ManxFactory());
        factories.add(new Mutt.MuttFactory());
        factories.add(new Pug.PugFactory());
    }

    public static Pet createRandom() {
        return factories.get(random.nextInt(factories.size())).creat();
    }

    public static void main(String[] args) {
        System.out.println(Pet.createRandom());
        System.out.println(Pet.createRandom());
        System.out.println(Pet.createRandom());
        System.out.println(Pet.createRandom());
        System.out.println(Pet.createRandom());
        System.out.println(Pet.createRandom());
        System.out.println(Pet.createRandom());
        System.out.println(Pet.createRandom());
        System.out.println(Pet.createRandom());
        System.out.println(Pet.createRandom());
    }
}
