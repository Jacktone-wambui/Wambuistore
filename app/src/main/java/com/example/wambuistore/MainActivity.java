package com.example.wambuistore;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.material.button.MaterialButton;

import java.net.URI;

public class MainActivity extends AppCompatActivity {

      ImageView facebook,twitter,linkedin;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        getSupportActionBar().hide();
        setContentView(R.layout.activity_main);

        TextView username = ( TextView) findViewById(R.id.username);
        TextView password = (TextView) findViewById(R.id.password);

        MaterialButton loginbtn = (MaterialButton) findViewById(R.id.loginbtn);

        //jackwarren and clinical

        loginbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (username.getText().toString().equals("jackwarren") && password.getText().toString().equals("clinical")) {
                    //correct
                    Toast.makeText(MainActivity.this, "LOGIN SUCCESSFULL", Toast.LENGTH_SHORT).show();
                } else
                    //incorrect
                    Toast.makeText(MainActivity.this, "LOGIN FAIL!!!", Toast.LENGTH_SHORT).show();
            }
        });

        //

        //variables
        facebook = findViewById(R.id.facebook);
        twitter = findViewById(R.id.twitter);
        linkedin = findViewById(R.id.linkedin);
        //we are now setting an onclick
        facebook.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                gotoUrl("https://www.facebook.com");
            }
        });
        twitter.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                gotoUrl("https://www.twitter.com");
            }
        });
        linkedin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                gotoUrl("https://www.linkedin.com");
            }
        });
    }

    private void gotoUrl(String s) {
       Uri uri = Uri.parse(s);
       startActivity(new Intent(Intent.ACTION_VIEW,uri));
    }

}