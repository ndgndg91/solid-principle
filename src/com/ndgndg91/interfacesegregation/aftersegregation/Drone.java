package com.ndgndg91.interfacesegregation.aftersegregation;

public class Drone implements Unit, GroundUnit, ResourceCollectable, BurrowAble{

    @Override
    public void burrow() {
        System.out.println("드론 버로우!");
    }

    @Override
    public void moveOnGround() {
        System.out.println("드론 지상에서 이동!");
    }

    @Override
    public void collectMineral() {
        System.out.println("드론 미네랄 채집!");
    }

    @Override
    public void collectGas() {
        System.out.println("드론 가스 채집!");
    }

    @Override
    public void attack() {
        System.out.println("드론 공격!");
    }

    @Override
    public void hold() {
        System.out.println("드론 정지!");
    }

    @Override
    public void patrol() {
        System.out.println("드론 순찰!");
    }
}
