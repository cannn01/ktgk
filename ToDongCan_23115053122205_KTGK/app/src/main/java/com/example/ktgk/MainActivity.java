package com.example.ktgk;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;


public class MainActivity extends AppCompatActivity {

    private Button button;
    private EditText editTextTextPassword, editTextText;
    private TextView textView4;
    private  final String VALID_USER = "ToDongCan";
    private  final String VALID_PASS = "23115053122205";
    @Override
    protected void onCreate (Bundle savedInstanceState){
       super.onCreate(savedInstanceState);
       setContentView(R.layout.activity_main);

       editTextText = findViewById(R.id.editTextText);
       editTextTextPassword= findViewById((R.id.editTextTextPassword);
       button = findViewById(R.id.button);
       textView4 = findViewById(R.id.textView4);

       button.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View v) {
               String u = editTextText.getText().toString().trim();
               String p = editTextTextPassword.getText().toString().trim();
               if (TextUtils.isEmpty(u)|| TextUtils.isEmpty(p)){
                   textView4.setText("Vui long nhap day du thong tin");
                   textView4.setVisibility(View.VISIBLE);
                   return;
               }
               if (u.equals(VALID_USER) && p.equals(VALID_PASS)){
                   Intent intent = new Intent( MainActivity.this, ManHinh2.class);
                   intent.putExtra("username", u);
                   intent.putExtra("password", p);

                   textView4.setVisibility(View.GONE);
               }
               else {
                   textView4.setText("Sai tai khoang hoac mat khau");
                   textView4.setVisibility(View.VISIBLE);
               }
           }
       });
    }

}