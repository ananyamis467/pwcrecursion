package org.example;

public class TriangleNumberCalculator {
    public int value(int n) {
        if (n <= 1) {
            return n;
        }
        return n + value(n - 1);
    }

    public int add(int n, int m) {
        return value(n) + value(m);
    }

    public int subtract(int n, int m) {
        return value(n) - value(m);
    }

    public static void main(String[] args) {
        TriangleNumberCalculator calculator = new TriangleNumberCalculator();

        System.out.println(calculator.value(1));     
        System.out.println(calculator.value(2));     
        System.out.println(calculator.value(4));      

        System.out.println(calculator.add(1, 1));      
        System.out.println(calculator.add(2, 3));    
        System.out.println(calculator.add(4, 2));      

        System.out.println(calculator.subtract(1, 1)); 
        System.out.println(calculator.subtract(2, 3)); 
        System.out.println(calculator.subtract(4, 2)); 
    }
}
