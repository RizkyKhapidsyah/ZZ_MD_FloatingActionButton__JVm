package com.rk.md_fab;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.google.android.material.button.MaterialButton;

public class Main2Activity extends AppCompatActivity {

    MaterialButton B_2_IDJAVA;
    Intent Activity1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        B_2_IDJAVA = findViewById(R.id.B_2_IDXML);
        B_2_IDJAVA.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Activity1 = new Intent(getApplicationContext(), MainActivity.class);
                startActivity(Activity1);
            }
        });
    }
}
