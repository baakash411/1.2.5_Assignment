package com.example.operam.syntesizer_nikolaip;

import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class SynthesizerActivity extends AppCompatActivity {
    public static final String TAG = SynthesizerActivity.class.getName();
    private Button mEButton1;
    private Button mFButton2;
    private MediaPlayer mpE;
    private MediaPlayer mpF;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_synthesizer);
        mEButton1 = (Button)findViewById(R.id.eButton);
        mFButton2 = (Button)findViewById(R.id.fButton);
        mpE = MediaPlayer.create(this, R.raw.scalee);
        mpF = MediaPlayer.create(this, R.raw.scalef);
    }
    public void onButton1Click(View firstView){
        Log.i(TAG, "Button 1 Clicked");
        mpE.start();
    }
    public void onButton2Click(View secondView){
        Log.i(TAG, "Button 2 Clicked");
        mpF.start();
    }
}
