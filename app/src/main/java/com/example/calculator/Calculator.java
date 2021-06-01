package com.example.calculator;

import java.util.MissingFormatArgumentException;

public class Calculator {

    private static final char PLUS = '+';
    private static final char MINUS = '-';
    private static final char MULTIPLY = '×';
    private static final char DIVIDE = '÷';
    private char currentAction;

    public void setCurrentAction(char action){
        currentAction = action;
    }

    public double calculate(double firstNumber, double secondNumber){
        double result = 0;

        switch (currentAction){
            case PLUS:
                result = firstNumber + secondNumber;
                break;

            case MINUS:
                result = firstNumber - secondNumber;
                break;

            case MULTIPLY:
                result = firstNumber * secondNumber;
                break;

            case DIVIDE:
                result = firstNumber / secondNumber;
                break;
        }

        return result;
    }

}
