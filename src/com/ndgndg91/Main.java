package com.ndgndg91;

import com.ndgndg91.openforextensioncloseformodification.BackendDeveloper;
import com.ndgndg91.openforextensioncloseformodification.FullStackDeveloper;

public class Main {

    public static void main(String[] args) {
	// write your code here
        BackendDeveloper backendDeveloper = new BackendDeveloper();
        backendDeveloper.developBackEnd();

        FullStackDeveloper fullStackDeveloper = new FullStackDeveloper();
        fullStackDeveloper.developFrontEnd();
        fullStackDeveloper.developBackEnd();
    }
}
