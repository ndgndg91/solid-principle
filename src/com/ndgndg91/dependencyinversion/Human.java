package com.ndgndg91.dependencyinversion;

public class Human {

    private final Mask mask;

    public Human(Mask mask) {
        this.mask = mask;
    }

    public void protectFromCovid19(){
        mask.protectFace();
    }

}
