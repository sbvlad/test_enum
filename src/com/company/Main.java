package com.company;
import java.util.Scanner;
public class Main {

    public enum Season{
        WINTER, SPRING, SUMMER, AUTUMN
    }


    private static void checkSeason(String month){

        Season season;
        switch (month) {
            case "December":
            case "January":
            case "February":
                season = Season.WINTER;
                System.out.println(season);
                break;
            case "March":
            case "April":
            case "May":
                season = Season.SPRING;
                System.out.println(season);
                break;
            case "June":
            case "Jule":
            case "August":
                season = Season.SUMMER;
                System.out.println(season);
                break;
            case "September":
            case "October":
            case "November":
                season = Season.AUTUMN;
                System.out.println(season);
                break;
            default:
                System.out.println("No this month");
        }

    }



    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        checkSeason(input.nextLine());

    }



}

