package com.example.siesattendance;

import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class HomeActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
    }
    public void fn(View view) {
        if(view.getId()==R.id.teacherButton){
            // Toast.makeText(MainActivity.this, "Hello", Toast.LENGTH_SHORT).show();
            Intent intent=new Intent(HomeActivity.this,TeacherLogin.class);
            startActivity(intent);
        }
        else{
            Intent intent2=new Intent(HomeActivity.this,StudentLogin.class);
            startActivity(intent2);
        }
    }

    private class MyListener implements DialogInterface.OnClickListener {

        @Override
        public void onClick(DialogInterface dialog, int which) {
            android.os.Process.killProcess(android.os.Process.myPid());
            System.exit(0);
        }
    }
}
