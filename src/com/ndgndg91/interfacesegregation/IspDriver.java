package com.ndgndg91.interfacesegregation;

import com.ndgndg91.interfacesegregation.beforesegregation.Drone;
import com.ndgndg91.interfacesegregation.beforesegregation.StarCraftUnit;
import com.ndgndg91.interfacesegregation.beforesegregation.Wraith;

public class IspDriver {

    public static void isp(){
        // StarCraftUnit Interface have so many methods.
        StarCraftUnit drone = new Drone();

        // drone can't do below behaviors.
        try {
            drone.activeCloakingField();
            drone.moveOnSky();
        } catch (IllegalStateException e) {
            System.out.println(e.getMessage());
        }

        // drone need below behaviors.
        drone.collectMineral();
        drone.collectGas();
        drone.burrow();
        drone.attack();
        drone.hold();
        drone.moveOnGround();
        drone.patrol();

        StarCraftUnit wraith = new Wraith();

        // wraith can't do below behaviors.
        try {
            wraith.moveOnGround();
            wraith.burrow();
            wraith.collectGas();
            wraith.collectMineral();
        } catch (IllegalStateException e) {
            System.out.println(e.getMessage());
        }

        // wraith need below behaviors.
        wraith.hold();
        wraith.patrol();
        wraith.attack();
        wraith.activeCloakingField();
        wraith.moveOnSky();

        // so StartCraftUnit interface segregate 6 interface
        // { Unit, CloakingAble, BurrowAble, ResourceCollectable, GroundUnit, AirUnit }
        com.ndgndg91.interfacesegregation.aftersegregation.Drone afterSegregatedDrone = new com.ndgndg91.interfacesegregation.aftersegregation.Drone();
        afterSegregatedDrone.attack();
        afterSegregatedDrone.burrow();
        afterSegregatedDrone.collectGas();
        afterSegregatedDrone.collectMineral();
        afterSegregatedDrone.hold();
        afterSegregatedDrone.moveOnGround();
        afterSegregatedDrone.patrol();

        com.ndgndg91.interfacesegregation.aftersegregation.Wraith afterSegregatedWraith = new com.ndgndg91.interfacesegregation.aftersegregation.Wraith();
        afterSegregatedWraith.activeCloakingField();
        afterSegregatedWraith.attack();
        afterSegregatedWraith.hold();
        afterSegregatedWraith.moveOnSky();
        afterSegregatedWraith.patrol();
    }

}
