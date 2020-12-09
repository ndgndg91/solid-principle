package com.ndgndg91.openforextensioncloseformodification;

public class OcpDriver {

    public static void ocp(){
        BackendDeveloper backendDeveloper = new BackendDeveloper();
        backendDeveloper.developBackEnd();

        FullStackDeveloper fullStackDeveloper = new FullStackDeveloper();
        fullStackDeveloper.developFrontEnd();
        fullStackDeveloper.developBackEnd();
    }

}
