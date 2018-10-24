package com.samsung.barracudapff.androidtesting;

import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class TestEditTextActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_test_edit_text);

        final TextView textPreview = findViewById(R.id.textPreview);
        final EditText editText = findViewById(R.id.editText);

        Button button = findViewById(R.id.button_show_text);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String text = editText.getText().toString();
                textPreview.setText(text);
            }
        });

        Button buttonToast = findViewById(R.id.buttonToast);
        buttonToast.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getBaseContext(), "Simple Toast here", Toast.LENGTH_SHORT).show();
            }
        });

        Button buttonToastNew = findViewById(R.id.buttonNewToast);
        buttonToastNew.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast toast = Toast.makeText(getBaseContext(), "Toast with custom gravity here", Toast.LENGTH_SHORT);
                toast.setGravity(Gravity.TOP, 0, 0);
                toast.show();
            }
        });

        Button buttonSnackbar = findViewById(R.id.buttonSnackbar);
        buttonSnackbar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Snackbar.make(v,"Snack bar from material design",Snackbar.LENGTH_SHORT).show();
            }
        });

        Button buttonCoolSnackbar = findViewById(R.id.buttonCoolSnackbar);
        buttonCoolSnackbar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Snackbar snackbar = Snackbar
                        .make(v, "Message is deleted", Snackbar.LENGTH_LONG)
                        .setAction("UNDO", new View.OnClickListener() {
                            @Override
                            public void onClick(View view) {
                                Snackbar snackbar1 = Snackbar.make(view, "Message is restored!", Snackbar.LENGTH_SHORT);
                                snackbar1.show();
                            }
                        });

                snackbar.show();
            }
        });

        Button buttonNext = findViewById(R.id.button_next);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                MainActivity.start(TestEditTextActivity.this, TestLayoutActivity.class);
            }
        });
    }
}
