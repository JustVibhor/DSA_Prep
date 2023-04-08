package com.vibhor.sample;

public class main {
}

class BadFoodException extends Exception {

}

class MyException extends Exception {
    public static void main(String[] args) {
        try {
            checkFood("good");
        }
        catch (BadFoodException bd) {
            System.out.println("ddd");
        }
    }
    static void checkFood(String food) throws BadFoodException {
        if(food.equals("good")) {
            System.out.println("good");
        } else {
            System.out.println("bad");
        }
    }
}
