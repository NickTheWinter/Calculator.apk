package com.example.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    TextView result;

    Button num0;
    Button num1;
    Button num2;
    Button num3;
    Button num4;
    Button num5;
    Button num6;
    Button num7;
    Button num8;
    Button num9;
    Button dot;
    Button numC;
    Button numPlus;
    Button numMinus;
    Button numDel;
    Button numAmp;
    Button numDev;
    Button numSqrt;
    Button numSqr;
    Button numEqual;

    String act;
    double firstNum;
    double secondNum;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        act="";
        result = findViewById(R.id.result);
        num0 = findViewById(R.id.num0);
        num1 = findViewById(R.id.num1);
        num2 = findViewById(R.id.num2);
        num3 = findViewById(R.id.num3);
        num4 = findViewById(R.id.num4);
        num5 = findViewById(R.id.num5);
        num6 = findViewById(R.id.num6);
        num7 = findViewById(R.id.num7);
        num8 = findViewById(R.id.num8);
        num9 = findViewById(R.id.num9);
        dot = findViewById(R.id.numDot);
        numC = findViewById(R.id.numC);
        numPlus = findViewById(R.id.numPlus);
        numMinus = findViewById(R.id.numMinus);
        numDev = findViewById(R.id.numDevision);
        numAmp = findViewById(R.id.numX);
        numDel = findViewById(R.id.numDel);
        numSqrt = findViewById(R.id.numSqrt);
        numSqr = findViewById(R.id.numSqr);
        numEqual = findViewById(R.id.numEqual);

        num0.setOnClickListener(this);
        num1.setOnClickListener(this);
        num2.setOnClickListener(this);
        num3.setOnClickListener(this);
        num4.setOnClickListener(this);
        num5.setOnClickListener(this);
        num6.setOnClickListener(this);
        num7.setOnClickListener(this);
        num8.setOnClickListener(this);
        num9.setOnClickListener(this);
        dot.setOnClickListener(this);
        numC.setOnClickListener(this);
        numPlus.setOnClickListener(this);
        numMinus.setOnClickListener(this);
        numDev.setOnClickListener(this);
        numAmp.setOnClickListener(this);
        numDel.setOnClickListener(this);
        numSqrt.setOnClickListener(this);
        numSqr.setOnClickListener(this);
        numEqual.setOnClickListener(this);

    }

    @SuppressLint({"DefaultLocale", "NonConstantResourceId"})
    @Override
    public void onClick(View view) {
        switch (view.getId()){
            case R.id.num0:
            case R.id.num1:
            case R.id.num2:
            case R.id.num3:
            case R.id.num4:
            case R.id.num5:
            case R.id.num6:
            case R.id.num7:
            case R.id.num8:
            case R.id.numDot:
            case R.id.num9:
                Button button = (Button) view;

                String numText = result.getText().toString();
                numText += button.getText().toString();
                result.setText(numText);
                break;
            case R.id.numC:
            case R.id.numDel:
                result.setText("");
                break;
            case R.id.numSqr:
                result.setText(String.format("%f",Math.pow(Double.parseDouble(result.getText().toString()),2)));
                break;
            case R.id.numSqrt:
                result.setText(String.format("%f",Math.sqrt(Double.parseDouble(result.getText().toString()))));
                break;
            case R.id.numDevision:
            case R.id.numMinus:
            case R.id.numPlus:
            case R.id.numX:
                Button button1 = (Button) view;
                firstNum = Double.parseDouble(result.getText().toString());
                act = button1.getText().toString();
                result.setText("");
                break;
            case R.id.numEqual:
                secondNum = Double.parseDouble(result.getText().toString());
                switch (act){
                    case "+":
                        result.setText(String.format("%f",firstNum+secondNum));
                        break;
                    case "-":
                        result.setText(String.format("%f",firstNum-secondNum));
                        break;
                    case "х":
                        result.setText(String.format("%f",firstNum*secondNum));
                        break;
                    case "/":
                        result.setText(String.format("%f",firstNum/secondNum));
                        break;
                }

        }

    }
}