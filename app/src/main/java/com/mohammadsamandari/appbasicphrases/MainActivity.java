package com.mohammadsamandari.appbasicphrases;

import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    MediaPlayer mediaPlayer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void playPhrase(View view){
        int clickedBtnTag= Integer.parseInt(view.getTag().toString());
        switch (clickedBtnTag){
            case 1:
                mediaPlayer=MediaPlayer.create(this,R.raw.doyouspeakenglish);
                break;
            case 2:
                mediaPlayer=MediaPlayer.create(this,R.raw.goodevening);
                break;
            case 3:
                mediaPlayer=MediaPlayer.create(this,R.raw.hello);
                break;
            case 4:
                mediaPlayer=MediaPlayer.create(this,R.raw.howareyou);
                break;
            case 5:
                mediaPlayer=MediaPlayer.create(this,R.raw.ilivein);
                break;
            case 6:
                mediaPlayer=MediaPlayer.create(this,R.raw.mynameis);
                break;
            case 7:
                mediaPlayer=MediaPlayer.create(this,R.raw.please);
                break;
            case 8:
                mediaPlayer=MediaPlayer.create(this,R.raw.welcome);
                break;
        }
        mediaPlayer.start();


    }
}
