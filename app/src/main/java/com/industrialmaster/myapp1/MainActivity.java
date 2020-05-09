package com.industrialmaster.myapp1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void convert(View v){
        EditText et1 = findViewById(R.id.editText);
        EditText et2 = findViewById(R.id.editText2);
        String text = et1.getText().toString();
        double usd = Double.parseDouble(text);
        double lkr = usd * 180;
        et2.setText(String.valueOf(lkr));

        Toast.makeText(this, "Helloooo", Toast.LENGTH_SHORT).show();
    }
}