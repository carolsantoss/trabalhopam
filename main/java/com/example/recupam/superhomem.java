package com.example.recupam;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;

public class superhomem extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_superhomem);


    }

    public void Visualizar(View view) {
        Uri uri = Uri.parse("https://www.dccomics.com/characters/superman");
        Intent it = new Intent(Intent.ACTION_VIEW, uri);
        startActivity(it);
    }

}