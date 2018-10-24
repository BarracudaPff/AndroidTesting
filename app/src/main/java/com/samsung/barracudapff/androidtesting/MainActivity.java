package com.samsung.barracudapff.androidtesting;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Toast.makeText(this, "Toast: " + getClass().getSimpleName() + " OnCreate", Toast.LENGTH_SHORT).show();

        Button button = findViewById(R.id.button_next);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                start(MainActivity.this, TestEditTextActivity.class);
            }
        });
    }

    public static void start(Activity activity, Class aClass) {
        Intent starter = new Intent(activity, aClass);
        activity.startActivity(starter);
    }
}
