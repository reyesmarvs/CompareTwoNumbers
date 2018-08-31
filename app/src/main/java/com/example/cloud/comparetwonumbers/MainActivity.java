package com.example.cloud.comparetwonumbers;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    EditText input1;
    EditText input2;
    TextView result;
    Button button1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        input1 = (EditText) findViewById(R.id.editText);
        input2 = (EditText) findViewById(R.id.editText2);
        result = (TextView) findViewById(R.id.textView);
        button1 = (Button) findViewById(R.id.button);

        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int firstNum = Integer.parseInt(input1.getText().toString());
                int secondNum = Integer.parseInt(input2.getText().toString());

                if(firstNum<secondNum){
                    result.setText(secondNum + " is greater than " + firstNum);
                }else if(firstNum>secondNum){
                    result.setText(firstNum + " is greater than " + secondNum);
                }else if(firstNum==secondNum){
                    result.setText(firstNum + " is equal to " + secondNum);
                }
            }
        });
    }
}
