package com.example.siesattendance;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class SubjectList extends AppCompatActivity {
    ListView lv;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        try{
            setContentView(R.layout.activity_subject_list);
            lv=(ListView)findViewById(R.id.listView);
            String arr[]=new String[7];
            for(int i=0;i<7;i++){
                arr[i]="IT0"+(i+1);
            }
            ArrayAdapter<String> arrayAdapter=new ArrayAdapter<String>(this,R.layout.support_simple_spinner_dropdown_item,arr);
            lv.setAdapter(arrayAdapter);
            lv.setOnItemClickListener(new AdapterView.OnItemClickListener() {
                @Override
                public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                    Intent intent=new Intent(SubjectList.this,AttendanceActivity.class);
                    intent.putExtra("position",position+"");
                    startActivity(intent);
                }
            });
        }catch(Exception e){
            Log.e("Exception is" ,e.toString());
        }
    }

}
