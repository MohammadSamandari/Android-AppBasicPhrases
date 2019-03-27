package com.mohammadsamandari.appbasicphrases;

import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    MediaPlayer mediaPlayer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void playPhrase(View view) {


        int id = view.getId();

        //getting the name of the id of  the view we have clicked throught it's id.
        String ourId = view.getResources().getResourceEntryName(id);

        //this line of code selects the audio file in raw folder that is's name is like the resourceId
        int resourceId = getResources().getIdentifier(ourId, "raw", getPackageName());

        mediaPlayer = MediaPlayer.create(this, resourceId);
        mediaPlayer.start();

//        int clickedBtnTag = Integer.parseInt(view.getTag().toString());
//        switch (clickedBtnTag){
//            case 1:
//                mediaPlayer=MediaPlayer.create(this,R.raw.doyouspeakenglish);
//                break;
//            case 2:
//                mediaPlayer=MediaPlayer.create(this,R.raw.goodevening);
//                break;
//            case 3:
//                mediaPlayer=MediaPlayer.create(this,R.raw.hello);
//                break;
//            case 4:
//                mediaPlayer=MediaPlayer.create(this,R.raw.howareyou);
//                break;
//            case 5:
//                mediaPlayer=MediaPlayer.create(this,R.raw.ilivein);
//                break;
//            case 6:
//                mediaPlayer=MediaPlayer.create(this,R.raw.mynameis);
//                break;
//            case 7:
//                mediaPlayer=MediaPlayer.create(this,R.raw.please);
//                break;
//            case 8:
//                mediaPlayer=MediaPlayer.create(this,R.raw.welcome);
//                break;
//        }
//        mediaPlayer.start();


    }
}
