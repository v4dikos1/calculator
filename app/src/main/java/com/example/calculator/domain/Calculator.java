package com.example.calculator.domain;

import java.util.MissingFormatArgumentException;

public class Calculator {

    private static final String PLUS = "+";
    private static final String MINUS = "-";
    private static final String MULTIPLY = "×";
    private static final String DIVIDE = "÷";
    private String currentAction;

    public void setCurrentAction(String action){
        currentAction = action;
    }

    public float calculate(int firstNumber, int secondNumber){
        int result = 0;

        switch (currentAction) {
            case MINUS:
                result = firstNumber - secondNumber;
                break;
            case MULTIPLY:
                result = firstNumber * secondNumber;
                break;
            case DIVIDE:
                result = firstNumber / secondNumber;
                break;
            case PLUS:
                result = firstNumber + secondNumber;
                break;
        }

        return result;
    }

}
