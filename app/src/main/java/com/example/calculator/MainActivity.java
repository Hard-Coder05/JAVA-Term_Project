//Main file with code
package com.example.calculator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private Button one;
    private Button two;
    private Button three;
    private Button four;
    private Button five;
    private Button six;
    private Button seven;
    private Button eight;
    private Button nine;
    private Button zero;
    private Button add;
    private Button mul;
    private Button equals;
    private Button clr;
    private Button sub;
    private Button div;
    private TextView info;
    private TextView chodu;
    private double val1=Double.NaN;
    private char val2 ='+';
    private double res =0;
    private int i=1;
    private int p=1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        setupUIViews();


        zero.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(p!=1){
                    info.setText("");
                    chodu.setText("");
                    val1=Double.NaN;
                    val2 ='+';
                    res =0;
                    p=1;
                }
                info.setText(info.getText().toString()+"0");
                chodu.setText(chodu.getText().toString()+"0");
                val1 = Double.parseDouble(chodu.getText().toString());
                i=1;
            }
        });
        clr.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                info.setText("");
                chodu.setText("");
                res=0;
                val1=Double.NaN;
                val2='+';
                i=1;
            }
        });
        equals.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(!Double.isNaN(val1)){
                    compute();
                    info.setText(""+res);
                chodu.setText(""+res);
                //res=0;
                val1=Double.NaN;
                    i=1;
                val2='+';
                p=0;}
                else{
                    info.setText(""+res);
                    chodu.setText(""+res);
                    p=0;
                }
            }
        });
        one.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(p!=1){
                    info.setText("");
                    chodu.setText("");
                    val1=Double.NaN;
                    val2 ='+';
                    res =0;
                    p=1;
                }
                info.setText(info.getText().toString()+"1");
                chodu.setText(chodu.getText().toString()+"1");
                val1 = Double.parseDouble(chodu.getText().toString());
                i=1;
            }
        });
        two.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(p!=1){
                    info.setText("");
                    chodu.setText("");
                    val1=Double.NaN;
                    val2 ='+';
                    res =0;
                    p=1;
                }
                info.setText(info.getText().toString()+"2");
                chodu.setText(chodu.getText().toString()+"2");
                val1 = Double.parseDouble(chodu.getText().toString());
                i=1;
            }
        });
        three.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(p!=1){
                    info.setText("");
                    chodu.setText("");
                    val1=Double.NaN;
                    val2 ='+';
                    res =0;
                    p=1;
                }
                info.setText(info.getText().toString()+"3");
                chodu.setText(chodu.getText().toString()+"3");
                val1 = Double.parseDouble(chodu.getText().toString());
                i=1;
            }
        });
        four.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(p!=1){
                    info.setText("");
                    chodu.setText("");
                    val1=Double.NaN;
                    val2 ='+';
                    res =0;
                    p=1;
                }
                info.setText(info.getText().toString()+"4");
                chodu.setText(chodu.getText().toString()+"4");
                val1 = Double.parseDouble(chodu.getText().toString());
                i=1;
            }
        });
        five.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(p!=1){
                    info.setText("");
                    chodu.setText("");
                    val1=Double.NaN;
                    val2 ='+';
                    res =0;
                    p=1;
                }
                info.setText(info.getText().toString()+"5");
                chodu.setText(chodu.getText().toString()+"5");
                val1 = Double.parseDouble(chodu.getText().toString());
                i=1;
            }
        });
        six.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(p!=1){
                    info.setText("");
                    chodu.setText("");
                    val1=Double.NaN;
                    val2 ='+';
                    res =0;
                    p=1;
                }
                info.setText(info.getText().toString()+"6");
                chodu.setText(chodu.getText().toString()+"6");
                val1 = Double.parseDouble(chodu.getText().toString());
                i=1;
            }
        });
        seven.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(p!=1){
                    info.setText("");
                    chodu.setText("");
                    val1=Double.NaN;
                    val2 ='+';
                    res =0;
                    p=1;
                }
                info.setText(info.getText().toString()+"7");
                chodu.setText(chodu.getText().toString()+"7");
                val1 = Double.parseDouble(chodu.getText().toString());
                i=1;
            }
        });
        eight.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(p!=1){
                    info.setText("");
                    chodu.setText("");
                    val1=Double.NaN;
                    val2 ='+';
                    res =0;
                    p=1;
                }
                info.setText(info.getText().toString()+"8");
                chodu.setText(chodu.getText().toString()+"8");
                val1 = Double.parseDouble(chodu.getText().toString());
                i=1;
            }
        });
        nine.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(p!=1){
                    info.setText("");
                    chodu.setText("");
                    val1=Double.NaN;
                    val2 ='+';
                    res =0;
                    p=1;
                }
                info.setText(info.getText().toString()+"9");
                chodu.setText(chodu.getText().toString()+"9");
                val1 = Double.parseDouble(chodu.getText().toString());
                i=1;
            }
        });
        add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(p!=1){
                    info.setText("");
                    chodu.setText("");
                    val1=Double.NaN;
                    val2 ='+';
                    res =0;
                    p=1;
                }
                if(i!=0) {
                    info.setText(info.getText().toString() + "+");
                    chodu.setText("");
                    compute();
                    val2 = '+';
                    i=0;
                }
            }
        });
        sub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(p!=1){
                    info.setText("");
                    chodu.setText("");
                    val1=Double.NaN;
                    val2 ='+';
                    res =0;
                    p=1;
                }
                if(i!=0){
                info.setText(info.getText().toString()+"-");
                chodu.setText("");
                compute();
                val2='-';
                    i=0;
            }}
        });
        mul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(p!=1){
                    info.setText("");
                    chodu.setText("");
                    val1=Double.NaN;
                    val2 ='+';
                    res =0;
                    p=1;
                }
                if(i!=0){
                info.setText(info.getText().toString()+"*");
                chodu.setText("");
                compute();
                val2='*';
                    i=0;
            }}
        });
        div.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(p!=1){
                    info.setText("");
                    chodu.setText("");
                    val1=Double.NaN;
                    val2 ='+';
                    res =0;
                    p=1;
                }
                if(i!=0){
                info.setText(info.getText().toString()+"/");
                chodu.setText("");
                compute();
                val2='/';
                    i=0;
            }}
        });
    }

    private void setupUIViews(){
        one = (Button)findViewById(R.id.btn1);
        two = (Button)findViewById(R.id.btn2);
        three = (Button)findViewById(R.id.btn3);
        four = (Button)findViewById(R.id.btn4);
        five = (Button)findViewById(R.id.btn5);
        six = (Button)findViewById(R.id.btn6);
        seven = (Button)findViewById(R.id.btn7);
        eight = (Button)findViewById(R.id.btn8);
        nine = (Button)findViewById(R.id.btn9);
        zero = (Button)findViewById(R.id.btn0);
        add = (Button)findViewById(R.id.btnadd);
        sub = (Button)findViewById(R.id.btnmin);
        mul = (Button)findViewById(R.id.btnmul);
        div = (Button)findViewById(R.id.btndiv);
        info = (TextView)findViewById(R.id.btninfo);
        clr = (Button)findViewById(R.id.btnclr);
        equals = (Button)findViewById(R.id.btnequal);
        chodu = (TextView)findViewById(R.id.btnchodu);
    }

    private void compute(){
        if(!Double.isNaN(val1)){
            if(val2=='+'){
            res=res+val1;
            val1=Double.NaN;
        }
        if(val2=='-'){
            res=res-val1;
            val1=Double.NaN;
        }
        if(val2=='*'){
            res=res*val1;
            val1=Double.NaN;
        }
        if(val2=='/'){
            res=res/val1;
            val1=Double.NaN;
        }
    }}
}
