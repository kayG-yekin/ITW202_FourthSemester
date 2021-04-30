package com.example.todo9;

public class calculator {
    public double add(double x,double y){
        return x+y;
    }
    public double sub(double x,double y){
        return x-y;
    }
    public double mul(double x,double y){
        return x*y;
    }
    public double div(double x,double y){
        if(y==0){
            throw new IllegalArgumentException("Divisor is zero!!!!!");
        }
        return x/y;
    }

}
