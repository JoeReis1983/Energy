package reis.joe.energy;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class SplashActivity extends AppCompatActivity {
public MediaPlayer som;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);
        getSupportActionBar().hide();
         som = MediaPlayer.create(SplashActivity.this,R.raw.b);
        som.start();
         Handler handler = new Handler();
        handler.postDelayed(new Runnable() {
            @Override
            public void run() {
                mostrarMainActivity();


            }
        }, 2000);
    }

    private void mostrarMainActivity() {
        Intent intent = new Intent(
                this,InicialActivity.class
        );
        startActivity(intent);
        finish();
    }



    }

