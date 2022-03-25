package com.company;

import java.util.Scanner;

class miniException extends Exception{

    private double y;
    public double getY(){
        return y;
    }
    public miniException(String massage, double y){
        super(massage);
        this.y = y;
    }
}

class calculation{
    public static double getCalculation(double x, double y) throws miniException{
        double result;
        if(y == -1) throw new miniException("Вы задали некорректное значение переменной у. Деление на ноль невозможно.", y);
        result = (x + y)/(y + 1);
        return result;
    }
}

public class Main {

    public static void main(String[] args) {
        System.out.println("ПРИМЕР: (х + у)/(у + 1) \n\n Введите значение x");
        Scanner ix = new Scanner(System.in);
        int x = ix.nextInt();

        System.out.println(" Введите значение y");
        Scanner iy = new Scanner(System.in);
        int y = iy.nextInt();

        try{
            double result = calculation.getCalculation(x, y);
            System.out.printf("(x + y)/(y + 1) = %f", result);
        }
        catch (miniException ex){
            System.out.println(ex.getMessage());
            System.out.println(ex.getY());
        }
    }
}