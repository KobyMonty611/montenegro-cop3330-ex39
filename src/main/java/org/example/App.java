package org.example;

/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Koby Montenegro
 */

import java.util.HashMap;
import java.util.Map;

public class App
{
    public static void main( String[] args )
    {
        Map<String, String> nameInfo = new HashMap<String, String>();

        nameInfo.put("John","Johnson");
        nameInfo.put("Tou","Xiong");
        nameInfo.put("Michaela","Michaelson");
        nameInfo.put("Jake","Jacobson");
        nameInfo.put("Jacquelyn","Jackson");
        nameInfo.put("Sally","Webber");

        Map<String, String> positionInfo = new HashMap<String, String>();

        positionInfo.put("John","Manager");
        positionInfo.put("Tou","Software Engineer");
        positionInfo.put("Michaela","District Manager");
        positionInfo.put("Jake","Programmer");
        positionInfo.put("Jacquelyn","DBA");
        positionInfo.put("Sally","Web Developer");

        Map<String, String> dateInfo = new HashMap<String, String>();

        dateInfo.put("John","2016-12-31");
        dateInfo.put("Tou","2016-10-05");
        dateInfo.put("Michaela","2015-12-19");
        dateInfo.put("Jake"," ");
        dateInfo.put("Jacquelyn"," ");
        dateInfo.put("Sally","2015-12-18");

        System.out.print("Name                | Position          | Separation date\n");
        System.out.print("--------------------|-------------------|----------------\n");

        String[] keys = {"Jacquelyn", "Jake", "John", "Michaela", "Sally", "Tou"};

        //
        //Printing loop
        for(int i = 0; i<6; i++)
        {
            //Jacquelyn
            if(i==0)
            System.out.println(keys[i]+ " " + nameInfo.get(keys[i]) + "   | "
            + positionInfo.get(keys[i]) + "               | "+ dateInfo.get(keys[i]) + "");

            //Jake
            if(i==1)
                System.out.println(keys[i]+ " " + nameInfo.get(keys[i]) + "       | "
            + positionInfo.get(keys[i]) + "        | "+ dateInfo.get(keys[i]) + "");

            //John
            if(i==2)
                System.out.println(keys[i]+ " " + nameInfo.get(keys[i]) + "        | "
            + positionInfo.get(keys[i]) + "           | "+ dateInfo.get(keys[i]) + "");

            //Michaela
            if(i==3)
                System.out.println(keys[i]+ " " + nameInfo.get(keys[i]) + " | "
            + positionInfo.get(keys[i]) + "  | "+ dateInfo.get(keys[i]) + "");

            //Sally
            if(i==4)
                System.out.println(keys[i]+ " " + nameInfo.get(keys[i]) + "        | "
            + positionInfo.get(keys[i]) + "     | "+ dateInfo.get(keys[i]) + "");

            //Tou
            if(i==5)
                System.out.println(keys[i]+ " " + nameInfo.get(keys[i]) + "           | "
            + positionInfo.get(keys[i]) + " | "+ dateInfo.get(keys[i]) + "");
        }
    }
}