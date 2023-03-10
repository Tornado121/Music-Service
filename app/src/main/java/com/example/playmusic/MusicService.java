package com.example.playmusic;

import android.app.Service;
import android.content.Intent;
import android.media.MediaPlayer;
import android.os.IBinder;
import android.widget.Toast;

import androidx.annotation.Nullable;

import java.security.Provider;

public class MusicService extends Service {
    MediaPlayer mp;
    @Nullable
    @Override
    public IBinder onBind(Intent intent) {
        return null;
    }
    public void onCreate()
    {
        mp = MediaPlayer.create(this,R.raw.myhero);
        mp.setLooping(true);
        mp.start();
    }
    public void onStart()
    {
        mp.start();
        Toast.makeText(this, "Service Started", Toast.LENGTH_SHORT).show();
    }
    public void onDestroy()
    {
        super.onDestroy();
        mp.stop();
        Toast.makeText(this, "Service Stopped", Toast.LENGTH_SHORT).show();
    }
}
