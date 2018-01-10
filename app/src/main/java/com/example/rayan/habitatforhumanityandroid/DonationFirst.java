package com.example.rayan.habitatforhumanityandroid;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class DonationFirst extends AppCompatActivity {
    Button schedule;
    Button accept;
    Button dontAccept;
    Button hours;
    TextView info;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_donation_first);

        setTitle("Donation Info");

        schedule = (Button) findViewById(R.id.btnSchedule);
        accept = (Button) findViewById(R.id.btnAccept);
        dontAccept = (Button) findViewById(R.id.btnNotAccept);
        hours = (Button) findViewById(R.id.btnHrs);
        info = (TextView) findViewById(R.id.txtInfo);

        schedule.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent newAct = new Intent(DonationFirst.this, WebViewActivity.class);
                newAct.putExtra("website", "http://habitatskc.vonigo.com/external/#0.2775217823539762");
                startActivity(newAct);
            }
        });

        accept.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                info.setText("\n" +
                        "Appliances\n" +
                        "Cabinets\n" +
                        "Doors\n" +
                        "Electrical\n" +
                        "Flooring\n" +
                        "Furniture\n" +
                        "Hardware\n" +
                        "Heating and Cooling\n" +
                        "Insulation\n" +
                        "Lighting\n" +
                        "Lumber/Trim\n" +
                        "Plumbing\n" +
                        "Roofing\n" +
                        "Sheet Goods\n" +
                        "Tile\n" +
                        "Tools\n" +
                        "Windows\n" +
                        "Home Decor/Media\n" +
                        "Yard and Garden");
            }
        });

        hours.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                info.setText("We accept donations on Tuesday to Saturday from 10 AM to 5 PM.");
            }
        });
    }
}
