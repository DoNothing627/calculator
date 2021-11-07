package com.example.android.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.TextView;

import java.util.Stack;

public class MainActivity extends AppCompatActivity {

    public static long res= 0;
    public static String text= "";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView textView= findViewById(R.id.textView);
        TextView textView2= findViewById(R.id.textView2);

        findViewById(R.id.button27).setBackgroundColor(0xFFF);
        findViewById(R.id.button).setBackgroundColor(0xFFF);
        findViewById(R.id.button25).setBackgroundColor(0xFFF);
        findViewById(R.id.button26).setBackgroundColor(0xFFF);
        findViewById(R.id.button4).setBackgroundColor(0xFFF);
        //findViewById(R.id.button5).setBackgroundColor(0xFFF);
        findViewById(R.id.button6).setBackgroundColor(0xFFF);
        findViewById(R.id.button7).setBackgroundColor(0xFFF);
        //findViewById(R.id.button8).setBackgroundColor(0xFFF);
        findViewById(R.id.button9).setBackgroundColor(0xFFF);
        findViewById(R.id.button10).setBackgroundColor(0xFFF);
        findViewById(R.id.button11).setBackgroundColor(0xFFF);
        findViewById(R.id.button12).setBackgroundColor(0xFFF);
        findViewById(R.id.button13).setBackgroundColor(0xFFF);
        findViewById(R.id.button14).setBackgroundColor(0xFFF);
        findViewById(R.id.button15).setBackgroundColor(0xFFF);
        findViewById(R.id.button16).setBackgroundColor(0xFFF);
        findViewById(R.id.button17).setBackgroundColor(0xFFF);
        findViewById(R.id.button18).setBackgroundColor(0xFFF);
        findViewById(R.id.button19).setBackgroundColor(0xFFF);
        findViewById(R.id.button20).setBackgroundColor(0xFFF);
        findViewById(R.id.button21).setBackgroundColor(0xFFF);
        findViewById(R.id.button22).setBackgroundColor(0xFFF);
        findViewById(R.id.button23).setBackgroundColor(0xFFF);
        findViewById(R.id.button24).setBackgroundColor(0xFFF);

        findViewById(R.id.button4).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                text= text+ "0";
                textView.setText(String.valueOf(text));
            }
        });

        findViewById(R.id.button).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                text= text+ "1";
                textView.setText(String.valueOf(text));
            }
        });

        findViewById(R.id.button12).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                text= text+ "2";
                textView.setText(String.valueOf(text));
            }
        });

        findViewById(R.id.button11).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                text= text+ "3";
                textView.setText(String.valueOf(text));
            }
        });

        findViewById(R.id.button13).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                text= text+ "4";
                textView.setText(String.valueOf(text));
            }
        });

        findViewById(R.id.button9).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                text= text+ "5";
                textView.setText(String.valueOf(text));
            }
        });

        findViewById(R.id.button14).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                text= text+ "6";
                textView.setText(String.valueOf(text));
            }
        });

        findViewById(R.id.button19).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                text= text+ "7";
                textView.setText(String.valueOf(text));
            }
        });

        findViewById(R.id.button18).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                text= text+ "8";
                textView.setText(String.valueOf(text));
            }
        });

        findViewById(R.id.button17).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                text= text+ "9";
                textView.setText(String.valueOf(text));
            }
        });

        findViewById(R.id.button10).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                text= text+ "+";
                textView.setText(String.valueOf(text));
            }
        });

        findViewById(R.id.button15).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                text= text+ "-";
                textView.setText(String.valueOf(text));
            }
        });

        findViewById(R.id.button16).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                text= text+ "*";
                textView.setText(String.valueOf(text));
            }
        });

        findViewById(R.id.button26).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                text= text+ ":";
                textView.setText(String.valueOf(text));
            }
        });

        findViewById(R.id.button27).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                text= text.substring(0, text.length()-1);
                textView.setText(String.valueOf(text));
            }
        });

        findViewById(R.id.button24).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                text= text.substring(0, text.length()-1);
                textView.setText(String.valueOf(text));
            }
        });

        findViewById(R.id.button23).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                text= "";
                textView.setText(String.valueOf(text));
            }
        });


        findViewById(R.id.button5).setOnClickListener(new View.OnClickListener() {
            char dau;
            @Override
            public void onClick(View view) {

                long p1= 0, p2= 0;
                for(int i= 0; i< text.length(); i++) {
                    if (text.charAt(i) == '+' || text.charAt(i) == '-' || text.charAt(i) == '*' || text.charAt(i) == ':') {
                        dau = text.charAt(i);
                        p1= p2;
                        p2= 0;
                    } else p2 = p2 * 10 + Integer.parseInt(String.valueOf(text.charAt(i)));
                }

                if(dau== '+') p2= p2+ p1;
                if(dau== '-') p2= p1- p2;
                if(dau== '*') p2= p2* p1;
                if(dau== ':') p2= p1/ p2;

                textView2.setText(String.valueOf((p2)));
            }
        });
    }
}