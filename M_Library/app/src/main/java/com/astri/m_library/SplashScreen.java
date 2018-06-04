package com.astri.m_library;

import android.content.Intent;
import android.os.Handler;
import android.os.Message;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Window;
import android.view.WindowManager;
import android.widget.ProgressBar;
import android.widget.TextView;
import android.widget.Toast;

public class SplashScreen extends AppCompatActivity {

    private ProgressBar progressBar;
    private TextView persentase;
    private int Value = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash_screen);
        progressBar = findViewById(R.id.progress);
        persentase = findViewById(R.id.presentase);
        progressBar.setProgress(0);

        final Handler handler = new Handler(){
            @Override
            public void handleMessage(Message msg){
                super.handleMessage(msg);
                persentase.setText(String.valueOf(Value)+"%");
                if (Value == progressBar.getMax()){
                    Toast.makeText(getApplicationContext(), "Progress Complete", Toast.LENGTH_SHORT).show();
                    startActivity(new Intent(SplashScreen.this, Login.class));
                    finish();
                }
                Value++;
            }
        };

        Thread thread = new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    for (int w=0; w<= progressBar.getMax(); w++){
                        progressBar.setProgress(w);
                        handler.sendMessage(handler.obtainMessage());
                        Thread.sleep(100);
                    }
                }catch (InterruptedException ex){
                    ex.printStackTrace();
                }
            }
        });
        thread.start();
}
}