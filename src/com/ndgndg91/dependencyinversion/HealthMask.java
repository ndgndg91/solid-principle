package com.ndgndg91.dependencyinversion;

public class HealthMask implements Mask {

    @Override
    public void protectFace() {
        System.out.println("비말을 완벽하게 차단한다.");
    }
}
