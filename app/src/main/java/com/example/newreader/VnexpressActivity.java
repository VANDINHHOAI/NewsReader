package com.example.newreader;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.ContextCompat;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class VnexpressActivity extends AppCompatActivity {

    Button btnTheThao, btnTinTuc, btnThoiSu, btnGiaiTri, btnSucKhoe, btnDoiSong;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_vnexpress);

        btnTheThao = findViewById(R.id.buttonTheThaoVn);
        btnTinTuc = findViewById(R.id.buttonTinTucVn);
        btnThoiSu = findViewById(R.id.buttonThoisuVn);
        btnGiaiTri = findViewById(R.id.buttonGiaitriVn);
        btnSucKhoe = findViewById(R.id.buttonSuckhoeVn);
        btnDoiSong = findViewById(R.id.buttonDoiSongVn);

        btnTheThao.setBackgroundColor(ContextCompat.getColor(this, R.color.teal_700));
        btnTinTuc.setBackgroundColor(ContextCompat.getColor(this, R.color.red));
        btnThoiSu.setBackgroundColor(ContextCompat.getColor(this, R.color.green));
        btnGiaiTri.setBackgroundColor(ContextCompat.getColor(this, R.color.yellow));
        btnSucKhoe.setBackgroundColor(ContextCompat.getColor(this, R.color.pink));
        btnDoiSong.setBackgroundColor(ContextCompat.getColor(this, R.color.silver));

        btnTheThao.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String link = "https://vnexpress.net/rss/the-thao.rss";
                pushLink(link);
            }
        });

        btnTinTuc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String link = "https://vnexpress.net/rss/tin-tuc.rss";
                pushLink(link);
            }
        });

        btnThoiSu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String link = "https://vnexpress.net/rss/thoi-su.rss";
                pushLink(link);
            }
        });

        btnGiaiTri.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String link = "https://vnexpress.net/rss/giai-tri.rss";
                pushLink(link);
            }
        });

        btnSucKhoe.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String link = "https://vnexpress.net/rss/suc-khoe.rss";
                pushLink(link);
            }
        });

        btnDoiSong.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String link = "https://vnexpress.net/rss/doi-song.rss";
                pushLink(link);
            }
        });
    }

    private void pushLink(String link) {
        Intent intent = new Intent(VnexpressActivity.this, MainActivity.class);
        intent.putExtra("LINK", link);
        startActivity(intent);
    }

}