package com.example.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;
import android.widget.Toast;

public class SecendActivity extends AppCompatActivity {


    TextView txtGet;
    private  long exit;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_secend);

        txtGet = findViewById(R.id.txt_get);
        Bundle bundle=getIntent().getExtras();
        txtGet.setText(bundle.getString("password","username"));



    }

    @Override
    public void onBackPressed() {
        moveTaskToBack(true);
    }
}
