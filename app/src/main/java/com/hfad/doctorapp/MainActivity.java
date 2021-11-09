package com.hfad.doctorapp;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.helper.widget.Flow;

import android.media.Image;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.Toast;

import com.google.android.material.textfield.TextInputLayout;

public class MainActivity extends AppCompatActivity {
    ImageView userLogo;
    AppCompatTextView viewAll;
    TextInputLayout endIcon;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        userLogo = (ImageView) findViewById(R.id.user_account_logo);
        userLogo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                CharSequence popUpText = "Logo";
                int duration = Toast.LENGTH_SHORT;
                Toast toast = Toast.makeText(MainActivity.this, popUpText, duration);
                toast.show();

            }
        });
        viewAll = findViewById(R.id.view_all);
        viewAll.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                CharSequence popUpText = "View all";
                int duration = Toast.LENGTH_SHORT;
                Toast toast = Toast.makeText(MainActivity.this, popUpText, duration);
                toast.show();
            }
        });
        endIcon = findViewById(R.id.text_input_field);
        endIcon.setEndIconOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                CharSequence popUpText = "Search info";
                int duration = Toast.LENGTH_SHORT;
                Toast toast = Toast.makeText(MainActivity.this, popUpText, duration);
                toast.show();
            }
        });
    }

    public void buttonClicked(View view) {
        if (view.getId() == R.id.button_consultation) {
            CharSequence popUpText = "Consultation";
            int duration = Toast.LENGTH_SHORT;
            Toast toast = Toast.makeText(MainActivity.this, popUpText, duration);
            toast.show();
        } else if (view.getId() == R.id.button_dental) {
            CharSequence popUpText = "Dental";
            int duration = Toast.LENGTH_SHORT;
            Toast toast = Toast.makeText(MainActivity.this, popUpText, duration);
            toast.show();
        } else if (view.getId() == R.id.button_heart) {
            CharSequence popUpText = "Heart";
            int duration = Toast.LENGTH_SHORT;
            Toast toast = Toast.makeText(MainActivity.this, popUpText, duration);
            toast.show();

        } else if (view.getId() == R.id.button_hospitals) {
            CharSequence popUpText = "Hospitals";
            int duration = Toast.LENGTH_SHORT;
            Toast toast = Toast.makeText(MainActivity.this, popUpText, duration);
            toast.show();

        } else if (view.getId() == R.id.button_medicines) {
            CharSequence popUpText = "Medicines";
            int duration = Toast.LENGTH_SHORT;
            Toast toast = Toast.makeText(MainActivity.this, popUpText, duration);
            toast.show();
        }
        else if (view.getId() == R.id.button_physician) {
            CharSequence popUpText = "Physician";
            int duration = Toast.LENGTH_SHORT;
            Toast toast = Toast.makeText(MainActivity.this, popUpText, duration);
            toast.show();
        }
        else if (view.getId() == R.id.button_skin) {
            CharSequence popUpText = "Skin";
            int duration = Toast.LENGTH_SHORT;
            Toast toast = Toast.makeText(MainActivity.this, popUpText, duration);
            toast.show();
        }
        else if (view.getId() == R.id.button_surgeon) {
            CharSequence popUpText = "Surgeon";
            int duration = Toast.LENGTH_SHORT;
            Toast toast = Toast.makeText(MainActivity.this, popUpText, duration);
            toast.show();
        }
    }

    public void menuSendwichButtonClicked(View view) {
        CharSequence popUpText = "Additional menu options";
        int duration = Toast.LENGTH_SHORT;
        Toast toast = Toast.makeText(MainActivity.this, popUpText, duration);
        toast.show();

    }
}