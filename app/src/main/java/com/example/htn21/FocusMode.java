package com.example.htn21;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class FocusMode extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_focus_mode);
        
        configureQuitFocusModeButton();
        
    }

    private void configureQuitFocusModeButton() {
        Button quitFocusModeButton = (Button) findViewById(R.id.btn_quitFocusMode);
        quitFocusModeButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });
    }


}