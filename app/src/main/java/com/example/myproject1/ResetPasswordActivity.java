package com.example.myproject1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class ResetPasswordActivity extends AppCompatActivity {

    private Button resetpwBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_reset_password);
        resetpwBtn = (Button) findViewById(R.id.reset_pw_btn);
        resetpwBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ResetPasswordActivity.this,MainActivity.class);
                startActivity(intent);
            }
        });
    }
}
