package org.example;
import java.lang.Math;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
    }

    public static boolean shouldWakeUp(boolean isBarking, int clock) {
        return isBarking && ((20 < clock && clock < 24) || (clock >= 0 && clock < 8));
    }

    public static boolean hasTeen(int firstAge, int secondAge, int thirdAge) {
       return (firstAge <=19 && firstAge >= 13) || (secondAge <=19 && secondAge >= 13) || (thirdAge <=19 && thirdAge >= 13);
    }

    public static boolean isCatPlaying(boolean isSummer, int temp) {
        if(isSummer){
            return 25 <= temp && temp <= 45;
        }
        else {
            return 25 <= temp && temp <= 35;
        }
    }

    public static double area(double width, double height) {
        if(width < 0 || height < 0 ){
            return -1;
        }
        else {
            double alan = width * height;
            return alan;
        }
    }

    public static double area(double radius) {
       if(radius < 0 ){
           return -1;
       }
       else {
           return radius * radius * Math.PI;

       }
    }
}
