package com.example.android.practice;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class NumbersActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_numbers);
    }

    public void openMain(View view) {
        Intent openMain = new Intent(this, MainActivity.class);
        startActivity(openMain);
    }

    public void sendMail(View view) {
        //composeEmail(new String[]{"ahmed.razic@gmail.com"}, "Order for coffee", "Body of e-mail");
        openWebPage("http://www.stackoverflow.com");
    }

    public void composeEmail(String[] addresses, String subject, String message) {
        Intent mail = new Intent(Intent.ACTION_SEND);
        mail.setType("*/*");
        mail.putExtra(Intent.EXTRA_EMAIL, addresses);
        mail.putExtra(Intent.EXTRA_SUBJECT, subject);
        mail.putExtra(Intent.EXTRA_TEXT, message);
        if (mail.resolveActivity(getPackageManager()) != null) {
            startActivity(mail);
        }
    }

    public void openWebPage(String url) {
        Uri webpage = Uri.parse(url);
        Intent web = new Intent(Intent.ACTION_VIEW, webpage);
        startActivity(web);
    }
}






