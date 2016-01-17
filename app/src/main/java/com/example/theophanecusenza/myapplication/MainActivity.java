package com.example.theophanecusenza.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import java.util.Random;

public class MainActivity extends AppCompatActivity  {


    private TextView textView;
    private String[] fruits = {"Apple","Mango","Peach","Banana","Tomato"};
    private Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button = (Button)findViewById(R.id.myButton);
        button.setOnClickListener(
                new Button.OnClickListener() {
                    public void onClick(View v) {
                        fillViews();
                    }
                }
        );
    }

    private void fillViews(){
        String random = (fruits[new Random().nextInt(fruits.length)]);
        textView = (TextView)findViewById(R.id.myTextView);
        textView.setText(random);
    }
}


