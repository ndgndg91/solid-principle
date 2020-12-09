package com.ndgndg91.interfacesegregation.beforesegregation;

public class Wraith implements StarCraftUnit {

    @Override
    public void activeCloakingField() {
        System.out.println("레이스 클로킹!");
    }

    @Override
    public void burrow() {
        throw new IllegalStateException("레이스는 버로우 불가능!");
    }

    @Override
    public void collectMineral() {
        throw new IllegalStateException("레이스 미네랄 채집 불가능!");
    }

    @Override
    public void collectGas() {
        throw new IllegalStateException("레이스 가스 채집 불가능!");
    }

    @Override
    public void attack() {
        System.out.println("레이스 공격!");
    }

    @Override
    public void moveOnGround() {
        throw new IllegalStateException("레이스 공중에서만 이동 가능!");
    }

    @Override
    public void moveOnSky() {
        System.out.println("레이스 공중에서 이동!");
    }

    @Override
    public void hold() {
        System.out.println("레이스 제자리 홀드!");
    }

    @Override
    public void patrol() {
        System.out.println("레이스 순찰!");
    }
}
