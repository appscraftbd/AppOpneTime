package com.example.appopentime;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    SharedPreferences sharedPreferences;
    SharedPreferences.Editor editor;

    private TextView textView;

/////////////////////////////////////////
    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        int inte = 1;


        textView = findViewById(R.id.tvdisplay);
        sharedPreferences = getSharedPreferences("data",MODE_PRIVATE);

        String out = sharedPreferences.getString("name","1");
        textView.setText(""+out);

        editor = sharedPreferences.edit();


        int inumber = Integer.parseInt(out);
        inte = inumber+1;
        String in= Integer.toString(inte);
        editor.putString("name",""+in);
        editor.apply();













    }
}