package com.ndgndg91.dependencyinversion;

public class DipDriver {

    public static void dip() {
        Mask cottonMask = new CottonMask();
        Mask dentalMask = new DentalMask();
        Mask healthMask = new HealthMask();

        Human wearingCottonMask = new Human(cottonMask);
        wearingCottonMask.protectFromCovid19();

        Human wearingDentalMask = new Human(dentalMask);
        wearingDentalMask.protectFromCovid19();

        Human wearingHealthMask = new Human(healthMask);
        wearingHealthMask.protectFromCovid19();
    }

}
