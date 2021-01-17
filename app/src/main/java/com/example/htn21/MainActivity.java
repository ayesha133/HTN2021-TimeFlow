package com.example.htn21;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;


import java.text.DateFormat;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        configureFocusModeBtn();

    }


    // create new event
    public void addEvent(View view) {

        DateFormat df = DateFormat.getDateInstance();

        EditText editText_eventType = (EditText) findViewById(R.id.editText_eventType);
        EditText editText_Comments = (EditText) findViewById(R.id.editText_Comments);
        EditText editText_Date = (EditText) findViewById(R.id.editText_Date);

        String type = editText_eventType.getText().toString();
        String comments = editText_Comments.getText().toString();
        String date = editText_Date.getText().toString();
    }

    private void configureFocusModeBtn() {
        Button btn_focusMode = (Button) findViewById(R.id.btn_focusMode);
        btn_focusMode.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, FocusMode.class));
            }
        });

    }

}