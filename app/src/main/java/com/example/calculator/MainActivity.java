package com.example.calculator;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private static final String ARG_RESULT = "ARG_RESULT";
    private static final String ARG_INPUT = "ARG_INPUT";

    Calculator calculator;
    EditText editText;
    TextView result;
    int firstNumber;
    int secondNumber;

    private View.OnClickListener clickListener = new View.OnClickListener() {
        @Override
        public void onClick(View v) {

        if (v.getId() == R.id.zero_btn){
            editText.append("0");
        }
        if (v.getId() == R.id.one_btn){
            editText.append("1");
        }
        if (v.getId() == R.id.two_btn){
            editText.append("2");
        }
        if (v.getId() == R.id.three_btn){
            editText.append("3");
        }
        if (v.getId() == R.id.four_btn){
            editText.append("4");
        }
        if (v.getId() == R.id.five_btn){
            editText.append("5");
        }
        if (v.getId() == R.id.six_btn){
            editText.append("6");
        }
        if (v.getId() == R.id.seven_btn){
            editText.append("7");
        }
        if (v.getId() == R.id.eight_btn){
            editText.append("8");
        }
        if (v.getId() == R.id.nine_btn){
            editText.append("9");
        }
        if (v.getId() == R.id.plus_btn){
            String value = editText.getText().toString();
            firstNumber = Integer.parseInt(value);
            calculator.setCurrentAction("+");
            editText.append("+");
        }
        if (v.getId() == R.id.minus_btn){
            String value = editText.getText().toString();
            firstNumber = Integer.parseInt(value);
            calculator.setCurrentAction("-");
            editText.append("-");
        }
        if (v.getId() == R.id.multiply_btn){
            String value = editText.getText().toString();
            firstNumber = Integer.parseInt(value);
            calculator.setCurrentAction("×");
            editText.append("×");
        }
        if (v.getId() == R.id.divide_btn){
            String value = editText.getText().toString();
            firstNumber = Integer.parseInt(value);
            calculator.setCurrentAction("÷");
            editText.append("÷");
        }

        if (v.getId() == R.id.comma_btn){

        }

        if (v.getId() == R.id.equals_btn){
            String value = editText.getText().toString();

            if (value.contains("+")){
                secondNumber = Integer.parseInt(value.substring(value.indexOf("+") + 1));
            }
            else if (value.contains("-")){
                secondNumber = Integer.parseInt(value.substring(value.indexOf("-") + 1));
            }
            else if (value.contains("×")){
                secondNumber = Integer.parseInt(value.substring(value.indexOf("×") + 1));
            }
            else if (value.contains("÷")){
                secondNumber = Integer.parseInt(value.substring(value.indexOf("÷") + 1));
            }

            result.setText(String.valueOf(calculator.calculate(firstNumber, secondNumber)));
        }

        if (v.getId() == R.id.backspace_btn){
            if (editText.getText().length() > 0)
                editText.setText(editText.getText().delete(editText.length() - 1, editText.length()));
        }
        if (v.getId() == R.id.clear_btn){
            editText.setText("");
        }

        }
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        calculator = new Calculator();

        editText = findViewById(R.id.calculator_field);
        result = findViewById(R.id.result);

        findViewById(R.id.zero_btn).setOnClickListener(clickListener);
        findViewById(R.id.one_btn).setOnClickListener(clickListener);
        findViewById(R.id.two_btn).setOnClickListener(clickListener);
        findViewById(R.id.three_btn).setOnClickListener(clickListener);
        findViewById(R.id.four_btn).setOnClickListener(clickListener);
        findViewById(R.id.five_btn).setOnClickListener(clickListener);
        findViewById(R.id.six_btn).setOnClickListener(clickListener);
        findViewById(R.id.seven_btn).setOnClickListener(clickListener);
        findViewById(R.id.eight_btn).setOnClickListener(clickListener);
        findViewById(R.id.nine_btn).setOnClickListener(clickListener);
        findViewById(R.id.plus_btn).setOnClickListener(clickListener);
        findViewById(R.id.minus_btn).setOnClickListener(clickListener);
        findViewById(R.id.multiply_btn).setOnClickListener(clickListener);
        findViewById(R.id.divide_btn).setOnClickListener(clickListener);
        findViewById(R.id.backspace_btn).setOnClickListener(clickListener);
        findViewById(R.id.clear_btn).setOnClickListener(clickListener);
        findViewById(R.id.comma_btn).setOnClickListener(clickListener);
        findViewById(R.id.equals_btn).setOnClickListener(clickListener);

    }

    @Override
    protected void onSaveInstanceState(@NonNull Bundle outState){
        super.onSaveInstanceState(outState);
        outState.putString(ARG_RESULT, result.getText().toString());
        outState.putString(ARG_INPUT, editText.getText().toString());
    }

    @Override
    protected void onRestoreInstanceState(@NonNull Bundle savedInstanceState) {
        super.onRestoreInstanceState(savedInstanceState);
        editText.setText(savedInstanceState.getString(ARG_INPUT, ""));
        result.setText(savedInstanceState.getString(ARG_RESULT, ""));
    }
}