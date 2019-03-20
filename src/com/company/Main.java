package com.company;

import java.io.File;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

import static com.company.Calculate.*;

public class Main
{

    public static void main(String[] args)
    {
        Set<Integer> fileOne = new HashSet<>();

        Set<Integer> fileTwo = new HashSet<>();

        try
        {
            String fileOneLocation = args[1];
            Scanner readerOne = new Scanner(new File(fileOneLocation));

            String fileTwoLocation = args[2];
            Scanner readerTwo = new Scanner(new File(fileTwoLocation));

            while(readerOne.hasNext())
            {
                String str = readerOne.nextLine();
                fileOne.add(Integer.parseInt(str));
            }

            while(readerTwo.hasNext())
            {
                String str = readerTwo.nextLine();
                fileTwo.add(Integer.parseInt(str));
            }
        }
        catch (Exception e)
        {
            System.out.println("Error: " + e.getMessage());
        }

        String command = args[0];

        run(command, fileOne, fileTwo);
    }

    private static void run(String command, Set<Integer> fileOne, Set<Integer> fileTwo)
    {
        switch(command)
        {
            case "intersection":
                Set<Integer> intersection = calculateIntersection(fileOne, fileTwo);
                System.out.println("Calculate of File One and File Two: " + intersection);
                break;
            case "compliment":
                Set<Integer> complimentFileOne = calculateCompliment(fileTwo, fileOne);
                Set<Integer> complimentFileTwo = calculateCompliment(fileOne, fileTwo);

                System.out.println("Complement of File One: " + complimentFileOne);
                System.out.println("Complement of File Two: " + complimentFileTwo);
                break;
            case "union":
                Set<Integer> union = calculateUnion(fileOne, fileTwo);
                System.out.println("Union of File One and File Two: " + union);
                break;
            default:
                System.out.println("Invalid Command");
        }
    }
}
