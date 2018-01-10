package com.example.rayan.habitatforhumanityandroid;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class VolunteerInfo extends AppCompatActivity {

    Button sendEmail;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_volunteer_info);

        setTitle("Volunteer Info");

        sendEmail = (Button) findViewById(R.id.btnEmail);
        sendEmail.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                /* just in case
                Intent intent = new Intent(Intent.ACTION_SEND);
                intent.setType("message/rfc822");
                intent.putExtra(Intent.EXTRA_EMAIL, "volunteer@habitatskc.org");
                intent.putExtra(Intent.EXTRA_SUBJECT, "I'm interested in Volunteering");
                intent.putExtra(Intent.EXTRA_TEXT, "Hello Habitat for Humanity! \nI am interested in volunteering for these times and locations:\n\n\nThanks!");

                startActivity(Intent.createChooser(intent, "Send Email"));
                */
                Intent emailIntent = new Intent(Intent.ACTION_SENDTO, Uri.fromParts(
                        "mailto","volunteer@habitatskc.org", null));
                emailIntent.putExtra(Intent.EXTRA_SUBJECT, "I'm interested in Volunteering");
                emailIntent.putExtra(Intent.EXTRA_TEXT, "Hello Habitat for Humanity! I am interested in volunteering for these times and locations:");
                startActivity(Intent.createChooser(emailIntent, "Send email..."));
            }
        });
    }
}
