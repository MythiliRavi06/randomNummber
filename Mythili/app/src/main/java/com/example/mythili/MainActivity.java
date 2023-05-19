package com.example.mythili;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private Button r_button;
    private TextView r_textview;
    private EditText r_edittext;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        r_button = findViewById(R.id.b);
        r_textview = findViewById(R.id.tv);
        r_edittext = findViewById(R.id.et);
        r_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String name = r_edittext.getText().toString();
                if (name.length() > 0) {
                    Intent home=new Intent(getApplicationContext(), MainActivity2.class);
                    home.putExtra("key",name);
                    startActivity(home);

                } else {
                    Toast toast = Toast.makeText(getApplicationContext(), "enter name", Toast.LENGTH_SHORT);
                    toast.show();

                }
            }
        });
    }
}
