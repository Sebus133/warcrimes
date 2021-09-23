package com.example.krootko;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void wyslij(View view){
        EditText edit=findViewById(R.id.edit);
        String tekst = edit.getText().toString();

        Intent intent = new Intent(this,RecieveActivity.class);
        intent.putExtra("wiadomosc", tekst);
        startActivity(intent);

    }
}