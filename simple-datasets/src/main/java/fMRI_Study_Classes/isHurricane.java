package fMRI_Study_Classes;

public class isHurricane {
    public static void run() {
        int value = 112;
        System.out.print(compute(value));
    }

    //SNIPPET_STARTS
    public static String compute(int value) {
        String result;

        if      (value <  65) result = "Not a hurricane";
        else if (value <  96) result = "Class 1 hurricane";
        else if (value < 111) result = "Class 2 hurricane";
        else if (value < 131) result = "Class 3 hurricane";
        else if (value < 155) result = "Class 4 hurricane";
        else result = "Class 5 hurricane";

        return result;
    }
}