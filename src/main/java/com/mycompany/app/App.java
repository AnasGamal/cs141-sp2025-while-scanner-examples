/*----------------------------------------------------------------------------------------
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See LICENSE in the project root for license information.
 *---------------------------------------------------------------------------------------*/
package com.mycompany.app;

import java.util.*;

public class App {
    public static void main(String[] args) {

        int numOfRuns = 5;

        int number = 0;

        while(number < numOfRuns) { // run while loop as long as array length less than numOfGrades
            number = number + 1;
            System.out.println("Number value is: " + number);
            // if (number == 3) {
            //     break;
            // }
        }

        System.out.println("Done");
    }
}