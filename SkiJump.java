//SkiJump.java
 /*
# Programmers: Michele Onton Cueva
# Course: CS 212
# Due Date: 02/01/2024
# Lab Assignment: 3
# Problem Statement: Create a program to determine the distance traveled and the points earned
# Data In: type of hill, jumper's speed
# Data Out: distance traveled, points earned
# Credits: Notes from Class
*/

import java.util.Scanner;
public class SkiJump {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("What is the type of hill? ");
        String type_hill = input.nextLine();
        double height = 0;
        double point_per_meter = 0;
        double par = 0;
        if (type_hill == "Normal" || type_hill == "normal") {
             height = 46;
             point_per_meter = 2;
             par = 90;
        } else {
             height = 70;
             point_per_meter = 1.8;
             par = 120;
        }

        System.out.println("What is the jumper's speed? ");
        double jumper_speed = input.nextDouble();
        double time_in_air = Math.sqrt((2 * height) / 9.8);
        double distance_traveled = jumper_speed * time_in_air;
        double points_earned = 60 + (distance_traveled - par) * point_per_meter;

        if (points_earned >= 61) {
            System.out.println("Great job for doing better than par!");
        } else if (points_earned < 10) {
            System.out.println("What happened?");
        } else {
            System.out.println("Sorry you didn't go very far.");
        }

        System.out.println(" You traveled " + distance_traveled + " and earned " + points_earned + " points");
    }
}
