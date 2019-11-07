package com.example.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    Button btn1, btn2, btn3, btnCong;
    EditText textEdit;
    TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btn1.findViewById(R.id.btn1);
        btn2.findViewById(R.id.btn2);
        btn3.findViewById(R.id.btn3);
        btnCong.findViewById(R.id.btnCong);
        textEdit.findViewById(R.id.textEdit);
        textView.findViewById(R.id.result);

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textEdit.setText(textEdit.getText() + "1");
            }
        });

        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textEdit.setText(textEdit.getText() + "2");
            }
        });

        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textEdit.setText(textEdit.getText() + "3");
            }
        });

        btnCong.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String str = textEdit.getText().toString();
                String [] arr = str.split("\\ +");
                int sum = 0;
                for (int i = 0; i < arr.length; i++) {
                    sum += Integer.parseInt(arr[i]);
                }
                textView.setText(sum);
            }
        });
    }
}
