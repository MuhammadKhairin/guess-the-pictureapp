package com.example.tebakgambar;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.Toast;

import java.util.Objects;

public class tebak extends AppCompatActivity {


    Button btn_submit, btn_kembali1;
    EditText txt_tebak;
    ImageView iv_tebak;

    private String jawaban;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tebak);

        btn_submit = findViewById(R.id.btn_submit);
        btn_kembali1 = findViewById(R.id.btn_kembali1);
        txt_tebak = findViewById(R.id.txt_tebak);
        iv_tebak = findViewById(R.id.iv_tebak);

        btn_kembali1.setOnClickListener(this::kembali1);
        btn_submit.setOnClickListener(this::submited);
        cekIntentGambar();

    }

    private void kembali1(View view) {
        startActivity(new Intent(this, PermainanMulai.class));
    }

    private void showToast(String message) {
        Toast.makeText(this, message, Toast.LENGTH_SHORT).show();
    }

    private void submited(View view) {
        String tebakan = txt_tebak.getText().toString().toLowerCase(); // Mengubah tebakan menjadi lowercase

        if (tebakan.equals(jawaban)) {
            showToast("Selamat, Anda Berhasil Menebak Gambar ini");
        } else {
            showToast("Coba Lagi");
        }
    }

    private void cekIntentGambar() {
        Intent cek = getIntent();
        String iconName = cek.getStringExtra("iconName");
        int drawableResource = 0;
        switch (Objects.requireNonNull(iconName).toLowerCase()) {
            case "instagram":
                drawableResource = R.drawable.instagram;
                jawaban = "instagram";
                break;
            case "whatsapp":
                drawableResource = R.drawable.whatsapp;
                jawaban = "whatsapp";
                break;
            case "twitter":
                drawableResource = R.drawable.twiter;
                jawaban = "twitter";
                break;
            case "line":
                drawableResource = R.drawable.line;
                jawaban = "line";
                break;
            case "snapchat":
                drawableResource = R.drawable.snapchat;
                jawaban = "snapchat";
                break;
            case "youtube":
                drawableResource = R.drawable.youtube;
                jawaban = "youtube";
                break;
        }

        iv_tebak.setImageResource(drawableResource);

    }
}