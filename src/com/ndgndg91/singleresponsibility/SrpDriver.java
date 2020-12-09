package com.ndgndg91.singleresponsibility;

public class SrpDriver {

    public static void srp(){
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

}
