package com.example.android.drumkit;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
       //Toast.makeText(getApplicationContext(), "Welcome,Click music icon to start playing", Toast.LENGTH_SHORT).show();
        //1.get the xml file
        LayoutInflater li=getLayoutInflater();
        //2.get the file name

        View v1=li.inflate(R.layout.ctoast,(ViewGroup)findViewById(R.id.id1));

        Toast t=new Toast(MainActivity.this);
        t.setView(v1);
        t.setDuration(Toast.LENGTH_LONG);
        t.setGravity(Gravity.CENTER|Gravity.CENTER_VERTICAL,0,0);
        t.show();


    }
    public void Send(View v)
    {
        Intent i=new Intent(this,Drum.class);
        startActivity(i);
    }

}
