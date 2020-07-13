package me.yonghong.springboot.lab.javainaction.chapter02;

import me.yonghong.springboot.lab.javainaction.common.Apple;
import me.yonghong.springboot.lab.javainaction.common.ColorEnum;

public class AppleGreenColorPredicate implements ApplePredicate {

    @Override
    public boolean accept(Apple apple) {
        return ColorEnum.GREEN.equals(apple.getColor());
    }
}
