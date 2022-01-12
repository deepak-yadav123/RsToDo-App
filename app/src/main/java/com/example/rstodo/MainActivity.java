package com.example.rstodo;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity<text> extends AppCompatActivity {
    TextView text;
    EditText n1;
    Button button;
    double d=72.99;
   /* void MoveDollar(View view){
        Intent intent = new Intent(MainActivity.this,DollarActivity.class);
        startActivity(intent);
    }*/

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toast.makeText(this, "Hello Deepak !!", Toast.LENGTH_SHORT).show();
        text = findViewById(R.id.text);
        n1 = findViewById(R.id.n1);
        button = findViewById(R.id.button);

        button.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                double dollar=Integer.parseInt(n1.getText().toString())/d;
                text.setText((String.format("The Converted Money To Dollar is : %.2f$", dollar)));
            }

        });


    }
}
