package com.vibhor.OOP.ExceptionHandling;

public class Main {
    public static void main(String[] args) {
        int a = 4;
        int b = 0;



        try {
//            divide(4, 0);

            String name = "Vibhor";

            if(name.equals("Vibhor")) {
                throw new MyException("Behen ke laude");
            }

        } catch (ArithmeticException e) {
            System.out.println(e.getMessage());
        } catch (MyException e) {
            System.out.println(e.getMessage());
        }
        finally {
            System.out.println("shi heh");
        }

    }

    public static int divide(int a, int b) throws ArithmeticException{    // throws means this method may throw an exception
        if(b == 0) {
            throw new ArithmeticException("Don't divide by zero");       // here its throwing the exception
        }
        return a/b;
    }
}
