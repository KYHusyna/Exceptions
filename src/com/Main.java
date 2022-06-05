package com;

public class Main {
    public static void main(String[] args) {
        int errorData = 0, correctData = 1;
        int arr[] = new int[]{-2, 3, 8};

        try {
            Calculate(correctData, errorData);
            ArrayElement(arr, correctData, errorData);
        } catch (Catcher e) {
        } finally {
            System.out.println("Calculate is end");
        }
    }

    static void Calculate(int correctData, int errorData) throws Catcher {
        try {
            int correct = 5 / correctData;
            System.out.println("Correct calculate: 5/" + correctData + " = " + correct);
            if (errorData == 0) ;
            throw new Catcher("calc", errorData);
        } catch (Catcher e) {
            System.out.println("Exception is defined");
        }
    }
//keywords try-catch and throw, throws logic
    static void ArrayElement(int[] arr, int correctData, int errorData) throws Catcher {
        try {
            System.out.println("Correct element:" + arr[correctData] + " index: " + correctData);
            errorData += 3;
            if (errorData >= arr.length)
                throw new Catcher("arr", errorData);
        } catch (Catcher e) {
            System.out.println("Exception is defined\n");
        }
    }

    static class Catcher extends Exception {
        public Catcher(String calc, int errorData) {
            switch (calc) {
                case "calc":
                    System.out.println("\nERROR!\n- Incorrect calculate: 5/" + errorData + " -");
                    break;
                case "arr":
                    System.out.println("\nERROR!\n- index is not defined");
                    break;
                default:
                    System.out.println("Exception is not foreseen");
            }
        }
    }

}
