package com.example.dell.multifunctionapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Seventh extends AppCompatActivity {
    Button b1,b2,b3,b4,b5,b6,b7,b8,b9,b0,b,badd,bsub,bmul,bdiv,breset,bequal;
    TextView t2,t3;
    static Float valueone,valuetwo;
    boolean add,sub,div,mul;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getSupportActionBar().hide();
        setContentView(R.layout.activity_seventh);
        t2=(TextView)findViewById(R.id.textView2);
        t3=(TextView)findViewById(R.id.textView3);
        b1=(Button)findViewById(R.id.button12);
        b2=(Button)findViewById(R.id.button13);
        b3=(Button)findViewById(R.id.button14);
        b4=(Button)findViewById(R.id.button15);
        b5=(Button)findViewById(R.id.button17);
        b6=(Button)findViewById(R.id.button18);
        b7=(Button)findViewById(R.id.button19);
        b8=(Button)findViewById(R.id.button35);
        b9=(Button)findViewById(R.id.button36);
        b0=(Button)findViewById(R.id.button37);
        b=(Button)findViewById(R.id.button38);
        badd=(Button)findViewById(R.id.button39);
        bmul=(Button)findViewById(R.id.button40);
        bdiv=(Button)findViewById(R.id.button41);
        bsub=(Button)findViewById(R.id.button42);
        bequal=(Button)findViewById(R.id.button43);
        breset=(Button)findViewById(R.id.button44);
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                t2.setText(t2.getText()+"1");

            }
        });
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                t2.setText(t2.getText()+"2");

            }
        });
        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                t2.setText(t2.getText()+"3");

            }
        });
        b4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                t2.setText(t2.getText()+"4");

            }
        });
        b5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                t2.setText(t2.getText()+"5");

            }
        });
        b6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                t2.setText(t2.getText()+"6");

            }
        });
        b7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                t2.setText(t2.getText()+"7");

            }
        });
        b8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                t2.setText(t2.getText()+"8");

            }
        });
        b9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                t2.setText(t2.getText()+"9");

            }
        });
        b0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                t2.setText(t2.getText()+"0");

            }
        });
        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                t2.setText(t2.getText()+".");

            }
        });
        badd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(t2.getText()==""){
                    t2.setText("");
                }
                else{
                    valueone=Float.parseFloat(t2.getText() + "");
                    t3.setText(t2.getText() + " +");
                    add=true;
                    t2.setText("");
                }
            }
        });
        bsub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(t2.getText()==""){
                    t2.setText("");
                }
                else{
                    valueone=Float.parseFloat(t2.getText() + "");
                    t3.setText(t2.getText() + " -");
                    sub=true;
                    t2.setText("");
                }
            }
        });
        bmul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(t2.getText()==""){
                    t2.setText("");
                }
                else{
                    valueone=Float.parseFloat(t2.getText() + "");
                    t3.setText(t2.getText() + " *");
                    mul=true;
                    t2.setText("");
                }
            }
        });
        bdiv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(t2.getText()==""){
                    t2.setText("");
                }
                else{
                    valueone=Float.parseFloat(t2.getText() + "");
                    t3.setText(t2.getText() + " /");
                    div=true;
                    t2.setText("");
                }
            }
        });
        breset.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                t2.setText("");
            }
        });
        bequal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                valuetwo=Float.parseFloat(t2.getText()+"");
                if(add==true){

                    t2.setText(valueone + valuetwo +"");
                    t3.setText("");
                    add=false;
                }
                if(sub==true){

                    t2.setText(valueone - valuetwo +"");
                    t3.setText("");
                    sub=false;
                }
                if(mul==true){

                    t2.setText(valueone * valuetwo +"");
                    t3.setText("");
                    mul=false;
                }
                if(div==true){

                    t2.setText(valueone / valuetwo +"");
                    t3.setText("");
                    div=false;
                }

            }
        });

    }
}
