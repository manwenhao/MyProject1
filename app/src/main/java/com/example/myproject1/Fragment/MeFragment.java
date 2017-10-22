package com.example.myproject1.Fragment;


import android.app.Fragment;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;


import com.example.myproject1.BindPhoneActivity;
import com.example.myproject1.LoginActivity;
import com.example.myproject1.MainActivity;
import com.example.myproject1.MyInformationActivity;
import com.example.myproject1.NoticeActivity;
import com.example.myproject1.R;
import com.example.myproject1.ResetPasswordActivity;

public class MeFragment extends Fragment {

    private Button meResetpwBtn;
    private Button meBindphoneBtn;
    private Button meExitloginBtn;
    private Button meNoticeBtn;
    private Button meInfoBtn;

    public MeFragment() {

    }

    public static MeFragment newInstance() {
        MeFragment fragment = new MeFragment();
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_me, container, false);
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);

        //跳转到公告界面
        meNoticeBtn = (Button) getActivity().findViewById(R.id.btn_me_notice);
        meNoticeBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(),NoticeActivity.class);
                startActivity(intent);
            }
        });
        //跳转到个人信息界面
        meInfoBtn = (Button) getActivity().findViewById(R.id.btn_my_infomation);
        meInfoBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), MyInformationActivity.class);
                startActivity(intent);
            }
        });
        //跳转到修改密码界面
        meResetpwBtn = (Button) getActivity().findViewById(R.id.btn_me_reset_pw);
        meResetpwBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(),ResetPasswordActivity.class);
                startActivity(intent);
            }
        });
        //跳转到绑定手机界面
        meBindphoneBtn = (Button) getActivity().findViewById(R.id.btn_me_bind_phone);
        meBindphoneBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(),BindPhoneActivity.class);
                startActivity(intent);
            }
        });
        //退出登录
        meExitloginBtn = (Button) getActivity().findViewById(R.id.btn_me_exit_login);
        meExitloginBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(),LoginActivity.class);
                startActivity(intent);
            }
        });
    }
}