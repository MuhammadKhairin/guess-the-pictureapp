package com.example.tebakgambar;

import androidx.appcompat.app.AppCompatActivity;

import android.app.AlertDialog;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    TextView Tv_name;
    Button btn_masuk, btn_keluar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn_masuk = findViewById(R.id.btn_masuk);

        btn_keluar =  findViewById(R.id.btn_keluar);

        btn_masuk.setOnClickListener(this::mulaiPermainan);
        btn_keluar.setOnClickListener(this::keluarPermainan);
    }
    private void mulaiPermainan(View view){
        startActivity(new Intent(this, PermainanMulai.class));
    }

    private void keluarPermainan(View view){
        new AlertDialog.Builder(this)
                .setTitle("Konformasi Pilihan")
                .setMessage("Apakah Anda Ingin Keluar?")
                .setNegativeButton("Tidak", null)
                .setPositiveButton("Iya", (dialogInterface, i) -> finish()).show();

    }
}