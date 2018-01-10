package com.example.rayan.habitatforhumanityandroid;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    Button volunteer;
    Button donation;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        setTitle("Habitat for Humanity SKC");

        volunteer = (Button) findViewById(R.id.btnVolunteer);
        donation = (Button) findViewById(R.id.btnDonation);

        volunteer.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent newAct = new Intent(MainActivity.this, VolunteerInfo.class);
                startActivity(newAct);
            }
        });

        donation.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent newAct = new Intent(MainActivity.this, DonationFirst.class);
                startActivity(newAct);
            }
        });
    }
}
