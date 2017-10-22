package com.example.myproject1;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.ListView;

import com.example.myproject1.Listview.Notice_ListViewAdapter;

public class NoticeActivity extends AppCompatActivity {

    private ListView mLv1;
    private Button noticeleftBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_notice);
        mLv1 = (ListView) findViewById(R.id.lv_notice);
        mLv1.setAdapter(new Notice_ListViewAdapter(NoticeActivity.this));
        noticeleftBtn = (Button) findViewById(R.id.btn_notice_back);
        noticeleftBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });
    }
}
