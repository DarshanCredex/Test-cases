package org.example;

public class Factorial {

    public int fact(int n) {
        int fact=1;
        if (n > 0) {

            for (int i = 1; i <= n; i++) {
                fact = fact * i;

            }
        }
            else {
                throw new IllegalArgumentException();
        }
            return fact;
            //System.out.println("Factorial of " + number + " is: " + fact);

    }
}