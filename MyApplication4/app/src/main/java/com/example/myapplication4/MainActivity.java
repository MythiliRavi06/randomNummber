package com.example.myapplication4;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.LinkedHashSet;
import java.util.Set;

public class MainActivity extends AppCompatActivity {
    private Button button;
    private TextView textview;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        button=findViewById(R.id.button);
        textview=findViewById(R.id.textView2);
        Set<Integer> data = new LinkedHashSet<>();
        int max=10;
        int min=1;
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                int num=(int)Math.floor(Math.random() * (max - min + 1) + min);;
                boolean contains;

                contains = data.contains(num);
                if(!contains)
                {
                    data.add(num);
                    String str = String.valueOf(num);
                    textview.setText(str);
                }
                else {
                    textview.setText("oops");
                }
            }
        });
    }
}

