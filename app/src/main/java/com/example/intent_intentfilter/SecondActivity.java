package com.example.intent_intentfilter;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

import java.io.Serializable;

public class SecondActivity extends AppCompatActivity {

    private Button btnBack;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        btnBack = findViewById(R.id.btnBack);  // 1,2,3

//        btnBack.setOnClickListener(view -> { // 1
//            finish();
////            finishAffinity(); // hamma ochilgan oynalardi yopadi
//        });

//        Intent intent = getIntent();  // 2
//        String first = intent.getStringExtra("first");
//        String last = intent.getStringExtra("last");
//        btnBack.setText(first +" "+ last);

        Intent intent = getIntent();

        Bundle b = intent.getBundleExtra("b");  // bundle orqali malumotni qabul qilish
        String first = b.getString("first");
        String last = b.getString("last");
        btnBack.setText(first + " " + last);

        User user = (User) intent.getSerializableExtra("user");
        btnBack.setText(user.getName() + " " + user.getLastName());

    }
}