package com.hfad.doctorapp;

import static android.widget.Toast.LENGTH_SHORT;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatTextView;

import com.google.android.material.textfield.TextInputLayout;

public class MainActivity extends AppCompatActivity {
    //todo should be private
    ImageView userLogo;
    AppCompatTextView viewAll;
    TextInputLayout endIcon;
    private int duration = LENGTH_SHORT;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //todo redundant cast
        userLogo = (ImageView) findViewById(R.id.user_account_logo);
        //todo it is better to put it in separate methods
        setOnUserLogoClick();
        viewAll = findViewById(R.id.view_all);
        viewAll.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                CharSequence popUpText = "View all";
                int duration = LENGTH_SHORT;
                Toast toast = Toast.makeText(MainActivity.this, popUpText, duration);
                toast.show();
            }
        });
        endIcon = findViewById(R.id.text_input_field);
        endIcon.setEndIconOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                CharSequence popUpText = "Search info";
                int duration = LENGTH_SHORT;
                Toast toast = Toast.makeText(MainActivity.this, popUpText, duration);
                toast.show();
            }
        });
    }

    private void setOnUserLogoClick() {
        userLogo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //todo it is better to use String
                CharSequence popUpText = "Logo";
                //todo should be a common variable
                int duration = LENGTH_SHORT;
                Toast.makeText(MainActivity.this, popUpText, LENGTH_SHORT).show();
            }
        });
    }


    public void buttonClicked(View view) {
        if (view.getId() == R.id.button_consultation) {
            CharSequence popUpText = "Consultation";
            int duration = LENGTH_SHORT;
            Toast toast = Toast.makeText(MainActivity.this, popUpText, duration);
            toast.show();
        } else if (view.getId() == R.id.button_dental) {
            CharSequence popUpText = "Dental";
            int duration = LENGTH_SHORT;
            Toast toast = Toast.makeText(MainActivity.this, popUpText, LENGTH_SHORT);
            toast.show();
        } else if (view.getId() == R.id.button_heart) {
            CharSequence popUpText = "Heart";
            int duration = LENGTH_SHORT;
            Toast toast = Toast.makeText(MainActivity.this, popUpText, duration);
            toast.show();

        } else if (view.getId() == R.id.button_hospitals) {
            CharSequence popUpText = "Hospitals";
            int duration = LENGTH_SHORT;
            Toast toast = Toast.makeText(MainActivity.this, popUpText, duration);
            toast.show();

        } else if (view.getId() == R.id.button_medicines) {
            CharSequence popUpText = "Medicines";
            int duration = LENGTH_SHORT;
            Toast toast = Toast.makeText(MainActivity.this, popUpText, duration);
            toast.show();
        } else if (view.getId() == R.id.button_physician) {
            CharSequence popUpText = "Physician";
            int duration = LENGTH_SHORT;
            Toast toast = Toast.makeText(MainActivity.this, popUpText, duration);
            toast.show();
        } else if (view.getId() == R.id.button_skin) {
            CharSequence popUpText = "Skin";
            int duration = LENGTH_SHORT;
            Toast toast = Toast.makeText(MainActivity.this, popUpText, duration);
            toast.show();
        } else if (view.getId() == R.id.button_surgeon) {
            CharSequence popUpText = "Surgeon";
            int duration = LENGTH_SHORT;
            Toast toast = Toast.makeText(MainActivity.this, popUpText, duration);
            toast.show();
        }
    }

    //todo incomprehensible naming
    public void menuSendwichButtonClicked(View view) {
        CharSequence popUpText = "Additional menu options";
        int duration = LENGTH_SHORT;
        Toast toast = Toast.makeText(MainActivity.this, popUpText, duration);
        toast.show();

    }

    //todo incomprehensible naming
    public void openButtonClicked(View view) {
        CharSequence popUpText = "Open description of this doctor";
        int duration = LENGTH_SHORT;
        Toast toast = Toast.makeText(MainActivity.this, popUpText, duration);
        toast.show();
    }
}