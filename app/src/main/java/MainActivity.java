package com.example.videoplayerapp;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.MediaController;
import android.widget.VideoView;

public class MainActivity extends AppCompatActivity {

    VideoView videoView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        videoView = findViewById(R.id.videoview);

        //From local storage
        videoView.setVideoPath("android.resource://" + getPackageName() + "/" + R.raw.song);
        //android:resource is for getting access to local storage
        //getPackageName() - need to get access and specify package name firstly
        //R.raw.videopresentation - refer to  which resource and its corresponding folder file

        MediaController mc = new MediaController(this);
        mc.setAnchorView(videoView); //used to deisplay the controls on a view
        videoView.setMediaController(mc);
    }
}
