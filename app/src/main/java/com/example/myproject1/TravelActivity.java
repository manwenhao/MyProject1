package com.example.myproject1;

import android.app.DatePickerDialog;
import android.app.Dialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.DatePicker;

import java.util.Calendar;

public class TravelActivity extends AppCompatActivity {

    private Button backBtn;
    private int mYear;
    private int mMonth;
    private int mDay;

    private int nYear;
    private int nMonth;
    private int nDay;

    private Calendar calendar;
    private Button startBtn;
    private Button endBtn;
    private static final int START_DATE = 1;
    private static final int END_DATE = 2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_travel);
        backBtn = (Button) findViewById(R.id.btn_travel_back);
        backBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });

        calendar = Calendar.getInstance();
        mYear = calendar.get(Calendar.YEAR);
        mMonth = calendar.get(Calendar.MONTH);
        mDay = calendar.get(Calendar.DAY_OF_MONTH);

        nYear = calendar.get(Calendar.YEAR);
        nMonth = calendar.get(Calendar.MONTH);
        nDay = calendar.get(Calendar.DAY_OF_MONTH);

        startBtn = (Button) findViewById(R.id.btn_travel_start);
        startBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                showDialog(START_DATE);
            }
        });

        endBtn = (Button) findViewById(R.id.btn_travel_end);
        endBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                showDialog(END_DATE);
            }
        });
    }

    @Override
    protected Dialog onCreateDialog(int id) {
        switch (id) {
            case START_DATE:
                return new DatePickerDialog(this, mDateSetListener, mYear, mMonth,
                        mDay);
            case END_DATE:
                return new DatePickerDialog(this, nDateSetListener, nYear, nMonth,
                        nDay);
        }
        return null;
    }

    @Override
    protected void onPrepareDialog(int id, Dialog dialog) {
        switch (id) {
            case START_DATE:
                ((DatePickerDialog) dialog).updateDate(mYear, mMonth, mDay);
                break;
            case END_DATE:
                ((DatePickerDialog) dialog).updateDate(nYear, nMonth, nDay);
                break;
            default:
                break;
        }
    }

    private void setDateTime() {
        final Calendar c = Calendar.getInstance();
        mYear = c.get(Calendar.YEAR);
        mMonth = c.get(Calendar.MONTH);
        mDay =c.get(Calendar.DAY_OF_MONTH);

        nYear = c.get(Calendar.YEAR);
        nMonth = c.get(Calendar.MONTH);
        nDay =c.get(Calendar.DAY_OF_MONTH);
        //更新Button上显示的日期
        updateDateDisplay();
    }

    private DatePickerDialog.OnDateSetListener mDateSetListener = new DatePickerDialog.OnDateSetListener() {
        @Override
        public void onDateSet(DatePicker view, int year, int monthOfYear,
                              int dayOfMonth) {
            mYear = year;
            mMonth = monthOfYear;
            mDay = dayOfMonth;
            //更新Button上显示的日期
            updateDateDisplay();
        }
    };

    private DatePickerDialog.OnDateSetListener nDateSetListener = new DatePickerDialog.OnDateSetListener() {
        @Override
        public void onDateSet(DatePicker view, int year, int monthOfYear,
                              int dayOfMonth) {
            nYear = year;
            nMonth = monthOfYear;
            nDay = dayOfMonth;
            //更新Button上显示的日期
            updateDateDisplay();
        }
    };

    private void updateDateDisplay() {
        startBtn.setText(new StringBuilder().append(mYear).append("-")
                .append(mMonth + 1).append("-").append(mDay));
        endBtn.setText(new StringBuilder().append(nYear).append("-")
                .append(nMonth + 1).append("-").append(nDay));
    }
}
