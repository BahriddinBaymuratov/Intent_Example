package com.example.intent_intentfilter;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    private Button btn;              // 1, 2, 3,
    private EditText edit1, edit2;   // 2, 3,

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btn = findViewById(R.id.btn); // 1, 2, 3,

        edit1 = findViewById(R.id.edit1);  // 2, 3,
        edit2 = findViewById(R.id.edit2);  // 2, 3,

//        btn.setOnClickListener(view -> { // 1
//            Intent intent = new Intent(this, SecondActivity.class);
//            startActivity(intent);
//        });

//        btn.setOnClickListener(view -> {  // 2
//            String firstName = edit1.getText().toString();
//            String lastName = edit2.getText().toString();
//            Intent intent = new Intent(this, SecondActivity.class);
//            intent.putExtra("first", firstName);
//            intent.putExtra("last", lastName);
//            startActivity(intent);
//        });



        btn.setOnClickListener(view -> {  // 3
            String firstName = edit1.getText().toString();
            String lastName = edit2.getText().toString();

//            Bundle bundle = new Bundle(); // bundle orqali olib o'tish
//            bundle.putString("first", firstName);
//            bundle.putString("last", lastName);

            User user = new User(firstName,lastName);
            Intent intent = new Intent(this, SecondActivity.class);
            intent.putExtra("user", user);
//            intent.putExtra("b", bundle);  // bundle orqali olib o'tish
            startActivity(intent);
        });

    }
}