package com.ndgndg91.interfacesegregation.aftersegregation;

public class Wraith implements Unit, AirUnit, CloakingAble{

    @Override
    public void moveOnSky() {
        System.out.println("레이스 공중에서 이동!");
    }

    @Override
    public void activeCloakingField() {
        System.out.println("레이스 클로킹!");
    }

    @Override
    public void attack() {
        System.out.println("레이스 공격!");
    }

    @Override
    public void hold() {
        System.out.println("레이스 정지!");
    }

    @Override
    public void patrol() {
        System.out.println("레이스 순찰!");
    }
}
