package com.example.buoi_1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    Intent intent;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        intent = new Intent(this, MyService.class);

    }

    public void btn_start(View view){
        intent.putExtra("name" , "minh_hoang \n\n \t\t\tdata change service");
        startService(intent);

    }
    public void btn_stop(View view){
        stopService(intent);

    }
}