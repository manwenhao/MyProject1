package com.example.myproject1.Fragment;


import android.app.Fragment;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import com.example.myproject1.AttendanceActivity;
import com.example.myproject1.LeaveActivity;
import com.example.myproject1.MyInformationActivity;
import com.example.myproject1.R;
import com.example.myproject1.TravelActivity;

public class AttendenceFragment extends Fragment {

    private Button attendenceBtn;
    private Button leaveBtn;
    private Button travelBtn;

    public AttendenceFragment() {

    }

    public static AttendenceFragment newInstance() {
        AttendenceFragment fragment = new AttendenceFragment();
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_attendence, container, false);
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        //跳转到考勤信息界面
        attendenceBtn = (Button) getActivity().findViewById(R.id.btn_attendence);
        attendenceBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), AttendanceActivity.class);
                startActivity(intent);
            }
        });
        //跳转到请假申请界面
        leaveBtn = (Button) getActivity().findViewById(R.id.btn_leave);
        leaveBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), LeaveActivity.class);
                startActivity(intent);
            }
        });
        //跳转到出差申请界面
        leaveBtn = (Button) getActivity().findViewById(R.id.btn_travel);
        leaveBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), TravelActivity.class);
                startActivity(intent);
            }
        });
    }
}
