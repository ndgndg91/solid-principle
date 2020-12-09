package com.ndgndg91.liskovsubstitution;

public class StarCraftUnit {
    protected final String name;

    public StarCraftUnit(String name) {
        this.name = name;
    }

    public void attack(){
        System.out.println(name + " 공격 시작!");
    }
}
