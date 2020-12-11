package com.ndgndg91.dependencyinversion;

public class CottonMask implements Mask{

    @Override
    public void protectFace() {
        System.out.println("습기에 약하지만, 빨아서 한 번 더 쓸수 있어!");
    }
}
