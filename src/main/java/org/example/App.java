/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 Zarin Tasnim
 */

import java.util.Scanner;

class carIssues {

    public static void main(String args[]) {
        System.out.print("Is the car silent when you turn the turn the key? ");
        Scanner sc = new Scanner(System.in);
        String obj1 = sc.nextLine();


        if ("y".equalsIgnoreCase(obj1)) {
            System.out.print("Are the battery terminals corroded? ");
            String obj2 = sc.nextLine();
            if ("y".equalsIgnoreCase(obj2)) {
                System.out.print("Clean terminals and try starting again");
            } else if ("n".equalsIgnoreCase(obj2)) {
                System.out.print("Replace cables and try again");
            }

        } else if ("n".equalsIgnoreCase(obj1)) {
            System.out.print("Does the car make a slicking noise?");
            String obj3 = sc.nextLine();

            if ("y".equalsIgnoreCase(obj3)) {
                System.out.print("Replace the battery.");
            } else if ("n".equalsIgnoreCase(obj3)) {
                System.out.print("Does the car crank up but fail to start?");
                String obj4 = sc.nextLine();
                if ("y".equalsIgnoreCase(obj4)) {
                    System.out.print("Check spark plug connections.");
                } else if ("n".equalsIgnoreCase(obj4)) {
                    System.out.print("Does the engine start and then die?");
                    String obj5 = sc.nextLine();
                    if ("y".equalsIgnoreCase(obj5)) {
                        System.out.print("Does you car have fuel injection?");
                        String obj6 = sc.nextLine();
                        if ("y".equalsIgnoreCase(obj6)) {
                            System.out.print("Get it in for service");
                        } else if ("n".equalsIgnoreCase(obj6)) {
                            System.out.print("Check to ensure the choke is opening and closing.");
                        }
                    } else if ("n".equalsIgnoreCase(obj5)) {
                        System.out.print("This should not be possible.");
                    }

                }

            }
        }


    }

}