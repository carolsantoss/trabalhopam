package com.example.recupam;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.RadioButton;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void ver (View view){
        Intent intent;
        RadioButton flash =findViewById(R.id.rdbflash);
        RadioButton batman =findViewById(R.id.rdbbat);
        RadioButton aquaman =findViewById(R.id.rdbaqm);

        if (flash.isChecked())
            intent = new Intent (this, flash.class);
        else if (batman.isChecked())
            intent = new Intent (this, batman.class);
        else if (aquaman.isChecked())
            intent = new Intent (this, aquaman.class);
        else
            intent = new Intent (this, superhomem.class);

        startActivity(intent);


        }
    }
}

