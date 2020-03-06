package com.vCreativeIX.Oracle.baitap1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class SubView extends AppCompatActivity {
    TextView textView;
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sub_view);
        textView = findViewById(R.id.titSub);

        Intent intent = getIntent();
        textView.setText(intent.getStringExtra("Subject"));
    }
}
