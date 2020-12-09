package com.ndgndg91;

import com.ndgndg91.liskovsubstitution.LspDriver;
import com.ndgndg91.openforextensioncloseformodification.OcpDriver;
import com.ndgndg91.singleresponsibility.CustomerServiceRepresentative;
import com.ndgndg91.singleresponsibility.Designer;
import com.ndgndg91.singleresponsibility.Developer;
import com.ndgndg91.singleresponsibility.God;
import com.ndgndg91.singleresponsibility.Planner;
import com.ndgndg91.singleresponsibility.SrpDriver;

public class Main {

    public static void main(String[] args) {
	// write your code here
        SrpDriver.srp();

        OcpDriver.ocp();

        LspDriver.lsp();
    }
}
