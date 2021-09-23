package com.example.krootko;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class RecieveActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recieve);

        Intent intent = getIntent();
        String tekst=intent.getStringExtra("wiadomosc");

        TextView pole=(TextView) findViewById(R.id.textView);
        pole.setText(tekst);
    }
}