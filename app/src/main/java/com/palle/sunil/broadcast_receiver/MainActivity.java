package com.palle.sunil.broadcast_receiver;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toast.makeText(this,"Application opened",Toast.LENGTH_LONG).show();
    }

    @Override
    public void onBackPressed() {
        super.onBackPressed();

        Intent in = new Intent(MainActivity.this,MainActivity.class);
        startActivity(in);
    }

    @Override
    protected void onStop() {
        super.onStop();
        Intent in = new Intent(MainActivity.this,MainActivity.class);
        startActivity(in);
    }
}
