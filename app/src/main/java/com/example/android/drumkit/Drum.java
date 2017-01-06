package com.example.android.drumkit;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

/**
 * Created by Divyani on 04-01-2017.
 */
public class Drum extends AppCompatActivity {
    TextView tv;
    MediaPlayer m;
    MediaPlayer n;
    MediaPlayer o;
    MediaPlayer p;
    MediaPlayer q;
    MediaPlayer r;
    MediaPlayer s;
    MediaPlayer t;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.drum);
        tv=(TextView)findViewById(R.id.t);
    }
    public void boom(View v){
        m= MediaPlayer.create(Drum.this, R.raw.cow);
        tv.setText("COW BELL");

        m.start();
        m.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
            public void onCompletion(MediaPlayer mp) {
                mp.release();

            }


        });


    }
    public void clap(View v){
        n= MediaPlayer.create(Drum.this, R.raw.clave);
        tv.setText("CLAP");
        n.start();
        n.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
            public void onCompletion(MediaPlayer mp) {
                mp.release();

            }


        });



    }
    public void hihat(View v){
        o= MediaPlayer.create(Drum.this, R.raw.hihat);
        tv.setText("HIHAT");
        o.start();
        o.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
            public void onCompletion(MediaPlayer mp) {
                mp.release();

            }


        });


    }
    public void kick(View v){
        p= MediaPlayer.create(Drum.this, R.raw.kick);
        tv.setText("KICK");
        p.start();
        p.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
            public void onCompletion(MediaPlayer mp) {
                mp.release();

            }


        });


    }
    public void openhat(View v){
        q= MediaPlayer.create(Drum.this, R.raw.rim);
        tv.setText("RIM SHOT");
        q.start();
        q.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
            public void onCompletion(MediaPlayer mp) {
                mp.release();

            }


        });


    }
    public void ride(View v){
        r= MediaPlayer.create(Drum.this, R.raw.crash);
        tv.setText("CRASH");
        r.start();
        r.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
            public void onCompletion(MediaPlayer mp) {
                mp.release();

            }


        });


    }
    public void snare(View v){
        s= MediaPlayer.create(Drum.this, R.raw.snare);
        tv.setText("SNARE");

        s.start();
        s.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
            public void onCompletion(MediaPlayer mp) {
                mp.release();

            }


        });


    }

    public void tom(View v)
    {
        t= MediaPlayer.create(Drum.this, R.raw.mara);
        tv.setText("MARACAS");
        t.start();
        t.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
            public void onCompletion(MediaPlayer mp) {
                mp.release();

            }


        });


    }
}
