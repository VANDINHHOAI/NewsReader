package com.example.newreader;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.ContextCompat;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class BaoMoiActivity extends AppCompatActivity {

    Button btnTheThao, btnTinTuc, btnThoiSu, btnGiaiTri, btnSucKhoe, btnDoiSong;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bao_moi);

        btnTheThao = findViewById(R.id.buttonTheThaoBm);
        btnTinTuc = findViewById(R.id.buttonTinTucBm);
        btnThoiSu = findViewById(R.id.buttonThoisuBm);
        btnGiaiTri = findViewById(R.id.buttonGiaitriBm);
        btnSucKhoe = findViewById(R.id.buttonSuckhoeBm);
        btnDoiSong = findViewById(R.id.buttonDoiSongBm);

        btnTheThao.setBackgroundColor(ContextCompat.getColor(this, R.color.teal_700));
        btnTinTuc.setBackgroundColor(ContextCompat.getColor(this, R.color.red));
        btnThoiSu.setBackgroundColor(ContextCompat.getColor(this, R.color.green));
        btnGiaiTri.setBackgroundColor(ContextCompat.getColor(this, R.color.yellow));
        btnSucKhoe.setBackgroundColor(ContextCompat.getColor(this, R.color.pink));
        btnDoiSong.setBackgroundColor(ContextCompat.getColor(this, R.color.silver));

        btnTheThao.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String link = "https://tuoitre.vn/rss/the-thao.rss";
                pushLink(link);
            }
        });

        btnTinTuc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String link = "https://tuoitre.vn/rss/tin-tuc.rss";
                pushLink(link);
            }
        });

        btnThoiSu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String link = "https://tuoitre.vn/rss/thoi-su.rss";
                pushLink(link);
            }
        });

        btnGiaiTri.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String link = "https://tuoitre.vn/rss/giai-tri.rss";
                pushLink(link);
            }
        });

        btnSucKhoe.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String link = "https://tuoitre.vn/rss/suc-khoe.rss";
                pushLink(link);
            }
        });

        btnDoiSong.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String link = "https://tuoitre.vn/rss/doi-song.rss";
                pushLink(link);
            }
        });
    }

    private void pushLink(String link) {
        Intent intent = new Intent(BaoMoiActivity.this, MainActivity.class);
        intent.putExtra("LINK", link);
        startActivity(intent);
    }
}