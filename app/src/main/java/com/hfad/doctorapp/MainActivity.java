package com.hfad.doctorapp;

import androidx.appcompat.app.AppCompatActivity;

import android.media.Image;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    ImageView userLogo;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        userLogo =  (ImageView)findViewById(R.id.user_account_logo);
        userLogo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                CharSequence popUpText = "Всплывающий текст";
                int duration = Toast.LENGTH_SHORT;
                 Toast toast = Toast.makeText(MainActivity.this, popUpText, duration);
                toast.show();

            }
        });
    }

}