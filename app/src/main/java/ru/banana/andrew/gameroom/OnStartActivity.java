package ru.banana.andrew.gameroom;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class OnStartActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_on_start);

        View bigLayout = findViewById(R.id.activity_on_start);
        bigLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
            Intent intent = new Intent(OnStartActivity.this, VideogamesActivity.class);
            startActivity(intent);
                finish();
            }
        });
    }
}
