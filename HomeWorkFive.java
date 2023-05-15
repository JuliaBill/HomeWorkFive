package Homework;

public class HomeWorkFive {

    public static void main(String[] args) {

        //typeOFNumber(0);
        //typeOFNumber(-7);
        //typeOFNumber(6);

        //isEvenNumber(3);
        //isEvenNumber(4);

        int year = 2023;
        boolean isIntercalaryYear = intercalaryYear(year);
        if (isIntercalaryYear) {
            System.out.println(year + " ist ein Schaltjahr");
        } else {
            System.out.println(year + " ist kein Schaltjahr");
        }
    }

    public static void typeOFNumber(int number) {


        if (number > 0) {
            System.out.println(" x is positive number.");

        } else if (number < 0) {
            System.out.println("x is negative number");

        } else {

            System.out.println("x is even null");

        }
    }

    public static void isEvenNumber(int evenNumber) {

        if (evenNumber % 2 == 0) {
            System.out.println("the number is even .");

        } else {

            System.out.println("the number isn´t even");
        }
    }

    public static boolean intercalaryYear(int year) {


        if (year % 4 == 0) {
            if (year % 100 == 0) {
                if (year % 400 == 0) {
                    return true;
                } else {
                    return false;
                }
                } else{
                    return true;
                }
            } else {
                return false;
            }

        }
    }