package com.example.tebakgambar;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class PermainanMulai extends AppCompatActivity {
    ImageView iv_instagram, iv_whatsapp, iv_snapchat, iv_twitter, iv_line, iv_youtube;

    Button btn_kembali;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_permainan_mulai);

        btn_kembali = findViewById(R.id.btn_kembali);
        iv_instagram = findViewById(R.id.iv_instagram);
        iv_snapchat = findViewById(R.id.iv_snapchat);
        iv_whatsapp = findViewById(R.id.iv_whatsapp);
        iv_twitter = findViewById(R.id.iv_twitter);
        iv_line = findViewById(R.id.iv_line);
        iv_youtube = findViewById(R.id.iv_youtube);

        btn_kembali.setOnClickListener(this::kembali);
        set();

    }
    private void kembali(View view){
        startActivity(new Intent(this, MainActivity.class));
    }

    private void startTebakActivity(String iconName){
        Intent i = new Intent(this, tebak.class);
        i.putExtra("iconName",iconName);
        startActivity(i);
    }

    private void set(){
        iv_instagram.setOnClickListener(v -> startTebakActivity("instagram"));

        iv_whatsapp.setOnClickListener(v -> startTebakActivity("whatsapp"));

        iv_snapchat.setOnClickListener(v -> startTebakActivity("snapchat"));

        iv_twitter.setOnClickListener(v -> startTebakActivity("twitter"));

        iv_line.setOnClickListener(v -> startTebakActivity("line"));

        iv_youtube.setOnClickListener(v -> startTebakActivity("youtube"));

    }

}