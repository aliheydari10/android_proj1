package com.example.myapplication;

import android.content.Intent;
import android.support.design.widget.TextInputLayout;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import java.nio.channels.Channels;

public class MainActivity extends AppCompatActivity {


    TextInputLayout txtUser;
    TextInputLayout txtpass;
    Button btnsend;
    ImageView imgProfile;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        txtUser = findViewById(R.id.txt_inp);
        txtpass = findViewById(R.id.txt_inp_pass);
        btnsend = findViewById(R.id.btn_send);
        imgProfile = findViewById(R.id.img_profile);

        btnsend.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (txtUser.getEditText().getText().toString().equals("aliheydari") &&
                        txtpass.getEditText().getText().toString().equals("950261216")){

                    //imgProfile.setVisibility(View.INVISIBLE);


                    Intent intent=new Intent(MainActivity.this,SecendActivity.class);
                    intent.putExtra("username",txtUser.getEditText().getText().toString());
                    intent.putExtra("password",txtpass.getEditText().getText().toString());
                    startActivity(intent);



                }

            }
        });


    }

}
