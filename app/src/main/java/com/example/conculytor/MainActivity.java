package com.example.conculytor;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    EditText editText, editText2;
    Button button, button2, button3, button4;
    TextView textView, textView2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        textView = findViewById(R.id.textView3);
        textView2 = findViewById(R.id.textView1);
        editText = findViewById(R.id.editTextTextPersonName1);
        editText2 = findViewById(R.id.editTextTextPersonName2);
        button = findViewById(R.id.button);
        button2 = findViewById(R.id.button2);
        button3 = findViewById(R.id.button3);
        button4 = findViewById(R.id.button4);
        MyLictener myListener = new MyLictener();
        button.setOnClickListener(myListener);
        MyLictenerM myListenerm = new MyLictenerM();
        button2.setOnClickListener(myListenerm);
        MyLictenerU myListeneru = new MyLictenerU();
        button3.setOnClickListener(myListeneru);
        MyLictenerD myListenerd = new MyLictenerD();
        button4.setOnClickListener(myListenerd);
    }


    class MyLictener implements View.OnClickListener {
        @Override
        public void onClick(View v) {
            int a, b, c;
            String P1 = editText.getText().toString();
            String P2 = editText2.getText().toString();
            a = Integer.parseInt(P1);
            b = Integer.parseInt(P2);
            c = a + b;
            String P = Integer.toString(c);
            textView.setText(P);
            textView2.setText("+");

        }
    }

    class MyLictenerM implements View.OnClickListener {
        @Override
        public void onClick(View v) {
            int a, b, c;
            String P1 = editText.getText().toString();
            String P2 = editText2.getText().toString();
            a = Integer.parseInt(P1);
            b = Integer.parseInt(P2);
            c = a - b;
            String P = Integer.toString(c);
            textView.setText(P);
            textView2.setText("-");
        }
    }

    class MyLictenerU implements View.OnClickListener {
        @Override
        public void onClick(View v) {
            int a, b, c;
            String P1 = editText.getText().toString();
            String P2 = editText2.getText().toString();
            a = Integer.parseInt(P1);
            b = Integer.parseInt(P2);
            c = a * b;
            String P = Integer.toString(c);
            textView.setText(P);
            textView2.setText("*");
        }
    }

    class MyLictenerD implements View.OnClickListener {
        @Override
        public void onClick(View v) {
            Double a, b, c;
            String P1 = editText.getText().toString();
            String P2 = editText2.getText().toString();
            a = Double.parseDouble(P1);
            b = Double.parseDouble(P2);
            c = a / b;
            if (a == 0 || b == 0) {
                textView.setText("You can't delit na 0 ");
            } else {
                String P = Double.toString(c);
                textView.setText(P);
                textView2.setText("/");
            }
        }
    }


}

