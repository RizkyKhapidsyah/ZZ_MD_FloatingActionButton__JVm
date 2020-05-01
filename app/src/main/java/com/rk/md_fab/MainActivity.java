package com.rk.md_fab;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.google.android.material.floatingactionbutton.FloatingActionButton;

public class MainActivity extends AppCompatActivity {

    TextView TV_1_IDJAVA;
    FloatingActionButton FAB_1_MD_IDJAVA;
    Intent Activity2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TV_1_IDJAVA = findViewById(R.id.TV_1_IDXML);
        FAB_1_MD_IDJAVA = findViewById(R.id.FAB_1_MD_IDXML);

        FAB_1_MD_IDJAVA.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Activity2 = new Intent(getApplicationContext(), Main2Activity.class);
                startActivity(Activity2);
            }
        });

    }
}
