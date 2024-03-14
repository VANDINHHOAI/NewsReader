package com.example.newreader;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.View;
import android.widget.Button;
import android.view.MenuItem;
import android.widget.Toast;

public class HomeActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.news_menu, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        if (item.getItemId() == R.id.baoMoiLink) {
            Intent intent = new Intent(HomeActivity.this, BaoMoiActivity.class);
            startActivity(intent);
        } else if (item.getItemId() == R.id.baoThanhNienLink) {
            Intent intent = new Intent(HomeActivity.this, BaoThanhNienActivity.class);
            startActivity(intent);
        } else if (item.getItemId() == R.id.vnepressLink) {
            Intent intent = new Intent(HomeActivity.this, VnexpressActivity.class);
            startActivity(intent);
        }
        return super.onOptionsItemSelected(item);
    }   
}