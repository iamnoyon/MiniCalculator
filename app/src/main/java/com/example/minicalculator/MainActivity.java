package com.example.minicalculator;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;

public class MainActivity extends AppCompatActivity {

    private Button btn0,btn1,btn2,btn3,btn4,btn5,btn6,btn7,btn8,btn9,btnPlus,btnMinus, btnMultiply,btnDivision, btnRoot, btnPower, btnPercent, btnClear, btnDot, btnResult;
    private ImageButton backSpace;

    EditText resultView, operationView, inputView;

    private Float mValueone,mValueTwo;
    private String ValueOne, ValueTwo, Operator;
    boolean mAddition, mSubtract, mMultiplication, mDivision;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        Initializer();

        btn0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                inputView.setText(inputView.getText()+"0");
            }
        });

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                inputView.setText(inputView.getText()+"1");
            }
        });

        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                inputView.setText(inputView.getText()+"2");
            }
        });

        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                inputView.setText(inputView.getText()+"3");
            }
        });

        btn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                inputView.setText(inputView.getText()+"4");
            }
        });

        btn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                inputView.setText(inputView.getText()+"4");
            }
        });

        btn5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                inputView.setText(inputView.getText()+"5");
            }
        });

        btn0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                inputView.setText(inputView.getText()+"0");
            }
        });

        btn6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                inputView.setText(inputView.getText()+"6");
            }
        });

        btn7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                inputView.setText(inputView.getText()+"7");
            }
        });

        btn8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                inputView.setText(inputView.getText()+"8");
            }
        });

        btn9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                inputView.setText(inputView.getText()+"9");
            }
        });


        btnPlus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(inputView == null){
                    inputView.setText("");
                }
                else {
                    ValueOne = inputView.getText().toString();
                    mValueone = Float.parseFloat(inputView.getText()+"");
                    mAddition = true;
                    inputView.setText(null);
                }
            }
        });

        btnMinus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(inputView == null){
                    inputView.setText("");
                }
                else {
                    ValueOne = inputView.getText().toString();
                    mValueone = Float.parseFloat(inputView.getText()+"");
                    mSubtract = true;
                    inputView.setText(null);
                }
            }
        });

        btnMultiply.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(inputView == null){
                    inputView.setText("");
                }
                else {
                    ValueOne = inputView.getText().toString();
                    mValueone = Float.parseFloat(inputView.getText()+"");
                    mMultiplication = true;
                    inputView.setText(null);
                }
            }
        });

        btnDivision.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(inputView == null){
                    inputView.setText("");
                }
                else {
                    ValueOne = inputView.getText().toString();
                    mValueone = Float.parseFloat(inputView.getText()+"");
                    mDivision = true;
                    inputView.setText(null);
                }
            }
        });



        btnResult.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                operationView.setText(inputView.getText());
                ValueTwo = inputView.getText().toString();
                mValueTwo = Float.parseFloat(inputView.getText() + "");

                if(mAddition = true){
                    Operator = "+";
                    operationView.setText(ValueOne+Operator+ValueTwo);
                    resultView.setText(mValueone+mValueTwo+"");
                    mAddition=false;

                }

                if(mSubtract = true){
                    Operator = "-";
                    operationView.setText(ValueOne+Operator+ValueTwo);
                    resultView.setText(mValueone-mValueTwo+"");
                    mSubtract=false;

                }

                if(mMultiplication = true){
                    Operator = "*";
                    operationView.setText(ValueOne+Operator+ValueTwo);
                    resultView.setText(mValueone*mValueTwo+"");
                    mMultiplication=false;

                }

                if(mDivision = true){
                    Operator = "/";
                    operationView.setText(ValueOne+Operator+ValueTwo);
                    resultView.setText(mValueone/mValueTwo+"");
                    mDivision=false;

                }
            }
        });




        backSpace.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String str = inputView.getText().toString();
                if(str.length()>0){
                    str = str.substring(0, str.length()-1);
                    inputView.setText(str);
                }
                if(str.length()<=0){
                    inputView.setText(null);
                }
            }
        });

        btnClear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                inputView.setText(null);
                operationView.setText(null);
                resultView.setText(null);
            }
        });

    }



        private void Initializer() {

        btn0 = (Button) findViewById(R.id.btn0);
        btn1 = (Button) findViewById(R.id.btn1);
        btn2 = (Button) findViewById(R.id.btn2);
        btn3 = (Button) findViewById(R.id.btn3);
        btn4 = (Button) findViewById(R.id.btn4);
        btn5 = (Button) findViewById(R.id.btn5);
        btn6 = (Button) findViewById(R.id.btn6);
        btn7 = (Button) findViewById(R.id.btn7);
        btn8 = (Button) findViewById(R.id.btn8);
        btn9 = (Button) findViewById(R.id.btn9);
        btnPlus = (Button) findViewById(R.id.btnPlus);
        btnMinus = (Button) findViewById(R.id.btnMinus);
        btnMultiply = (Button) findViewById(R.id.btnMultiply);
        btnDivision = (Button) findViewById(R.id.btnDivision);
        btnRoot = (Button) findViewById(R.id.btnRoot);
        btnPower = (Button) findViewById(R.id.btnPower);
        btnPercent = (Button) findViewById(R.id.btnPercent);
        btnDot = (Button) findViewById(R.id.btnDot);
        btnClear = (Button) findViewById(R.id.btnClear);
        btnResult = (Button) findViewById(R.id.btnResult);

        backSpace = (ImageButton) findViewById(R.id.backspace);
        resultView = (EditText) findViewById(R.id.resultView);
        operationView = (EditText) findViewById(R.id.operationView);
        inputView = (EditText) findViewById(R.id.inputView);

    }
}
