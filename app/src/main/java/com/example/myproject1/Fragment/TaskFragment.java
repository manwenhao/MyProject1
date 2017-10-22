package com.example.myproject1.Fragment;

import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import com.example.myproject1.Listview.Notice_ListViewAdapter;
import com.example.myproject1.Listview.Task_ListViewAdapter;
import com.example.myproject1.R;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


public class TaskFragment extends Fragment {

    private ListView listView;

    public TaskFragment() {

    }

    public static TaskFragment newInstance() {
        TaskFragment fragment = new TaskFragment();
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_task, container, false);
        listView = (ListView)view.findViewById(R.id.lv_task);
        List<Map<String, Object>> list=getData();
        listView.setAdapter(new Task_ListViewAdapter(getActivity(), list));
        return view;
    }

    public List<Map<String, Object>> getData(){
        List<Map<String, Object>> list=new ArrayList<Map<String,Object>>();
        for (int i = 0; i < 10; i++) {
            Map<String, Object> map = new HashMap<String, Object>();
            map.put("image", R.drawable.task_pic);
            map.put("title", "工单标题");
            map.put("time", "10月3日 13:00");
            map.put("info", "工单详细信息");
            list.add(map);
        }
        return list;
    }

}
