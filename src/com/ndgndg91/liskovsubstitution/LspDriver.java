package com.ndgndg91.liskovsubstitution;

public class LspDriver {

    public static void lsp(){
        // drone, scv is a subtype of MineralCollector.
        // drone, scv can substitute mineral collector. (프로브1)
        Drone drone = new Drone("드론1");
        SCV scv = new SCV("scv1");
        MineralCollector probe = new MineralCollector("프로브1");
        probe.collectMineral();
        drone.collectMineral();
        scv.collectMineral();

        // dark templar is not a subtype of mineral collector.
        // dark templar can't substitute mineral collector.
        StarCraftUnit darkTemplar = new DarkTemplar("닥템1");
        darkTemplar.attack(); // dark templar only can attack. can't collect mineral.
    }
}
