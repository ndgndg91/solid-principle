package com.ndgndg91.interfacesegregation.beforesegregation;

public class Drone implements StarCraftUnit {

    @Override
    public void activeCloakingField() {
        throw new IllegalStateException("드론은 클로킹이 불가능함!");
    }

    @Override
    public void burrow() {
        System.out.println("드론 버로우!");
    }

    @Override
    public void collectMineral() {
        System.out.println("드론 미네랄 8 수집!");
    }

    @Override
    public void collectGas() {
        System.out.println("드론 가스 5 수집!");
    }

    @Override
    public void attack() {
        System.out.println("드론 공격!");
    }

    @Override
    public void moveOnGround() {
        System.out.println("드론 이동!");
    }

    @Override
    public void moveOnSky() {
        throw new IllegalStateException("드론은 하늘로 이동 불가능!");
    }

    @Override
    public void hold() {
        System.out.println("드론 제자리에 홀드!");
    }

    @Override
    public void patrol() {
        System.out.println("드론 순찰!");
    }
}
