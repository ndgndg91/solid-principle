package com.ndgndg91.dependencyinversion;

public class DentalMask implements Mask{

    @Override
    public void protectFace() {
        System.out.println("가볍고 습기에 강하다!");
    }
}
