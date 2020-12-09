package com.ndgndg91.liskovsubstitution;

public class MineralCollector extends StarCraftUnit{

    public MineralCollector(String name) {
        super(name);
    }

    public void collectMineral() {
        System.out.println(super.name + "미네랄 수집.");
    }
}
