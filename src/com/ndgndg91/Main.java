package com.ndgndg91;

import com.ndgndg91.liskovsubstitution.DarkTemplar;
import com.ndgndg91.liskovsubstitution.Drone;
import com.ndgndg91.liskovsubstitution.MineralCollector;
import com.ndgndg91.liskovsubstitution.SCV;
import com.ndgndg91.liskovsubstitution.StarCraftUnit;
import com.ndgndg91.openforextensioncloseformodification.BackendDeveloper;
import com.ndgndg91.openforextensioncloseformodification.FullStackDeveloper;
import com.ndgndg91.singleresponsibility.CustomerServiceRepresentative;
import com.ndgndg91.singleresponsibility.Designer;
import com.ndgndg91.singleresponsibility.Developer;
import com.ndgndg91.singleresponsibility.God;
import com.ndgndg91.singleresponsibility.Planner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        srp();

        ocp();

        lsp();
    }

    private static void srp(){
        God god = new God(); // God has 4 responsibility.
        god.doPlan();
        god.doDesign();
        god.doDevelop();
        god.doCustomerService();

        Developer developer = new Developer(); // has a single responsibility
        developer.develop();
        Designer designer = new Designer(); // has a single responsibility
        designer.design();
        Planner planner = new Planner(); // has a single responsibility
        planner.plan();
        CustomerServiceRepresentative customerServiceRepresentative = new CustomerServiceRepresentative(); // has a single responsibility
        customerServiceRepresentative.satisfyCustomer();
    }

    private static void ocp(){
        BackendDeveloper backendDeveloper = new BackendDeveloper();
        backendDeveloper.developBackEnd();

        FullStackDeveloper fullStackDeveloper = new FullStackDeveloper();
        fullStackDeveloper.developFrontEnd();
        fullStackDeveloper.developBackEnd();
    }

    private static void lsp(){
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
