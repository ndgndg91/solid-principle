package com.ndgndg91;

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

    }
}
